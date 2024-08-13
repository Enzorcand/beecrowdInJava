package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada;
        do{

            ArrayList<Float> notas = notaValida(scanner);
            float media = calculaMedia(notas);
            System.out.printf("media = %.2f%n", media);
            entrada = novoCalculo(scanner);
        }while (entrada == 1);
        scanner.close();

    }

    private static float calculaMedia(ArrayList<Float> notas) {
        float media = 0;
        for (float f : notas) {
            media += f;
        }
        return media / 2;
    }

    private static ArrayList<Float> notaValida(Scanner scan) {
        ArrayList<Float> notas = new ArrayList<>();
        for (int i = 0; i < 2;) {
            float entrada = Float.parseFloat(scan.nextLine());
            if(entrada <= 10 && entrada >= 0){
                notas.add(entrada);
                i++;
            }else {
                System.out.println("nota invalida");
            }
        }

        return notas;
    }

    private static int novoCalculo(Scanner scanner) {

        int entrada;
        do{
            System.out.println("novo calculo (1-sim 2-nao)");
            entrada = Integer.parseInt(scanner.nextLine());
            if(entrada == 2){
                break;
            }
        }while (entrada != 1);
        return entrada;
    }
}
