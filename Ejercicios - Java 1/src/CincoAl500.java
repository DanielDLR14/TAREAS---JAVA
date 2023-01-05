// Se asigna el nombre a la variable que desee
public class CincoAl500 {
    public static void main(String[] args) {
        // Declara una variable entera y asignale el valor 5
        int num = 5;
        // Utiliza un bucle while para iterar mientras num sea menor o igual a 500
        while (num <= 500) {
            // Verifica si num es divisible tanto por 3 como por 5
            if (num % 3 == 0 && num % 5 == 0) {
                // Si cumple ambas condiciones, imprime num
                System.out.println(num);
            }
            // Incrementa num en 1
            num++;
        }
    }
}

