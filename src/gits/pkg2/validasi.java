/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gits.pkg2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author ZULIA ARISANDA
 */
public class validasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String email;
        System.out.print("Masukan Email : ");
        email = input.nextLine();
        
        System.out.println(valEmail(email));
    }

    private static boolean valEmail(String input) {
        String emailRegex = "^[a-zA-Z0-9]{0,20}+[@]{1}+[a-zA-Z0-9]+[.]{1}+[co.id|id]+$";
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);
        return matcher.find();
    }
    
}
