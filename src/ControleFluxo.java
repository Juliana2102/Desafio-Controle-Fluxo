import java.util.Scanner;

public class ControleFluxo extends Exception {
    public ControleFluxo(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ControleFluxo e) {
                System.out.println(e.getMessage()); // Exibe a mensagem da exceção personalizada
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ControleFluxo {
        // Verifica se o primeiro parâmetro é maior que o segundo
        if (parametroUm > parametroDois) {
            throw new ControleFluxo("O segundo parâmetro deve ser maior que o primeiro");
        }
        // loop para imprimir os nnúmeros no intervalo especificado.
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}