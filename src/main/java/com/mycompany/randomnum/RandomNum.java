/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomnum;
import java.util.Random;

/**
 *
 * @author Lenovo-User
 */
public class RandomNum {

    public static void main(String[] args) {
         Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println(randomNumber);
            
    }
}
}
