package com.jie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages = "com")
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com")
public class Application {
    //   SpringBoot所有的自动配置功能都在 spring-boot-autoconfigure 包里面
    public static void main(String[] args) {
        // 返回我们的ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        // 查看容器里面的组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        /*System.out.println("========================================");
        // 从容器中获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件：" + (tom01 == tom02));   // 组件单实例的

        // com.jie.config.MyConfig$$EnhancerBySpringCGLIB$$2f899407@649f25f3
        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);

        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法。SpringBoot总会检查这个组件是否在容器中有。
        //保持组件单实例
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println(user == user1);


        // @Configuration(proxyBeanMethods = false) 如果为配置为false，就不是使用代理创建的单利
        User user01 = run.getBean("user01", User.class);
        Pet tom = run.getBean("tom", Pet.class);
        System.out.println("用户的宠物："+(user01.getPet() == tom));


        //5、获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("======");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }
        System.out.println("======");

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);*/


        boolean tom = run.containsBean("tom");
        System.out.println("容器中Tom组件："+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中user01组件："+user01);

        boolean tom22 = run.containsBean("tom22");
        System.out.println("容器中tom22组件："+tom22);

        // @ImportResource("classpath:beans.xml")导入Spring的配置文件，
        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("haha："+haha);
        System.out.println("hehe："+hehe);


    }
}
