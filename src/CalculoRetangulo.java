import Retangulo.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculoRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Informe os valores da base e altura do retangulo: ");

        System.out.print("Base: ");
        ret.base = sc.nextDouble();

        System.out.print("Altura: ");
        ret.altura = sc.nextDouble();

        System.out.printf("A área do retângulo é: %.2f", ret.areaRetangulo());

        System.out.println("");

        System.out.println("O Perímetro é: ");

        System.out.printf("%.2f%n", ret.perimetro());
        sc.close();

        System.out.printf("Diagonal %.2f", ret.diagonal());
        }
    }
