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
    //@gabriel-1302
    // Método para dividir dos números complejos
    public Complejo dividir(Complejo divisor) {
        double denominador = Math.pow(divisor.real, 2) + Math.pow(divisor.imaginario, 2);
        double nuevoReal = ((this.real * divisor.real) + (this.imaginario * divisor.imaginario)) / denominador;
        double nuevoImaginario = ((this.imaginario * divisor.real) - (this.real * divisor.imaginario)) / denominador;
        return new Complejo(nuevoReal, nuevoImaginario);
    }

    // Método para obtener el conjugado de un número complejo
    public Complejo conjugado() {
        return new Complejo(this.real, -this.imaginario);
    }

    // Método para obtener el módulo de un número complejo
    public double modulo() {
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imaginario, 2));
    }

    //@valeriaalexandracuellarcoca
    // Método para obtener la raíz cuadrada de un número complejo
    public Complejo raizCuadrada() {
        double magnitud = Math.sqrt(this.modulo());
        double angulo = this.fase() / 2.0;
        return new Complejo(magnitud * Math.cos(angulo), magnitud * Math.sin(angulo));
    }

    // Método para obtener el logaritmo natural de un número complejo
    public Complejo logaritmoNatural() {
        double magnitud = Math.log(this.modulo());
        double angulo = this.fase();
        return new Complejo(magnitud, angulo);
    }

    // Método para obtener una representación en cadena del número complejo
    @Override
    public String toString() {
        if (imaginario >= 0) {
            return real + " + " + imaginario + "i";
        } else {
            return real + " - " + Math.abs(imaginario) + "i";
        }
    }

    public static void main(String[] args) {
    




        
        
    }
}