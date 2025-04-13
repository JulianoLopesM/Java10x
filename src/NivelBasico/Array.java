package NivelBasico;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        //inicializa como null
        String[] ninja = new String[3];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        System.out.println(Arrays.toString(ninja));
        //inicializa como 0
        int[] idade = new int[3];
        System.out.println(idade[0]);
        //inicializa como 0.0
        double[] flutuante = new double[3];
        System.out.println(flutuante[0]);
        //inicializa como falso
        boolean[] verdadeiroOuFalso = new boolean[3];
        System.out.println(verdadeiroOuFalso[0]);

    }
}
