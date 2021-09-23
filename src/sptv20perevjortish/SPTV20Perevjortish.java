/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20perevjortish;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Perevjortish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charStr = str.toCharArray();
//        System.out.println("charStr = "+Arrays.toString(charStr));
        char[] charStr2 = new char[charStr.length];
//        System.out.println("charStr2 = "+Arrays.toString(charStr2));
        for(int i = 0;i<charStr.length;i++){
            charStr2[(charStr2.length - i)-1] = charStr[i];
        }
//        System.out.println("charStr2 = "+Arrays.toString(charStr2));
        String str2 = new String(charStr2);
        System.out.println("Строка наоборот: " + str2);
    }
    
}
