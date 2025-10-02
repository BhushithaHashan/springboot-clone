package com.springclone.bean;

import org.springframework.stereotype.Component;

@Component
public class AnotherBean {

    private final MyBean myBean;

    public AnotherBean(MyBean myBean) {
        this.myBean = myBean;
    }

    public void test() {
        System.out.println("AnotherBean using " + myBean.getClass().getSimpleName());
    }
}
