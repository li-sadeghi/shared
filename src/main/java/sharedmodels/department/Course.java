package sharedmodels.department;


import sharedmodels.cw.EducationalThing;
import sharedmodels.cw.HomeWork;
import sharedmodels.users.SharedMaster;
import sharedmodels.users.SharedStudent;

import javax.persistence.*;
import java.util.ArrayList;
public class Course {
    private String id;
    private String name;
    private int capacity;
    private SharedMaster master;
    private Department department;
    private int unit;
    private String weeklyTime;
    private String examTime;
    private Course prerequisite;
    private ArrayList<SharedStudent> studentsHaveCourse = new ArrayList<>();
    private ArrayList<SharedStudent> teacherAssistants = new ArrayList<>();
    private ArrayList<EducationalThing> educationalThings = new ArrayList<>();
    private ArrayList<HomeWork> homeWorks = new ArrayList<>();


    public Course() {
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getWeeklyTime() {
        return weeklyTime;
    }

    public void setWeeklyTime(String weeklyTime) {
        this.weeklyTime = weeklyTime;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public SharedMaster getMaster() {
        return master;
    }

    public void setMaster(SharedMaster master) {
        this.master = master;
    }

    public Course getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Course prerequisite) {
        this.prerequisite = prerequisite;
    }

    public ArrayList<SharedStudent> getStudentsHaveCourse() {
        return studentsHaveCourse;
    }

    public void setStudentsHaveCourse(ArrayList<SharedStudent> studentsHaveCourse) {
        this.studentsHaveCourse = studentsHaveCourse;
    }

    public ArrayList<SharedStudent> getTeacherAssistants() {
        return teacherAssistants;
    }

    public void setTeacherAssistants(ArrayList<SharedStudent> teacherAssistants) {
        this.teacherAssistants = teacherAssistants;
    }

    public ArrayList<EducationalThing> getEducationalThings() {
        return educationalThings;
    }

    public void setEducationalThings(ArrayList<EducationalThing> educationalThings) {
        this.educationalThings = educationalThings;
    }

    public ArrayList<HomeWork> getHomeWorks() {
        return homeWorks;
    }

    public void setHomeWorks(ArrayList<HomeWork> homeWorks) {
        this.homeWorks = homeWorks;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
