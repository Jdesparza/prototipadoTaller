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
        int[] values = new int[11];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(10);
        }

        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    int index = j;
                }
            }
        }
    }
    
}
