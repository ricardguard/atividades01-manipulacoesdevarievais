public class Atividade02 {
    public static void main(String[] args) {
        String nome = "Ricardo";
        int idade = 27;
        double salarioMensalBruto = 3500.00;
        int mesesTrabalhados = 12;
        int quantidadeItensComprados = 5;
        double valorTotalCompras = 500.00;

        double salarioAnualBruto = salarioMensalBruto * mesesTrabalhados;
        double descontoFixo = 2000.00;
        double salarioAnualLiquido = salarioAnualBruto - descontoFixo;
        double mediaGastoPorItem = valorTotalCompras / quantidadeItensComprados;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário Mensal Bruto: " + salarioMensalBruto);
        System.out.println("Meses Trabalhados: " + mesesTrabalhados);
        System.out.println("Quantidade de Itens Comprados: " + quantidadeItensComprados);
        System.out.println("Valor Total das Compras: " + valorTotalCompras);
        System.out.println("Salário Anual Bruto: " + salarioAnualBruto);
        System.out.println("Salário Anual Líquido (com desconto de R$ 2.000,00): " + salarioAnualLiquido);
        System.out.println("Média de Gasto por Item: " + mediaGastoPorItem);
    }
}