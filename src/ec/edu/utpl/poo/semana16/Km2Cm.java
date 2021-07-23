package ec.edu.utpl.poo.semana16;
import java.util.List;

public class Km2Cm implements Longitudable{
    public double conversion(double x){
        return x * (100000);
    }

    public boolean esValorValido(double valor){
        return valor > 0;
    }

    public boolean esUnidadValida(List<String> unidades, String unidad){
        if(unidades.contains(unidad.toLowerCase()) && unidad.equals("cm")){
            return true;
        }else{
            return false;
        }
    }
}
