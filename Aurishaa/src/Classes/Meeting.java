/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDate;


public class Meeting {
    private String meetingWith;
    private LocalDate meetingDate;
    private  String meetingTime;

    public Meeting(String meetingWith, LocalDate meetingDate, String meetingTime) {
        this.meetingWith = meetingWith;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
    }

    public String getMeetingWith() {
        return meetingWith;
    }

    public void setMeetingWith(String meetingWith) {
        this.meetingWith = meetingWith;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }

    @Override
    public String toString() {
        return "Meeting{" + "meetingWith=" + meetingWith + ", meetingDate=" + meetingDate + ", meetingTime=" + meetingTime + '}';
    }

}