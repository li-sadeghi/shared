package sharedmodels.users;

import sharedmodels.department.Course;
import sharedmodels.department.Department;
import java.util.ArrayList;
import java.util.List;

public class SharedMaster extends SharedUser {
    private MasterRole masterRole;
    private String departmentId;
    private MasterGrade grade;
    private String roomNumber;
    private ArrayList<String> coursesId = new ArrayList<>();
    private List<String> studentsIsHelperMasterIds = new ArrayList<>();

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

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
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

    public ArrayList<String> getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(ArrayList<String> coursesId) {
        this.coursesId = coursesId;
    }

    public List<String> getStudentsIsHelperMasterIds() {
        return studentsIsHelperMasterIds;
    }

    public void setStudentsIsHelperMasterIds(List<String> studentsIsHelperMasterIds) {
        this.studentsIsHelperMasterIds = studentsIsHelperMasterIds;
    }
}
