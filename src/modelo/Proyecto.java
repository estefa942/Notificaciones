/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estef
 */
public class Proyecto {
    String nombre;
    String areaEstudio;
    String problema;
    float porcentajeTiempoFinalizacion;
    int presupuesto; 
    int recursosGastados;

    public Proyecto() {
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAreaEstudio() {
        return areaEstudio;
    }

    public void setAreaEstudio(String areaEstudio) {
        this.areaEstudio = areaEstudio;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public float getPorcentajeTiempoFinalizacion() {
        return porcentajeTiempoFinalizacion;
    }

    public void setPorcentajeTiempoFinalizacion(float porcentajeTiempoFinalizacion) {
        this.porcentajeTiempoFinalizacion = porcentajeTiempoFinalizacion;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getRecursosGastados() {
        return recursosGastados;
    }

    public void setRecursosGastados(int recursosGastados) {
        this.recursosGastados = recursosGastados;
    }
    
    
    
}
