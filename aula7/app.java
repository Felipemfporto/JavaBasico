package aula7;

import java.text.BreakIterator;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);

        Delta delta = new Delta();
        EqXn eqXn = new EqXn();

        System.out.println("Com base na Fómula de Bháskara : Ax² + Bx + C");
        System.out.println("______________________________________________");
        System.out.println("Digite o valor de A:");
        delta.setA(lerDados.nextDouble());
        delta.getA();
        while (delta.getA() == 0) {
            System.out.println("Inválido, pois deixará de ser uma equação de segundo grau");
            System.out.println("----------------------------------------------------------");
            System.out.println("Digite o valor de A novamente:");
            delta.setA(lerDados.nextDouble());
        }
        System.out.println("Digite o valor de B:");
        delta.setB(lerDados.nextDouble());
        
        System.out.println("Digite o valor de C:");
        delta.setC(lerDados.nextDouble());

        delta.finalDelta();
        System.out.println("---> RESULTADOS :");
        System.out.println("Delta = " + delta.getDelta());
        if (delta.getDelta() < 0) {
            System.out.println("Não existem valores reais");
        } else if (delta.getDelta() == 0) {
            double x;
            x = -(delta.getB()) / (2 * delta.getA());
            System.out.println("esta equação possui apenas uma raiz com valor de " + x);
        } else {
            System.out.println("X' = " + eqXn.calculaXn(delta));
            System.out.println("X'' = " + eqXn.calculaXp(delta));
        
        }
        
    }
}
