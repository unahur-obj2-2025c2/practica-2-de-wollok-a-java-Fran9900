package me.gonzager.ex.operaciones;

import java.util.List;

public class MisionVigilancia implements Mision{
    private List<Sensor> sensores;

    public MisionVigilancia(List<Sensor> sensores) {
        this.sensores = sensores;
    }

    @Override
    public Integer extra(Dron dron){
        Integer extraDato = 0;
        for (Sensor sensor : sensores){
            extraDato =+ sensor.eficiencia();
        }
        return extraDato;
    };

    @Override
    public boolean avanzadoPorMision(Dron dron){
        for (Sensor sensor: sensores){
            if(!sensor.duradero()){
                return false;
            }
        }
        return true;
    }
}
