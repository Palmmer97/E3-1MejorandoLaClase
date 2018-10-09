/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesm;

import java.util.List;


/**
 *
 * @author Alejandro Lopez Garcia 
 */
import java.util.Scanner;
public class calificacionesMM {
    //Declaracion de algunas variables y escanner 
      Scanner sc = new Scanner(System.in);
      int Num,Alum,Cali;
      String Materia,Alumno,Califica;
      
    //Metodo de captura de materia 
    public void CapturaMateria(List<String>ListaMateria)
    {
        // pedir al usuario lo indicado 
        System.out.println("Introducir el numero de materias: ");
        //Guardar lo ingresado en la variable 
        Num=sc.nextInt();
        // Hacer que se repida las veces requeridas
        for (int cont=0; cont<Num;cont++)
        {
            System.out.println("Ingrese materia: "+ cont+1);
            Materia= sc.next();
            // Enviar a la lista 
            ListaMateria.add(Materia);
        }    
    }
    //Medoto de caputra de alumnos 
    public void CapturaAlumnos(List<String> ListaAlumnos)
    {
        // Pedir al usuario lo requerid 
        System.out.println("Introduccir el numero de alumnos: ");
        // Guardar lo ingresado en la variable 
        Alum=sc.nextInt();
        // HAcer que se repita las veces requeridas 
        for ( int cont=0;cont<Alum;cont++)
        {
            System.out.println("Ingrese Nombre alumno: "+ cont+1);
            Alumno=sc.next();
            ListaAlumnos.add(Alumno);
        }
    }
    // Imprimir lo ingresado en materias 
    public void ImprimirLasMaterias(List<String> ListaDeMaterias)
    {
        
        System.out.println("Alumno-          -");
        for (String Materia: ListaDeMaterias)
        {
            System.out.println(Materia+"-                -");
        }
        
    }
    // Impirmir lo ingresado en alumnos 
    public void ImprimirLosAlumnos(List<String> ListaDeAlumnos)
    {
        
        for (String Alum: ListaDeAlumnos)
        {
          System.out.println(Alum);
        }
    }
    // Metodo caputura de calificaicones 
    public void CapturaDeCalificaciones(List<String> ListaCali)
    {
        System.out.println("Introduccir la calificacion: ");
        Cali=sc.nextInt();
        for(int cont=0; cont<Cali;cont++)
        {
           System.out.println("Ingrese Calificacion de Alumno: "+ cont+1); 
           Califica=sc.next();
           ListaCali.add(Califica);
        }
    }
    // Imprimir lo de qcalificaciones 
     public void ImprimirLasCali(List<String> ListaDeCali)
    {
        
        for (String Cali: ListaDeCali)
        {
          System.out.println(Cali);
        }
    }
    
}
