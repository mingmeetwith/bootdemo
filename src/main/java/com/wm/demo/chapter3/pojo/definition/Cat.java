package com.wm.demo.chapter3.pojo.definition;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("猫["+Cat.class.getSimpleName()+"]是抓老鼠的。");
    }
}
