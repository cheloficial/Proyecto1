/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.graphstream.graph.*;
import org.graphstream.graph.implementations.*;
import org.graphstream.ui.view.Viewer;
/**
 *
 * @author Marcel
 */
public class Main extends JPanel{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //esta es la rama marcel
        
        
//        Interfaz ventana1 = new Interfaz();
//        ventana1.setVisible(true);
        
        
        
        
        
//        CodigoJFileChooser
        ListaUsuario usuarios = new ListaUsuario();
        ListaRelacion relaciones = new ListaRelacion();
        
        
        ManejoArchivos ventana2 = new ManejoArchivos();//carga el archivo
        ventana2.setVisible(true);
        String archvioTxtCompleto = ventana2.abrirArchivo();//retorna el contendio en forma de string
        
        if (!"".equals(archvioTxtCompleto)){
            //Separamos archivo texto por linea
            String[] archivoTextoLinea = archvioTxtCompleto.split("\n");
            //Por cada linea  revisamos:
            
            for (int i = 0; i < archivoTextoLinea.length; i++) {
                if((archivoTextoLinea[i]=="Usuarios")||(archivoTextoLinea[i]=="usuarios")||(archivoTextoLinea[i]=="")){
                    ;
                }else if((archivoTextoLinea[i]=="Relaciones")||(archivoTextoLinea[i]=="relaciones")){
                    ;
                }else{
                    String[] lineaInfo = archivoTextoLinea[i].split(",");
                    for (int j = 0; j < lineaInfo.length; j++) {
                        lineaInfo[j] = lineaInfo[j].replaceAll("\\s+", "");
                    }
     
                    if (lineaInfo.length == 2){
                        
                        usuarios.InsertarFinal(lineaInfo[0], lineaInfo[1]);
                    }else if (lineaInfo.length == 3) {
                        relaciones.InsertarAlFinal(lineaInfo[0], lineaInfo[1], lineaInfo[2]);
                    }else{
                        ;
                    }
                    
                
            }
          
        }
        }
        
//        String tr = relaciones.buscarTiempoRelacion(0);
//        System.out.println(tr);
//        
        
        
        
////      Hacemos Grafo
        
        GrafoMa grafo  = new GrafoMa(usuarios.getSize(), false);//Grafo de 12 vertices no dirigido
        for (int i = 0; i < usuarios.getSize(); i++) {
           grafo.insertarVertice(); 
        }
        
        
        
        for (int i = 0; i < relaciones.getSize(); i++) {
            
            String a1 = relaciones.buscarArista1(i);
            String indiceA1 = usuarios.idToInt(a1);
            String a2 = relaciones.buscarArista2(i);
            String indiceA2 = usuarios.idToInt(a2);
            grafo.insertarArista(Integer.parseInt(indiceA1), Integer.parseInt(indiceA2));
        }

        
//        grafo.imprimir();
//        System.out.println("Tamano: " + grafo.size());
//        System.out.println("Grado de entrada del vertice 3: " + grafo.columna(3));
//        System.out.println("Grado de salida del vertice 3: " + grafo.fila(3));

        System.setProperty("org.graphstream.ui", "swing"); 
        Graph graph = new SingleGraph("Tutorial 1"); 

        for (int i = 0; i < usuarios.getSize(); i++) {
            String idNodoaInsertar = usuarios.intToId(i);
            graph.addNode(idNodoaInsertar);
            Node aux = graph.getNode(idNodoaInsertar);
            aux.setAttribute("ui.style", "shape:circle;fill-color: cyan;size: 20px;");
            aux.setAttribute("ui.label", idNodoaInsertar);
        }
        
        for (int i = 0; i < relaciones.getSize(); i++) {
            String a1 = relaciones.buscarArista1(i);
            String a2 = relaciones.buscarArista2(i);
            String tr = relaciones.buscarTiempoRelacion(i);
            graph.addEdge(a1 + a2, a1, a2);
            Edge eaux = graph.getEdge(a1+a2);
            eaux.setAttribute("ui.style", "text-size: 15; text-aligment: under;");
            eaux.setAttribute("ui.label", tr);
            
        }
        
        graph.display();
    
}
}