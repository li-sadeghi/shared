package sharedmodels.cw;

import javax.persistence.*;
import java.util.ArrayList;
public class HomeWork {
    private int id;
    private String homeworkFileString;
    private String startTime;
    private String endTime;
    private String homeWorkName;
    private ArrayList<Integer> solutionsId;
    private String courseId;
    private String homeWorkFileType;

    public HomeWork() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeworkFileString() {
        return homeworkFileString;
    }

    public void setHomeworkFileString(String homeworkFileString) {
        this.homeworkFileString = homeworkFileString;
    }

    public ArrayList<Integer> getSolutionsId() {
        return solutionsId;
    }

    public void setSolutionsId(ArrayList<Integer> solutionsId) {
        this.solutionsId = solutionsId;
    }

    public HomeWork(String homeworkFileString) {
        this.homeworkFileString = homeworkFileString;
    }

    public String getHomeWorkName() {
        return homeWorkName;
    }

    public void setHomeWorkName(String homeWorkName) {
        this.homeWorkName = homeWorkName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getHomeWorkFileType() {
        return homeWorkFileType;
    }

    public void setHomeWorkFileType(String homeWorkFileType) {
        this.homeWorkFileType = homeWorkFileType;
    }
}
