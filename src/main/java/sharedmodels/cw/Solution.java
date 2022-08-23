package sharedmodels.cw;


import sharedmodels.users.SharedStudent;

import javax.persistence.*;

public class Solution {
    private int id;
    private double mark;
    private String responsiveId;
    private String responsiveName;
    private String time;
    private String answerFileString;
    private String answerFileType;

    public Solution() {
    }


    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
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

    public String getResponsiveId() {
        return responsiveId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setResponsiveId(String responsiveId) {
        this.responsiveId = responsiveId;
    }

    public String getResponsiveName() {
        return responsiveName;
    }

    public void setResponsiveName(String responsiveName) {
        this.responsiveName = responsiveName;
    }

    public String getAnswerFileType() {
        return answerFileType;
    }

    public void setAnswerFileType(String answerFileType) {
        this.answerFileType = answerFileType;
    }
}
