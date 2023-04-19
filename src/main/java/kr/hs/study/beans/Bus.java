package kr.hs.study.beans;

import lombok.Data;

@Data
public class Bus implements Meter{
    private String startData;
    private String stopData;

//    xml
//    @Override
//    public void start() {
//        System.out.println("버스 운행을 시작합니다.");
//    }
//
//    @Override
//    public int stop(int distance) {
//        System.out.println("버스 운행을 종료합니다. 요금은 일반 1,250원 / 청소년 720원 / 어린이 450원 입니다.");
//        return 0;
//    }

//    constructor
    public Bus(String startData, String stopData) {
        this.startData = startData;
        this.stopData = stopData;
    }

    @Override
    public void start() {
        System.out.println(startData + "버스 운행을 시작합니다.");
    }

    @Override
    public int stop(int distance) {
        System.out.println(stopData + "버스 운행을 종료합니다. 요금은 일반 1,250원 / 청소년 720원 / 어린이 450원 입니다.");
        return 0;
    }

}
