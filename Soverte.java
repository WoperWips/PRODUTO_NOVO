import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Soverte {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    // Construtor que recebe todos os atributos por parâmetro
    public Soverte(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // Construtor que recebe nome, preço de custo, preço de venda e data de fabricação
    // A data de validade será 1 mês após a data de fabricação
    public Soverte(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }

    // Construtor que recebe apenas o nome e o preço de custo
    // O preço de venda será 10% a mais sobre o preço de custo
    // A data de validade será 1 mês após a data de fabricação
    public Soverte(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10;
        this.dataFabricacao = LocalDate.now(); // Define a data de fabricação como a data atual
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }

    // Getters e Setters para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Sobrescrita do método toString para exibir as informações do produto
    @Override
    public String toString() {
        return String.format("Produto: %s | Preço de Custo: %.2f | Preço de Venda: %.2f | Data de Fabricação: %s | Data de Validade: %s",
                nome, precoCusto, precoVenda, dataFabricacao, dataValidade);
    }

    // Exemplo de uso com um único produto
    public static void main(String[] args) {
        // Criando um único produto "Sorvete de Chocolate"
        Soverte sorvete = new Soverte("Sorvete de Chocolate", 5.00, 8.00, LocalDate.of(2024, 9, 1));
        System.out.println(sorvete);
    }
}
