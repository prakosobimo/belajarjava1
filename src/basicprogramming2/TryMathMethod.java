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
public class TryMathMethod {
    public static void main(String[] args) {
        //System.out.println(Math.random());
        //System.out.println(Math.random());
        //System.out.println(Math.random());
        //System.out.println(Math.random());
        //System.out.println(Math.min(50, 70));
        //System.out.println(Math.max(50, 70));
        //System.out.printf("5 * 1 = 5\n5 * 2 = 10\n5 * 3 = 15\n");
        //System.out.printf("5 * 4 = 20").println();
        //System.out.println("5 * 5 = 25");
        //System.out.printf("5 * 6 = 30").println();
        
        /*
        jika pada metod cetak ingin dilakukan suatu operasi seperti
        penjumlahan, perkalian, pengurangan, dll gunakanlah metod printf
        karena jika kamu menggunakan metod prinln maka metod tersebut tidak dapat
        digunakan untuk melakukan operasi apapun. ia hanya bisa dipakai untuk
        memanggil variabel atau menampilkan suatu nilai saja.
        
        untuk dapat melakukan operasinya tambahkan modifier %d dimana maksud dr 
        modifier tersebut adalah memparsing nilai
        
        %d -> untuk integer
        %s -> untuk string
        %f -> untuk float
        
        kenapa ditambah metod .println setelah parameter, karana kamu ingin
        mencetak outputnya ke dalam baris baru. sedangkan printf tidak bisa
        mencetak ke dalam baris baru. 
        
        jika kamu tidak ingin menambahkan metod println setelah parameter, silahakan
        gunakan modifier \n
        
        System.out.printf("3 * 1 = %d \n", 3*1);
        System.out.printf("3 * 2 = %d %d \n", 3*2, 3*10);
        System.out.printf("3 * 3 = %d", 3*3).println();
        System.out.printf("3 * 4 = %d", 3*4).println();
        System.out.printf("%d + %d = %d", 5, 7, 5 + 7).println();
        System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5+6+7).println();
        System.out.printf("5 + 6 + 7 = %d", 5+6+7).println();
        System.out.printf("Hello %s", "World \n");
        System.out.printf("%f + %f + %f = %f", 20.12, 21.98, 12.542, 20.12+21.98+12.542);
        */
        int number = 5;
        //System.out.println(--number);
        System.out.println(number--);
        //System.out.println(++number);
        System.out.println(number++);
        
    }
}
