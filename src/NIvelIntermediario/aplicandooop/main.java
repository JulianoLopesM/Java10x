package NIvelIntermediario.aplicandooop;

public class main {
    public static void main(String[] args) {

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Uchiha", 21);
        itachi.apresentacao();
        itachi.ativarSharingan();
        itachi.habilidadeEspecial();
        System.out.println("------------------");
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.cla = "Uchiha";
        sasuke.apresentacao();
        sasuke.ativarSharingan();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaEspecialNinja();
        System.out.println("------------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Uzumaki", 16);
        naruto.apresentacao();
        naruto.habilidadeEspecial();
        naruto.estrategiaEspecialNinja();

        System.out.println("------------------");

        Hatake kakashi  = new Hatake("Kakashi Hatake", "Hatake", 31);
        kakashi.apresentacao();
        kakashi.ativarSharingan();
        kakashi.habilidadeEspecial();
        kakashi.estrategiaEspecialNinja();
        kakashi.fizParteDaAmbu();
    }
}
