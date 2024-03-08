import java.lang.Math;
import java.util.Scanner;

public class Complejo {
    
    private double real;
    private double imaginario;

    // Constructor base
    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    //@valeriaalexandracuellarcoca
    // Método para sumar dos números complejos
    public Complejo sumar(Complejo otroComplejo) {
        return new Complejo(this.real + otroComplejo.real, this.imaginario + otroComplejo.imaginario);
    }

    // Método para restar dos números complejos
    public Complejo restar(Complejo otroComplejo) {
        return new Complejo(this.real - otroComplejo.real, this.imaginario - otroComplejo.imaginario);
    }

    // Método para multiplicar dos números complejos
    public Complejo multiplicar(Complejo otroComplejo) {
        double nuevoReal = (this.real * otroComplejo.real) - (this.imaginario * otroComplejo.imaginario);
        double nuevoImaginario = (this.real * otroComplejo.imaginario) + (this.imaginario * otroComplejo.real);
        return new Complejo(nuevoReal, nuevoImaginario);
    }
    public static void main(String[] args) {

     
    }
}