package jogoquiz;

public class dadosUsuario {
    private String nomeUsuario;
    private String dadosEmailUsuario;
    private String dadosSenhaUsuario;
    private String opcaoEscolha;
    
        public dadosUsuario(String nomeUsuario, String dadosEmailUsuario, String dadosSenhaUsuario, String opcaoEscolha) {
            this.nomeUsuario = nomeUsuario;
            this.dadosEmailUsuario = dadosEmailUsuario;
            this.dadosSenhaUsuario = dadosSenhaUsuario;
            this.opcaoEscolha = opcaoEscolha;
         }
        public String getNomeUsuario() {
            return nomeUsuario;
        }
        public void setNomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
        }
        public String getDadosEmailUsuario() {
            return dadosEmailUsuario;
        }
        public void setDadosEmailUsuario(String dadosEmailUsuario) {
            this.dadosEmailUsuario = dadosEmailUsuario;
        }
        public String getDadosSenhaUsuario() {
            return dadosSenhaUsuario;
        }
        public void setDadosSenhaUsuario(String dadosSenhaUsuario) {
            this.dadosSenhaUsuario = dadosSenhaUsuario;
        }
        public String getOpcaoEscolha() {
            return opcaoEscolha;
        }
        public void setOpcaoEscolha(String opcaoEscolha) {
            this.opcaoEscolha = opcaoEscolha;
        }
    }

