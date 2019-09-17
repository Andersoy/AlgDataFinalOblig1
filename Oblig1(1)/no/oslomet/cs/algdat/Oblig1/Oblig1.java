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

        if(a.length == 0){
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int j = i; j < a.length; j++) {
                    if (a[j] % 2 != 0) {
                        int temp = a[i];
                        a[i]= a[j];
                        a[j] = temp;
                    }
                }
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
        bobleSortering(a, 0, indexPartall-1);

        //partall(indexPartall til a.length -1
        bobleSortering(a, indexPartall, a.length-1);
        throw new NotImplementedException();
    }

    public static int[] bobleSortering(int[] a, int left, int right){
        for(int i = left; i < right; i++){
            for(int j = i+1; j <= right; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        return a;

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
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        String ut = "";

        if(s1.length == 0 && s2.length == 0) {
            return ut;
        } if (s1.length == 0) {
            ut = t;
            return ut;
        } if (s2.length == 0){
            ut += s;
            return ut;
        }

        if (s1.length > s2.length) {
            for (int i = 0; i < s1.length; i++) {
                ut += s1[i];
                if (i < s2.length) {
                    ut += s2[i];
                }
            }
        } else {
            for (int i = 0; i < s2.length; i++) {

                if (i < s1.length) {
                    ut += s1[i];
                }
                ut += s2[i];
            }
        }
        return ut;
    }

    /// 7b)
    public static String flett(String... s) {

        String ut = "";
        int hoyest = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() > hoyest ) {
                hoyest = s[i].length();
            }
        }
        char[][] charArray = new char[s.length][hoyest];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < hoyest; j++) {
                try {
                    charArray[i][j] = s[i].charAt(j);
                } catch (Exception e) {

                }
            }
        }
        String flett = "";

        for (int i = 0; i < hoyest; i++) {
            for (int j = 0; j < s.length; j++) {
                if(!(charArray[j][i] == 0)) {
                    flett += charArray[j][i];
                }
            }
        }

        return flett;
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