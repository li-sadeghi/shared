package sharedmodels.cw;

import javax.persistence.*;

public class EducationalThing {
    private int id;
    private String fileString;
    private String name;
    private String fileType;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
