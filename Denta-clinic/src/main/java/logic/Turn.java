
package logic;

import java.util.Date;


public class Turn {
    
    private int turn_id;
    private Date turnDate;
    private String turnTime;
    private String afection;

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
