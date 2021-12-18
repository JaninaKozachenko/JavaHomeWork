package com.pb.kozachenko.hw11;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;

public class People implements Comparable<People> {
    private String name;
    private String dateOfBirth;
    private String telNumb;
    private String address;
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime date;

    public People() {
    }

    public People(String name, String dateOfBirth, String telNumb, String address, LocalDateTime date) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.telNumb = telNumb;
        this.address = address;
        this.date = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelNumb() {
        return telNumb;
    }

    public void setTelNumb(String telNumb) {
        this.telNumb = telNumb;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public int compareTo(People o) {
        return 0;
    }

    @Override
    public String toString() {
        return "\n Person {" + "\n" +
                "name='" + name + '\'' + "\n" +
                "dateOfBirth='" + dateOfBirth + '\'' + "\n" +
                "telNumb='" + telNumb + '\'' + "\n" +
                "address='" + address + '\'' + "\n" +
                "date='" + LocalDateTime.now() + '\'' +
                '}';
    }
}

