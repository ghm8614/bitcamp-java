package com.bitcamp.web.java.oop.jb04.part07;

// Father과 같은 패키지, 상속 o
public class Son extends Father {

    public Son() {
        System.out.println(this.name);
        System.out.println(bank);
        System.out.println(branch);

        // 1. private 필드에 직접 접근 불가
//        System.out.println(password);

        // 2. 메서드에 올바른 key를 입력 시엔, 접근가능
        getPassword(0);
    }
}
