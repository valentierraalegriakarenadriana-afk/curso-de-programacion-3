package semana2;

public class Ejercicio1 {
    public static void main(String[] args) {
        // forma1 -> Definiendo directamente los valores del arreglo
        int[] a = { 4, 8, 9, 6, 1, 2, 10 };

        // iterar los elementos del arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]=" + a[i]);
        }
        //sumar los numeros pares e impares del arreglo y mostrar el resultado
        int sumapares = 0, sumaImpares = 0;
        for (int i _= 0; i < a.length; i++) {
            if(a[i]%2 == 0) {
                sumapares  += a[i];
            }else{
                sumaImpares += a[i];

            }
        }
        System.out.println("suma pares = " + sumapares + " suma Impares = " + sumaImpares);

    }
}
