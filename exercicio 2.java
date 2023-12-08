// Classe Pessoa (base)
class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Getters e Setters
    // ...

    @Override
    public String toString() {
        return "Pessoa: [Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo + "]";
    }
}

// Outras classes conforme especificado

// Classe de teste
public class TestePessoas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Masculino");
        // Crie instâncias de outras classes e teste aqui
        System.out.println(pessoa);
    }
}
