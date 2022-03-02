package com.bitcamp.web.java.prob;

import java.util.Objects;

public class CellPhone2 {

    //F
    String model;   // 핸드폰 모델 번호
    double battery; // 남은 배터리

    //C
    public CellPhone2() {
    }

    public CellPhone2(String model) {
        this.model = model;
    }

    //M
    public void call(int time) {
        System.out.println("통화 시간 : " + time + "분");

        this.battery -= time * 0.5;
        if (battery < 0) {
            battery = 0;
        }

        if (time < 0) {
            throw new IllegalArgumentException("통화시간 입력오류");
        }
    }


    public void charge(int time) {
        System.out.println("충전 시간 : " + time + "분");

        this.battery += time * 3;
        if (battery > 0) {
            battery = 100;
        }

        if (time < 0) {
            throw new IllegalArgumentException("충전시간 입력오류");
        }
    }

    public void printBattery() {
        System.out.println("남은 배터리 양 : " + this.battery);
    }

    // equals() 오버라이딩..
}
