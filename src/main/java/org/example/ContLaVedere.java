package org.example;


import java.time.LocalDate;
import java.util.Calendar;

public class ContLaVedere extends Cont{
double dobanda=1.5;

    ContLaVedere(String adresa, String nume, int nrCont, int sumaBani, double dobanda, LocalDate dataDeschidere) {
        super(adresa, nume, nrCont, sumaBani, dobanda, dataDeschidere);
        this.dobanda=dobanda;
    }
}

