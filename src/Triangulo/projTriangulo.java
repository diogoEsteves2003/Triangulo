package Triangulo;

import java.util.Scanner;

public class projTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExTriangulo t1, t2, t3;
        t1 = new ExTriangulo();
        t2 = new ExTriangulo();
        t3 = new ExTriangulo();

        //T1
        System.out.println("1º Triângulo: ");
        System.out.println("Lado A: ");
        t1.lA = sc.nextDouble();

        System.out.println("Lado B: ");
        t1.lB = sc.nextDouble();

        System.out.println("Lado C: ");
        t1.lC = sc.nextDouble();

        System.out.printf("Area do 1º Triangulo: %.2f%n", t1.Area());
        System.out.printf("Perimetro do 1º Triangulo: %.2f%n%n", t1.Perimetro());


        //T2
        System.out.println("2º Triângulo: ");
        System.out.println("Lado A: ");
        t2.lA = sc.nextDouble();

        System.out.println("Lado B: ");
        t2.lB = sc.nextDouble();

        System.out.println("Lado C: ");
        t2.lC = sc.nextDouble();

        System.out.printf("Area do 2º Triangulo: %.2f%n", t2.Area());
        System.out.printf("Perimetro do 2º Triangulo: %.2f%n%n", t2.Perimetro());


        //T3
        System.out.println("3º Triângulo: ");
        System.out.println("Lado A: ");
        t3.lA = sc.nextDouble();

        System.out.println("Lado B: ");
        t3.lB = sc.nextDouble();

        System.out.println("Lado C: ");
        t3.lC = sc.nextDouble();

        System.out.printf("Area do 3º Triangulo: %.2f%n", t3.Area());
        System.out.printf("Perimetro do 3º Triangulo: %.2f%n%n", t3.Perimetro());
    }
}
