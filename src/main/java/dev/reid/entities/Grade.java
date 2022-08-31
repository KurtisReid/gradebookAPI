package dev.reid.entities;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g_Id")
    private int gId;

    @Column(name = "s_Id")
    private int sId;

    @Column(name = "time_Reported")
    private long timeReported;

    @Column(name = "note")
    private String note;

    @Column(name = "behavior")
    private Behavior behavior;

    public Grade() {
    }

    public Grade(int gId, int sId, long timeReported, String note, Behavior behavior) {
        this.gId = gId;
        this.sId = sId;
        this.timeReported = timeReported;
        this.note = note;
        this.behavior = behavior;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public long getTimeReported() {
        return timeReported;
    }

    public void setTimeReported(long timeReported) {
        this.timeReported = timeReported;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gId=" + gId +
                ", sId=" + sId +
                ", timeReported=" + timeReported +
                ", note='" + note + '\'' +
                ", behavior=" + behavior +
                '}';
    }
}
