package kr.hs.study.beans;

import lombok.Data;

@Data
public class Cat implements Animal{
    private String moveData;
    private String eatData;
    private String barkData;

//    // xml
//    @Override
//    public void move() {
//        System.out.println("고양이가 움직인다");
//    }
//
//    @Override
//    public void eat() {
//        System.out.println("고양이가 먹는다");
//    }
//
//    @Override
//    public void bark() {
//        System.out.println("고양이가 운다 야옹");
//    }

    // constructor DI
    public Cat(String moveData, String eatData, String barkData) {
        this.moveData = moveData;
        this.eatData = eatData;
        this.barkData = barkData;
    }

    @Override
    public void move() {
        System.out.println("cat 움직인다." + this.moveData);
    }

    @Override
    public void eat() {
        System.out.println("cat 먹는다." + this.eatData);
    }

    @Override
    public void bark() {
        System.out.println("cat 짖는다." + this.barkData);
    }

}
