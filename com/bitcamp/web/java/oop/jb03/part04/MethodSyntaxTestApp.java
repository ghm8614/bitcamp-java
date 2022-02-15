package com.bitcamp.web.java.oop.jb03.part04;

import com.bitcamp.web.java.oop.jb03.part04.MethodSyntax;

public class MethodSyntaxTestApp {
    public static void main(String[] args) {

        // 인스턴스 생성
        MethodSyntax methodSyntax = new MethodSyntax();

        System.out.println("===========");
        methodSyntax.browserOn();

        System.out.println("===========");
        boolean result = methodSyntax.documentWork();
        System.out.println("문서 작업유무 = " + result);

        System.out.println("===========");
        System.out.println("sum 값 = " + methodSyntax.sum(1, 1));

        System.out.println("===========");
        System.out.println("name = " + methodSyntax.getName());

        System.out.println("===========");
        System.out.println("address = " + methodSyntax.getAddress());

        System.out.println("===========");
        String[] info = methodSyntax.getAllInformation();
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }

    }
}

