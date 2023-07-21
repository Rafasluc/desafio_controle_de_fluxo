import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        int resultado = 0;

        if (parametroDois > parametroUm) {
            resultado = parametroDois - parametroUm;
            System.out.println(resultado);
            for (int i = 0; i < resultado; i++) {
                System.out.println("o resultado é " + (i + 1));
            }
        } else {
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
        }
    }

}