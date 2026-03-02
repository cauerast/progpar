package exs.ex2;

public class Streaming {
    String usuario;
    String plano;
    float mensalidade;
    boolean ativo;
    String ultimoFilmeAssistido;

    Streaming(String usuario, String plano){
        this.usuario = usuario;
        this.plano = plano;
        switch (plano) {
            case "Básico" -> this.mensalidade = 25.90f;
            case "Premium" -> this.mensalidade = 45.90f;
            case "Família" -> this.mensalidade = 60.90f;
            default -> this.mensalidade = 0f;
        }
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme){
        if(this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistido: " + nomeFilme);
        } else {
            System.out.println("Pague sua fatura!");
        }
    }

    public void cancelarAssinatura(){
        this.ativo = false;
        System.out.println("Assinatura cancelada!");
    }

    public String toString(){
        String status;
        if(this.ativo){
            status = "Ativo";
        } else {
            status = "Suspenso";
        }
        return "Usuario: " + this.usuario +
                "\nPlano: " + this.plano +
                "\nMensalidade: " + this.mensalidade +
                "\nStatus: " + status +
                "\nUltimo Filme Assistido: " + this.ultimoFilmeAssistido + "\n";
    }
}
