package sharedmodels.cw;


import sharedmodels.users.SharedStudent;

import javax.persistence.*;

public class Solution {
    private int id;
    private double mark;
    private SharedStudent responsive;
    private String answerFileString;

    public Solution() {
    }

    public Solution(SharedStudent responsive, String answerFileString) {
        this.responsive = responsive;
        this.answerFileString = answerFileString;
    }

    public SharedStudent getResponsive() {
        return responsive;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setResponsive(SharedStudent responsive) {
        this.responsive = responsive;
    }

    public String getAnswerFileString() {
        return answerFileString;
    }

    public void setAnswerFileString(String answerFileString) {
        this.answerFileString = answerFileString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
