public class AssertsMediana {

    public static void main(String[] args) {

        int[] v1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int p1 = PivotMediana.lomutoPartition(v1);
        assert p1 == 8 : "Teste 1 falhou: posicao do pivot incorreta";
        checkPartition(v1, p1, "Teste 1");

        int[] v2 = {1, 2, 3, 4, 5};
        int p2 = PivotMediana.lomutoPartition(v2);
        assert p2 == 2 : "Teste 2 falhou: posicao do pivot incorreta";
        checkPartition(v2, p2, "Teste 2");

        int[] v3 = {5, 4, 3, 2, 1};
        int p3 = PivotMediana.lomutoPartition(v3);
        assert p3 == 2 : "Teste 3 falhou: posicao do pivot incorreta";
        checkPartition(v3, p3, "Teste 3");

        int[] v4 = {7, 7, 7, 7, 7};
        int p4 = PivotMediana.lomutoPartition(v4);
        checkPartition(v4, p4, "Teste 4");

        int[] v5 = {42};
        int p5 = PivotMediana.lomutoPartition(v5);
        assert p5 == 0 : "Teste 5 falhou: posicao do pivot incorreta";
        checkPartition(v5, p5, "Teste 5");

        int[] v6 = {2, 1};
        int p6 = PivotMediana.lomutoPartition(v6);
        assert p6 == 1 : "Teste 6 falhou: posicao do pivot incorreta";
        checkPartition(v6, p6, "Teste 6");

        int[] v7 = {5, 3, 5, 3, 5, 3};
        int p7 = PivotMediana.lomutoPartition(v7);
        checkPartition(v7, p7, "Teste 7");

        System.out.println("Todos os testes do pivot passaram.");
    }

    private static void checkPartition(int[] v, int pivotPos, String testName) {
        int pivot = v[pivotPos];
        for (int i = 0; i < pivotPos; i++) {
            assert v[i] <= pivot : testName + " falhou: elemento a esquerda " + v[i] + " > pivot " + pivot;
        }
        for (int i = pivotPos + 1; i < v.length; i++) {
            assert v[i] > pivot : testName + " falhou: elemento a direita " + v[i] + " <= pivot " + pivot;
        }
    }

}
