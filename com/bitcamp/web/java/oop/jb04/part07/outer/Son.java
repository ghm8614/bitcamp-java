package com.bitcamp.web.java.oop.jb04.part07.outer;

import com.bitcamp.web.java.oop.jb04.part07.Father;

// Father�� �ٸ� ��Ű��, ��� o
public class Son extends Father {

    public Son() {
        System.out.println(this.name);
        System.out.println(bank);  // protected : ��ӹ޾�����, �ٸ� ��Ű���� ���ٰ���
//        System.out.println(branch);
//        System.out.println(password);
    }
}
