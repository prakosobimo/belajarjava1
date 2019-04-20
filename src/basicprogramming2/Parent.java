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
public class Parent {
      public static void main(String[] args) {
          
        System.out.println("Di sini kelas untuk kita memanggil Method");
        Method m = new Method();
          //System.out.println(m.helloWorld());
          //m.helloWorld(2);
          //m.helloWorld(6);
          System.out.println(m.sumOfThreeNumbers(5, 10, 15));
          System.out.println(m.triangles(60, 60));
          }
      
      
}
