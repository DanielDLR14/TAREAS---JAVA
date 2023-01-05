// Se nombra la clase con el nombre que deseemos
public class DolarPeso {
    public static void main(String[] args) {
        // Declarar variables y asignan los valores
        /*
        El tipo double se utiliza para representar valores numéricos con punto flotante, es decir, números con decimales.
        En este caso, se utiliza para almacenar el monto en dólares y la tasa de conversión,
        que son valores numéricos con decimales.
        */
        double dolares = 570;
        double tasa = 55.98;
        double resultado;

        //  realiza la conversión de dólares a pesos dominicanos utilizando la fórmula dolares * tasa y
        //  almacena el resultado en la variable resultado.
        resultado = dolares * tasa;

        // Imprimir el resultado
        System.out.println("La conversión a pesos dominicanos es: " + resultado);
    }
}
