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
public class NotificacionRecursos implements Notificacion{

    @Override
    public void mensaje() {
           System.out.println("Los recursos se estan agotando\n");
    }
    
    
    
}
