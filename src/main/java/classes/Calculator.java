/** By Felipe P.
 *  Date: 2019-7-04
 *
 ·    Hacer una calculadora que reciba los valores por consola e imprima el resultado en consola.
 ·    Convertir la calculadora a proyecto maven y subirlo a bit bucket.
 */

package classes;

public class Calculator {

    int A, B;

    public Calculator (){

        this.A = 0;
        this.B = 0;
    }

    public Calculator (int X, int Y){
        this.A = X;
        this.B = Y;
    }
    public int Add(){return this.A + this.B; }

    public int Subtract(){return this.A - this.B; }

    public int Multiply (){return this.A * this.B; }

    public float Divide (int X, int Y){return A / (float)B; }
}
