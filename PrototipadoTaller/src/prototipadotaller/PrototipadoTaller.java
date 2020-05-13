/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipadotaller;

import java.util.Random;

/**
 *
 * @author PC
 */
public class PrototipadoTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] values = new int[1000];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(1000);
        }

        for (int i = 0; i < 1000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                }
                System.out.println(index);
            }
            break;
        }
    }
    
}
