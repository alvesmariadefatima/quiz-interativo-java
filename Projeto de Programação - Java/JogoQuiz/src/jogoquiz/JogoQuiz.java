package jogoquiz;

import java.util.Scanner;

public class JogoQuiz {

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
        int valido = 0;
        while(valido != 1){
        System.out.println("Olá, " + nomeUsuario + "! Para dar inicio ao jogo, clique na opção correspondente a seguir: ");
        System.out.println("1 - Iniciar Quiz");
        System.out.println("2 - Sair");
        System.out.println("Digite a opção: ");
        String opcaoEscolha = teclado.nextLine();

        switch(opcaoEscolha){
            case "1":
            int pontuacao = 0;

            System.out.println("1-) Quais são o menor e maior país do mundo?");
            System.out.println("a) Vaticano e Rússia");
            System.out.println("b) Brasil e EUA");
            System.out.println("c) Argentina e China");
            System.out.println("d) Mônaco e Canadá");
            System.out.println("e) Nauru e China");

            if(teclado.nextLine().equals("a"))
            {
                pontuacao++;
            }

            System.out.println("2-) Qual o livro mais vendido no mundo depois da bíblia?");
            System.out.println("a) Dom Quixote");
            System.out.println("b) O Pequeno Príncipe");
            System.out.println("c) Senhor dos Anéis");
            System.out.println("d) Harry Potter");
            System.out.println("e) Crepúsculo");

            if(teclado.nextLine().equals("a"))
            {
                pontuacao++;
            }

                System.out.println("3-) Qual a ciência que estuda a atmosfera da Terra e a climatologia?");
                System.out.println("a) Astronomia");
                System.out.println("b) Meteorologia");
                System.out.println("c) Dispersão atmosférica");
                System.out.println("a) Ciências Exatas");



            if(teclado.nextLine().equals("b"))
            {
                pontuacao++;
            }
    
            System.out.println("4-) Nesses pares, ambos são mamíferos:");
            System.out.println("a) Baleia azul e golfinhos");
            System.out.println("b) Morcegos e galinhas");
            System.out.println("c) Girafas e tartarugas");
            System.out.println("d) Porcos e pinguins");
            System.out.println("e) Macacos e sapos");

            if(teclado.nextLine().equals("a"))
            {
                pontuacao++;
            }
            System.out.println("5-) Quantos estados tem no Brasil?");
            System.out.println("a) 22");
            System.out.println("b) 23");
            System.out.println("c) 24");
            System.out.println("d) 26");
            System.out.println("e) 28");

            
    
            if(teclado.nextLine().equals("d"))
            {
                pontuacao++;
            }

            System.out.println("6-) Em que ano o Brasil ganhou a primeira copa?");
            System.out.println("a) 2002");
            System.out.println("b) 1970");
            System.out.println("c) 1958");
            System.out.println("d) 1994");

            if(teclado.nextLine().equals("c")){
                pontuacao++;
            }

            System.out.println("7-) Como foi a primeira frase de Niel Armstrong ao pisar na lua?");
            System.out.println("a) 'É um grande passo para o homem, mas um salto pequeno para a humanidade.'");
            System.out.println("b) 'Esse é um pequeno passo para o homem, mas um gigantesco salto para a humanidade.'");
            System.out.println("c) 'O Brasil vai ser Hexa!'");
            System.out.println("d) 'A professora Yana é a melhor da Unit e vai passar todo mundo.'");

            if(teclado.nextLine().equals("d")){
               pontuacao++; 
            }

            System.out.println("8-) Qual o número da camisa do Neymar na seleção?");
            System.out.println("a) 11");
            System.out.println("b) 10");
            System.out.println("c) 7");
            System.out.println("d) 9");

            if(teclado.nextLine().equals("b")){
               pontuacao++; 
            }

            System.out.println("9-) Qual o nome do presidente do Brasil que ficou conhecido como Jango?");
            System.out.println("a) Jânio Quadros");
            System.out.println("b) Jacinto Anjos");
            System.out.println("c) Getúlio Vargas");
            System.out.println("d) João Figueiredo");
            System.out.println("e) João Gourlart");

            if(teclado.nextLine().equals("e")){
                pontuacao++;
            }

            System.out.println("10-) Quem é o artista que recebeu o título de Rei do Rock?");
            System.out.println("a) Elvis Presley");
            System.out.println("b) Michael Jackson");
            System.out.println("c) Axl Rose");
            System.out.println("d) Slash");
            System.out.println("e) John Lennon");

            if(teclado.nextLine().equals(("a"))){
                pontuacao++;
            }

            System.out.println("Sua Pontuação: " + pontuacao + " pontos.");
            valido = 1;
            break;

            case "2":
                System.out.println("Jogo encerrado.");
                valido = 1;
            break;
            default:
                System.out.println("Opção inválida. Por favor, reinicie o jogo novamente.");
            break;
            }
        }
    }     
}
