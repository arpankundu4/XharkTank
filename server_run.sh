#!/bin/bash

# This script contains a series of commands to run the backend application
# for springboot maven project

# migrate to backend directory
cd backend

# run project
./mvnw spring-boot:run

# return back to previous directory
cd ../