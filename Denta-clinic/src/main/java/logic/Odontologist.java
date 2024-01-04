
package logic;

import java.util.Date;
import java.util.List;


public class Odontologist extends Person {
    
    private int odont_id;
    private String speciality;
    private List<Turn> turnList;
    private User aUser;
    private Schedule aSchedule;

    public Odontologist() {
    }

    public Odontologist(int odont_id, String speciality, List<Turn> turnList, User aUser, Schedule aSchedule, String dni, 
            String name, String lastName, String phoneNumber, String address, Date birthday) {
        super(dni, name, lastName, phoneNumber, address, birthday);
        this.odont_id = odont_id;
        this.speciality = speciality;
        this.turnList = turnList;
        this.aUser = aUser;
        this.aSchedule = aSchedule;
    }

    

    public int getOdont_id() {
        return odont_id;
    }

    public void setOdont_id(int odont_id) {
        this.odont_id = odont_id;
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
