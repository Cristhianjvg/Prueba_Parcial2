package ec.edu.utpl.poo.semana16.controller;

import ec.edu.utpl.poo.semana16.*;

import javax.swing.*;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        String valuetxt;
        double value;
        String inicial;
        String terminal;
        Cm2Km cm_km = new Cm2Km();
        Cm2M cm_M = new Cm2M();
        Km2Cm km_Cm = new Km2Cm();
        Km2M km_M = new Km2M();
        M2Cm m_cm = new M2Cm();
        M2Km m_km = new M2Km();
        List<Longitudable> longit = List.of(cm_km, cm_M, m_cm, m_km, km_Cm, km_M);

        valuetxt = JOptionPane.showInputDialog("Ingrese el valor");
        value = Double.parseDouble(valuetxt);
        inicial = JOptionPane.showInputDialog("Ingrese unidad inicial: ");
        terminal = JOptionPane.showInputDialog("Ingrese unidad final: ");
        for (var x : longit) {
            if(x.esUnidadValida((x , inicial) && (x, terminal)){
                value = x.conversion(value);
            }
        }

    }

}
