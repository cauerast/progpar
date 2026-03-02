package exs.ex3;

public class testaPlacar {
    public static void main(String[] args){
        Placar placar = new Placar("timeA", "timeB");

        placar.registrarPontos("casa", 3);
        placar.registrarPontos("visitante", 2);
        placar.registrarPontos("casa", 3);

        placar.proximoQuarto();
        placar.proximoQuarto();
        System.out.println(placar.toString());
    }
}
