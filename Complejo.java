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
    // Método para obtener la fase o argumento de un número complejo
    public double fase() {
        return Math.atan2(this.imaginario, this.real);
    }

    // Método para elevar un número complejo a una potencia entera
    public Complejo potencia(int exponente) {
        double magnitud = Math.pow(this.modulo(), exponente);
        double angulo = this.fase() * exponente;
        return new Complejo(magnitud * Math.cos(angulo), magnitud * Math.sin(angulo));
    }

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
    //@gabriel-1302
    Scanner scanner = new Scanner(System.in);
        System.out.println("---Ingenieria de Sofware---");
        System.out.println("GABRIEL VELASQUEZ MENDIA");
        System.out.println("VALERIA CUELLAR COCA");
        System.out.println("Ingrese la parte real del Complejo 1:");
        double real1 = scanner.nextDouble();

        System.out.println("Ingrese la parte imaginaria del Complejo 1:");
        double imaginario1 = scanner.nextDouble();

        Complejo complejo1 = new Complejo(real1, imaginario1);

        System.out.println("Ingrese la parte real del Complejo 2:");
        double real2 = scanner.nextDouble();

        System.out.println("Ingrese la parte imaginaria del Complejo 2:");
        double imaginario2 = scanner.nextDouble();

        Complejo complejo2 = new Complejo(real2, imaginario2);

        Complejo suma = complejo1.sumar(complejo2);
        Complejo resta = complejo1.restar(complejo2);
        Complejo multiplicacion = complejo1.multiplicar(complejo2);
        Complejo division = complejo1.dividir(complejo2);
        Complejo conjugado1 = complejo1.conjugado();
        double modulo1 = complejo1.modulo();
        double fase1 = complejo1.fase();
        Complejo potencia1 = complejo1.potencia(2);
        Complejo raizCuadrada1 = complejo1.raizCuadrada();
        Complejo logaritmoNatural1 = complejo1.logaritmoNatural();

        System.out.println("Complejo 1: " + complejo1);
        System.out.println("Complejo 2: " + complejo2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Conjugado de complejo 1: " + conjugado1);
        System.out.println("Módulo de complejo 1: " + modulo1);
        System.out.println("Fase de complejo 1: " + fase1);
        System.out.println("Potencia de complejo 1^2: " + potencia1);
        System.out.println("Raíz cuadrada de complejo 1: " + raizCuadrada1);
        System.out.println("Logaritmo natural de complejo 1: " + logaritmoNatural1);

    }
}