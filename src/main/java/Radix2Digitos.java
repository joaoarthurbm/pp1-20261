import java.util.Arrays;

public class Radix2Digitos {

    /**
     * Ordena o array utilizando Radix Sort,
     * processando pares de dígitos por vez.
     *
     * Exemplo:
     * 7843 -> primeiro processa 43, depois 78
     */
    public static void radix(int[] array) {

        // TODO: implemente sua solução aqui

    }

    /**
     * Counting Sort estável considerando pares de dígitos.
     *
     * exp = 1   -> considera os 2 últimos dígitos
     * exp = 100 -> considera os próximos 2 dígitos
     */
    private static void countingSort(int[] array, int exp) {

        // TODO: implemente sua solução aqui

    }

    public static void main(String[] args) {

        // Caso do enunciado
        int[] a1 = {7843, 5374, 2344, 8543};
        radix(a1);

        assert Arrays.equals(
                a1,
                new int[]{2344, 5374, 7843, 8543}
        ) : "Teste 1 falhou";

        // Array já ordenado
        int[] a2 = {1111, 2222, 3333, 4444};
        radix(a2);

        assert Arrays.equals(
                a2,
                new int[]{1111, 2222, 3333, 4444}
        ) : "Teste 2 falhou";

        // Ordem inversa
        int[] a3 = {9999, 8888, 7777, 6666};
        radix(a3);

        assert Arrays.equals(
                a3,
                new int[]{6666, 7777, 8888, 9999}
        ) : "Teste 3 falhou";

        // Valores repetidos
        int[] a4 = {1212, 3434, 1212, 5656, 3434};
        radix(a4);

        assert Arrays.equals(
                a4,
                new int[]{1212, 1212, 3434, 3434, 5656}
        ) : "Teste 4 falhou";

        // Mistura geral
        int[] a5 = {9090, 1010, 8080, 2020, 7070, 3030};
        radix(a5);

        assert Arrays.equals(
                a5,
                new int[]{1010, 2020, 3030, 7070, 8080, 9090}
        ) : "Teste 5 falhou";

        // Todos iguais
        int[] a6 = {4444, 4444, 4444};
        radix(a6);

        assert Arrays.equals(
                a6,
                new int[]{4444, 4444, 4444}
        ) : "Teste 6 falhou";

        System.out.println("Todos os testes passaram.");
    }
}
