/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviciosTecnicos.mensajes;

/**
 *
 * @author estef
 */
public interface MensajeStrategy {
    /**
     * Este es el método con el que utilizaremos el patrón Strategy, este escogerá el medio a utilizar 
     * para enviar el mensaje de la notificación
     */
    public void enviarNotificacion();
}
