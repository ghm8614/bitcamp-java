package com.bitcamp.web.java.oop.jp02.part05;

// Inner Member Class
// innerMember Class�� Ŭ������ �����ϴ� �ʵ�,�޼���� ���� Ŭ������ �����ϴ� Member�� �ɼ��ִ�.(inner Ŭ������ �ʵ�,�޼���ó�� ���?)
// ��������� OuterClass�� ������ ����
// ������ ���� innerClass�� � ������ Ŭ������ �Ǵ��� Ȯ��..
public class OuterClass01 {

    //F
    private String outer = "Outer Class Field";

    //C
    public OuterClass01() {
    }

    //M
    public void outerMethod() {
        System.out.println(":: " + this.getClass().getName() + " ����");
        // innerClass�� ������ ���, �ν��Ͻ� ���� �� ����
        InnerClass ic = new InnerClass();
        ic.innerMethod();
        System.out.println(":: " + this.getClass().getName() + " ��");
    }

    //InnerMember Class
    public class InnerClass {
        //F
        private String inner = "Inner Class Field";

        //C
        public InnerClass() {
        }

        //M
        public void innerMethod() {
            // innerClass���� outerClass�� ����
            // OuterClass01�� �ʵ�, �޼��忡 ���� ���ٰ���, ���� ���ʿ�
            System.out.println(" :: " + this.getClass().getName() + " ����");
            // OuterClass�� �ʵ� ���� ��� : 2����
            System.out.println(outer);
            System.out.println(OuterClass01.this.outer);
//            System.out.println(this.outer);   error �߻�
            System.out.println(inner);
            System.out.println(" :: " + this.getClass().getName() + " ��");
        }

    }

    //Main
    public static void main(String[] args) {
        new OuterClass01().outerMethod();
    }
}
