package kr.hs.study;

import kr.hs.study.beans.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//        // xml
//        Dog xdog = ctx.getBean("xdog", Dog.class);
//        xdog.move();
//        xdog.eat();
//        xdog.bark();
//
//        Cat xcat = ctx.getBean("xcat", Cat.class);
//        xcat.move();
//        xcat.eat();
//        xcat.bark();
//
//        Rabbit xrabbit = ctx.getBean("xrabbit", Rabbit.class);
//        xrabbit.move();
//        xrabbit.eat();
//        xrabbit.bark();
//
//        Taxi xtaxi = ctx.getBean("xtaxi", Taxi.class);
//        xtaxi.start();
//        xtaxi.stop(5);
//
//        Bus xbus = ctx.getBean("xbus", Bus.class);
//        xbus.start();
//        xbus.stop(5);

//        constructor
//        Dog cdog = ctx.getBean("cdog", Dog.class);
//        cdog.move();
//        cdog.eat();
//        cdog.bark();
//
//        Cat ccat = ctx.getBean("ccat", Cat.class);
//        ccat.move();
//        ccat.eat();
//        ccat.bark();
//
//        Rabbit crabbit = ctx.getBean("crabbit", Rabbit.class);
//        crabbit.move();
//        crabbit.eat();
//        crabbit.bark();

        Taxi ctaxi = ctx.getBean("ctaxi", Taxi.class);
        ctaxi.start();
        ctaxi.stop(8);

        Bus cbus = ctx.getBean("cbus", Bus.class);
        cbus.start();
        cbus.stop(8);
    }
}