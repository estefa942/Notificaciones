/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
 
import java.util.ArrayList;
import modelo.Proyecto;

/**
 *
 * @author estef
 */
public class ControladorProyectos {
    String nombre;
    String areaEstudio;
    String problema;
    double porcentajeFinalizacion;
    int presupuesto; 
    int recursosUtilizados;
    Proyecto proyecto;
    
    public ArrayList<Proyecto> crearProyectos(){
        ArrayList<Proyecto> proyectosInvestigacion = new ArrayList<>();
            nombre= "grafos";
            areaEstudio = "Ciencias de la computación";
            problema = "Pintar todos los vertices de un grafo con sólo 3 colores";
            porcentajeFinalizacion = 60;
            presupuesto = 10000000;
            recursosUtilizados = 35;  
            proyecto = new Proyecto(nombre, areaEstudio, problema, recursosUtilizados, presupuesto, recursosUtilizados);
            proyectosInvestigacion.add(proyecto);
            nombre= "Conjetura Collatz";
            areaEstudio = "Matemáticas";
            problema = "Encontrar un patron en la generación del árbol de secuencias";
            porcentajeFinalizacion = 40;
            presupuesto = 5000000;
            recursosUtilizados = 10;  
            proyecto = new Proyecto(nombre, areaEstudio, problema, recursosUtilizados, presupuesto, recursosUtilizados);
             proyectosInvestigacion.add(proyecto);
            nombre= "Buscaminas";
            areaEstudio = "Ciencias de la computación";
            problema = "Encontrar un algoritmo que resuelva el buscaminas con un margen de erro mínimo";
            porcentajeFinalizacion = 30;
            presupuesto = 8000000;
            recursosUtilizados = 15;  
            proyecto = new Proyecto(nombre, areaEstudio, problema, recursosUtilizados, presupuesto, recursosUtilizados);
            proyectosInvestigacion.add(proyecto);
            nombre= "Fractales";
            areaEstudio = "Matemáticas";
            problema = "Encontrar la dimensión de determinados fractales";
            porcentajeFinalizacion = 90;
            presupuesto = 15000000;
            recursosUtilizados = 45;  
            proyecto = new Proyecto(nombre, areaEstudio, problema, recursosUtilizados, presupuesto, recursosUtilizados);
            proyectosInvestigacion.add(proyecto);
            return proyectosInvestigacion;
            
    }
}
