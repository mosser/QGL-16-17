####
## Polytech TSE Framework
####

####
## This file defines a Domain-specific Language to deal with project
## verification. It is made as a support for the course "Outils pour le
## Genie Logiciel" (Tools for Software Engineering) given at Polytech'Nice
## Sophia Antipolis (Universite Nice-Sophia Antipolis.
## 
## Main author: Sebastien Mosser [mosser@i3s.unice.fr]
## Website:     http://www.i3s.unice.fr/~mosser/teaching/tse/start
##
####

ERROR=0

function checkout_tag()  # $1 is the expected tag
{
    echo -ne "# Checking out tag [$1]: "
    git checkout $1  > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "OK"; else  ERROR=1 ; echo "FAILURE"; fi
}

function maven() # $1 is maven goal
{
    echo -ne "# Building using Maven [$1]: "
    mvn $1 > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "OK"; else ERROR=1 ; echo "FAILURE"; fi
}

function build_git_stats() # $1 is project's id
{  ## Relies on git_stats tool
    echo "# Analyzing git activity"
    mkdir -p ../git_stats
    rm -rf ../git_stats/$1
    git_stats generate -p . -o ../git_stats/$1 -s 2> /dev/null
}

function count_loc() 
{ ## Relies on cloc
    echo -ne "# LOC counter [main]: " 
    cloc src/main 2> /dev/null | grep Java | tr -s '[:space:]' ' ' | cut -d " " -f 5
    echo -ne "# LOC counter [test]: " 
    cloc src/test 2> /dev/null | grep Java | tr -s '[:space:]' ' ' | cut -d " " -f 5
}


function exists_file()  #  $1  is file_name
{
    echo -ne "# Checking existence of [$1]: "
    if [ -s $1 ]; then echo "OK"; else ERROR=1 ; echo "FAILURE"; fi
}

function exists_regexp()
{
    echo -ne "# Checking existence of [$1]: "
    ls -1 | grep -i $1  > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "OK"; else ERROR=1 ; echo "FAILURE"; fi
}

function exists_dir()  #  $1  is dir_name
{
    echo -ne "# Checking existence of [$1]: "
    if [ -s $1 ]; then echo "OK"; else ERROR=1 ; echo "FAILURE"; fi
}

function not_exists_dir()  #  $1  is dir_name
{
    echo -ne "# Checking non-existence of [$1]: "
    if [ -s $1 ]; then echo "FAILURE"; else echo "OK"; fi
}

function exists_pattern() # $1 = pattern, $2 = nickname
{
    echo -ne "# Checking existence of $2 [$1]: "
    find . -name "$1" | egrep '.*'  > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "OK"; else ERROR=1 ; echo "FAILURE"; fi
}

function not_exists_pattern() # $1 = Directory, $2 = pattern, $3 = nickname
{
    echo -ne "# Checking non-existence of $2 [$1]: "
    find . -name "$1" | egrep '.*'  > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "FAILURE"; else echo "OK"; fi
}


function enter_project()  # $1 is project's ID
{
    echo "# Opening project $1"
    cd $1
}


function leave_project() # $1 is project's ID
{
    echo "# Leaving project $1"
    cd ..
}


function log_time() 
{
    echo -ne "#  $1:"
    date "+%Y-%m-%d %H:%M:%S"
    echo
}


function clone_repo()     # $1 is project's ID, $2 is repository's URL
{   
    echo -ne "# Cloning project from remote repository: "
    git clone $2 $1 > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "OK"; else echo "FAILURE"; fi
}


function git_tag_time()
{
    echo -ne "# Git stamp: "
    git log -n 1 $1 2> /dev/null | grep Date
    if [ "$?" != "0" ]; then echo ""; fi
}

function xml_key_value() # $1 file name. $2 node name, $3 expected value
{
    echo -ne "# $1/$2 == [$3]: "
    cat $1 | grep $2 | grep $3  > /dev/null 2> /dev/null
    if [ "$?" = "0" ]; then echo "OK"; else  ERROR=1 ; echo "FAILURE"; fi
}


function main()  # Main loop used ot iterate over all projects
{
    log_time "Started at "
    while read URL
    do
	if [[ $URL == \#* ]]
	then
	    continue
	fi
	repo=`echo $URL | cut -d ';' -f 1`
	name=`echo $URL | cut -d ';' -f 2`
	id=`echo $repo | cut -d '/' -f 6`
	echo -ne "\n####\n## Handling $name [$id]\n####\n"
	rm -rf $id
	clone_repo $id $URL
	enter_project $id
	handle_repository $id
	leave_project $id
    done < urls.txt
    echo 
    log_time "Ended at "
}
