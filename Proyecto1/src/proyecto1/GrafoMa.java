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
public class GrafoMa {
    private final int maxVertices; // num max de vertices (usuarios)
    private int numVertices; // num de vertices (usuarios)
    private boolean dirigido; // si es o no dirigido
    private boolean [][] matrizAdy; // num de vertices

    public GrafoMa(int maxVertices, boolean dirigido) {
        this.maxVertices = maxVertices;
        numVertices = 0;
        this.dirigido = dirigido;
        this.matrizAdy = new boolean [maxVertices][maxVertices];
    }
    
    public GrafoMa(int maxVertices, int numVertices, boolean dirigido, boolean[][] matrizAdy) {
        this.maxVertices = maxVertices;
        numVertices = 0;
        this.dirigido = dirigido;
        this.matrizAdy = new boolean [maxVertices][maxVertices];
    }

    public int getMaxVertices() {
        return maxVertices;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public boolean isDirigido() {
        return dirigido;
    }
    
    public void insertarVertice(){
        //Insertar los datos que queremos insertar al vertice
        if(maxVertices==numVertices){
            System.out.println("Error se supera el numero de nodos");
        }else{
            for (int i = 0; i < numVertices; i++) {
                matrizAdy[i][numVertices]=false;
                
            }
            for (int i = 0; i < numVertices; i++) {
                matrizAdy[numVertices][i]=false;
                
            }
            numVertices++;
        }
    }
    
    public void insertarArista(int a, int b){
        if((a<numVertices)&&(a>=0)&&(a<numVertices)&&(a>=0)){
            matrizAdy[a][b] = true;
            if(!dirigido){
                 matrizAdy[a][b] = true;
            }
        }else{
            System.out.println("Los vertices no se encuentran en el grafo");
        }
    }
    
    public void eliminarArista(int a, int b){
        if((a<numVertices)&&(a>=0)&&(a<numVertices)&&(a>=0)){
            matrizAdy[a][b] = false;
            if(!dirigido){
                 matrizAdy[a][b] = false;
            }
        }else{
            System.out.println("Los vertices no se encuentran en el grafo");
        }
    }
    
    public boolean existeArista(int a, int b){
        if((a<numVertices)&&(a>=0)&&(a<numVertices)&&(a>=0)){
            return matrizAdy[a][b];
        }else{
            return false;
        }
    
    }
    
    public int columna(int a){
        int result = 0;
        if((a<numVertices)&&(a>=0)){
            for (int i = 0; i < numVertices; i++) {//recorremos la columna a
                if(matrizAdy[i][a]){
                    result++;
                }
            }
        }
        return result;
    }
    
    public int fila(int a){
        int result = 0;
        if((a<numVertices)&&(a>=0)){
            for (int j = 0; j < numVertices; j++) {//recorremos la fila a
                if(matrizAdy[a][j]){
                    result++;
                }
            }
        }
        return result;
    }
    
    public int incidencia(int a){
        int result = 0;
        if((a<numVertices)&&(a>=0)){
            if(!dirigido){
                result = columna(a);
            }else{
                result = columna(a)+fila(a);
            }
        }
        return result;
    }
    
    public int size(){ //numero total de aristas en el grafo
        int result = 0;
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if(matrizAdy[i][j]){
                    if(dirigido != i>=j){
                        result++;
                    }
                }
                
            }
            
        }
        return result;
    }
    
    public void imprimir(){
        System.out.println("La matriz tiene: " + numVertices + "vertices");
        if(dirigido){
            System.out.println("Es dirigido");
        }else{
            System.out.println("No es dirigido");
        }
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                if(matrizAdy[i][j]){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
            
        }
    }
        
    
    
}
