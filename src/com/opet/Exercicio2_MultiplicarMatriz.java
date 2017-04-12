package com.opet;

public class Exercicio2_MultiplicarMatriz
{

    public static void main(String[] args)
    {
        int [][]mat1 = new int[2][3];
        /* mat1[0][0] = 12;
        mat1[0][1] = 0;
        mat1[0][2] = 15;

        mat1[1][0] = 5;
        mat1[1][1] = 3;
        mat1[1][2] = 7;
        */
        mat1[0][0] = 1;
        mat1[0][1] = 2;
        mat1[0][2] = 3;

        mat1[1][0] = 4;
        mat1[1][1] = 5;
        mat1[1][2] = 6;

        int [][]mat2 = new int[3][2];
        /* mat2[0][0] = 1;
        mat2[0][1] = 4;
        mat2[1][0] = 3;
        mat2[1][1] = 8;
        mat2[2][0] = 6;
        mat2[2][1] = 3; */
        mat2[0][0] = 1;
        mat2[0][1] = 4;
        mat2[1][0] = 2;
        mat2[1][1] = 5;
        mat2[2][0] = 3;
        mat2[2][1] = 6;


        int [][] novaMatriz = calcular(mat1, mat2);

        /* Imprime a nova matriz para testar se está OK */
        for(int i=0;i<novaMatriz.length;i++) {
            for(int j=0; j<novaMatriz[i].length;j++) {
                System.out.println("Elemento "+i+","+j+":"+novaMatriz[i][j]);
            }
        }

    }

    public static int [][] calcular(int [][] matriz1, int [][] matriz2)
    {
        int [][]resultado = new int[2][2];
        resultado[0][0] = multiplicarColuna(matriz1[0], 0, matriz2) ;
        resultado[0][1] = multiplicarColuna(matriz1[0], 1, matriz2) ;
        resultado[1][0] = multiplicarColuna(matriz1[1], 0, matriz2) ;
        resultado[1][1] = multiplicarColuna(matriz1[1], 1, matriz2) ;
        return resultado;
    }

    public static int multiplicarColuna(int [] linha,int indiceColuna, int [][] coluna)
    {
        int soma = 0;
        for(int i=0;i<1;i++) {
            for(int j=0; j<coluna.length;j++) {
                soma =  soma+(linha[j] * coluna[j][indiceColuna]) ;
            }
        }
        return soma;
    }
}
