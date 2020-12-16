package Main;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         Arbol arbol = new Arbol();
         int nodo;
         for (int i = 0; i < 10; i++) {
             System.out.println("Ingresa el nodo");
             nodo = leer.nextInt();
             arbol.Anadir(nodo);
          
         }
         System.out.println("");
         System.out.println("*******Arboles Binarios normales y con espejo*****");
         System.out.println("\n             Arbol normal In-Orden");
         System.out.println("");
         arbol.InOrden(arbol.getRaizNormal());
         System.out.println("\n             Arbol espejo In-Orden");
         System.out.println("");
         arbol.InOrden(arbol.getRaizEspejo());
         System.out.println("\n             Arbol normal Pre-Orden");
         System.out.println("");
         arbol.PreOrden(arbol.getRaizNormal());
         System.out.println("\n             Arbol espejo Pre-Orden");
         System.out.println("");
         arbol.PreOrden(arbol.getRaizEspejo());
         System.out.println("");
         System.out.println("\n             Arbol normal Post-Orden");
         System.out.println("");
         arbol.PostOrden(arbol.getRaizNormal());
         System.out.println("");
         System.out.println("\n             Arbol espejo Post-Orden");
         arbol.PostOrden(arbol.getRaizEspejo());
         System.out.println("");
    }
 }
