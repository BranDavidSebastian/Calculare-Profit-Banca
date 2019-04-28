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
public class Client {
    
    public String nume;
    public int varsta;
    public String sexul;
    
    
     public Scanner scan = new Scanner(System.in);
    
   public String adaugaNume () {
       
      
       
       
       System.out.println("Adauga nume client: ");
      nume = scan.nextLine();
       
       return nume ;
       
   }
   

   
  public  int adaugavarsta () {
        
        
        System.out.println("Adauga varsta client: ");
        varsta = scan.nextInt();
        
        
        return  varsta;
    
}
    
  
   
   public String adaugaSex (){
       
       sexul = null;
          System.out.println("Care este sexul clientului?(B/F)  ");
        char sex = scan.next().charAt(0);
        
        do {
            System.out.println("Care este sexul clientului?(B/F)  ");
      sex = scan.next().charAt(0);
      if (sex== 'B' || sex == 'b'){
           
           sexul="barbat";
           
       }
       
        if (sex== 'F' || sex == 'f'){
           
           sexul="Femeie";
           
       }
            System.out.println("Sexul nu a fost introdus corect");
        }
        while (sex != 'B' || sex != 'b' || sex != 'F' || sex != 'f');
       
                  
        
       return sexul;    
   }
   
   
   public void afisezaClient () {
       
       System.out.println("Numele clientului este " + nume + ", acesta are " + varsta + " ani, si este " + sexul );
       
   }
   
    
}
