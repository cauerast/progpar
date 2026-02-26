package ClasseObjeto;

public class TestaCarroContructor {
    public static void main(String[] args){

        // play -> jdk = compilador
        // jdk compila um .class em bytecode e a JVM interpreta

        Carro obj1 = new Carro("Fiat", "Uno", 0, false);

        obj1.ligarMotor();

        obj1.acelerar(100);

        obj1.desacelerar(60);

        obj1.desligarMotor();


        Carro obj2 = new Carro("Gm", "Onix", 0, false);

        obj2.ligarMotor();

        obj2.acelerar(80);

        obj2.desacelerar(60);
        obj2.desacelerar(30);

        obj2.desligarMotor();
    }
}