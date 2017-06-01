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
  
    
    static ArrayList<Proyecto> proyectosInvestigacion = new ArrayList<>();
    
    public ControladorProyectos(){
    Proyecto proyecto = new Proyecto();
    proyecto.setNombre("Grafos");
    proyecto.setAreaEstudio("Ciencias de la computación");
    proyecto.setProblema("Pintar todos los vertices de un grafo con sólo 3 colores");
    proyecto.setPorcentajeTiempoFinalizacion(80);
    proyecto.setPresupuesto(10000000);
    proyecto.setRecursosGastados(35);
    proyectosInvestigacion.add(proyecto);
    proyecto = new Proyecto();
    proyecto.setNombre("Conjetura Collatz");
    proyecto.setAreaEstudio("Matemáticas");
    proyecto.setProblema("Encontrar un patron en la generación del árbol de secuencias");
    proyecto.setPorcentajeTiempoFinalizacion(40);
    proyecto.setPresupuesto(4000000);
    proyecto.setRecursosGastados(10);
    proyectosInvestigacion.add(proyecto);
    proyecto = new Proyecto();
    proyecto.setNombre("Buscaminas");
    proyecto.setAreaEstudio("Ciencias de la computación");
    proyecto.setProblema("Encontrar un algoritmo que resuelva el buscaminas con un margen de error mínimo");
    proyecto.setPorcentajeTiempoFinalizacion(30);
    proyecto.setPresupuesto(8000000);
    proyecto.setRecursosGastados(15);
    proyectosInvestigacion.add(proyecto);
    proyecto = new Proyecto();
    proyecto.setNombre("Fractales");
    proyecto.setAreaEstudio("Matemáticas");
    proyecto.setProblema("Encontrar la dimensión de determinados fractales");
    proyecto.setPorcentajeTiempoFinalizacion(90);
    proyecto.setPresupuesto(15000000);
    proyecto.setRecursosGastados(45);
    proyectosInvestigacion.add(proyecto);
       
}

    public ArrayList<Proyecto> getProyectosInvestigacion() {
        return proyectosInvestigacion;
    }
   
}
