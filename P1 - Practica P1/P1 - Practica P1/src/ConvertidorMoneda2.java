public class ConvertidorMoneda2 {
    public static double ConvertirMoneda(double dolarMonto) {
        final double cantcambio = 56.40;
        return dolarMonto * cantcambio;
    }
    public static boolean validar(double pesoMonto) {
        return pesoMonto > 500.00;
    }
    public static void main(String[] args) {
        double dolarMonto = 5.0;
        double pesoMonto = ConvertidorMoneda2.ConvertirMoneda(dolarMonto);
        boolean validacion = ConvertidorMoneda2.validar(pesoMonto);
        System.out.println("El monto de " + "$" + dolarMonto + " es igual a " + pesoMonto + " pesos.");
        System.out.println("El monto convertido es mayor a 500.00: " + validacion);
    }
}

