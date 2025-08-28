package me.gonzager.ex.operaciones;

public class MisionExploracion  implements Mision{

    @Override
    public Integer extra(Dron dron) {
        return 0;
    }

    @Override
    public boolean avanzadoPorMision(Dron dron) {
        return dron.eficienciaOperativa() % 2 == 0;
    }
    
}
