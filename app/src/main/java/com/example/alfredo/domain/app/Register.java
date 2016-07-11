package com.example.alfredo.domain.app;

/**
 * Created by Alfredo on 07/07/2016.
 */
public class Register{

    public String rfc;
    public Integer numberAgent;
    public String nameAgent;
    public Integer phone;
    public String username;
    public String password;

    public Register(String rfc, Integer numberAgent, String nameAgent, Integer phone, String username, String password) {
        this.rfc = rfc;
        this.numberAgent = numberAgent;
        this.nameAgent = nameAgent;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public Integer getNumberAgent() {
        return numberAgent;
    }

    public void setNumberAgent(Integer numberAgent) {
        this.numberAgent = numberAgent;
    }

    public String getNameAgent() {
        return nameAgent;
    }

    public void setNameAgent(String nameAgent) {
        this.nameAgent = nameAgent;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
