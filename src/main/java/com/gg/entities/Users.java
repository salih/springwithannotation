package com.gg.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by salih on 12.06.2016.
 */
@Entity
@Table(name = "USERS")
public class Users {

    private long ID;

    private String firstName;
    private String lastName;
    private String email;

    private Timestamp reg_date;

    public Users(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Users() {
    }


    public Users(String firstName, String lastName, String email, Timestamp reg_date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.reg_date = reg_date;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @CreationTimestamp
    public Timestamp getReg_date() {
        return reg_date;
    }

    public void setReg_date(Timestamp reg_date) {
        this.reg_date = reg_date;
    }

}
