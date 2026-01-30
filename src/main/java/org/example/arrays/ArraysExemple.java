package org.example.arrays;
import java.util.Arrays;
public class ArraysExemple {
    static void main(String[] args) {
        int [ ] array = new int[3];
        System.out.println();
        int [ ] arraywithElements={2,3,4};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < arraywithElements.length; i++) {
//            arraywithElements[i] = i;
            System.out.println(arraywithElements[i]+" ");

        }
    }
}
