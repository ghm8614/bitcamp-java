package com.bitcamp.web.java.oop.jb04.part07.outer;

import com.bitcamp.web.java.oop.jb04.part07.Father;

// Father과 다른 패키지, 상속 o
public class Son extends Father {

    public Son() {
        System.out.println(this.name);
        System.out.println(bank);  // protected : 상속받았으면, 다른 패키지라도 접근가능
//        System.out.println(branch);
//        System.out.println(password);
    }
}
