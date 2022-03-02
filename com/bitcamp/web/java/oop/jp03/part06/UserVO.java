package com.bitcamp.web.java.oop.jp03.part06;

// 회원정보를 가지고 있는 UserVO : ValueObject => RMI / EJB (Value Object Pattern)
// 회원의 정보를 갖는 UserVO instance 는 파일에 저장될 것
// 객체를 입출력 자원, 네트워크 자원으로 이동되기 위해서는 Serializable 이라는 marker interface 를 구현해야 한다. (객체의 직렬화)
public class UserVO {

    //F
    private int no;
    private String name;

    //C
    public UserVO() {

    }

    public UserVO(int no, String name) {
        this.no = no;
        this.name = name;
    }

    //M
    //getter/setter


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserVO [no=");
        builder.append(no);
        builder.append(", name =");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

}//end of class
