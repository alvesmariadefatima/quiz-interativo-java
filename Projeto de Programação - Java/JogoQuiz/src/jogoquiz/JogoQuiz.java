package jogoquiz;

import java.util.Scanner;

public class JogoQuiz {
      String nomeUsuario;
      String dadosEmailUsuario;
      String dadosSenhaUsuario;
      String opcaoEscolha;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("QUIZ INTERATIVO - PERGUNTAS E RESPOSTAS SOBRE ATUALIDADES");
        System.out.println("=========================================================");
        System.out.println("Digite seu nome completo: ");
        String nomeUsuario = teclado.nextLine();

        System.out.println("Digite seu e-mail: ");
        String dadosEmailUsuario = teclado.nextLine();

        System.out.println("Digite sua senha: ");
        String dadosSenhaUsuario = teclado.nextLine();
        System.out.println("Olá, " + nomeUsuario + "! Para dar inicio ao jogo, clique na opção correspondente a seguir: ");
        System.out.println("1 - Iniciar Quiz");
        System.out.println("2 - Sair");
        System.out.println("Digite a opção: ");
        String opcaoEscolha = teclado.nextLine();

        switch(opcaoEscolha){
            case "1":
            int pontuacao = 0;

            System.out.println("Quantos estados tem o Brasil?");
            System.out.println("a)22 b)24 c)26 d) 28");
            
            if(teclado.nextLine().equals("c"))
            {
                pontuacao++;
            }
    
            System.out.println("Qual o ano em que foi descoberto o Brasil?");
            System.out.println("a)1490 b)1500 c)1560 d)1700");
    
            if(teclado.nextLine().equals("b"))
            {
                pontuacao++;
            }
            System.out.println("Qual a capital de Alagoas?");
            System.out.println("a)Aracaju b)Recife c)Maranhão d) Maceió");
    
            if(teclado.nextLine().equals("d"))
            {
                pontuacao++;
            }
            System.out.println("Sua pontuação é: " + pontuacao);
            break;

            case "2":
                System.out.println("Jogo encerrado.");
            default:
                System.out.println("Opção inválida. Tente novamente...");
            break;
        }
    }     
}