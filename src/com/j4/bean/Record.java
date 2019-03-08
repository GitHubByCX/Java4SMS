package com.j4.bean;

import java.util.Date;

public class Record {
    private Integer id;

    private Integer studentId;

    private String jiLu;

    private Date jiluTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getJiLu() {
        return jiLu;
    }

    public void setJiLu(String jiLu) {
        this.jiLu = jiLu;
    }

    public Date getJiluTime() {
        return jiluTime;
    }

    public void setJiluTime(Date jiluTime) {
        this.jiluTime = jiluTime;
    }
}