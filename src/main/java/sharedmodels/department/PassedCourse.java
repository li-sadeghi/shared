package sharedmodels.department;
import sharedmodels.users.SharedStudent;

import javax.persistence.*;

public class PassedCourse {
    private String id;
    private double mark;
    private int unit;
    private String name;
    private String courseId;
    private PassStatus status;
    private SharedStudent master;
    private SharedStudent student;


    public PassedCourse() {
    }

    public PassedCourse(double mark) {
        this.mark = mark;
        if (mark >= 10) status = PassStatus.PASS;
        else if (mark >= 0) status = PassStatus.FAIL;
        else status = PassStatus.W;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public PassStatus getStatus() {
        return status;
    }

    public void setStatus(PassStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SharedStudent getMaster() {
        return master;
    }

    public void setMaster(SharedStudent master) {
        this.master = master;
    }

    public SharedStudent getStudent() {
        return student;
    }

    public void setStudent(SharedStudent student) {
        this.student = student;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
