package me.gonzager.ex.operaciones;

public class Zona {
    Integer tamaño;
    Integer cantidadOperacionesRealizadas;

    public Zona(Integer tamaño, Integer cantidadOperacionesRealizadas) {
        this.tamaño = tamaño;
        this.cantidadOperacionesRealizadas = cantidadOperacionesRealizadas;
    }
    public Integer getTamaño() {
        return tamaño;
    }
    public Integer getCantidadOperacionesRealizadas() {
        return cantidadOperacionesRealizadas;
    }

    public void operarZona(Escuadron escuadron){
        if (!escuadron.puedeOperarSobre(this)) {
            throw new SuperaCantidadExc("El escuadron no es operable en esta zona");
        }else{
            cantidadOperacionesRealizadas =+ 1;
            for (Dron dron : escuadron.getDrones()) {
                dron.setAutonomia(dron.getAutonomia() - 2);
        }
    }
}
}
