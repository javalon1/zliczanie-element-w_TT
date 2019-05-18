package com.sda.algorytmy;


public class App {
    public static void main(String[] args) {

        int[] tablica = new int[]{2, 4, 6, 7, 4, 3, 5, 4, 2, 3, 7, 8, 6};


        for (int i = 1; i < 10; i++) {
            int wynik = 0;

            for(int j = 0; j<tablica.length;j++){
                if (tablica[j]==i){
                    wynik++;
                }
            }
            System.out.println("w tablicy jest "+ wynik+" - "+i);
        }
    }
}
