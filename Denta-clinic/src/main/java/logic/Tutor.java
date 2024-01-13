
package logic;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Tutor extends Person{
    
    //private int tutor_id;
    private String tutorType;

    public Tutor() {
    }

    public Tutor(String tutorType, int id, String dni, String name, String lastName, String phoneNumber, String address, 
            Date birthday) {
        super(id, dni, name, lastName, phoneNumber, address, birthday);
        this.tutorType = tutorType;
    }

    

    public String getTutorType() {
        return tutorType;
    }

    public void setTutorType(String tutorType) {
        this.tutorType = tutorType;
    }
    
    
    
}
