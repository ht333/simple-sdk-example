# simple-sdk-example
Using docker to demonstrate sdk.

[中文](https://github.com/liumapp/simple-sdk-example/blob/master/README_CN.md) | [English](https://github.com/liumapp/simple-sdk-example/blob/master/README.md)

## How to use

* first, make sure your operating system contains Maven3, docker and docker-compose.

    If not, you can refer to this script for installation: [liumapp/install-docker-compose](https://github.com/liumapp/install-docker-compose).

* installation mirror

    * execute the build-image.sh script to complete the installation of MySQL, sdk-server and client-server mirrors.

    * MySQL mirroring is used to support two servers of client-server and sdk-server.

    * client-server is used to simulate sdk-demo (sdk-core is a dependency of the service).

    * sdk-server is used to simulate the service provider of SDK.

* start

    * execute docker-compose up -d in the project root directory, wait for about 10 seconds, and visit localhost:2020 in browser.

## Introduction of process

## Development and debugging

## Matters of Attention
