
package logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologist extends Person implements Serializable {
    
    //private int odont_id;
    private String speciality;
    @OneToMany(mappedBy="odonto")
    private List<Turn> turnList;
    @OneToOne
    private User aUser;
    @OneToOne
    private Schedule aSchedule;

    public Odontologist() {
    }

    public Odontologist(String speciality, List<Turn> turnList, User aUser, Schedule aSchedule, int id, String dni, 
            String name, String lastName, String phoneNumber, String address, Date birthday) {
        super(id, dni, name, lastName, phoneNumber, address, birthday);
        this.speciality = speciality;
        this.turnList = turnList;
        this.aUser = aUser;
        this.aSchedule = aSchedule;
    }

    

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public List<Turn> getTurnList() {
        return turnList;
    }

    public void setTurnList(List<Turn> turnList) {
        this.turnList = turnList;
    }

    public User getaUser() {
        return aUser;
    }

    public void setaUser(User aUser) {
        this.aUser = aUser;
    }

    public Schedule getaSchedule() {
        return aSchedule;
    }

    public void setaSchedule(Schedule aSchedule) {
        this.aSchedule = aSchedule;
    }
    
    
    
}
