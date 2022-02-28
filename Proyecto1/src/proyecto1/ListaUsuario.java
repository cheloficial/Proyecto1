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
public class ListaUsuario {
    
    private NodoUsuario pFirst;
    private NodoUsuario pLast;
    private int size;

    
//constructor de lista de la lista con sus variables respectivas insert code construccion    
    public ListaUsuario(NodoUsuario pFirst, NodoUsuario pLast, int size) {
        this.pFirst = pFirst;
        this.pLast = pLast;
        this.size = size;
    }

//pero necesito incializar asi    
    public ListaUsuario() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    
    
//Getters y Setters Right click inster code
    public NodoUsuario getpFirst() {
        return pFirst;
    }

    public void setpFirst(NodoUsuario pFirst) {
        this.pFirst = pFirst;
    }

    public NodoUsuario getpLast() {
        return pLast;
    }

    public void setpLast(NodoUsuario pLast) {
        this.pLast = pLast;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    //funciones originales
    
// Pregunta si la condicion pFirts == null se cumple, si se cumple retorna true si no false    
    public boolean EsVacio(){
        return pFirst == null;
    }
    
    public void InsertarFinal(Object ID, Object usuario){
        NodoUsuario nuevoNodo = new NodoUsuario(ID, usuario);
        
        if (EsVacio()){
            pFirst = nuevoNodo;
            pLast = nuevoNodo;
        } else{
            NodoUsuario aux = pLast;
            aux.setpNext(nuevoNodo);
            pLast = nuevoNodo;
        }
        
        size += 1;
    }
    
    public void Imprimir(){
        
        if (!EsVacio()){
            NodoUsuario aux = pFirst;
            for (int i = 0; i < size; i++) {
                System.out.print(aux.getID() + " ");
                System.out.println(aux.getUsuario() + " ");
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
            NodoUsuario aux = pFirst;
            
            for (int i = 0; i < size; i++) {
                final_msg = final_msg + "ID: " + aux.getID() + "\n" + aux.getUsuario() + "\n";
                aux = aux.getpNext();
                
            }
            JOptionPane.showMessageDialog(null, final_msg);
        }else{
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }
        
    }
    
    
    
    
    
}
