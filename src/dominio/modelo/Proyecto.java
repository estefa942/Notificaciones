
package dominio.modelo;

/**
 *
 * @author Estefany Muriel
 */
public class Proyecto {
    private String nombre;
    private String areaEstudio;
    private String problema;
    private float porcentajeTiempoFinalizacion;
    private int presupuesto; 
    private int recursosGastados;

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
