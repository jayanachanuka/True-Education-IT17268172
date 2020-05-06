
package Model;


public class Manage_New_Event_Model {
    private String EventID;
    private String Event;
    private String Time;
    private String Status;

    public Manage_New_Event_Model(String EventID, String Event, String Time, String Status) {
        this.EventID = EventID;
        this.Event = Event;
        this.Time = Time;
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getEventID() {
        return EventID;
    }

    public void setEventID(String EventID) {
        this.EventID = EventID;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String Event) {
        this.Event = Event;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    
    
    
}
