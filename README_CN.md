# sdk开发案例
sdk开发案例，并使用docker进行demo的部署。

[中文](https://github.com/liumapp/simple-sdk-example/blob/master/README_CN.md) | [English](https://github.com/liumapp/simple-sdk-example/blob/master/README.md)

## 使用方法

* 首先请确保您的操作系统包含了Maven3、docker、docker-compose。

    如果缺少的话，可以参考这个脚本进行安装：[liumapp/install-docker-compose](https://github.com/liumapp/install-docker-compose)
    
* 安装镜像

    * 执行build-image.sh脚本，完成mysql、sdk-server、client-server镜像的安装。
    
        * mysql镜像用于支持client-server和sdk-server两个服务端
        * client-server用于模拟sdk-demo（sdk-core是该服务的一个依赖）
        * sdk-server用于模拟sdk的服务提供者。
        
* 启动

    * 在项目根目录下，执行 docker-compose up -d，等待10秒左右后，在浏览器访问localhost:2020            

## 流程介绍

执行docker-compose up -d 之后，等待10秒左右。

然后打开您的浏览器，分别访问

* http://localhost:2020/

    用于模拟客户端运行的demo，依赖于sdk-core，该服务会提供流程展示，具体流程为：
    
    * 创建新的用户
    
    * 提交用户的收货地址
    
    * 用户下订单
    
    * 获取订单详情
    
    * 借助sdk-core，向sdk-server调用订单数据备份接口，将订单详情数据备份到sdk-server的数据库系统中。
    
    * 借助sdk-core，向sdk-server获取备份的订单数据，并打印在浏览器的console中。

* http://localhost:2020/druid

    方便查询client-server与数据库的交互。

* http://localhost:3030/druid

    方便查询sdk-server与数据库的交互。

## 开发调试

### 后端

因为系统是基于docker运行的，所以client-server、sdk-server和mysql之间都是以docker-compose的service name来进行通讯的。

比如，在client-server下，它与mysql之间的连接建立地址为："jdbc:mysql://client-mysql:3306"

这里的client-mysql就是代表docker-compose.yml下mysql的service name。

所以如果您要调试后端的话，并不建议直接修改client-server和sdk-server的配置文件。

我个人建议这种方式（假设您的操作系统为Mac OS）：

修改您的/etc/hosts文件，添加以下内容：

    127.0.0.1 client-server
    127.0.0.1 client-mysql
    127.0.0.1 sdk-server
    
之后将项目导入您常用的IDE即可。    

### 前端

前端项目为client-ui

项目的主要配置文件为./client-ui/static/js/config.js

前端项目可以独立在nodejs环境下运行，也可以做为client-server的静态资源去运行。

前者跟传统的前后端分离实现方式一样，后者需要额外对client-ui进行打包编译操作，然后运行update-ui.sh脚本将dist资源整合到client-server项目下。

## 注意事项

* 需要确保您的系统具有maven、docker、docker-compose的支持，如果前端项目要独立运行的话，还需要nodejs环境的支持。

* 如果要调试系统，请在您本地的mysql数据库执行table.sql来创建相关数据表。





