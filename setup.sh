#!/bin/bash

# this script contains a series of commands to set up dependencies of the project
# for java maven project

# migrate to backend directory
cd backend

# make mvnw executable
chmod +x mvnw

# build project
./mvnw clean install compile test

# return back to previous directory
cd ../