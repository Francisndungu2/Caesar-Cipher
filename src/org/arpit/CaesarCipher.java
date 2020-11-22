package org.arpit;

import java.util.Scanner;
public class CaesarCipher{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int shift,i,n;
        String str;
        StringBuilder str1= new StringBuilder();
        StringBuilder str2= new StringBuilder();
        System.out.println("Enter the plaintext");
        str=sc.nextLine();
        str=str.toLowerCase();
        n=str.length();
        char[] ch1 =str.toCharArray();
        char ch3,ch4;
        System.out.println("Enter the value by which each letter of the string is to be shifted");
        shift=sc.nextInt();
        System.out.println();
        System.out.println("Encrypted text is");

    }
}