/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosTecnicos.mensajes;

import dominio.controladores.ControladorSistema;
import serviciosTecnicos.notificaciones.Notificacion;
import serviciosTecnicos.notificaciones.NotificacionPresupuestal;

/**
 *
 * @author estef
 */
public class MensajeSMS implements MensajeStrategy{
ControladorSistema cs = new ControladorSistema();
    @Override
    public void enviarNotificacion() {
        NotificacionPresupuestal np = new NotificacionPresupuestal();
        System.out.println("Vía SMS informamos que:");
        cs.obtenerMensaje(np);//Obtiene el mensaje de la notificación pasada por parámetro
    }
   
    
}
