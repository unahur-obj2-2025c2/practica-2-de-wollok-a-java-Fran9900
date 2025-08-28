package me.gonzager.ex.operaciones;

public class DronComercial extends Dron  {

    public DronComercial(Integer autonomia, Integer procesamiento, Mision mision) {
        super(autonomia, procesamiento, mision);
    }

    @Override
    public boolean avanzadoPorTipo() {
        return false;
    }
    
    @Override
    public int eficienciaOperativa() {
        return super.eficienciaOperativa() + 15;
    }
    
}
