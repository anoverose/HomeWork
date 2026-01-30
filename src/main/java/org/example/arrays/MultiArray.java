package org.example.arrays;
public class MultiArray {
    static void main(String[] args) {
        int [ ][ ]house = new int [2][5];
        house [0] [0] = 33;
        house [0] [1] = 46;
        house [0] [2] = 2;
        house [0] [3] = 14;
        house [1] [0] = 7 ;
        house [1] [1] = 16;
        house [1] [2] = 3;
        house [1] [3] = 8;
        //System.out.println(java.util.Arrays.deepToString(house));
        for (int i = 0; i < house.length; i++) {
            for (int j = 0; j < house[i].length; j++) {
                System.out.print(house[i][j]+" ");
            }

        }
    }
}
