package com.wm.demo.chapter3.config;


//import com.wm.demo.chapter3.pojo.User;
import com.wm.demo.chapter3.pojo.definition.BussinessPerson;
import com.wm.demo.chapter3.pojo.definition.Person;
import com.wm.demo.chapter3.scope.pojo.ScopeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCTest {

    public static void main(String[] argc){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        User user = ctx.getBean(User.class);
//        log.info(user.getId());
//        User user1 = (User)ctx.getBean("initUser2");


//        Person person = ctx.getBean(BussinessPerson.class);
//        person.service();
//        ctx.close();

//        System.out.println(user.getId());
//        System.out.println(user1.getId());

        ScopeBean scopeBean1 = ctx.getBean(ScopeBean.class);
        ScopeBean scopeBean2 = ctx.getBean(ScopeBean.class);
        System.out.println(scopeBean1 == scopeBean2);
    }
}
