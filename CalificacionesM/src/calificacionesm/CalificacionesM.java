/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesm;

import java.util.List;
import java.util.*;

/**
 *
 * @author Alejandro Lopez Garcia 
 */
public class CalificacionesM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Listas llamando 
        List<String> ListaAlumnos=new ArrayList<String>();
        List<String> ListaCali= new ArrayList<String>();
        List<String> ListaMateria=new ArrayList<String>();
        // Creando mi metodo 
        calificacionesMM fb= new calificacionesMM();
        // llamando alos metodos de la otra clase 
        fb.CapturaAlumnos(ListaAlumnos);
        fb.CapturaMateria(ListaMateria);
        fb.CapturaDeCalificaciones(ListaCali);
        fb.ImprimirLasMaterias(ListaMateria);
        fb.ImprimirLosAlumnos(ListaAlumnos);
        fb.ImprimirLasCali(ListaCali);
        
        
    }
    
}
