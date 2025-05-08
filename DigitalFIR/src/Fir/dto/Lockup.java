package Fir.dto;


public class Lockup
{
private int lockupNo;
private String accusedName;
private String crime;
private String image;

private long contact;

public Lockup(){ 
}

    public Lockup(int lockupNo, String accusedName, String crime, String image,  long contact) {
        this.lockupNo = lockupNo;
        this.accusedName = accusedName;
        this.crime = crime;
        this.image = image;
       
        this.contact = contact;
    }

    

    public String getAccusedName() {
        return accusedName;
    }

    public long getContact() {
        return contact;
    }

    public String getCrime() {
        return crime;
    }

   
    public int getLockupNo() {
        return lockupNo;
    }

    public void setAccusedName(String accusedName) {
        this.accusedName = accusedName;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

   

    public void setLockupNo(int lockupNo) {
        this.lockupNo = lockupNo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}