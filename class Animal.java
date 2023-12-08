class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    // Getters e Setters
    // ...

    @Override
    public String toString() {
        return "Animal: [Nome: " + nome + ", Peso: " + peso + "]";
    }
}

class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    // Getters e Setters
    // ...

    @Override
    public String toString() {
        return super.toString() + " - Peixe: [Tipo de Habitat: " + tipoHabitat + "]";
    }
}

class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    // Getters e Setters
    // ...

    @Override
    public String toString() {
        return super.toString() + " - Cachorro: [Raça: " + raca + "]";
    }
}

// Classe de teste
public class TesteAnimais {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Dourado", 0.5, "Água Doce");
        Cachorro cachorro = new Cachorro("Rex", 5.2, "Labrador");

        System.out.println(peixe);
        System.out.println(cachorro);
    }
}
