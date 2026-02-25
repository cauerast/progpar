package ClasseObjeto;

public class Carro{

    // vars or props or actributs
    public String marca, modelo; // String is type class
    public float velocidade; // float is type primitive
    public boolean motor; // boolean is type primitive

    //functions = methods now
    public String toString() { // this represents the object who calls the method
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " +  this.motor;
    }
}