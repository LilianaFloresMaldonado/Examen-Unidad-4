package Main;

import java.util.Scanner;




public class Main {
     public static void main(String[] args) {
         // TODO code application logic here
         int opc=0;
         int elemento;
         String nombre;
         Arbol arbol=new Arbol();
         Scanner leer= new Scanner(System.in);
         do{
             System.out.println("Menú de Arbol binario");
             System.out.println("1.- Agregar un nodo");
             System.out.println("2.- Recorrer árbol InOrden");
             System.out.println("3.- Recorrer árbol PreOrden");
             System.out.println("4.- Recorrer árbol PostOrden");
             System.out.println("5.- Salir");
             System.out.println("Inserta una opción");
             opc=leer.nextInt();
             switch (opc){
                 case 1: 
                     System.out.println("Ingresa el numero del nodo");
                     elemento=leer.nextInt();
                     System.out.println("Ingresa el nombre del nodo");
                     nombre=leer.next();
                     arbol.agregarNodo(elemento, nombre);
                     break;
                 case 2:
                     if(!arbol.estaVacio()){
                         arbol.inOrden(arbol.raiz);
                     }else{
                     System.out.println("El árbol esta vacio");
                     }
                     break;
                 case 3:
                       if(!arbol.estaVacio()){
                         arbol.PreOrden(arbol.raiz);
                     }else{
                     System.out.println("El árbol esta vacio");
                     }
                     break;
                 case 4:
                       if(!arbol.estaVacio()){
                         arbol.PostOrden(arbol.raiz);
                     }else{
                     System.out.println("El árbol esta vacio");
                     }
                      break;
                 case 5: 
                     System.out.println("Saliendo");
                     break;
                 default:
                     System.out.println("Error");
             }
         }while(opc!=5);
     }
    
} 

    

