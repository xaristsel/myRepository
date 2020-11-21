package com.codehub.springcoreexamples.vehicle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car implements Vehicle, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void start() {
        System.out.println("Travelling by Car");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName called ### Demo Car Bean name is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory called ### Demo Car Bean Factory has been set ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext called ### Demo Car Bean application context name is " + applicationContext.getDisplayName());
    }

    public void beanPostProcessbeforeInit() {
        System.out.println("postProcessor before initialization triggered ### Before Car Init called by BeanPostProcessor");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("initmethod called ### Inside Car bean init method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet called ### Demo Car Bean has its properties set");
    }

    public void beanPostProcessAfterInit() {
        System.out.println("postProcessor after initialization triggered ### After Car Init called by BeanPostProcessor");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroy method called ### Inside Car bean destroyMethod method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method of Disposable bean called ### Demo Car Bean has been destroyed");
    }


}
