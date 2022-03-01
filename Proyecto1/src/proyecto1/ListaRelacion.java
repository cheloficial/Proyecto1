/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author Marcel
 */
public class ListaRelacion {
    private NodoRelacion pFirst;
    private NodoRelacion pLast;
    private int size;

    public ListaRelacion(NodoRelacion pFirst, NodoRelacion pLast, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = size;
    }
    
    public ListaRelacion() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public NodoRelacion getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoRelacion pFirst) {
        this.pFirst = pFirst;
    }

    public NodoRelacion getpLast() {
        return pLast;
    }

    public void setpLast(NodoRelacion pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean EsVacio(){
        return pFirst == null;
    }
    
    public void InsertarAlFinal(String IdUser1, String IdUser2, String tiempoRelacion){
        NodoRelacion nuevoNodo = new NodoRelacion(IdUser1, IdUser2, tiempoRelacion);
        
        if (EsVacio()){
            pFirst = nuevoNodo;
            pLast = nuevoNodo;
        } else{
            NodoRelacion aux = pLast;
            aux.setpNext(nuevoNodo);
            pLast = nuevoNodo;
        }
        
        size += 1;
    }
    
    public void Imprimir(){
        
        if (!EsVacio()){
            NodoRelacion aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.print(aux.getIdUser1() + " ");
                System.out.print(aux.getIdUser2() + " ");
                System.out.println(aux.getTiempoRelacion() + " ");
                aux = aux.getpNext();
                
            }
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
    public void EliminarAlInicio(){
        if (!EsVacio()){
            pFirst = pFirst.getpNext();
            size = size - 1;
        }else{
            System.out.println("La lista esta vacia");
        }
    }
    
        public void mostrar_elementos(){
        String final_msg = "";
        if (!EsVacio()){
            NodoRelacion aux = pFirst;
            
            for (int i = 0; i < size; i++) {
                final_msg = final_msg + "ID Usuario 1: " + aux.getIdUser1() + ",   " + "Id Usuario 2: " + aux.getIdUser2() + ",   " + "Tiempo de Relacion: " + aux.getTiempoRelacion() + "\n";
                aux = aux.getpNext();
                
            }
            JOptionPane.showMessageDialog(null, final_msg);
        }else{
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        
    }
        
    public String buscarArista1(int target){
        if (!EsVacio()){
            int contador = 0;
            NodoRelacion aux = pFirst;
            for (int i = 0; i < size; i++) {
                if (contador == target){
                    return aux.getIdUser1();
                }else{
                    contador ++;
                    aux = aux.getpNext();
                }
                
            }
        
        }else{
            ;
        }
        return "Lista vacia";
    }
    
    public String buscarArista2(int target){
        if (!EsVacio()){
            int contador = 0;
            NodoRelacion aux = pFirst;
            for (int i = 0; i < size; i++) {
                if (contador == target){
                    return aux.getIdUser2();
                }else{
                    contador ++;
                    aux = aux.getpNext();
                }
                
            }
        
        }else{
            ;
        }
        return "Lista vacia";
    }
    
    public String buscarTiempoRelacion(int target){
        if (!EsVacio()){
            int contador = 0;
            NodoRelacion aux = pFirst;
            for (int i = 0; i < size; i++) {
                if (contador == target){
                    return aux.getTiempoRelacion();
                }else{
                    contador ++;
                    aux = aux.getpNext();
                }
                
            }
        
        }else{
            ;
        }
        return "Lista vacia";
    }
        
        
    
    //
    
        
        
    
    
    
    
    
    
    
    
    
    
}
