package me.gonzager.ex.operaciones;

public class MisionTransporte implements Mision{
    @Override
    public Integer extra(Dron dron){
        return 100;
    }

    public boolean avanzadoPorMision(Dron dron){
        return dron.getAutonomia() > 50;
    }
}
