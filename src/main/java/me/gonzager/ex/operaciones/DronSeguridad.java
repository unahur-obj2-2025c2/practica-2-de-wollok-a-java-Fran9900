package me.gonzager.ex.operaciones;

public class DronSeguridad extends Dron{

    public DronSeguridad(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);    
    }

    @Override
    public boolean avanzadoPorTipo() {
        return procesamiento > 50;
    }
    
}
