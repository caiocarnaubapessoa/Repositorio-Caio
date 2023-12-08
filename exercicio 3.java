class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor, getters e setters
    // ...

    // ToString() para Pessoa
    @Override
    public String toString() {
        return "Pessoa: [Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone + "]";
    }
}

class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtor, getters e setters
    // ...

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
}

// Classe de teste
public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        // Configurar atributos e testar métodos
        System.out.println(fornecedor);
        System.out.println("Saldo: " + fornecedor.obterSaldo());
    }
}
