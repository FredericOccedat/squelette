#!/bin/bash

## Created by: Frederic Occedat (frederic.occedat@gmail.com)
## Created on: 17/05/2016
##
## Script to create a new skeleton clojure project using squelette as a template
## Usage: ./create_project.sh new_project_name
##         
##:
echo "Let's do it!"

# Check destination name
DEST="$1"
if [$DEST == ""]; then
   echo "ERROR: new project name mandatory"	
   exit -1
fi

echo "Generic structure: copying..."
rsync -a . ../$DEST --exclude .git --exclude target --exclude create_project.sh
echo "Generic structure: copied"

echo "Clean up..."
mv ../$DEST/src/squelette ../$DEST/src/$DEST
mv ../$DEST/test/squelette ../$DEST/test/$DEST
mv ../$DEST/blank-canvas/* ../$DEST
rm -rf ../$DEST/blank-canvas

find ../$DEST/ -type f -exec sed -i '' "s/squelette/$DEST/g" {} \;

sed -i '' "2,3s/\".*\"/\"TODO\"/g" ../$DEST/project.clj

echo "Done."