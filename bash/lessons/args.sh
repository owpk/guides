#!/bin/bash
q=1366
g=0
args=($@)
for (( i=0; i<"$#"; i++ ))
do
   if [[ ${args[$i]} == "-q" ]] ; then
        echo "Is set!"
        i=$(( i + 1 ))
        q=${args[$i]}
    elif [[ ${args[$i]} == "-g" ]] ; then
       g=1
    fi
done
