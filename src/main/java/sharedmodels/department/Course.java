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
    private String isStarred = "No";
    private boolean haveCwPage ;
    private int capacity;
    private SharedMaster master;
    private String departmentId;
    private String departmentName;
    private int unit;
    private String weeklyTime;
    private String examTime;
    private String prerequisiteId;
    private ArrayList<String> studentsHaveCourseId = new ArrayList<>();
    private ArrayList<String> teacherAssistantsId = new ArrayList<>();
    private ArrayList<Integer> educationalThingsId = new ArrayList<>();
    private ArrayList<Integer> homeWorksId = new ArrayList<>();


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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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

    public String getPrerequisiteId() {
        return prerequisiteId;
    }

    public void setPrerequisiteId(String prerequisiteId) {
        this.prerequisiteId = prerequisiteId;
    }

    public ArrayList<String> getStudentsHaveCourseId() {
        return studentsHaveCourseId;
    }

    public void setStudentsHaveCourseId(ArrayList<String> studentsHaveCourseId) {
        this.studentsHaveCourseId = studentsHaveCourseId;
    }

    public ArrayList<String> getTeacherAssistantsId() {
        return teacherAssistantsId;
    }

    public void setTeacherAssistantsId(ArrayList<String> teacherAssistantsId) {
        this.teacherAssistantsId = teacherAssistantsId;
    }

    public ArrayList<Integer> getEducationalThingsId() {
        return educationalThingsId;
    }

    public void setEducationalThingsId(ArrayList<Integer> educationalThingsId) {
        this.educationalThingsId = educationalThingsId;
    }

    public ArrayList<Integer> getHomeWorksId() {
        return homeWorksId;
    }

    public void setHomeWorksId(ArrayList<Integer> homeWorksId) {
        this.homeWorksId = homeWorksId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getIsStarred() {
        return isStarred;
    }

    public void setIsStarred(String isStarred) {
        this.isStarred = isStarred;
    }

    public boolean isHaveCwPage() {
        return haveCwPage;
    }

    public void setHaveCwPage(boolean haveCwPage) {
        this.haveCwPage = haveCwPage;
    }
}
