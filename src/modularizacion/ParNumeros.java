package modularizacion;

// Clase creada para simular el  paso por referencia
// Esta clase guarda dos números y permite intercambiarlos

public class ParNumeros {

    public int a;
    public int b;

    public ParNumeros(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a + ", b=" + b;
    }
}