package sharedmodels.cw;

import javax.persistence.*;
import java.util.ArrayList;
public class HomeWork {
    private int id;
    private String homeworkFileString;
    private ArrayList<Solution> solutions;

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

    public ArrayList<Solution> getSolutions() {
        return solutions;
    }

    public void setSolutions(ArrayList<Solution> solutions) {
        this.solutions = solutions;
    }

    public HomeWork(String homeworkFileString) {
        this.homeworkFileString = homeworkFileString;
    }
}
