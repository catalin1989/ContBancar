package org.example;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Cont extends Persoane {



    LocalDate dataCurenta= LocalDate.now();

    LocalDate dataDeschidere;
    int nrCont;
    double sumaBani;

    double dobanda;
    Scanner scanner = new Scanner(System.in);





    Cont(String adresa, String nume, int nrCont, double sumaBani, double dobanda, LocalDate dataDeschidere) {
        super( adresa, nume);
        this.nrCont = nrCont;
        this.sumaBani = sumaBani;
        this.dataDeschidere=dataDeschidere;
        this.dobanda=dobanda;



            }



    public void depunere() {
        int sumaDeBaniDepusa;
        System.out.println(" Cati bani doriti sa depuneti?");
        //Scanner scanner = new Scanner(System.in);
        sumaDeBaniDepusa = scanner.nextInt();
        System.out.println("Ati depus "+sumaDeBaniDepusa+" lei");
        sumaBani = sumaBani + sumaDeBaniDepusa;
        System.out.println("Noul sold este "+ sumaBani+" lei");

    }

    public void retragere() {
        int sumaDeBaniRetrasa;
        System.out.println("Cati bani doriti sa retrageti?");
        sumaDeBaniRetrasa=scanner.nextInt();
        System.out.println("Ati retras "+sumaDeBaniRetrasa+" lei");
        sumaBani-=sumaDeBaniRetrasa;
    }
    public void interogareSold(){
        System.out.println("Soldul dumneavoastra este"+sumaBani);
    }

    public void actualizareDobanda(){
        if(dataCurenta.equals(dataDeschidere.plusYears(1))) {
            sumaBani = sumaBani + sumaBani * dobanda / 100;

        }
        System.out.println("contul a ajuns la maturitate!");
        System.out.println(sumaBani);
    }









}
