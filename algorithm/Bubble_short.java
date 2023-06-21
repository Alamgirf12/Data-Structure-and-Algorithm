
package algorithm;

import java.util.Scanner;


public class Bubble_short {
    
    Scanner s = new Scanner(System.in);
    public void bubble_short(){
        
        System.out.print("Enter the number of input you want>:");
        int n=s.nextInt();
        System.out.println("Enter the numbers: ");
        int list[] =new int [n];
        int i;
       
        for(i=0; i<n; i++){
            System.out.println("index{"+i+"}= ");
            list[i] = s.nextInt();
            
        }
        System.out.println("Sorted Output");
        for (int j=0; j<n; j++){
            System.out.print(" "+ list[j]);
        }
    }
}
