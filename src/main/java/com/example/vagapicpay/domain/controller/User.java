package com.example.vagapicpay.domain.controller;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Getter
@Setter
public class User {

    private long id;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getEmail() { 
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;
}
