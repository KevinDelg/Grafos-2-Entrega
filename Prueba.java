/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import Grafos.Grafo;


/**
 *
 * @author kevindelgado
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* Grafo uno = new Grafo(30);//numero de nodos
        uno.modeloER(250); //número de aristas
        uno.escribirArchivo("Grafo-ER-30.gv");

        Grafo dos = new Grafo(500);//numero de nodos
        dos.modeloGilbert(0.25); //número de aristas
        dos.escribirArchivo("Grafo-Gilbert-500.gv");
        
        Grafo tres = new Grafo(30, "geo");//numero de nodos
        tres.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        tres.escribirArchivo("Grafo-Geo-30.gv");
       
        Grafo cuatro = new Grafo(500);//numero de nodos
        cuatro.modeloBA(6); //parámetro 'd' del modelo
        cuatro.escribirArchivo("Grafo-BA-500.gv");
    *//*
       Grafo uno = new Grafo(30);
        uno.modeloER(250); //número de aristas
        uno.escribirArchivo("Grafo-ER-30.gv");
        Grafo unoBFS = uno.BFS(0);
        unoBFS.escribirArchivo("Grafo-ER-30_BFS.gv");
        Grafo unoDFS_R = uno.DFS_R(0);
        unoDFS_R.escribirArchivo("Grafo-ER-30_DFS_R.gv");
        Grafo unoDFS_I = uno.DFS_I(0);
        unoDFS_I.escribirArchivo("Grafo-ER-30_DFS_I.gv");
       Grafo dos = new Grafo(100);
        dos.modeloER(250); //número de aristas
        dos.escribirArchivo("Grafo-ER-100.gv");
        Grafo dosBFS = dos.BFS(0);
        dosBFS.escribirArchivo("Grafo-ER-100_BFS.gv");
        Grafo dosDFS_R = dos.DFS_R(0);
        dosDFS_R.escribirArchivo("Grafo-ER-100_DFS_R.gv");
        Grafo dosDFS_I = dos.DFS_I(0);
        dosDFS_I.escribirArchivo("Grafo-ER-100_DFS_I.gv");
       Grafo tres = new Grafo(500);
        tres.modeloER(250); //número de aristas
        tres.escribirArchivo("Grafo-ER-500.gv");
        Grafo tresBFS = tres.BFS(0);
        tresBFS.escribirArchivo("Grafo-ER-500_BFS.gv");
        Grafo tresDFS_R = tres.DFS_R(0);
        tresDFS_R.escribirArchivo("Grafo-ER-500_DFS_R.gv");
        Grafo tresDFS_I = tres.DFS_I(0);
        tresDFS_I.escribirArchivo("Grafo-ER-30_DFS_I.gv");

        Grafo uno = new Grafo(30);//numero de nodos
        uno.modeloGilbert(0.25); //número de aristas
        uno.escribirArchivo("Grafo-Gilbert-30.gv");
        Grafo unoBFS = uno.BFS(0);
        unoBFS.escribirArchivo("Grafo-Gilbert-30_BFS.gv");
        Grafo unoDFS_R = uno.DFS_R(0);
        unoDFS_R.escribirArchivo("Grafo-Gilbert-30_DFS_R.gv");
        Grafo unoDFS_I = uno.DFS_I(0);
        unoDFS_I.escribirArchivo("Grafo-Gilbert-30_DFS_I.gv");
        
        Grafo dos = new Grafo(100);//numero de nodos
        dos.modeloGilbert(0.25); //número de aristas
        dos.escribirArchivo("Grafo-Gilbert-100.gv");
        Grafo dosBFS = dos.BFS(0);
        dosBFS.escribirArchivo("Grafo-Gilbert-100_BFS.gv");
        Grafo dosDFS_R = dos.DFS_R(0);
        dosDFS_R.escribirArchivo("Grafo-Gilbert-100_DFS_R.gv");
        Grafo dosDFS_I = dos.DFS_I(0);
        dosDFS_I.escribirArchivo("Grafo-Gilbert-100_DFS_I.gv");

        Grafo tres = new Grafo(500);
        tres.modeloGilbert(0.25); //probabilidad
        tres.escribirArchivo("Grafo-Gilbert-500.gv");
        Grafo tresBFS = tres.BFS(0);
        tresBFS.escribirArchivo("Grafo-Gilbert-500_BFS.gv");
        Grafo tresDFS_R = tres.DFS_R(0);
        tresDFS_R.escribirArchivo("Grafo-Gilbert-500_DFS_R.gv");
        Grafo tresDFS_I = tres.DFS_I(0);
        tresDFS_I.escribirArchivo("Grafo-Gilbert-500_DFS_I.gv");       
   /*     
        
        Grafo uno = new Grafo(30, "geo");//numero de nodos
        uno.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        uno.escribirArchivo("Grafo-Geo-30.gv");
        Grafo unoBFS = uno.BFS(0);
        unoBFS.escribirArchivo("Grafo-Geo-30_BFS.gv");
        Grafo unoDFS_R = uno.DFS_R(0);
        unoDFS_R.escribirArchivo("Grafo-Geo-30_DFS_R.gv");
        Grafo unoDFS_I = uno.DFS_I(0);
        unoDFS_I.escribirArchivo("Grafo-Geo-30_DFS_I.gv");
        
        Grafo dos = new Grafo(100, "geo");//numero de nodos
        dos.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        dos.escribirArchivo("Grafo-Geo-100.gv");
        Grafo dosBFS = dos.BFS(0);
        dosBFS.escribirArchivo("Grafo-Geo-100_BFS.gv");
        Grafo dosDFS_R = dos.DFS_R(0);
        dosDFS_R.escribirArchivo("Grafo-Geo-100_DFS_R.gv");
        Grafo dosDFS_I = dos.DFS_I(0);
        dosDFS_I.escribirArchivo("Grafo-Geo-100_DFS_I.gv");
        
        Grafo tres = new Grafo(500, "geo");//numero de nodos
        tres.modeloGeoSimple(0.3); //distancia a la que se deben conectar nodos
        tres.escribirArchivo("Grafo-Geo-500.gv");
        Grafo tresBFS = tres.BFS(0);
        tresBFS.escribirArchivo("Grafo-Geo-500_BFS.gv");
        Grafo tresDFS_R = tres.DFS_R(0);
        tresDFS_R.escribirArchivo("Grafo-Geo-500_DFS_R.gv");
        Grafo tresDFS_I = tres.DFS_I(0);
        tresDFS_I.escribirArchivo("Grafo-Geo-500_DFS_I.gv");
 /**/       
        Grafo uno = new Grafo(30);//numero de nodos
        uno.modeloBA(6); //parámetro 'd' del modelo
        uno.escribirArchivo("Grafo-BA-30.gv");
        Grafo unoBFS = uno.BFS(0);
        unoBFS.escribirArchivo("Grafo-BA-30_BFS.gv");
        Grafo unoDFS_R = uno.DFS_R(0);
        unoDFS_R.escribirArchivo("Grafo-BA-30_DFS_R.gv");
        Grafo unoDFS_I = uno.DFS_I(0);
        unoDFS_I.escribirArchivo("Grafo-BA-30_DFS_I.gv");
 
        Grafo dos = new Grafo(100);//numero de nodos
        dos.modeloBA(6); //parámetro 'd' del modelo
        dos.escribirArchivo("Grafo-BA-100.gv");
        Grafo dosBFS = dos.BFS(0);
        dosBFS.escribirArchivo("Grafo-BA-100_BFS.gv");
        Grafo dosDFS_R = dos.DFS_R(0);
        dosDFS_R.escribirArchivo("Grafo-BA-100_DFS_R.gv");
        Grafo dosDFS_I = dos.DFS_I(0);
        dosDFS_I.escribirArchivo("Grafo-BA-100_DFS_I.gv");
        
        Grafo tres = new Grafo(500);//numero de nodos
        tres.modeloBA(6); //parámetro 'd' del modelo
        tres.escribirArchivo("Grafo-BA-500.gv");
        Grafo tresBFS = tres.BFS(0);
        tresBFS.escribirArchivo("Grafo-BA-500_BFS.gv");
        Grafo tresDFS_R = tres.DFS_R(0);
        tresDFS_R.escribirArchivo("Grafo-BA-500_DFS_R.gv");
        Grafo tresDFS_I = tres.DFS_I(0);
        tresDFS_I.escribirArchivo("Grafo-BA-500_DFS_I.gv");

        
    }
    
}
