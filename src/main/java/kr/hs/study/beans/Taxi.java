package kr.hs.study.beans;

import lombok.Data;

@Data
public class Taxi implements Meter{
    private String startData;
    private String stopData;

//    xml
//    @Override
//    public void start() {
//        System.out.println("Taxi 운행을 시작합니다.");
//    }
//
//    @Override
//    public int stop(int distance) {
//        int fare = distance * 2;
//        System.out.println("Taxi 운행을 종료합니다. 요금은 " + fare + "원 입니다.");
//        return 0;
//    }

//    constructor
    public Taxi(String startData, String stopData) {
        this.startData = startData;
        this.stopData = stopData;
    }

    @Override
    public void start() {
        System.out.println(startData + "Taxi 운행을 시작합니다.");
    }

    @Override
    public int stop(int distance) {
        int fare = distance * 2;
        System.out.println(stopData + "Taxi 운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return 0;
    }


}
