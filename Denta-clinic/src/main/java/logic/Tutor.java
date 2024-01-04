
package logic;

import java.util.Date;


public class Tutor extends Person{
    
    private int tutor_id;
    private String tutorType;

    public Tutor() {
    }

    public Tutor(int tutor_id, String tutorType, String dni, String name, String lastName, String phoneNumber, 
            String address, Date birthday) {
        super(dni, name, lastName, phoneNumber, address, birthday);
        this.tutor_id = tutor_id;
        this.tutorType = tutorType;
    }

    public int getTutor_id() {
        return tutor_id;
    }

    public void setTutor_id(int tutor_id) {
        this.tutor_id = tutor_id;
    }

    public String getTutorType() {
        return tutorType;
    }

    public void setTutorType(String tutorType) {
        this.tutorType = tutorType;
    }
    
    
    
}
