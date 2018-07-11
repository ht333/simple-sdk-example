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

After executing docker-compose up -d, wait for about 10 seconds.

Then open your browser and visit each other

* http://localhost:2020/

    The demo used to simulate the client's operation depends on sdk-core. 
    
    The service will provide process demonstration, and the specific process is:

    * create new users

    * submit the user's shipping address

    * subscriber orders

    * get order details

    * with sdk-core, the order data backup interface is invoked to sdk-server, and the order details data is backed up to the database system of sdk-server.

    * with sdk-core, the backup order data is obtained from sdk-server and printed in the browser's console.

* http://localhost:2020/druid

It is convenient to query the interaction between client-server and database.

* http://localhost:3030/druid

It is convenient to query the interaction between sdk-server and database.

## Development and debugging

### The back end

Because the system is run on docker, client-server, sdk-server and MySQL communicate with each other by service name of docker-compose.

For example, under client-server, the connection url to MySQL is "jdbc:mysql://client-mysql:3306".

The client-mysql here represents the service name of MySQL under docker-compose.yml.

So if you want to debug the backend, it is not recommended to modify the configuration files of client-server and sdk-server directly.

I personally suggest this way (assuming your operating system is Mac OS):

Modify your /etc/hosts file and add the following:

    127.0.0.1 client-server
    
    127.0.0.1 client-mysql
    
    127.0.0.1 sdk-server

Then import the project into your common IDE.

### The front end

The front-end project is client-ui

The main configuration file of the project is./client-ui/static/js/config.js.

The front-end project can run independently in nodejs environment or client-server static resources.

The former is the same as the traditional front and back separation implementation, which requires an extra package compilation operation for the client-ui, and then runs the update-ui.sh script to integrate the dist resources into the client-server project.

## Matters of Attention

* ensure that your system has the support of maven, docker and docker-compose.
 
    If the front-end project is to run independently, it needs the support of the nodejs environment.

* if you want to debug the system, please execute table.sql in your local MySQL database to create the relevant data table.



