package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_EMPTY_RECORD = "No records found";
    public static String ERR_VERIFICATION_ERROR = "Verification error";

    public SearchException(String message){
        super(message);
    }

}
