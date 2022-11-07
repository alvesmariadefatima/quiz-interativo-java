package jogoquiz;

import java.util.Scanner;

public class JogoQuiz {

    public static void main(String[] args) {
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
