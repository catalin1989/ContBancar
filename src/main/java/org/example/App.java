package org.example;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class App
{
    public static void main( String[] args ){



        ContDeEconomii persoana1= new ContDeEconomii("Str Soporului 13-15",
                "Chira Catalin",1111,0,6,LocalDate.of(2023,03,28));
        ContLaVedere persoana2= new ContLaVedere("Str Soporului 13-15",
                "Chira Catalin",1112,0,2,LocalDate.of(2023,03,28));



persoana2.depunere();
persoana2.actualizareDobanda();

        System.out.println("banca are "+Cont.numarClienti+" clienti.");






    }


}
