#!/bin/bash

echo '============================================================='
echo '$                                                           $'
echo '$                      liumapp                              $'
echo '$                                                           $'
echo '$                                                           $'
echo '$  email:    liumapp.com@gmail.com                          $'
echo '$  homePage: http://www.liumapp.com                         $'
echo '$  Github:   https://github.com/liumapp                     $'
echo '$                                                           $'
echo '============================================================='
echo '.'

rm -rf ./client-server/src/main/resources/static/static

rm ./client-server/src/main/resources/templates/index.html

cp -r ./client-ui/dist/static ./client-server/src/main/resources/static/

cp ./client-ui/dist/index.html ./client-server/src/main/resources/templates/index.html

chmod -R a+w ../simple-sdk-example
