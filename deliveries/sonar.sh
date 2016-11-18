#!/bin/bash

for team in ia*
do
    cd $team
    mvn sonar:sonar
    cd ..
done 

