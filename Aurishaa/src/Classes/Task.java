/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

public class Task {
    private String taskDetails;
    private LocalDate dueDate;
    private String assignedTo;

    public Task(String taskDetails, LocalDate dueDate, String assignedTo) {
        this.taskDetails = taskDetails;
        this.dueDate = dueDate;
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

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    @Override
    public String toString() {
        return "Task{" + "taskDetails=" + taskDetails + ", dueDate=" + dueDate + ", assignedTo=" + assignedTo + '}';
    }
    
    
}
