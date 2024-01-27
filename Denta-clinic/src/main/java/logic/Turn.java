
package logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turn implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int turn_id;
    @Temporal(TemporalType.DATE)
    private Date turnDate;
    private String turnTime;
    private String afection;
    @ManyToOne
    @JoinColumn(name="odon_turn")
    private Odontologist odonto;

    @ManyToOne
    @JoinColumn(name="patient_turn")
    private Patient pati;
    
    public Turn() {
    }

    public Turn(int turn_id, Date turnDate, String turnTime, String afection) {
        this.turn_id = turn_id;
        this.turnDate = turnDate;
        this.turnTime = turnTime;
        this.afection = afection;
    }

    public int getTurn_id() {
        return turn_id;
    }

    public void setTurn_id(int turn_id) {
        this.turn_id = turn_id;
    }

    public Date getTurnDate() {
        return turnDate;
    }

    public void setTurnDate(Date turnDate) {
        this.turnDate = turnDate;
    }

    public String getTurnTime() {
        return turnTime;
    }

    public void setTurnTime(String turnTime) {
        this.turnTime = turnTime;
    }

    public String getAfection() {
        return afection;
    }

    public void setAfection(String afection) {
        this.afection = afection;
    }
    
    
    
}
