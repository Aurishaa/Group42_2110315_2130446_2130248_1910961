/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;


public class LoginInfo implements Serializable{
    
    private Integer UserId;
    private String UserPass;
    private String UserType;

    public LoginInfo(Integer UserId, String UserPass, String UserType) {
        this.UserId = UserId;
        this.UserPass = UserPass;
        this.UserType = UserType;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String UserPass) {
        this.UserPass = UserPass;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    @Override
    public String toString() {
        return "LoginInfo{" + "UserId=" + UserId + ", UserPass=" + UserPass + ", UserType=" + UserType + '}';
    }

}
