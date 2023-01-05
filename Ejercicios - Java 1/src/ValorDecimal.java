// Se le asigna un nombre a la clase
public class ValorDecimal {
        public static void main(String[] args) {
            // Se Declara una variable double y se le pone el valor inicial
            double valor = 200.0;
            // Se utiliza el bucle while para decir mientras valor sea menor a 1,000
            while (valor < 1000) {
                // Se Incrementara valor en un 5%
                valor *= 0.05;
                // Luego usando if se verifica si el valor es divisible entre 2
                if (valor % 2 == 0) {
                    // Si se cumple esta condición, finaliza el programa
                    break;
                }
            }
            // Imprime el valor final
            System.out.println(valor);
        }
    }




