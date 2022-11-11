package jogoquiz;

public class Perguntas {
    String prompt;
    String resposta;
    String dadosEmailUsuario;
    String dadosSenhaUsuario;
    
    public Perguntas(String prompt, String resposta, String dadosEmailUsuario, String dadosSenhaUsuario){
        this.prompt = prompt;
        this.resposta = resposta;
        this.dadosEmailUsuario = dadosEmailUsuario;
        this.dadosSenhaUsuario = dadosSenhaUsuario;
    }
}
