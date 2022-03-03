package com.bitcamp.web.java.prob;

public class Score2 {

    //F
    private String name;
    private String subject;
    private int score;
    private String passOrFail;

    //C
    public Score2() {

    }

    public Score2(String name, String subject, int score, String passOrFail) {
        this.name = name;
        this.subject = subject;
        this.score = score;
        this.passOrFail = passOrFail;
    }

    //M
    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPassOrFail() {
        return passOrFail;
    }

    public void setPassOrFail(String passOrFail) {
        this.passOrFail = passOrFail;
    }


    @Override
    public String toString() {
        return "[" + name + ", " + subject + ", " + score +
                ", " + passOrFail + "]";
    }
}
