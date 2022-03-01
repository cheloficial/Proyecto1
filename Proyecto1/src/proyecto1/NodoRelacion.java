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
public class NodoRelacion {
    private String IdUser1;
    private String IdUser2;
    private String tiempoRelacion;
    private NodoRelacion pNext;

    public NodoRelacion(String IdUser1, String IdUser2, String tiempoRelacion) {
        this.IdUser1 = IdUser1;
        this.IdUser2 = IdUser2;
        this.tiempoRelacion = tiempoRelacion;
        this.pNext = null;
    }
    
    public NodoRelacion(String IdUser1, String IdUser2, String tiempoRelacion, NodoRelacion nodito) {
        this.IdUser1 = IdUser1;
        this.IdUser2 = IdUser2;
        this.tiempoRelacion = tiempoRelacion;
        this.pNext = nodito;
    }

    public String getIdUser1() {
        return IdUser1;
    }

    public void setIdUser1(String IdUser1) {
        this.IdUser1 = IdUser1;
    }

    public String getIdUser2() {
        return IdUser2;
    }

    public void setIdUser2(String IdUser2) {
        this.IdUser2 = IdUser2;
    }

    public String getTiempoRelacion() {
        return tiempoRelacion;
    }

    public void setTiempoRelacion(String tiempoRelacion) {
        this.tiempoRelacion = tiempoRelacion;
    }

    public NodoRelacion getpNext() {
        return pNext;
    }

    public void setpNext(NodoRelacion pNext) {
        this.pNext = pNext;
    }
    
    

    
    
    
    
}
