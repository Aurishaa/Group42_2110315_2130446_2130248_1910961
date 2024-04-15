/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

public class Task implements Serializable{
    private String assignedTo;
    private String taskDetails;
    private LocalDate dueDate;

    public Task(String assignedTo, String taskDetails, LocalDate dueDate) {
        this.assignedTo = assignedTo;
        this.taskDetails = taskDetails;
        this.dueDate = dueDate;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task{" + "assignedTo=" + assignedTo + ", taskDetails=" + taskDetails + ", dueDate=" + dueDate + '}';
    }

}