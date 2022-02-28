/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Marcel
 */
public class NodoUsuario {
    private Object ID;
    private Object usuario;
    private NodoUsuario pNext;
    
    public NodoUsuario(Object ID, Object usuario){
        this.ID = ID; //lo que voy a guardar
        this.usuario = usuario; //lo que voy a guardar
        this.pNext = null; // por ahora apunta al vacio
        
       
    }
    public NodoUsuario(Object ID, Object usuario, NodoUsuario nodito){ //lo que quiero guardar y se donde guardarlo
        this.ID = ID;
        this.usuario = usuario;
        this.pNext = nodito; //apunta a otra caja
    }

    public Object getID() {
        return ID;
    }

    public void setID(Object ID) {
        this.ID = ID;
    }

    public Object getUsuario() {
        return usuario;
    }

    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getpNext() {
        return pNext;
    }

    public void setpNext(NodoUsuario pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
}
