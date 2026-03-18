package exs.ex3;

public class Placar {
    String nomeTimeCasa;
    String nomeTimeVisitante;
    int pontosCasa;
    int pontosVisitante;
    int periodoQuarto;

    Placar(String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPontos(String time, int tipo){
        if(time.equalsIgnoreCase("casa")){
            this.pontosCasa += tipo;
        } else if(time.equalsIgnoreCase("visitante")){
            this.pontosVisitante += tipo;
            System.out.println("Time " + time + " pontuou " + tipo + " pontos");
        } else {
            System.out.println("error");
        }
    }

    public void proximoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto += 1;
            System.out.println("Periodo (quarto): " + this.periodoQuarto);
        } else{
            System.out.println("O jogo terminou!");
        }
    }

    public String toString(){
        return "Placar atual: " + this.nomeTimeCasa + " [" + this.pontosCasa + "] x [" + this.pontosVisitante + "] " + this.nomeTimeVisitante +
                "\nPeriodo (quarto): " + this.periodoQuarto;
    }
}


