/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author student
 */
public class Data {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(localDate));

    }

}
