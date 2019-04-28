/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banca;

import java.util.Scanner;

/**
 *
 * @author David PC
 */
public class Banca {
    
    public String nume;
    public String adresa;
    public float capital;
    
    public float profit;
    public float profitAnual;
    
     public Scanner scan = new Scanner(System.in);
     
     public String adaugaNume () {
       
      
       
       
       System.out.println("Adauga nume banca ");
      nume = scan.next();
       
       return nume ;
       
   }
     
     String getnume (){
         
         return nume;   
     }
     
       public  void adaugaCapital () {
        
       
        System.out.println("Adauga capitalul bacnii: ");
        capital = scan.nextFloat();
         
}
       
          public  void adaugaProfit () {
        
        
        System.out.println("Profitul estimat al bancii: ");
        profit = scan.nextFloat();
         
}
          
              public  void calculeazaProfitAnual () {
        
        int alegere;
        int i=1;
        
        for (profitAnual=0;i<100;i++){
            
            profitAnual=capital*profit;
            capital= capital + profitAnual;
            System.out.println("Anul " + i + ":");
            System.out.println("Profitul este " + profitAnual + " $ ");
            System.out.println("Capitalul va fi de " + capital + " $ ");
            
            System.out.println("Doriti sa vedeti prognoza pentru anul viitor: [1] Da \t [2] Nu");
            alegere = scan.nextInt();
            
            if (alegere == 1){
                System.out.println("\n");
        }
            
        
        else 
        break;
        }
         
}  
              
               public void afiseazaBanca () {
       
       System.out.println("Banca " + nume + ", are un capital initial de " + capital + " $, si un profit estimat de " + profit + "% pe an" );
       
   }
       
    
}
