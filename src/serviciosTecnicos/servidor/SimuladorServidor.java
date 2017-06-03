/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosTecnicos.servidor;

import dominio.controladores.ControladorSistema;
import dominio.controladores.ControladorSistema;
import serviciosTecnicos.notificaciones.NotificacionPresupuestal;
import serviciosTecnicos.notificaciones.NotificacionRecursos;
import serviciosTecnicos.notificaciones.NotificacionTiempo;

/**
 *
 * @author Estefany Muriel
 */
public class SimuladorServidor {

    static ControladorSistema cs = new ControladorSistema();
    static NotificacionPresupuestal np = new NotificacionPresupuestal();
    static NotificacionRecursos nr = new NotificacionRecursos();
    static NotificacionTiempo nt = new NotificacionTiempo();

    /**
     * Este método simulará el llamado que hace constantemente el servidor al
     * sistema para pasarle las notificaciones y que el sistema analice sus
     * proyectos
     */
    public static void llamarSistema() {
        cs.consultarProyectos(np);
        cs.consultarProyectos(nr);
        cs.consultarProyectos(nt);
    }

    public static void main(String[] args) {
        llamarSistema();
    }

}
