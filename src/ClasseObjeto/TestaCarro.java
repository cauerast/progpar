package ClasseObjeto;

public class TestaCarro {
    public static void main(String[] args){

        // play -> jdk = compilador
        // jdk compila um .class em bytecode e a JVM interpreta

        Carro obj1 = new Carro();
        obj1.marca = "fiat";
        obj1.modelo = "Uno";
        obj1.velocidade = 0;
        obj1.motor = false;
        System.out.println(obj1);

        Carro obj2 = new Carro();
        obj2.marca = "gm";
        obj2.modelo = "Onix";
        obj2.velocidade = 0;
        obj2.motor = false;
        System.out.println(obj2.toString());

    }
}