import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String opcion = "";
            System.out.println(" ");
            System.out.println(" **** BIENVENID@ A NUESTRA APP **** ");
            System.out.println(" ");
            System.out.println("Indique que operación desea realizar!");
            System.out.println("1- Calculadora\n" +
                    "2- N° Mayor\n" +
                    "3- Numero divisible por 2\n" +
                    "4- Calcular IVA\n" +
                    "5- Escribir del 1 al 100\n" +
                    "6- N° divisibles x2 y x3 del 1 al 100\n" +
                    "7- N°mayor o igual a 0\n" +
                    "8- Adivine la contraseña :)\n" +
                    "9- Días laborales\n" +
                    "10- Decir si es un N° primo\n" +
                    "11- N° aleatorio entre 0 y 100\n" +
                    "0- SALIR");
            opcion = sc.nextLine();
            if (opcion.equals("0")) {
                System.out.println("***Usted salió de la APLICACIÓN ***");
                break;
            }
            operaciones(opcion);
        }
    }

    public static void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void operaciones(String opcion) {
        switch (opcion) {
            case "1":
                Logica.calcular();
                break;
            case "2":
                Logica.numeroMayor();
                break;
            case "3":
                Logica.numDivisiblePorDos();
                break;
            case "4":
                Logica.precioConIva();
                break;
            case "5":
                Logica.centena();
                break;
            case "6":
                Logica.divisibles();
                break;
            case "7":
                Logica.numMayorOigual();
                break;
            case "8":
                Logica.contrasena();
                break;
            case "9":
                Logica.calendario();
                break;
            case "10":
                Logica.numPrimo();
                break;
            case "11":
                Logica.aleatorio();
                break;
            default:
                System.out.println("Caracter no valido, intente de nuevo");
                break;
        }
        delay();
    }
}