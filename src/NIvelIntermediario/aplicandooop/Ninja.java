package NIvelIntermediario.aplicandooop;

public abstract class Ninja implements estrategiaNinja {
    String nome;
    String cla;
    int idade;

    public Ninja() {

    }

    public Ninja(String nome, String cla, int idade) {
        this.nome = nome;
        this.cla = cla;
        this.idade = idade;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e minha habilidade é: ");
    }

    public void apresentacao(){
        System.out.println("Olá! Meu nome é " + nome + ", tenho " + idade +  " anos " + "e pertenço ao cla " + cla);
    }
    @Override
    public  void estrategiaEspecialNinja(){
        System.out.println("Estratégia padrão");
    }


}
