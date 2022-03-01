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
    private String ID;
    private String usuario;
    private NodoUsuario pNext;
    
    public NodoUsuario(String ID, String usuario){
        this.ID = ID; //lo que voy a guardar
        this.usuario = usuario; //lo que voy a guardar
        this.pNext = null; // por ahora apunta al vacio
        
       
    }
    public NodoUsuario(String ID, String usuario, NodoUsuario nodito){ //lo que quiero guardar y se donde guardarlo
        this.ID = ID;
        this.usuario = usuario;
        this.pNext = nodito; //apunta a otra caja
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public NodoUsuario getpNext() {
        return pNext;
    }

    public void setpNext(NodoUsuario pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
}
