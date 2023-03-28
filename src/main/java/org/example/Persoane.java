package org.example;

public class Persoane {

    static int numarClienti=0;
    String adresa;

    String nume;

    Persoane(String adresa, String nume){
        this.adresa=adresa;
        this.nume=nume;
        numarClienti++;
    }

}
