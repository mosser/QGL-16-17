#!/bin/bash

for team in q*
do
    cd $team
    mvn sonar:sonar
    cd ..
done 

