/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banca;

/**
 *
 * @author David PC
 */
import java.io.*;

class ContBanca
{ private double balanta;
public ContBanca(double balantainitiala)
{ balanta = balantainitiala; }
public void depunere(double suma)
{ balanta = balanta + suma;
System.out.println("A fost depusa suma de "+suma);}
public void retragere(double suma)
{ balanta = balanta - suma;
System.out.println("A fost retrasa suma de "+suma);}
public void afiseaza()
{System.out.println("balanta="+balanta);
}
} 