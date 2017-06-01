/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialanalisis;

import controlador.ControladorSistema;
import modelo.NotificacionPresupuestal;
import modelo.NotificacionRecursos;
import modelo.NotificacionTiempo;

/**
 *
 * @author estef
 */
public class ParcialAnalisis {
    static ControladorSistema cs = new ControladorSistema();
    static NotificacionPresupuestal np = new NotificacionPresupuestal();
    static NotificacionRecursos nr = new NotificacionRecursos();
    static NotificacionTiempo nt = new NotificacionTiempo();
    public static void llamarSistema(){
        cs.consultarProyectos(np);
        cs.consultarProyectos(nr);
        cs.consultarProyectos(nt);
    }
    public static void main(String[] args) {
        llamarSistema();
    }
    
}
