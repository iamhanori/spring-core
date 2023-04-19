package kr.hs.study.beans;

import lombok.Data;

@Data
public class Rabbit implements Animal{
    private String moveData;
    private String eatData;
    private String barkData;

//    // xml
//    @Override
//    public void move() {
//        System.out.println("토끼가 움직인다");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("토끼가 먹는다");
//    }
//
//    @Override
//    public void bark() {
//        System.out.println("토끼가 운다 ...");
//    }

    // constructor DI
    public Rabbit(String moveData, String eatData, String barkData) {
        this.moveData = moveData;
        this.eatData = eatData;
        this.barkData = barkData;
    }

    @Override
    public void move() {
        System.out.println("rabbit 움직인다." + this.moveData);
    }

    @Override
    public void eat() {
        System.out.println("rabbit 먹는다." + this.eatData);
    }

    @Override
    public void bark() {
        System.out.println("rabbit 짖는다." + this.barkData);
    }

}
