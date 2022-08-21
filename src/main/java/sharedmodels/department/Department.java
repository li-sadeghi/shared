package sharedmodels.department;

import sharedmodels.users.SharedMaster;
import sharedmodels.users.SharedStudent;

import javax.persistence.*;
import java.util.ArrayList;
public class Department {
    private String id;
    private String name;
    private String chairmanId;
    private String educationalAssistantId;
    private ArrayList<String> coursesId = new ArrayList<>();
    private ArrayList<String> mastersId = new ArrayList<>();
    private ArrayList<String> studentsId = new ArrayList<>();

    public Department() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getChairmanId() {
        return chairmanId;
    }

    public void setChairmanId(String chairmanId) {
        this.chairmanId = chairmanId;
    }

    public String getEducationalAssistantId() {
        return educationalAssistantId;
    }

    public void setEducationalAssistantId(String educationalAssistantId) {
        this.educationalAssistantId = educationalAssistantId;
    }

    public ArrayList<String> getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(ArrayList<String> coursesId) {
        this.coursesId = coursesId;
    }

    public ArrayList<String> getMastersId() {
        return mastersId;
    }

    public void setMastersId(ArrayList<String> mastersId) {
        this.mastersId = mastersId;
    }

    public ArrayList<String> getStudentsId() {
        return studentsId;
    }

    public void setStudentsId(ArrayList<String> studentsId) {
        this.studentsId = studentsId;
    }
}
