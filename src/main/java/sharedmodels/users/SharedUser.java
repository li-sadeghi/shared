package sharedmodels.users;

import javax.persistence.*;
public class SharedUser {
    private String username;
    private Role role;
    private String fullName;
    private String nationalCode;
    private String emailAddress;
    private String phoneNumber;
    private String lastLogin;
    private String userImageBytes;
    // dont forget: private ArrayList<Request> requests = new ArrayList<Request>();
    public SharedUser(){

    }
    public SharedUser(String username)  {
        this.setUsername(username);
        this.setLastLogin(null);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getUserImageBytes() {
        return userImageBytes;
    }

    public void setUserImageBytes(String userImageBytes) {
        this.userImageBytes = userImageBytes;
    }
}
