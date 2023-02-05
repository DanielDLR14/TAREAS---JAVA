import java.util.Scanner;

public class StringNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.println("Ingrese su nombre:");
            name = scanner.nextLine();
        } while (name.length() <= 3);
        printName(name);
    }

    public static void printName(String name) {
        System.out.println("Bienvenido " + name);
    }
}

