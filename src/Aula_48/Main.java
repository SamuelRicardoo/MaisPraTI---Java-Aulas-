package Aula_48;

public class Main {
    public static void main(String[] args) {

       int[][] matriz = {
               {10, 20, 30},
               {48, 58, 68},
               {79, 89, 99}};


        System.out.println("Matriz Principal diagonal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(" "+matriz[i][j]);
                }
            }
        }
        System.out.println();

        System.out.println("Matriz diagonal secundaria");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.print(" "+matriz[i][j]);
                }
            }
        }

        System.out.println();

        System.out.println("Matriz Tranposta");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int soma =0;
        System.out.println("Soma da matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        System.out.println(soma);
    }
}