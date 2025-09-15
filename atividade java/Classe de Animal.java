class Animal {
    String nome;
    String raca; 

    public Animal(String nome, String raca) { 
        this.nome = nome;
        this.raca = raca;
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void comer() {
        System.out.println(nome + " está comendo");
    }

    public void andar() {
        System.out.println(nome + " está andando.");
    }
}

class gato extends Animal {
    public gato(String nome, String raca) {
        super(nome, raca); 

    public void miar() {
        System.out.println(nome + " está miando: miau.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Dorito", "Shiba");
        Passaro meuPassaro = new Passaro("Lombriga", "Laranja");

        System.out.println("Nome do cachorro: " + meuCachorro.nome + " | Raça: " + meuCachorro.raca);
        meuCachorro.correr();
        meuCachorro.comer();
        meuCachorro.andar();

        System.out.println("\nNome do gato: " + meuGato.nome + " | Raça: " + meuGato.raca);
        meuPassaro.comer();
        meuPassaro.miar();
        meuPassaro.dormir();
    }
}