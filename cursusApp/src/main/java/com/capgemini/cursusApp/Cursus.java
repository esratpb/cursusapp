package com.capgemini.cursusApp;

import java.util.Date;

public class Cursus {

    private int id;
    private String name;
    private String level;
    private String teacher;
    String firstDay;
    String lastDate;
    private String status;     //like   finished,  continues,  coming

    public Cursus() {
    }

    public Cursus(int id, String name, String level, String teacher, String firstDay, String  lastDate, String status) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.teacher = teacher;
        this.firstDay = firstDay;
        this.lastDate = lastDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(String firstDay) {
        this.firstDay = firstDay;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cursus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", teacher='" + teacher + '\'' +
                ", firstDay=" + firstDay +
                ", lastDate=" + lastDate +
                ", status='" + status + '\'' +
                '}';
    }
}
