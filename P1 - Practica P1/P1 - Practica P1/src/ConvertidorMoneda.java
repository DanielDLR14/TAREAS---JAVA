public class ConvertidorMoneda {
    public static double ConvertirMoneda(double dolarMonto) {
        final double cantcambio = 56.40;
        return dolarMonto * cantcambio;
    }

    public static void main(String[] args) {
        double dolarMonto = 20.0;
        double pesoMonto = ConvertidorMoneda.ConvertirMoneda(dolarMonto);
        System.out.println("$" + dolarMonto + " tiene un total de " + pesoMonto + " pesos.");

    }
}

