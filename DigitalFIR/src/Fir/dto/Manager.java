package Fir.dto;


public class Manager
{
private String Id;
private String name;
private String gender;
private String password;
private String address;
private long contact;

    public Manager() {
    }

    public Manager(String Id, String name, String gender, String password, String address, long contact) {
        this.Id = Id;
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.address = address;
        this.contact = contact;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public long getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(long contact) {
        this.contact = contact;
    }
}




    