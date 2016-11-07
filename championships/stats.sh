# List the available actions


ACTIONS=`grep -o '"action"[^}]*' *.json | cut -d ':' -f 3 | cut -d '"' -f 2 | sort | uniq`

for act in $ACTIONS
do
    COUNT=`grep -o '"action"[^}]*' *.json | cut -d ':' -f 3 | cut -d '"' -f 2 | grep $act | wc -l`
    echo $act - $COUNT
done
