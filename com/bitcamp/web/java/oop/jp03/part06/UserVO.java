package com.bitcamp.web.java.oop.jp03.part06;

// ȸ�������� ������ �ִ� UserVO : ValueObject => RMI / EJB (Value Object Pattern)
// ȸ���� ������ ���� UserVO instance �� ���Ͽ� ����� ��
// ��ü�� ����� �ڿ�, ��Ʈ��ũ �ڿ����� �̵��Ǳ� ���ؼ��� Serializable �̶�� marker interface �� �����ؾ� �Ѵ�. (��ü�� ����ȭ)
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
