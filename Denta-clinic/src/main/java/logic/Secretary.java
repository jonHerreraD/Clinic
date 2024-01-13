
package logic;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Secretary extends Person {
    
    //private int secretary_id;
    private String sector;
    @OneToOne
    private User aUser;

    public Secretary() {
    }

    public Secretary(String sector, User aUser, int id, String dni, String name, String lastName, String phoneNumber, 
            String address, Date birthday) {
        super(id, dni, name, lastName, phoneNumber, address, birthday);
        this.sector = sector;
        this.aUser = aUser;
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
