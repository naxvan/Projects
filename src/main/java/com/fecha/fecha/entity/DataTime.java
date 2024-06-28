package com.fecha.fecha.entity;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Getter
public class DataTime {
    //thursday, 27 of june, 2024
    private LocalDate date;
    private String dayOfWeek;
    private int dayOfMonth;
    private String month;
    private int year;
    private LocalTime horaActual = LocalTime.now();

    public DataTime() {
        this.date = LocalDate.now();
        this.dayOfWeek = date.getDayOfWeek().toString().toLowerCase();
        this.dayOfMonth = date.getDayOfMonth();
        this.month = date.getMonth().toString().toLowerCase();
        this.year = date.getYear();
        this.horaActual = LocalTime.now();
    }

    public String showDate() {
        return "" + this.dayOfWeek + " " + this.dayOfMonth + " of " + this.month + ", " + this.year;
    }


    public String showTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String format = horaActual.format(dateTimeFormatter);
        return "" + format;

    }


}
