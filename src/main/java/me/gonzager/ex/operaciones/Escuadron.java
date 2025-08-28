package me.gonzager.ex.operaciones;

import java.util.List;

public class Escuadron {
    List<Dron> drones;
    Integer cantidadMaximaDrones = 10;

    public Escuadron(List<Dron> drones) {
        this.drones = drones;
    }

    public void agregarDron(Dron dron){
        if (drones.size()>=10) {
            throw new SuperaCantidadExc("Supera la cantidad máxima definida por la ciudad");
        }
        this.drones.add(dron);
    }

    public boolean tieneDronAvanzado(){
        for(Dron dron : drones){
            if(dron.esAvanzado()){
                return true;
            }
        };
        return false;
    }

    public Integer capacidadOperativaSuficiente(){
        int aux = 0;
        for(Dron dron : drones){
            aux =+ dron.eficienciaOperativa();
        }
        return aux;
    }

    public boolean puedeOperarSobre(Zona zona) {
        boolean tieneDronAvanzado = this.tieneDronAvanzado();
        boolean capacidadSuficiente = this.capacidadOperativaSuficiente() > (zona.getTamaño() * 2);
        
        return tieneDronAvanzado && capacidadSuficiente;
    }

    public List<Dron> getDrones() {
        return drones;
    }


}
