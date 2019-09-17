package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 - 2019 ////////////////////////

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class Oblig1 {
    private Oblig1() {
    }

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if(a.length == 0){
            throw new NoSuchElementException("Arrayet er tomt");
        }
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }

        }
        return a[a.length - 1];


    }

    public static int ombyttinger(int[] a) {

        int temp;
        int teller = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
                teller ++;
            }

        }
        return teller;


    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {

        if(a.length == 0){
            return 0;
        }

        int antallInvers = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    antallInvers++;
                }
            }
        }

        int teller = 1;

        if (antallInvers > 0) {
            throw new IllegalStateException("Tabellen er ikke sortert");

        } else {
            for (int i = 0; i < a.length-1; i++) {
                if (a[i] != a[i + 1]) {
                    teller++;
                }
            }
            System.out.print(teller);
            System.out.println(Arrays.toString(a));
            return teller;

        }

    }


    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {

        int teller = 0;

        for(int i = 0; i < a.length; i++){
            int erLike = 0;
            for(int j = i+1; j < a.length; j++){
                if(a[i] == a[j]){
                    erLike++;
                }
            }
            if(erLike == 0) {
                teller++;
            }
        }
        return teller;
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {


        int v = 0;
        int h = a.length-1;
        int antallOddetall = 0;
        while (true)                                  // stopper når v > h
        {
            while (v <= h && a[v]%2!=0) {
                v++;   // h er stoppverdi for v
                antallOddetall++;
            }

            while (v <= h && a[h]%2== 0) {
                h--;  // v er stoppverdi for h
            }

            if (v < h){
                int temp = a[v];
                a[v]= a[h];
                a[h] = temp;
            }
            else{
                 break;
            }
        }

        //finn index på første partall:
        int indexPartall = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                indexPartall = i;
                break;
            }
        }

        //sorter liste i forskjellige intervaller. Først oddetall og så partall.

        //Oddetall(index 0 til index første partall -1
        quickSort(a, 0, indexPartall-1);

        //partall(indexPartall til a.length -1
        quickSort(a, indexPartall, a.length-1);


    }

    public static void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int a[], int begin, int end) {
        int pivot = a[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;

        return i+1;
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new NotImplementedException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {


        throw new NotImplementedException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new NotImplementedException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new NotImplementedException();
    }


    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new NotImplementedException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new NotImplementedException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new NotImplementedException();
    }

}  // Oblig1
