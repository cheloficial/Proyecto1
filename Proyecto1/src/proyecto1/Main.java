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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //esta es la rama marcel
        
        
//        CodigoJFileChooser
        ListaUsuario usuarios = new ListaUsuario();
        
        ManejoArchivos ventana1 = new ManejoArchivos();//carga el archivo
        ventana1.setVisible(true);
        String myString = ventana1.abrirArchivo();//retorna el contendio en forma de string
        
        if (!"".equals(myString)){
            String[] usuariosSplit = myString.split("\n");
            for (int i = 0; i < usuariosSplit.length; i++) {
                if((usuariosSplit[i]=="Usuarios")||(usuariosSplit[i]=="usuarios")||(usuariosSplit[i]=="")){
                    ;
                }else if((usuariosSplit[i]=="Relaciones")||(usuariosSplit[i]=="relaciones")){
                    ;
                }else{
                    String[] usuario = usuariosSplit[i].split(", ");
                    usuarios.InsertarFinal(usuario[0], usuario[1]);
                
            }
          
        }
        }
        usuarios.Imprimir();
        
        
        
    

        
        
        
        int Max = 12;
        GrafoMa grafo  = new GrafoMa(Max, false);//Grafo de 12 vertices no dirigido
        for (int i = 0; i < Max; i++) {
           grafo.insertarVertice(); 
        }
        
        grafo.insertarArista(0, 1);
        grafo.insertarArista(0, 6);
        grafo.insertarArista(4, 2);
        grafo.insertarArista(0, 7);
        grafo.insertarArista(1, 3);
        grafo.insertarArista(3, 3);
        grafo.insertarArista(9, 6);
        grafo.insertarArista(12, 1);
        grafo.insertarArista(6, 10);
        grafo.insertarArista(5, 9);
        grafo.insertarArista(8, 11);
        grafo.insertarArista(2, 3);
        
        grafo.imprimir();
        System.out.println("Tamano: " + grafo.size());
        System.out.println("Grado de entrada del vertice 3: " + grafo.columna(3));
        System.out.println("Grado de salida del vertice 3: " + grafo.fila(3));
    
}
}