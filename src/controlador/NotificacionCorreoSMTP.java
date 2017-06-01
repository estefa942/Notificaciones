/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.NotificacionPresupuestal;
import modelo.NotificacionTiempo;

/**
 *
 * @author estef
 */
public class NotificacionCorreoSMTP implements NotificationStrategy{
    ControladorSistema cs = new ControladorSistema();
    @Override
    public void enviarNotificacion() {
        NotificacionTiempo nt = new NotificacionTiempo();
        System.out.println("Vía Correo SMTP informamos que:");
        cs.obtenerMensaje(nt);//Obtiene el mensaje de la notificación pasada por parámetro
    }
    
}
