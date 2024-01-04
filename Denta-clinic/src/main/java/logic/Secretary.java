
package logic;

import java.util.Date;


public class Secretary extends Person {
    
    private int secretary_id;
    private String sector;
    private User aUser;

    public Secretary() {
    }

    public Secretary(int secretary_id, String sector, User aUser, String dni, String name, String lastName, 
            String phoneNumber, String address, Date birthday) {
        super(dni, name, lastName, phoneNumber, address, birthday);
        this.secretary_id = secretary_id;
        this.sector = sector;
        this.aUser = aUser;
    }

    public int getSecretary_id() {
        return secretary_id;
    }

    public void setSecretary_id(int secretary_id) {
        this.secretary_id = secretary_id;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public User getaUser() {
        return aUser;
    }

    public void setaUser(User aUser) {
        this.aUser = aUser;
    }
    
    
    
}
