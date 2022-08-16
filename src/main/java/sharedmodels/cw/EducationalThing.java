package sharedmodels.cw;

import javax.persistence.*;

public class EducationalThing {
    private int id;
    private String fileString;

    public EducationalThing() {
    }

    public EducationalThing(String fileString) {
        this.fileString = fileString;
    }

    public String getFileString() {
        return fileString;
    }

    public void setFileString(String fileString) {
        this.fileString = fileString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
