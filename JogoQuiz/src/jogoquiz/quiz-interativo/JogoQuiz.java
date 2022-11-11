package jogoquiz;

import java.util.Scanner;

public class JogoQuiz {
        String dadosEmailUsuario;
        String dadosSenhaUsuario;
        String nomeJogador;
        String iniciarJogo;
        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Ao terminar de preencher os dados, seu jogo iniciará automaticamente...");
        System.out.println("Digite seu nome completo: ");
        String nomeJogador = scan.nextLine();
        System.out.println("Digite seu e-mail: ");
        String dadosEmailUsuario = scan.nextLine();
        System.out.println("Digite sua senha: ");
        String dadosSenhaUsuario = scan.nextLine();
        System.out.println("Olá, " + nomeJogador + "! Para dar início ao jogo, digite 'Ok' e pressione 'Enter'.");
        String iniciarJogo = scan.nextLine();
        
        String questao1 = "Quantos estados tem o Brasil?\n" + "(a) 22\n(b)24\n(c)26\n(d)29\n";
        
        String questao2 = "Qual a capital de Alagoas?\n(a)São Miguel dos Campos\n(b) Maceió\n(c)Arapiraca\n(d)Delmiro Gouveia";
        
        Perguntas [] perguntas = {
        new Perguntas(questao1, "c"),
        new Perguntas(questao2, "b"),
         
        };
        testarResposta(perguntas);
   }
        public static void testarResposta(Perguntas [] perguntas){
            int pontuacao = 0;
            Scanner entrada = new Scanner(System.in);
            
            for(int i = 0; i < perguntas.length; i++){
                System.out.println(perguntas[i].prompt);
                String resposta = entrada.nextLine();
                if(resposta.equals(perguntas[i].resposta)){
                    pontuacao++;
                }
            }
            System.out.println("Sua pontuação final: " + pontuacao + "/" + perguntas.length);
        }
} 
