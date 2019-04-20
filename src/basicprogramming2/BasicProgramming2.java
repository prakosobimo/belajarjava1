/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicprogramming2;


import java.util.Scanner;


/**
 *
 * @author Bimo
 */
public class BasicProgramming2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Write a Java program to print the sum (addition), multiply, subtract, 
        //divide and remainder of two numbers
        //System.out.println("Program Penambahan, Pengurangan, Perkalian, DLL");
        Scanner sc = new Scanner(System.in);
        //System.out.print("Masukan angka pertama = ");
        //int angka1 = sc.nextInt();
        //System.out.print("Masukan angka kedua = ");
        //int angka2 = sc.nextInt();
        
        //System.out.println(angka1+ " + " +angka2+ " = " +(angka1 + angka2));
        //System.out.println(angka1+ " - " +angka2+ " = " +(angka1 - angka2));
        //System.out.println(angka1+ " x " +angka2+ " = " +(angka1 * angka2));
        //System.out.println(angka1+ " : " +angka2+ " = " +(angka1 / angka2));
        //System.out.println(angka1+ " mod " +angka2+ " = " +(angka1 % angka2));
    
        //Write a Java program that takes a number as input and prints its 
        //multiplication table up to 10.
        //Cara 1
        //System.out.println("Program Java Perkalian");
        //System.out.print("Masukan Angka = ");
        //int angka = sc.nextInt();
        
        //System.out.println(angka+ " x " + " 1 " + " = " +(angka * 1));
        //System.out.println(angka+ " x " + " 2 " + " = " +(angka * 2));
        //System.out.println(angka+ " x " + " 3 " + " = " +(angka * 3));
        //System.out.println(angka+ " x " + " 4 " + " = " +(angka * 4));
        //System.out.println(angka+ " x " + " 5 " + " = " +(angka * 5));
        //System.out.println(angka+ " x " + " 6 " + " = " +(angka * 6));
        //System.out.println(angka+ " x " + " 7 " + " = " +(angka * 7));
        //System.out.println(angka+ " x " + " 8 " + " = " +(angka * 8));
        //System.out.println(angka+ " x " + " 9 " + " = " +(angka * 9));
        //System.out.println(angka+ " x " + " 10 " + " = " +(angka * 10));
        
        //Cara 2
        //System.out.println("Program Java Perkalian");
        //System.out.print("Masukan Angka = ");
        //int angka = sc.nextInt();
        
        //for (int i = 0; i < 11; i++) {
            //System.out.println(angka + " x " + (i+1) + " = " +(angka * (i+1)));
        //}
        
        //Write a Java program to display the following pattern.
        //System.out.println("    J     a    v     v   a   ");
        //System.out.println("    J    a a    v   v   a a  ");
        //System.out.println("J   J   aaaaaa    VV   aaaaa ");
        //System.out.println(" JJ    a      a    V  a     a ");
        
        //Write a Java program to compute the specified expressions and
        //print the output.
        //System.out.println((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));
        
        //Write a Java program to print the area and perimeter of a circle
        //System.out.println("Program Menghitung area dan perimeter");
        //System.out.print("Masukan Radius = ");
        ///double radius = sc.nextDouble();
        //double pi = Math.PI;
        //double sqoure = Math.pow(pi, pi);
        //double parameterLingkaran = 2 * pi * radius;
        //double areaLingkaran = pi * sqoure;
        //System.out.print("Parameternya adalah = " +parameterLingkaran);
        //System.out.print("Areanya adalah = " +areaLingkaran);
        
        //Write a Java program that takes five numbers as input to calculate and
        //print the average of the numbers.
        //System.out.println("Program Java Menghitung Rata-rata");
        //System.out.print("Masukan Angka Ke-1 = ");
        //int angka1 = sc.nextInt();
        //System.out.print("Masukan Angka Ke-2 = ");
        //int angka2 = sc.nextInt();
        //System.out.print("Masukan Angka Ke-3 = ");
        //int angka3 = sc.nextInt();
        //System.out.print("Masukan Angka Ke-4 = ");
        //int angka4 = sc.nextInt();
        //System.out.print("Masukan Angka Ke-5 = ");
        //int angka5 = sc.nextInt();
        //int hasil = (angka1 + angka2 + angka3 + angka4 + angka5) / 5;
        
        //System.out.println("Nilai rata-ratanya adalah = " + hasil);
        
        //Write a Java program to print the area and perimeter of a rectangle.
        //final double width = 5.6;
        //final double height = 8.5;

        //double perimeter = 2*(height + width);	
        //double area = width * height;			
		
	//System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
        //System.out.printf("Area is %.1f * %.1f = %.2f \n", height, width, area);
        
        //PENJELASAN
        //% is a symbol for variable and is not a modulo!
        //. and the number fallowing modifies how many digit decimal points you want to print
        //%f string formatting option treats the value as a decimal, and prints it to six decimal places
        //the second % outside of the " " sets the variable total to the variable %.2f inside the " "
        //"%.4f" would print 54.6293
        //"%.2f" prints 54.63 rounded
        
        //Write a Java program to print an American flag on the screen.
        //String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        //String p2 = "==============================================";
        //for (int i = 0; i < 4; i++) {
        //System.out.println(p1);
        //}
        //for (int i = 0; i < 6; i++) {
        //System.out.println(p2);   
        //}
        // \n untuk baris baru
        
        //Write a Java program to swap two variables.
        //System.out.println("Program Java Mengganti Variabel");
        //System.out.print("Masukan Angka Untuk Variabel Pertama = ");
        //int a = sc.nextInt();
        //System.out.print("Masukan Angka Untuk Variabel Kedua = ");
        //int b = sc.nextInt();
        //int c;
        
        //System.out.println("Sebelum ditukar");
        //System.out.println("Nilai Variabel A adalah = " + a);
        //System.out.println("Nilai Variabel B adalah = " + b);
        
        //c = a;
        //a = b;
        //b = c;
        
        //System.out.println("Sesudah ditukar");
        //System.out.println("Nilai Variabel A adalah = " + a);
        //System.out.println("Nilai Variabel A adalah = " + b);
        
        //Write a Java program to print a face.
        
        //Cara 1 Pakai Arai
        //String[] arrai = new String[5];

        //arrai[0] = " +\"\"\"\"\"+ ";
        //arrai[1] = "[| o o |]";
        //arrai[2] = " |  ^  |";
        //arrai[3] = " | '-' |";
        //arrai[4] = " +-----+";
  
        //for (int i = 0; i < 5; i++) {
        //System.out.println(arrai[i]);
        //}
        //System.out.println("\n");
        
        //Cara 2 Konvensional
        //System.out.println(" +\"\"\"\"\"+ ");
        //System.out.println("[| o o |] ");
        //System.out.println(" |  ^  | ");
        //System.out.println(" | '-' | ");
        //System.out.println(" +-----+ ");
        
        //Write a Java program that reads a number in inches, converts it to meters
        //System.out.println("Program Java Konvert Inci ke Meter");
        //System.out.print("Masukan Nilai = ");
        //double angka = sc.nextDouble();
        //double hasil = angka * 0.0254;
        
        //System.out.println(angka + " Inci adalah " + hasil + "Meter");
    
        // Write a Java program that reads an integer between 0 and 1000 and adds 
        //all the digits in the integer
        System.out.println("Program Menambahkan Semua Angka");
        System.out.print("Masukan interger antara 0 dan 1000 = ");
        int nilai = sc.nextInt();
        
        int digitPertama = nilai % 10;
        int remainingNumber = nilai / 10;
        int digitKedua = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int digitKetiga = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int digitKeempat = remainingNumber % 10;
        int hasil = digitKetiga + digitKedua + digitPertama + digitKeempat;
        System.out.println("Jumlah dari" + nilai + " adalah :" + hasil);
    }
}

    

