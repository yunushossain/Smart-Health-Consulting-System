package com.example;

import java.sql.Date;
import java.util.Vector;

public class AppointModel {

    private int id;
    private String patientfName;
    private String pusername;
    private String pGender;
    private String pAge;
    private String pContact;
    private String doctorfName;
    private String dusername;
    private String department;
    private String hospital;
    private String problem;
    private Date getdate;
    private String status;

    public AppointModel(int id, String patientfName, String pusername, String pGender, String pAge, String pContact, String doctorfName, String dusername, String department, String hospital, String problem, Date getdate, String status) {
        this.id = id;
        this.patientfName = patientfName;
        this.pusername = pusername;
        this.pGender = pGender;
        this.pAge = pAge;
        this.pContact = pContact;
        this.doctorfName = doctorfName;
        this.dusername = dusername;
        this.department = department;
        this.hospital = hospital;
        this.problem = problem;
        this.getdate = getdate;
        this.status = status;
    }

    public AppointModel(String patientfName, String pusername, String pGender, String pAge, String pContact, String doctorfName, String dusername, String department, String hospital, String problem, Date getdate, String status) {
        this.patientfName = patientfName;
        this.pusername = pusername;
        this.pGender = pGender;
        this.pAge = pAge;
        this.pContact = pContact;
        this.doctorfName = doctorfName;
        this.dusername = dusername;
        this.department = department;
        this.hospital = hospital;
        this.problem = problem;
        this.getdate = getdate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientfName() {
        return patientfName;
    }

    public void setPatientfName(String patientfName) {
        this.patientfName = patientfName;
    }

    public String getPusername() {
        return pusername;
    }

    public void setPusername(String pusername) {
        this.pusername = pusername;
    }

    public String getpGender() {
        return pGender;
    }

    public void setpGender(String pGender) {
        this.pGender = pGender;
    }

    public String getpAge() {
        return pAge;
    }

    public void setpAge(String pAge) {
        this.pAge = pAge;
    }

    public String getpContact() {
        return pContact;
    }

    public void setpContact(String pContact) {
        this.pContact = pContact;
    }

    public String getDoctorfName() {
        return doctorfName;
    }

    public void setDoctorfName(String doctorfName) {
        this.doctorfName = doctorfName;
    }

    public String getDusername() {
        return dusername;
    }

    public void setDusername(String dusername) {
        this.dusername = dusername;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Date getGetdate() {
        return getdate;
    }

    public void setGetdate(Date getdate) {
        this.getdate = getdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AppointModel{" + "id=" + id + ", patientfName=" + patientfName + ", pusername=" + pusername + ", pGender=" + pGender + ", pAge=" + pAge + ", pContact=" + pContact + ", doctorfName=" + doctorfName + ", dusername=" + dusername + ", department=" + department + ", hospital=" + hospital + ", problem=" + problem + ", getdate=" + getdate + ", status=" + status + '}';
    }

    public Object[] toTableObject() {
        return new Object[]{
            patientfName,
            pusername,
            pGender,
            pAge,
            pContact,
            doctorfName,
            dusername,
            department,
            hospital,
            problem,
            getdate,
            status
        };
    }

}
