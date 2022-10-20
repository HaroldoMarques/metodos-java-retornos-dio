package br.com.retorno.metodosjava.intellij.dio;

public class Execucao {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercícios Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);

    }
}
