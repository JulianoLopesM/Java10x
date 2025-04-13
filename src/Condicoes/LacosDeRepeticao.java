package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
            /*
            Os laços de repetição vão repetir infinitamente ou vão se repitir até o limite que impus
            While e For
            */

            //While
            //While (condicao) {vai acontecer tudo aqui}

            int numeroDeClones = 0;
            int numeroMaximoDeClones = 40;
           /* while(numeroDeClones <= numeroMaximoDeClones) {

                System.out.println("O naruto fez " + numeroDeClones + " clones das sombras");
                numeroDeClones++;
            } */

       /* for ( numeroDeClones = 0; numeroDeClones < numeroMaximoDeClones ; numeroDeClones++) {
            System.out.println("O naruto fez " + numeroDeClones + " clones das sombras");
        } */

        int idade = 12;

        if (idade < 18) {
            for (int i = idade; i < 18; i++) {
                if (i == idade) {
                    int anosFaltando = 18 - i;
                    System.out.println("Faltando " + anosFaltando + " anos para completar 18");
                }
            }
        }else {
            System.out.println("Parabéns, é maior de idade");
        }



    }
}
