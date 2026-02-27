package ClasseObjeto;

public class Carro {

    // vars or props or actributs
    public String marca, modelo; // String is type class
    public float velocidade; // float is type primitive
    public boolean motor; // boolean is type primitive

    // constructor
    public Carro(String marca, String modelo, float velocidade, boolean motor){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    //functions = methods now
    public String toString() { // this represents the object who calls the method
        return " Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Velocidade: " + this.velocidade +
                " Motor: " +  this.motor;
    }

    public void ligarMotor(){

        if(!this.motor) {
            this.motor = true;
            System.out.println("Motor ligado!");
        }
    }

    public void desligarMotor(){

        if(this.motor) {
            this.motor = false;
            this.velocidade = 0;
            System.out.println("Motor desligado!");
        }
    }

    public void acelerar(float x){
        if(this.motor){
            this.velocidade += x;
            System.out.println("a velocidade agora é de " + this.velocidade + "km/h");
        }
    }

    public void desacelerar(float y){
        if(this.motor && this.velocidade >= y){
            this.velocidade -= y;
            System.out.println("a velocidade agora é de " + this.velocidade + "km/h");
        }
    }
}