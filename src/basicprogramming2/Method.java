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
public class Method {
    public int helloworld(){
        System.out.println("Hae Maniez");
        System.out.println("Hae Maniez");
        return 2;
    }
    
    public void helloWorld(int numberOfHelloWorld){
        System.out.println(numberOfHelloWorld);
        //return numberOfHelloWorld;
    }
    
    public int sumOfThreeNumbers(int number1, int number2, int number3){
        int sum = number1 + number2 + number3;
        return sum;
    }
    
    public int triangles(int angles1, int angles2){
        int calculateThirdiangles = 180 - (angles1 + angles2);
        return calculateThirdiangles;
    }
}
