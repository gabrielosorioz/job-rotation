import java.util.HashMap;
import java.util.Map;

public class FaturamentoDistribuidora {

    public static void main(String[] args) {
        // Valores de faturamento mensal por estado
        Map<String, Double> faturamentoEstados = new HashMap<>();
        faturamentoEstados.put("SP", 67836.43);
        faturamentoEstados.put("RJ", 36678.66);
        faturamentoEstados.put("MG", 29229.88);
        faturamentoEstados.put("ES", 27165.48);
        faturamentoEstados.put("Outros", 19849.53);

        // Calcular o valor total mensal
        double valorTotalMensal = faturamentoEstados.values().stream().mapToDouble(Double::doubleValue).sum();

        // Calcular os percentuais de representação
        Map<String, Double> percentuaisRepresentacao = new HashMap<>();
        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
            double percentual = (entry.getValue() / valorTotalMensal) * 100;
            percentuaisRepresentacao.put(entry.getKey(), percentual);
        }

        // Exibir os resultados
        System.out.println("Percentual de representação por estado:");
        for (Map.Entry<String, Double> entry : percentuaisRepresentacao.entrySet()) {
            System.out.printf("%s: %.2f%%\n", entry.getKey(), entry.getValue());
        }
    }
}
