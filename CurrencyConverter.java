// Write a Java program that takes a double-precision number as input, representing an amount of money, and formats it into US,
//  Indian, Chinese, and French currency formats using the NumberFormat class. Each formatted amount should be displayed on a separate 
//  line with the country name prefixed to it. Ensure that the Indian currency is formatted correctly using an English language locale.
//  Provide the complete Java code for this task.
import java.text.*;
import java.util.*;

public class CurrencyConverter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);
        
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);
        
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);
        
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
