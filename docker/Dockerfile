###
# Docker environment to run championships
# Version: 0.1
###

FROM ubuntu:16.04
MAINTAINER Sebastien Mosser <mosser@i3s.unice.fr>

###
# Build time
###

# Updating the ubuntu system
RUN apt-get update && apt-get -y upgrade

# Getting the add-apt command 
RUN apt-get -y install software-properties-common

# Adding the non-official Oracle Java repository
RUN add-apt-repository -y ppa:webupd8team/java && apt-get -y update

# Setting up the auto-acceptance mechanism for the license
RUN echo oracle-java8-installer \
    shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

# Installing Java 8
RUN apt-get -y install oracle-java8-installer

# Installing Maven
RUN apt-get -y install maven

# Installing Git
RUN apt-get -y install git
RUN git config --global user.email "sebastien.mosser@gmail.com"
RUN git config --global user.name "Sebastien Mosser"

# Preparing the championship
RUN mkdir /var/island

###
# Execution time
###

CMD cd /var/island \
    && git clone https://github.com/mosser/QGL-16-17.git \
    && cd /var/island/QGL-16-17/deliveries \
    && bash


