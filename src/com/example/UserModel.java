package com.example;

public class UserModel {

    private int id;
    private String fullname;
    private String username;
    private String password;
    private String userrole;
    private String gender;
    private String age;
    private String contact;
    private String address;

    public UserModel(int id, String fullname, String username, String password, String userrole, String gender, String age, String contact, String address) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.userrole = userrole;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    public UserModel(String fullname, String username, String password, String userrole, String gender, String age, String contact, String address) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.userrole = userrole;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", fullname=" + fullname + ", username=" + username + ", password=" + password + ", userrole=" + userrole + ", gender=" + gender + ", age=" + age + ", contact=" + contact + ", address=" + address + '}';
    }

}
