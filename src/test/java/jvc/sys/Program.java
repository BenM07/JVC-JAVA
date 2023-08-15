package jvc.sys;

import java.util.Scanner;

public abstract class Program {
    
    // Print
    public static void print(String str) {
        System.out.print(str);
    } // close print method
    
    public static void print(char c) {
        System.out.print(c);
    } // close print overloading method
    
    public static void print(int i) {
        System.out.print(i);
    } // close print overloading method
    
    public static void print(double d) {
        System.out.print(d);
    } // close print overloading method
    
    public static void print(boolean b) {
        System.out.print(b);
    } // close print overloading method
    
    
    // Print Line
    public static void println(String str) {
        System.out.println(str);
    } // close print overloading method
    
    public static void println(char c) {
        System.out.println(c);
    } // close print overloading method
    
    public static void println(int i) {
        System.out.println(i);
    } // close print overloading method
    
    public static void println(double d) {
        System.out.println(d);
    } // close print overloading method
    
    public static void println(boolean b) {
        System.out.println(b);
    } // close print overloading method
    
    // Input 
    public static String input(String prompt, String str) {
        final Scanner scan = new Scanner(System.in);
        String inputLine;
        System.out.print(prompt);
        inputLine = scan.nextLine();
        
        return inputLine;
    } // close input method
    
    public static char input(String prompt, char c) {
        final Scanner scan = new Scanner(System.in);
        char inputLine;
        System.out.print(prompt);
        inputLine = scan.next().charAt(0);
        scan.nextLine();
        
        return inputLine;
    } // close input overloading method
    
    public static int input(String prompt, int i) {
        final Scanner scan = new Scanner(System.in);
        int inputLine;
        System.out.print(prompt);
        inputLine = scan.nextInt();
        scan.nextLine();
        
        return inputLine;
    } // close input overloading method

    public static double input(String prompt, double d) {
        final Scanner scan = new Scanner(System.in);
        double inputLine;
        System.out.print(prompt);
        inputLine = scan.nextDouble();
        scan.nextLine();
        
        return inputLine;
    } // close input overloading method
    
    // Cases
    public static String lower(String str) {
        return str.toLowerCase();
    } // close lower method
    
    public static String upper(String str) {
        return str.toUpperCase();
    } // close upper method
    
    public static int random(int n, int i) {
        return (int) (Math.random() * n) + i;
    } // close random method
    
} // close class
