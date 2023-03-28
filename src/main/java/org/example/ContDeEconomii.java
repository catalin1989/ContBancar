package org.example;

import java.time.LocalDate;

public class ContDeEconomii extends Cont{
    double dobanda;


    ContDeEconomii(String adresa, String nume, int nrCont, double sumaBani, double dobanda, LocalDate dataDeschidere) {
        super(adresa, nume, nrCont, sumaBani, dobanda, dataDeschidere);
    }
}


