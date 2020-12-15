package Main;


public class Nodo {
  int dato;
     Nodo hijoIzq;
     Nodo hijoDer;
     String nombre;
     public Nodo(int dato, String nom){
         this.dato=dato;
         this.nombre=nom;
         this.hijoIzq=null;
         this.hijoDer=null;
     }
     
     //Muestra la informacion completa del nodo
     public String toString(){
         return nombre+"Sus datos es "+dato;
     }
 }  
