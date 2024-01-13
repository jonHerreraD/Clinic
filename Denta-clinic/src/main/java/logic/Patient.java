
package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient extends Person implements Serializable{
    
    //private int patient_id;
    private boolean has_HI;
    private String bloodType;
    @OneToOne
    private Tutor tutor;
    @OneToMany(mappedBy="pati")
    private List<Turn> turnList;
    

    public Patient() {
    }

    public Patient(boolean has_HI, String bloodType, Tutor tutor, List<Turn> turnList, int id, String dni, String name, 
            String lastName, String phoneNumber, String address, Date birthday) {
        super(id, dni, name, lastName, phoneNumber, address, birthday);
        this.has_HI = has_HI;
        this.bloodType = bloodType;
        this.tutor = tutor;
        this.turnList = turnList;
    }

       public boolean isHas_HI() {
        return has_HI;
    }

    public void setHas_HI(boolean has_HI) {
        this.has_HI = has_HI;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Turn> getTurnList() {
        return turnList;
    }

    public void setTurnList(List<Turn> turnList) {
        this.turnList = turnList;
    }
    
    
    
}
