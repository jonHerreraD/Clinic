
package logic;

import java.util.Date;
import java.util.List;


public class Patient extends Person{
    
    private int patient_id;
    private boolean has_HI;
    private String bloodType;
    private Tutor tutor;
    private List<Turn> turnList;
    

    public Patient() {
    }

    public Patient(int patient_id, boolean has_HI, String bloodType, Tutor tutor, List<Turn> turnList, String dni, 
            String name, String lastName, String phoneNumber, String address, Date birthday) {
        super(dni, name, lastName, phoneNumber, address, birthday);
        this.patient_id = patient_id;
        this.has_HI = has_HI;
        this.bloodType = bloodType;
        this.tutor = tutor;
        this.turnList = turnList;
    }

   

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
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
