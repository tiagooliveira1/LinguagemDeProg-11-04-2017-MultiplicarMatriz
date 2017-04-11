package com.opet;

public class Exercicio2_MultiplicarMatriz
{

    public static void main(String[] args)
    {
        int [][]mat1 = new int[2][3];
        mat1[0][0] = 12;
        mat1[0][1] = 13;
        mat1[0][2] = 17;

        mat1[1][0] = 9;
        mat1[1][1] = 0;
        mat1[1][2] = 15;

        int [][]mat2 = new int[3][2];
        mat2[0][0] = 1;
        mat2[0][1] = 7;
        mat2[1][0] = 34;
        mat2[1][1] = 22;
        mat2[2][0] = 90;
        mat2[2][1] = 13;

    }

    public static int [][] transporMatriz(int [][] matriz1, int [][] matriz2)
    {
        int [][]resultado = new int[3][2];
        for(int i=0;i<matriz1.length;i++) {
            for(int j=0; j<matriz1[i].length;j++) {
                resultado[j][i] =matriz1[i][j];
            }
        }
        return resultado;
    }

}
