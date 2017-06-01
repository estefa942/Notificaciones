/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Notificacion;
import modelo.NotificacionPresupuestal;
import modelo.NotificacionTiempo;
import modelo.Proyecto;

/**
 *
 * @author estef
 */
public class ControladorSistema {

    static ControladorProyectos cp = new ControladorProyectos();

    public void obtenerMensaje(Notificacion n) {
        n.mensaje();
    }

    /**
     * este método permite consultar la lista que se tiene de proyectos de
     * investigación y filtarlos según el tipo de notificación que se le entre
     * por parámetro.
     *
     * @param n
     * @return
     */
    static ArrayList<Proyecto> proyectos = cp.getProyectosInvestigacion();
    public static void consultarProyectos(Notificacion n) {
        ArrayList<Proyecto> proyectosSeleccionados = new ArrayList<>();
        Proyecto proyecto;

        if (n instanceof NotificacionPresupuestal) {
            for (int i = 0; i < proyectos.size(); i++) {
                proyecto= proyectos.get(i);
                if (proyecto.getPresupuesto() <= 5000000 && !proyectosSeleccionados.contains(proyecto)) {
                    proyectosSeleccionados.add(proyecto);
                }
            }
        } else if (n instanceof NotificacionTiempo) {
            for (int i = 0; i < proyectos.size(); i++) {
                proyecto= proyectos.get(i);
                if (proyecto.getPorcentajeTiempoFinalizacion() >= 80 && !proyectosSeleccionados.contains(proyecto)) {
                    proyectosSeleccionados.add(proyecto);
                }
            }
        } else {
            for (int i = 0; i < proyectos.size(); i++) {
                 proyecto= proyectos.get(i);
                if (proyecto.getRecursosGastados() >= 40 && !proyectosSeleccionados.contains(proyecto)) {
                    proyectosSeleccionados.add(proyecto);
                }
            }
        }

        notificarProyectos(proyectosSeleccionados, n);
    }
/**
 * Muestra los proyectos que van a hacer notificados y les envía su correspondiente notificación
 * @param proyectos
 * @param n 
 */
    public static void notificarProyectos(ArrayList<Proyecto> proyectos, Notificacion n) {
        if(proyectos.size() != 0){
        System.out.println("A los siguientes proyectos:");
        for (int i = 0; i < proyectos.size(); i++) {
            System.out.println(proyectos.get(i).getNombre());
        }
        obtenerNotificacion(n);
        }
        
    }
   /**
    * Obtiene la estrategia de la notificación que se va enviar () SMS,correo SMTP, web Server) en base 
    * del tipo de noticación que se ingresa por parámetro;
    * @param n 
    */
    public static void obtenerNotificacion(Notificacion n){
       NotificationStrategy  notificacionStrategy = null;
        if (n instanceof NotificacionPresupuestal) {
                notificacionStrategy = new NotificacionSMS();
        }
        else if(n instanceof NotificacionTiempo){
            notificacionStrategy = new NotificacionCorreoSMTP();
        }
        else{
            notificacionStrategy = new NotificacionWebServer();
        }
        notificacionStrategy.enviarNotificacion();
}
}
