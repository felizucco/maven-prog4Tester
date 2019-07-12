/** By Felipe P.
 *  Date: 2019-7-03
 *
 *  ·    Hacer una matriz de *s.
 ·       Hacer una matriz que ponga 0s de la diagonal hacia abajo y 1s de la diagonal hacia arriba
 ·       ¿¿¿Hacer la matriz con los ceros de abajo???
 */


package main;

public class MatrixExercises {

    public static void main(String[] args) {

        int n,m;
        n = 5;
        m = 5;

        char[][] matrix = new char[n][m];
        //int[][] matrix2 = new int[n][m];

        System.out.println("Hacer una matriz de *s e imprimirla por consola: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                matrix[i][j] = '*';
        }

        //Here we print results reading matrix's content
        for (int i = 0; i < n; i++)
        {
            int j = 0;
            while (j < m)
            {
                System.out.print(matrix[i][j]);
                j++;
            }
            if (j == m)
                System.out.print("\n");
        }

        System.out.println("Hacer una matriz que ponga 0s de la diagonal hacia abajo y 1s de la diagonal hacia arriba: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (i<j)
                    matrix[i][j] = '1';
                else if (i == j)
                    matrix[i][j] = '*';
                else
                    matrix[i][j] = '0';

            }
        }

        //Here we print results
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < m) {
                System.out.print(matrix[i][j]);
                j++;
            }
            if (j == m)
                System.out.print("\n");
        }

    }
}
