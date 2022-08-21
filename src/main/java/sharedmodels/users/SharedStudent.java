package sharedmodels.users;

import sharedmodels.department.Course;
import sharedmodels.department.Department;
import sharedmodels.department.PassedCourse;
import sharedmodels.department.TemporaryCourse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Random;
public class SharedStudent extends SharedUser {
    private double average;
    private int units;
    private String departmentId;
    private String helperSharedMasterId;
    private String enteringYear;
    private StudentGrade grade;
    private EducationalStatus status;
    private Licence registrationLicence;
    private String registrationTime;
    private ArrayList<String> coursesId = new ArrayList<>();
    private ArrayList<String> passedCoursesId = new ArrayList<>();
    private ArrayList<String> temporaryCoursesId = new ArrayList<>();

    public SharedStudent(){
        super();
    }

    public SharedStudent(String username){
        super(username);
        this.setRole(Role.STUDENT);
        setRegistrationLicence();
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }



    public String getEnteringYear() {
        return enteringYear;
    }

    public void setEnteringYear(String enteringYear) {
        this.enteringYear = enteringYear;
    }

    public StudentGrade getGrade() {
        return grade;
    }

    public void setGrade(StudentGrade grade) {
        this.grade = grade;
    }

    public EducationalStatus getStatus() {
        return status;
    }

    public void setStatus(EducationalStatus status) {
        this.status = status;
    }

    public Licence getRegistrationLicence() {
        return registrationLicence;
    }

    public void setRegistrationLicence(Licence registrationLicence) {
        this.registrationLicence = registrationLicence;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getHelperSharedMasterId() {
        return helperSharedMasterId;
    }

    public void setHelperSharedMasterId(String helperSharedMasterId) {
        this.helperSharedMasterId = helperSharedMasterId;
    }

    public ArrayList<String> getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(ArrayList<String> coursesId) {
        this.coursesId = coursesId;
    }

    public ArrayList<String> getPassedCoursesId() {
        return passedCoursesId;
    }

    public void setPassedCoursesId(ArrayList<String> passedCoursesId) {
        this.passedCoursesId = passedCoursesId;
    }

    public ArrayList<String> getTemporaryCoursesId() {
        return temporaryCoursesId;
    }

    public void setTemporaryCoursesId(ArrayList<String> temporaryCoursesId) {
        this.temporaryCoursesId = temporaryCoursesId;
    }

    public void setRegistrationLicence() {
        Random rd = new Random();
        int random = rd.nextInt() % 2;
        if (random == 0) this.registrationLicence = Licence.ALLOWED;
        else this.registrationLicence = Licence.ILLEGAL;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }


}
