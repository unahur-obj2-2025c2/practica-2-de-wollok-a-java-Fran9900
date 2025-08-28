package me.gonzager.ex.operaciones;

public class Sensor {
    Integer capasidad;
    Integer durabilidad;
    boolean mejorar;

    public Sensor(Integer capasidad, Integer durabilidad, boolean mejorar) {
        this.capasidad = capasidad;
        this.durabilidad = durabilidad;
        this.mejorar = mejorar;
    }

    public boolean duradero(){
        return this.durabilidad > this.capasidad *2;
    }

    public Integer eficiencia(){
        if(mejorar){
            return this.capasidad*2;
        }else{
            return this.capasidad;
        }
    }
}
