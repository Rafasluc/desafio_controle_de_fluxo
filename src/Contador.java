import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        int resultado = 0;

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
        }


    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {


        if (parametroDois > parametroUm) {
            int contagem = parametroDois - parametroUm;
            System.out.println(contagem);
            for (int i = 0; i < contagem; i++) {
                System.out.println("o resultado é " + (i + 1));
            }
        } else {
            //System.out.println("O Segundo parâmetro deve ser maior que o primeiro");
        }
    }

}