package sharedmodels.department;

import sharedmodels.users.SharedMaster;
import sharedmodels.users.SharedStudent;

public class TemporaryCourse {
    private String id;
    private double mark;
    private int unit;
    private String name;
    private PassStatus status;
    private String protestText;
    private SharedMaster master;
    private SharedStudent student;


    public TemporaryCourse() {
    }

    public TemporaryCourse(double mark) {
        this.mark = mark;
        if (mark >= 10) status = PassStatus.PASS;
        else if (mark >= 0) status = PassStatus.FAIL;
        else status = PassStatus.W;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
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

    public PassStatus getStatus() {
        return status;
    }

    public void setStatus(PassStatus status) {
        this.status = status;
    }

    public String getProtestText() {
        return protestText;
    }

    public void setProtestText(String protestText) {
        this.protestText = protestText;
    }

    public SharedMaster getMaster() {
        return master;
    }

    public void setMaster(SharedMaster master) {
        this.master = master;
    }

    public SharedStudent getStudent() {
        return student;
    }

    public void setStudent(SharedStudent student) {
        this.student = student;
    }
}
