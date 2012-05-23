package com.example.entity;

import java.io.Serializable;
import java.util.Date;

public class DateObject implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date date;

    private Date lastAccessed;


    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getLastAccessed() {
        return this.lastAccessed;
    }

    public void setLastAccessed(Date lastAccessed) {
        this.lastAccessed = lastAccessed;
    }
}
