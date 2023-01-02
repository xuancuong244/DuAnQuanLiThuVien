/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author CUONGNX
 */
public class TestEmail {
    public static void parseEmail(String email) throws Exception {
        String mau = "\\w+@\\w+(\\.\\w+){1,2}";
        Pattern pattern = Pattern.compile(mau);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches() == false){
            throw new Exception();
        }
    }
}
