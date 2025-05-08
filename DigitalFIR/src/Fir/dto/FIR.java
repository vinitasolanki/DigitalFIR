package Fir.dto;


public class FIR
{
private int applicationNo;
private String dateOfRegistration;
private String nameOfComplainant;
private String complain;
private String nameOfAccused;
private String address;
private long contact;



public FIR(){ 
} 

    public FIR(int applicationNo, String dateOfRegistration, String nameOfComplainant, String complain, String nameOfAccused, String address, long contact) {
        this.applicationNo = applicationNo;
        this.dateOfRegistration = dateOfRegistration;
        this.nameOfComplainant = nameOfComplainant;
        this.complain = complain;
        this.nameOfAccused = nameOfAccused;
        this.address = address;
        this.contact = contact;
    }

   

    public String getAddress() {
        return address;
    }

    public int getApplicationNo() {
        return applicationNo;
    }

    public String getComplain() {
        return complain;
    }

    public long getContact() {
        return contact;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public String getNameOfAccused() {
        return nameOfAccused;
    }

    public String getNameOfComplainant() {
        return nameOfComplainant;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setApplicationNo(int applicationNo) {
        this.applicationNo= applicationNo;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public void setNameOfAccused(String nameOfAccused) {
        this.nameOfAccused = nameOfAccused;
    }

    public void setNameOfComplainant(String nameOfComplainant) {
        this.nameOfComplainant = nameOfComplainant;
    }
    
}