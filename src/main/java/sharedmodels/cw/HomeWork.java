package sharedmodels.cw;

import javax.persistence.*;
import java.util.ArrayList;
public class HomeWork {
    private int id;
    private String homeworkFileString;

    private String homeWorkName;
    private ArrayList<Integer> solutionsId;

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
}
