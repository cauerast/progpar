package Lecture2;

public class SmartTv {
    private String marca, modelo;
    private int volume;

    public SmartTv(){}
    public SmartTv(String marca, String modelo, int volume){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume); //
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }


    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }


    public void setVolume(int volume){
        if(volume >= 0 && volume <= 100) {
            this.volume = volume;
        } else {
            System.out.println("Volume invalido");
        }
    }
    public int getVolume(){ // method aways the same type as your return
        return this.volume;
    }
}
