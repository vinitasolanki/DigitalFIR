package Fir.dto;


public class Advocates
{
private int id;
private String name;
private String address;
private String history;
private long contact;
public Advocates()
{ 
}

    public Advocates(int id,String name, String address, String history, long contact) {
        this.id=id;
        this.name = name;
        this.address = address;
        this.history = history;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public long getContact() {
        return contact;
    }

    public String getHistory() {
        return history;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public void setName(String name) {
        this.name = name;
    }
}