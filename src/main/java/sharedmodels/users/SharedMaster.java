package sharedmodels.users;

import sharedmodels.department.Course;
import sharedmodels.department.Department;
import java.util.ArrayList;
public class SharedMaster extends SharedUser {
    private MasterRole masterRole;
    private Department department;
    private MasterGrade grade;
    private String roomNumber;
    private ArrayList<Course> courses = new ArrayList<>();

    public SharedMaster() {
        super();
    }

    public SharedMaster(String username) {
        super(username);
        this.setRole(Role.MASTER);
    }

    public MasterRole getMasterRole() {
        return masterRole;
    }

    public void setMasterRole(MasterRole masterRole) {
        this.masterRole = masterRole;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public MasterGrade getGrade() {
        return grade;
    }

    public void setGrade(MasterGrade grade) {
        this.grade = grade;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
