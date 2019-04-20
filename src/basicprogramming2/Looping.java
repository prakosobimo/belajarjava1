/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramming2;

/**
 *
 * @author Bimo
 */
public class Looping {
    public static void main(String[] args){
        /* Latihan Looping
        for (int j = 0; j <= 10; j++) {
            System.out.printf("%d x %d = %d", 5, j, 5*j).println();
        }
        */
        
        /* Soal 1
        Print 6 Tables
            for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d", 6, i, 6*i).println();
        }
        */
        
        /* Soal 2
        Print 10 Tables
            for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d", 10, i, 10*i).println();
        }
        */
        
        /* Soal 3
        Print numbers from 1 to 10
            for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        */
        
        /* Soal 4
        Print Numbers 10 to 1
            for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        */
        
        /*
        int i = 5;
        //int square = i * i;
        
        for(int square=i*i; square<=100; square++){
                System.out.printf("%d x %d = %d", square, square, square*square).println();
        
        }
        */
        
        /* Soal 4
        Cetak angka genap mulai dari angka 10
        
        for(int i=10; i>=1; i=i-2){
            System.out.printf("%d",i).println();
        }
        */
        
        /* Soal 5
        Cetak angka ganjil mulai dari angka 9
        
        for(int i=9; i>=1; i=i-2){
            System.out.printf("%d",i).println();
        }
        */
        
        /* Soal 6
        Prnt squares of first 10 number
        for (int i=1; i<=20; i++){
        System.out.printf("%d", i*i).println();
        }
        */
       
        /* Soal 7
        Print squares of first 10 event number
        for (int i=2; i<=10; i=i+2){
        System.out.printf("%d\t%d", i, i*i).println();
        }
        */
        
        /* Soal 8
        Print squares of first 10 odd number
        
        for (int i=1; i<=20; i=i+2){
            System.out.printf("%d\t%d", i, i*i).println();
        }
        */ 
        
        int i;
        int j;
        for(i=1, j=2; i<=10; i++, j++ ){
            System.out.println(i);
            System.out.println(j);
        }
    }
}
