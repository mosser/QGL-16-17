#!/bin/bash

for team in ia*
do
    cd $team
    mvn -DskipTests clean install
#    mvn org.jacoco:jacoco-maven-plugin:prepare-agent clean install
    cd ..
done 

