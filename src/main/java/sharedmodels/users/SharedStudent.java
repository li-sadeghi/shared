package sharedmodels.users;

import sharedmodels.department.Course;
import sharedmodels.department.Department;
import sharedmodels.department.PassedCourse;
import sharedmodels.department.TemporaryCourse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Random;public class SharedStudent extends SharedUser {
    private double average;
    private int units;
    private Department department;
    private SharedMaster helperSharedMaster;
    private String enteringYear;
    private StudentGrade grade;
    private EducationalStatus status;
    private Licence registrationLicence;
    private String registrationTime;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<PassedCourse> passedCourses = new ArrayList<>();
    private ArrayList<TemporaryCourse> temporaryCourses = new ArrayList<>();

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

    public SharedMaster getHelperMaster() {
        return helperSharedMaster;
    }

    public void setHelperMaster(SharedMaster helperSharedMaster) {
        this.helperSharedMaster = helperSharedMaster;
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<PassedCourse> getPassedCourses() {
        return passedCourses;
    }

    public void setPassedCourses(ArrayList<PassedCourse> passedCourses) {
        this.passedCourses = passedCourses;
    }

    public ArrayList<TemporaryCourse> getTemporaryCourses() {
        return temporaryCourses;
    }

    public void setTemporaryCourses(ArrayList<TemporaryCourse> temporaryCourses) {
        this.temporaryCourses = temporaryCourses;
    }

    public void setRegistrationLicence() {
        Random rd = new Random();
        int random = rd.nextInt() % 2;
        if (random == 0) this.registrationLicence = Licence.ALLOWED;
        else this.registrationLicence = Licence.ILLEGAL;
    }

    public void setAverage()  {
        int size = passedCourses.size();
        double sum = 0;
        int unitsPassed = 0;
        for (int i = 0; i < size; i++) {
            //TODO
        }
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
