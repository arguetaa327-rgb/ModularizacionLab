package modularizacion;

import java.util.Random;
import java.util.Scanner;

public class ModularizacionMetodos {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = leerEntero("Elige una opcion: ");

            switch (opcion) {
                case 1:
                    ejercicioCalculadora();
                    break;
                case 2:
                    ejercicioContrasenia();
                    break;
                case 3:
                    ejercicioPrimos();
                    break;
                case 4:
                    ejercicioSumaPares();
                    break;
                case 5:
                    ejercicioTemperatura();
                    break;
                case 6:
                    ejercicioContarVocales();
                    break;
                case 7:
                    ejercicioFactorial();
                    break;
                case 8:
                    ejercicioAdivinanza();
                    break;
                case 9:
                    ejercicioPasoPorReferencia();
                    break;
                case 10:
                    ejercicioTablaMultiplicar();
                    break;
                case 0:
                    System.out.println("Programa finalizado correctamente.");
                    System.out.println("Gracias por utilizar el sistema. Hasta luego...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

            if (opcion != 0) {
                System.out.println("\nPresiona Enter para continuar...");
                sc.nextLine();
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n====== MENU PRINCIPAL ======");
        System.out.println("1. Calculadora basica");
        System.out.println("2. Validacion de contrasenia");
        System.out.println("3. Numero primo");
        System.out.println("4. Suma de numeros pares");
        System.out.println("5. Conversion de temperatura");
        System.out.println("6. Contador de vocales");
        System.out.println("7. Factorial");
        System.out.println("8. Juego de adivinanza");
        System.out.println("9. Paso por referencia");
        System.out.println("10. Tabla de multiplicar");
        System.out.println("0. Salir");
    }

    // ===== METODOS DE VALIDACION CORREGIDOS =====

    private static int leerEntero(String mensaje) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            } catch (Exception e) {
                System.out.println("Debes ingresar un numero entero valido.");
            }
        }

        return numero;
    }

    private static double leerDouble(String mensaje) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(sc.nextLine());
                valido = true;
            } catch (Exception e) {
                System.out.println("Debes ingresar un numero valido.");
            }
        }

        return numero;
    }

    // ===== 1 CALCULADORA =====

    private static void ejercicioCalculadora() {

        System.out.println("\n--- Calculadora basica ---");

        double a = leerDouble("Ingrese el primer numero: ");
        double b = leerDouble("Ingrese el segundo numero: ");

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int op = leerEntero("Seleccione operacion: ");

        switch (op) {
            case 1:
                System.out.println("Resultado: " + sumar(a, b));
                break;
            case 2:
                System.out.println("Resultado: " + restar(a, b));
                break;
            case 3:
                System.out.println("Resultado: " + multiplicar(a, b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    System.out.println("Resultado: " + dividir(a, b));
                }
                break;
            default:
                System.out.println("Operacion invalida.");
        }
    }

    private static double sumar(double a, double b) {
        return a + b;
    }

    private static double restar(double a, double b) {
        return a - b;
    }

    private static double multiplicar(double a, double b) {
        return a * b;
    }

    private static double dividir(double a, double b) {
        return a / b;
    }

    // ===== 2 CONTRASENIA =====

    private static void ejercicioContrasenia() {

        String pass;

        do {
            System.out.print("Ingrese la contrasenia: ");
            pass = sc.nextLine();

            if (!pass.equals("1234")) {
                System.out.println("Contrasenia incorrecta.");
            }

        } while (!pass.equals("1234"));

        System.out.println("Acceso concedido.");
    }

    // ===== 3 PRIMO =====

    private static void ejercicioPrimos() {

        int num = leerEntero("Ingrese un numero: ");

        if (esPrimo(num)) {
            System.out.println("Es primo.");
        } else {
            System.out.println("No es primo.");
        }
    }

    private static boolean esPrimo(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    // ===== 4 SUMA PARES =====

    private static void ejercicioSumaPares() {

        int suma = 0;
        int num;

        while (true) {
            num = leerEntero("Ingrese numero (0 para salir): ");
            if (num == 0) break;

            if (num % 2 == 0) {
                suma += num;
            }
        }

        System.out.println("Suma de pares: " + suma);
    }

    // ===== 5 TEMPERATURA =====

    private static void ejercicioTemperatura() {

        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");

        int op = leerEntero("Seleccione opcion: ");

        if (op == 1) {
            double c = leerDouble("Ingrese Celsius: ");
            System.out.println("Resultado: " + celsiusAFahrenheit(c));
        } else if (op == 2) {
            double f = leerDouble("Ingrese Fahrenheit: ");
            System.out.println("Resultado: " + fahrenheitACelsius(f));
        } else {
            System.out.println("Opcion invalida.");
        }
    }

    private static double celsiusAFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    private static double fahrenheitACelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // ===== 6 VOCALES =====

    private static void ejercicioContarVocales() {

        System.out.print("Ingrese texto: ");
        String texto = sc.nextLine().toLowerCase();

        int contador = 0;

        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }

        System.out.println("Cantidad de vocales: " + contador);
    }

    // ===== 7 FACTORIAL =====

    private static void ejercicioFactorial() {

        int n;

        do {
            n = leerEntero("Ingrese numero no negativo: ");
        } while (n < 0);

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        System.out.println("Factorial: " + resultado);
    }

    // ===== 8 ADIVINANZA =====

    private static void ejercicioAdivinanza() {

        Random random = new Random();
        int secreto = random.nextInt(100) + 1;
        int intento;

        do {
            intento = leerEntero("Adivina el numero (1-100): ");

            if (intento < secreto) {
                System.out.println("Es mayor.");
            } 
            else if (intento > secreto) {
                System.out.println("Es menor.");
            } 
            else {
                System.out.println("Felicidades adivinaste el numero");
            }

        } while (intento != secreto);
    }

    // ===== 9 PASO POR REFERENCIA =====

    private static void ejercicioPasoPorReferencia() {

        int a = leerEntero("Ingrese a: ");
        int b = leerEntero("Ingrese b: ");

        ParNumeros par = new ParNumeros(a, b);

        System.out.println("Antes: " + par);

        intercambiar(par);

        System.out.println("Despues: " + par);
    }

    private static void intercambiar(ParNumeros par) {
        int temp = par.a;
        par.a = par.b;
        par.b = temp;
    }

    // ===== 10 TABLA =====

    private static void ejercicioTablaMultiplicar() {

        int num = leerEntero("Ingrese numero: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}