package com.capgemini.cursusApp.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeController {

    public static String dateToString(LocalDate myDateObj) {


        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formattedDate = myDateObj.format(myFormatObj);
        return formattedDate;
    }

    public static LocalDate stringToDate(String myDateStr){
        DateTimeFormatter f = DateTimeFormatter.ofPattern( "dd-MM-yyyy" );
        LocalDate date= LocalDate.parse( myDateStr , f );
        return date;
    }
}
