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
class Aplicatie
{ public static void main(String[] args)
{ ContBanca ba1 = new ContBanca(100.00);
System.out.print("Inainte de tranzactie, ");
ba1.afiseaza();
ba1.depunere(74.35);
ba1.retragere(20.00);
System.out.print("Dupa tranzactie ");
ba1.afiseaza(); 

/*Client client1 = new Client ();


 client1.adaugaNume();
client1.adaugavarsta();
client1.adaugaSex();
client1.afisezaClient(); */


Banca banca1 = new Banca ();

banca1.adaugaNume();
banca1.adaugaCapital();
banca1.adaugaProfit();

banca1.afiseazaBanca();
banca1.calculeazaProfitAnual();

}
}