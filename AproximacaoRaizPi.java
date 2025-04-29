public class AproximacaoRaizPi {

    public static double aproximarPiLeibniz(int iteracoes) {
        double piAprox = 0.0;
        int sinal = 1;

        for (int i = 0; i < iteracoes; i++) {
            piAprox += sinal * 1.0 / (2 * i + 1);
            sinal = -sinal; // alterna o sinal entre + e -
        }

        return piAprox * 4;
    }

    public static void main(String[] args) {
        int iteracoes = 1_000_000_000; // valor padrão

        if (args.length > 0) {
            try {
                iteracoes = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Número inválido de iterações. Usando valor padrão: " + iteracoes);
            }
        }

        System.out.println("Calculando aproximação de PI usando " + iteracoes + " iterações...");
        long inicio = System.nanoTime();

        double piAproximado = aproximarPiLeibniz(iteracoes);
        double raizPiAproximado = Math.sqrt(piAproximado);

        long fim = System.nanoTime();
        double tempoSegundos = (fim - inicio) / 1_000_000_000.0;

        System.out.printf("Valor aproximado de PI (Leibniz): %.15f%n", piAproximado);
        System.out.printf("Raiz quadrada aproximada de PI: %.15f%n", raizPiAproximado);
        System.out.printf("Tempo de execução: %.3f segundos%n", tempoSegundos);
    }
}
