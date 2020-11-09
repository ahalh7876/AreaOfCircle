/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaofcircle;
import java.util.Scanner;

/**
 *
 * @author ahalh7876
 */
public class AreaOfCircle {
    

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius in cm");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double area = radius * radius * pi;
        System.out.println("The area of the circle is: " + area + "cm ^2");
    }
    
}
