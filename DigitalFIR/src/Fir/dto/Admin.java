package Fir.dto;


public class Admin
{
private String adminId;
private String password;

    public Admin() {
    }

    public Admin(String adminId, String password) {
        this.adminId = adminId;
        this.password = password;
    }

    /**
     * @return the adminId
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * @param adminId the adminId to set
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
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



}