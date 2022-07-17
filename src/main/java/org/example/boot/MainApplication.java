package org.example.boot;

import ch.qos.logback.core.db.DBHelper;
import org.example.boot.bean.Pet;
import org.example.boot.bean.User;
import org.example.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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

        //3.从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("3.从容器中获取组件");
        System.out.println("组件tom01==tom02:" + (tom01 == tom02) + "\n");
        //组件tom01==tom02:true

        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);
        /**
         if @Configuration(proxyBeanMethods = false)
         bean = org.example.boot.config.MyConfig@534243e4 (bean是普通对象,直接new的对象)

         if @Configuration(proxyBeanMethods = true)
         bean = org.example.boot.config.MyConfig$$EnhancerBySpringCGLIB$$1d98ae26@99a65d3 (被spring增强的代理对象,先从容器中查找没有再创建)
         */

        //4、如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println("4.@Configuration(proxyBeanMethods = true) 保持组件单实例");
        System.out.println(user == user1);

        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);

        System.out.println("用户的宠物:" + (user01.getPet() == tom));
        /**
         * 当有其他人需要依赖我们的组件时,可以proxyBeanMethods = true可以确保是同一个对象
         * if @Configuration(proxyBeanMethods = true)
         *  user01.getPet() == tom  (用户的宠物就是容器中的宠物)
         */

        //5. 获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
            //org.example.boot.bean.User
            //user01
        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println("5. 获取组件");
        System.out.println(bean1);
        //ch.qos.logback.core.db.DBHelper@29d37757

        //6.条件装配
        System.out.println("6.条件装配");
        System.out.println("容器中tom组件" + run.containsBean("tom"));
        System.out.println("容器中testConditionalOnBean组件" + run.containsBean("testConditionalOnBean"));
        //容器中testConditionalOnBean组件false:由于没有404bean组件,所以testConditionalOnBean组件无法生效
        System.out.println("容器中testConditionalOnBean1组件" + run.containsBean("testConditionalOnBean1"));
        //容器中testConditionalOnBean1组件true:由于容器中有tom组件,所以testConditionalOnBean1组件生效

        //7.原生配置文件引入
        System.out.println("7.原生配置文件引入");
        System.out.println("原生配置文件beans.xml引入:" + run.containsBean("haha"));

    }
}
