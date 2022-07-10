# 课程结构

![sum1](img/summary1.png)

![sum2](img/summary2.png)

配置特性(重点)

# 第一季：SpringBoot2核心技术

## 1.SpringBoot2基础入门

### Spring和SpringBoot

#### 1、Spring能做什么

##### 1.1、Spring的能力

![img](https://cdn.nlark.com/yuque/0/2020/png/1354552/1602641710418-5123a24a-60df-4e26-8c23-1d93b8d998d9.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_41%2Ctext_YXRndWlndS5jb20g5bCa56GF6LC3%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10)



##### 1.2、Spring的生态

https://spring.io/projects/spring-boot



覆盖了：

web开发

数据访问

安全控制

分布式

消息服务

移动开发

批处理

......

##### 1.3、Spring5重大升级

###### 1.3.1、响应式编程

![img](https://cdn.nlark.com/yuque/0/2020/png/1354552/1602642309979-eac6fe50-dc84-49cc-8ab9-e45b13b90121.png?x-oss-process=image%2Fwatermark%2Ctype_d3F5LW1pY3JvaGVp%2Csize_27%2Ctext_YXRndWlndS5jb20g5bCa56GF6LC3%2Ccolor_FFFFFF%2Cshadow_50%2Ct_80%2Cg_se%2Cx_10%2Cy_10)

###### 1.3.2、内部源码设计

基于Java8的一些新特性，如：接口默认实现。重新设计源码架构。



#### 2、为什么用SpringBoot



Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".



能快速创建出生产级别的Spring应用



##### 2.1、SpringBoot优点

- Create stand-alone Spring applications

- - 创建独立Spring应用

- Embed Tomcat, Jetty or Undertow directly (no need to deploy WAR files)

- - 内嵌web服务器

- Provide opinionated 'starter' dependencies to simplify your build configuration

- - 自动starter依赖，简化构建配置

- Automatically configure Spring and 3rd party libraries whenever possible

- - 自动配置Spring以及第三方功能

- Provide production-ready features such as metrics, health checks, and externalized configuration

- - 提供生产级别的监控、健康检查及外部化配置

- Absolutely no code generation and no requirement for XML configuration

- - 无代码生成、无需编写XML



SpringBoot是整合Spring技术栈的一站式框架

SpringBoot是简化Spring技术栈的快速开发脚手架



##### 2.2、SpringBoot缺点

- 人称版本帝，迭代快，需要时刻关注变化
- 封装太深，内部原理复杂，不容易精通

#### 3、时代背景

##### 3.1、微服务

[James Lewis and Martin Fowler (2014)](https://martinfowler.com/articles/microservices.html)  提出微服务完整概念。https://martinfowler.com/microservices/

In short, the **microservice architectural style** is an approach to developing a single application as a **suite of small services**, each **running in its own process** and communicating with **lightweight** mechanisms, often an **HTTP** resource API. These services are **built around business capabilities** and **independently deployable** by fully **automated deployment** machinery. There is a **bare minimum of centralized management** of these services, which may be **written in different programming languages** and use different data storage technologies.-- [James Lewis and Martin Fowler (2014)](https://martinfowler.com/articles/microservices.html)

- 微服务是一种架构风格
- 一个应用拆分为一组小型服务
- 每个服务运行在自己的进程内，也就是可独立部署和升级
- 服务之间使用轻量级HTTP交互
- 服务围绕业务功能拆分
- 可以由全自动部署机制独立部署
- 去中心化，服务自治。服务可以使用不同的语言、不同的存储技术

##### 3.2、分布式

![ms1](img/ms1.png)

###### 分布式的困难

- 远程调用
- 服务发现
- 负载均衡
- 服务容错
- 配置管理
- 服务监控
- 链路追踪
- 日志管理
- 任务调度
- ......



###### 分布式的解决

- SpringBoot + SpringCloud
- 分布式的解决
  - SpringBoot + SpringCloud

##### 3.3、云原生

原生应用如何上云。 Cloud Native

###### 上云的困难

- 服务自愈
- 弹性伸缩
- 服务隔离
- 自动化部署
- 灰度发布
- 流量治理
- ......

###### 上云的解决

![cloudnative](img/cloudnative1.png)

#### 4、如何学习SpringBoot

##### 4.1、官网文档架构

![howtolearn1](img/howtolearn1.png)

![howtolearn1](img/howtolearn2.png)

查看版本新特性；

https://github.com/spring-projects/spring-boot/wiki#release-notes

![howtolearn1](img/howtolearn3.png)

### SpringBoot2入门

#### 1、系统要求

- [Java 8](https://www.java.com/) & 兼容java14 .
- Maven 3.3+
- idea 2019.1.2

##### 1.1、maven设置

```xml
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.4.RELEASE</version>
    </parent>


    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

    </dependencies>
```

#### 2、HelloWorld

需求：浏览发送/hello请求，响应 Hello，Spring Boot 2 

##### 2.1、创建maven工程

创建mvn工程,注意settings文件的配置和mvn

![mvn-setting](img/starting1.png)

##### 2.2、引入依赖

```xml
 <!-- 引入SpringBoot   -->
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.4.RELEASE</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>
```

##### 2.3、创建主程序

```java
/**
 * 主程序类
 * @SpringBootApplication：这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
```



##### 2.4、编写业务

```java
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot2!";
    }
}

```



目录结构

![starting2](img/starting2.png)

##### 2.5、测试

直接运行main方法

##### 2.6、简化配置

application.properties

```xml
server.port=8888
```

##### 2.7、简化部署

```xml
<!-- 简化部署   -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>2.3.4.RELEASE</version>
            </plugin>
        </plugins>
    </build>
```

把项目打成jar包，直接在目标服务器执行即可。

![packing](img/starting3.png)

![runing](img/starting4.png)

#### 03、了解自动配置原理

##### 1、SpringBoot特点 

###### 1.1、依赖管理

父项目做依赖管理

也就是引入了spring-boot-starter-parent就引入了一整套spring-boot的依赖

```xml
依赖管理    
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.4.RELEASE</version>
</parent>

他的父项目
 <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.3.4.RELEASE</version>
  </parent>

几乎声明了所有开发中常用的依赖的版本号,自动版本仲裁机制

```

开发导入starter场景启动器

这些场景包括很多大型(如web的redis,mysql等等)项目的全套依赖(自动选择推荐的版本)

```xml
1、见到很多 spring-boot-starter-* ： *就某种场景
2、只要引入starter，这个场景的所有常规需要的依赖我们都自动引入
3、SpringBoot所有支持的场景
https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-starter
4、见到的  *-spring-boot-starter： 第三方为我们提供的简化开发的场景启动器。(非官方推荐,第三方的地址版本)
5、所有场景启动器最底层的依赖
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter</artifactId>
  <version>2.3.4.RELEASE</version>
  <scope>compile</scope>
</dependency>
```

无需关注版本号，自动版本仲裁

```
1、引入依赖默认都可以不写版本<----有时候可能会有问题
2、引入非版本仲裁的jar，要写版本号。
```

可以修改默认版本号

```xml
1、查看spring-boot-dependencies里面规定当前依赖的版本 用的 key。
2、在当前项目里面重写配置
    <properties>
        <mysql.version>5.1.43</mysql.version>
    </properties>
```

###### 1.2、自动配置

我们可以在主程序类中打印看到底加载了哪些组件

```java
/**
 * 主程序类
 *
 * @SpringBootApplication：这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1.返回我们IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器里面的所有组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

    }
}
```

结果:以前SpringMVC.pom的常用组件都有

```text
...
characterEncodingFilter  #编码器
...
multipartResolver   #文件上传
dispatcherServlet	#default-servlet-handle
simpleControllerHandlerAdapter		#拦截器
handlerExceptionResolver			#异常处理器
viewControllerHandlerMapping		#view-controller
...

```

**自动配好Tomcat**

- 引入Tomcat依赖。

- 配置Tomcat

- ```xml
  <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <version>2.3.4.RELEASE</version>
        <scope>compile</scope>
      </dependency>
  ```

**自动配好SpringMVC**

  - 引入SpringMVC全套组件

  - 自动配好SpringMVC常用组件（功能）

**自动配好Web常见功能，如：字符编码问题**

- SpringBoot帮我们配置好了所有web开发的常见场景

**默认的包结构**

  - 主程序所在包及其下面的所有子包里面的组件都会被默认扫描进来

![autoconfig1](img/autoconfig1.png)

  - 无需以前的包扫描配置

  - 想要改变扫描路径，@SpringBootApplication(scanBasePackages=**"com.atguigu"**)

  - 或者@ComponentScan 指定扫描路径

    - ```java
      @SpringBootApplication
      等同于
      @SpringBootConfiguration
      @EnableAutoConfiguration
      @ComponentScan("com.atguigu.boot")
      ```


**各种配置拥有默认值**

  - 默认配置最终都是映射到某个类上，如：MultipartProperties

  - 配置文件的值最终会绑定每个类上，这个类会在容器中创建对象

**按需加载所有自动配置项**

  - 非常多的starter
  - 引入了哪些场景这个场景的自动配置才会开启
  - SpringBoot所有的自动配置功能都在 spring-boot-autoconfigure 包里面

## 2.SpringBoot2核心功能

## 3.SpringBoot2场景整合

# 第二季： SpringBoot2响应式编程

## 1.响应式编程

## 2.Webflux开发web应用

## 3.响应式访问持久化层

## 4.响应式安全开发

## 5.响应式原理