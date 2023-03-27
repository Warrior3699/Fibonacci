/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fino;

import java.util.Scanner;
public class Fino {
     public static int fin (int n){
      if (n==0){
          
          return 0;
      } if(n==1){
          
         return 1; 
      } else {
           
          return fin (n-1)+fin(n-2);
      }
    }
     
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in);
        System.out.print("introduce tu fino"); 
        System.out.println();
   int n=leer.nextInt();//valor de fino
        System.out.println();
  for (int i=0;i<n;i++){
      System.out.print(fin(i)+",");
     }
    } 
}
                 





