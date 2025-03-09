public class AproximacaoRaizPi {
    public static double aproximarPiLeibniz(int iteracoes) {
        double piAprox = 0.0;
        for (int i = 0; i < iteracoes; i++) {
            double termo = Math.pow(-1, i) / (2 * i + 1);
            piAprox += termo;
        }
        return piAprox * 4; 
        
    }

    public static void main(String[] args) {
        int iteracoes = 1000000000; // Quanto maior, mais preciso
        double piAproximado = aproximarPiLeibniz(iteracoes);
        double raizPiAproximado = Math.sqrt(piAproximado);

        System.out.println("Valor aproximado de PI (Leibniz): " + piAproximado);
        System.out.println("Raiz quadrada aproximada de PI: " + raizPiAproximado);
    }
}
