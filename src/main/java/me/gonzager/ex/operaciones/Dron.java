package me.gonzager.ex.operaciones;

public abstract class Dron {
    Integer autonomia;
    Integer procesamiento;
    Mision mision;

    public Dron(Integer autonomia, Integer procesamiento, Mision mision) {
        this.autonomia = autonomia;
        this.procesamiento = procesamiento;
        this.mision = mision;
    }

    public int eficienciaOperativa(){
        return (autonomia * 10) + mision.extra(this);
    }


    public boolean esAvanzado(){
        return false;
    }

    public abstract boolean avanzadoPorTipo();

    public Integer getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(Integer autonomia) {
        this.autonomia = autonomia;
    }

    public Integer getProcesamiento() {
        return procesamiento;
    }

    public Mision getMision() {
        return mision;
    }
}
