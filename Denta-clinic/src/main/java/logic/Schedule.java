
package logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Schedule implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int schedule_id;
    private String start_schedule;
    private String end_schedule;

    public Schedule() {
    }

    public Schedule(int schedule_id, String start_schedule, String end_schedule) {
        this.schedule_id = schedule_id;
        this.start_schedule = start_schedule;
        this.end_schedule = end_schedule;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getStart_schedule() {
        return start_schedule;
    }

    public void setStart_schedule(String start_schedule) {
        this.start_schedule = start_schedule;
    }

    public String getEnd_schedule() {
        return end_schedule;
    }

    public void setEnd_schedule(String end_schedule) {
        this.end_schedule = end_schedule;
    }
    
    
    
}
