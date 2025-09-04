import java.text.DecimalFormat;
public class Atividade03 {
    public static void main(String[] args) {
        String nomeProduto = "Notebook";
        double precoUnitario = 3700.75;
        int quantidadeComprada = 2;
        double taxaImposto = 0.10;
        double margemLucroDesejada = 0.20;

        double valorTotalSemImpostos = precoUnitario * quantidadeComprada;
        double valorImposto = valorTotalSemImpostos * taxaImposto;
        double valorTotalComImpostos = valorTotalSemImpostos + valorImposto;

        double precoVendaNecessario = valorTotalComImpostos / (1 - margemLucroDesejada);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Nome do Produto: " + nomeProduto);
        System.out.println("Preço Unitário: R$ " + df.format(precoUnitario));
        System.out.println("Quantidade Comprada: " + quantidadeComprada);
        System.out.println("Taxa de Imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de Lucro Desejada: " + (margemLucroDesejada * 100) + "%");
        System.out.println("Valor Total Sem Impostos: R$ " + df.format(valorTotalSemImpostos));
        System.out.println("Valor do Imposto: R$ " + df.format(valorImposto));
        System.out.println("Valor Total Com Impostos: R$ " + df.format(valorTotalComImpostos));
        System.out.println("Preço de Venda Necessário (com margem de lucro): R$ " + df.format(precoVendaNecessario));

        System.out.println("\nResumo da Compra:");
        System.out.println("O produto " + nomeProduto + " custou R$ " + df.format(valorTotalComImpostos) + " com impostos. Para uma margem de lucro de " + (margemLucroDesejada * 100) + "%, o preço de venda sugerido é R$ " + df.format(precoVendaNecessario) + ".");
    }
}