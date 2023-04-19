package kr.hs.study.beans;

import lombok.Data;

@Data
public class Dog implements Animal{
    private String moveData;
    private String eatData;
    private String barkData;

    // xml
//    @Override
//    public void move() {
//        System.out.println("강아지가 움직인다");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("강아지가 먹는다");
//    }
//
//    @Override
//    public void bark() {
//        System.out.println("강아지가 짖는다 멍멍");
//    }


    // constructor DI
    public Dog(String moveData, String eatData, String barkData) {
        this.moveData = moveData;
        this.eatData = eatData;
        this.barkData = barkData;
    }

    @Override
    public void move() {
        System.out.println("dog 움직인다." + this.moveData);
    }

    @Override
    public void eat() {
        System.out.println("dog 먹는다." + this.eatData);
    }

    @Override
    public void bark() {
        System.out.println("dog 짖는다." + this.barkData);
    }

}
