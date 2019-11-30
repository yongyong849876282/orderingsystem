### 项目概述


本项目分为客户端和后台管理系统两个界面，客户端针对普通用户，功能包括用户登陆、用户退出、菜品订购、我的订单。

后台管理系统针对管理员，功能包括管理员登陆、管理员退出、添加菜品、查询菜品、修改菜品、删除菜品、订单处理、添加用户、查询用户、删除用户。

需求了解完之后，接下来设计系统架构，首先分配出4个服务提供者，account、menu、order、user。

account 提供账户服务：用户和管理员登陆。

menu 提供菜品服务：添加菜品、查询菜品、修改菜品、删除菜品。

order 提供订单服务：添加订单、查询订单、删除订单、处理订单。

user 提供用户服务：添加用户、查询用户、删除用户。

本系统共有8个模块组成，包括注册中心，配置中心，Git 仓库配置信息，服务消费者，4个服务提供者。

系统架构搞清楚之后，接下来开始创建工程。

pom.xml 引入 Spring Boot 和 Spring Cloud 相关依赖，其中 JAXB API 的依赖只针对 JDK 9 以上版本，如果你是 JDK 9 以下版本，不需要配置。

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.southwind</groupId>
    <artifactId>orderingsystem</artifactId>
    <version>1.0-SNAPSHOT</version>

    <!-- 引入Spring Boot的依赖 -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.0.7.RELEASE</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- 解决JDK 9以上版本没有JAXB API的问题 -->
        <dependency>
            <groupId>javax.xml.bind</groupId>
            <artifactId>jaxb-api</artifactId>
            <version>2.3.0</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-impl</artifactId>
            <version>2.3.0</version>
        </dependency>
        <dependency>
            <groupId>com.sun.xml.bind</groupId>
            <artifactId>jaxb-core</artifactId>
            <version>2.3.0</version>
        </dependency>
        <dependency>
            <groupId>javax.activation</groupId>
            <artifactId>activation</artifactId>
            <version>1.1.1</version>
        </dependency>

        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
    </dependencies>

    <!-- 引入Spring Cloud的依赖，管理Spring Cloud生态各个组件 -->
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Finchley.SR2</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>

</project>
```


