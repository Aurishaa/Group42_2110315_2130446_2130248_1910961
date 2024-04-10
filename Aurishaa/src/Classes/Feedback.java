/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;


public class Feedback implements Serializable {
     private String FeedBack;
     private LocalDate dateOfFeedback;

    public Feedback(String FeedBack, LocalDate dateOfFeedback) {
        this.FeedBack = FeedBack;
        this.dateOfFeedback = dateOfFeedback;
    }

    public String getFeedBack() {
        return FeedBack;
    }

    public void setFeedBack(String FeedBack) {
        this.FeedBack = FeedBack;
    }

    public LocalDate getDateOfFeedback() {
        return dateOfFeedback;
    }

    public void setDateOfFeedback(LocalDate dateOfFeedback) {
        this.dateOfFeedback = dateOfFeedback;
    }

    @Override
    public String toString() {
        return "Feedback{" + "FeedBack=" + FeedBack + ", dateOfFeedback=" + dateOfFeedback + '}';
    }
     
}
