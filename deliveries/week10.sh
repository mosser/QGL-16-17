#!/bin/bash
source ./framework.sh

####
## Week #10
####

TAG="week10"

function valid_env() # $1 is project's id. 
{
    # POM
    xml_key_value pom.xml groupId fr.unice.polytech.3a.qgl
    xml_key_value pom.xml artifactId $1
    # Bot
    PACKAGE=./src/main/java/fr/unice/polytech/si3/qgl/$1
    exists_dir $PACKAGE
    if [ "$ERROR" = "1" ]
    then
	echo "## Abort [Invalid environment]"
    else
	exists_file $PACKAGE/Explorer.java
	if [ "$ERROR" = "1" ]
	then
	    echo "## Abort [team player not found]"
	else
	    echo "## \o/ Environment OK, will run the championship \o/"
	fi
    fi
    ERROR=0
}

function handle_repository() # $1 is project's id. 
{ 
    checkout_tag      $TAG
    if [ "$ERROR" = "1" ]
    then
	echo "## Abort [missing tag]"
    else
	git_tag_time  $TAG
	count_loc
	maven    "clean package"
        if [ "$ERROR" = "1" ]
	then
	    echo "## Abort [project does not build]"
	else
	    echo "## \o/ Delivery OK \o/"
	    valid_env $1
	fi
    fi
    ERROR=0
}

main
