package com.wm.demoouter;

import com.wm.demo.chapter3.pojo.definition.Animal;

public class Squirrel implements Animal {
    @Override
    public void use() {
        System.out.println("松鼠可以采集松果");
    }
}
