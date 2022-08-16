package sharedmodels.department;

import sharedmodels.users.SharedMaster;
import sharedmodels.users.SharedStudent;

import javax.persistence.*;
import java.util.ArrayList;
public class Department {
    private String id;
    private String name;
    private SharedMaster chairman;
    private SharedMaster educationalAssistant;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<SharedMaster> masters = new ArrayList<>();
    private ArrayList<SharedStudent> students = new ArrayList<>();

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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public SharedMaster getChairman() {
        return chairman;
    }

    public void setChairman(SharedMaster chairman) {
        this.chairman = chairman;
    }

    public SharedMaster getEducationalAssistant() {
        return educationalAssistant;
    }

    public void setEducationalAssistant(SharedMaster educationalAssistant) {
        this.educationalAssistant = educationalAssistant;
    }

    public ArrayList<SharedMaster> getMasters() {
        return masters;
    }

    public ArrayList<SharedStudent> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<SharedStudent> students) {
        this.students = students;
    }

    public void setMasters(ArrayList<SharedMaster> masters) {
        this.masters = masters;
    }
}
