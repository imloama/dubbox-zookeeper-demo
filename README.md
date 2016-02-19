dubbox zookeeper入门说明
===

用到的类库或软件

> * eclipse
> * maven
> * jdk7
> * spring boot
> * zookeeper
> * dubbox
> * tomcat

1. 安装zookeeper

> * 下载[zookeeper](http://zookeeper.apache.org/)
> * 解压下载文件，在conf文件夹下有zoo_sample.cfg文件，改名成zoo.cfg
> * 修改zoo.cfg配置文件如下
```
dataDir=E:\\workprograme\\dev\\zookeeper-data
dataLogDir=E:\\workprograme\\dev\\zookeeper-logs
```

2. 下载dubbox（也可以使用dubbo）

> * 下载[dubbox](https://github.com/dangdangdotcom/dubbox)或[dubbo](dubbo.io)，也可以使用git clone命令下载对应的源码
> * 在源码目录中执行mvn install -Dmaven.test.skip=true
> * 在dubbo-admin项目下的target下的war包拷备到tomcat的webapps目录
> * 打开WEB-INF/dubbo.properties文件，配置内容如下，其中有zookeeper地址
```
dubbo.registry.address=zookeeper://127.0.0.1:2181
dubbo.admin.root.password=root
dubbo.admin.guest.password=guest
```
> * 启动tomcat（可能需要修改tomcat的端口）


3. 项目界面

> * dubbo-zookeeper-demo是parent工程，配置了spring-boot等
> * dubbo-zookeeper-api是接口工程
> * dubbo-zookeeper-simple是接口实现
> * dubbo-zookeeper-client是接口调用工程


