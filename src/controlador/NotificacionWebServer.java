/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.NotificacionPresupuestal;
import modelo.NotificacionRecursos;

/**
 *
 * @author estef
 */
public class NotificacionWebServer implements NotificationStrategy{
    ControladorSistema cs = new ControladorSistema();

    @Override
    public void enviarNotificacion() {
        NotificacionRecursos nr = new NotificacionRecursos();
        System.out.println("Vía Web Server informamos que:");
        cs.obtenerMensaje(nr);//Obtiene el mensaje de la notificación pasada por parámetro
    }
    
}
