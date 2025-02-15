package com.example.BLOGGO.beans;

import javax.persistence.*;

@Entity
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int sno;

    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "password")
    private String password;

    public users() {
    }

    public users(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
