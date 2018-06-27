# sdk开发案例
sdk开发案例，并使用docker进行demo的部署。

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

## 开发调试

因为系统是基于docker运行的，所以client-server、sdk-server和mysql之间都是以docker-compose的service name来进行通讯的。

比如，在client-server下，它与mysql之间的连接建立地址为："jdbc:mysql://client-mysql:3306"

这里的client-mysql就是代表docker-compose.yml下mysql的service name。




## 注意事项






