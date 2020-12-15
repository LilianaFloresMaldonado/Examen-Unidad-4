
public class Arbol {
  Nodo raiz;
     public Arbol(){
         raiz=null;
     }
     
     public void agregarNodo(int d, String nom){
         Nodo nuevo= new Nodo(d, nom);
         if(raiz==null){
             raiz=nuevo;
         }else{
             Nodo auxiliar=raiz;
             Nodo padre;
             while(true){
                 padre=auxiliar;
                 if(d<auxiliar.dato){
                     auxiliar=auxiliar.hijoIzq;
                     if(auxiliar==null){
                         padre.hijoIzq=nuevo;
                         return;
                     }
                 }else{
                     auxiliar=auxiliar.hijoDer;
                     if(auxiliar==null){
                         padre.hijoDer=nuevo;
                         return;
                     }
                 }
                 
                 
             }
         }
        
     }
     
     public boolean estaVacio(){
         return raiz==null;
     }
     
     public void inOrden(Nodo r){
         if(r!=null){
             inOrden(r.hijoIzq);
             System.out.println(r.dato);
             inOrden(r.hijoDer);
         }
      }
         public void PreOrden(Nodo r) {
        if (r != null) {
            System.out.println(r);
            PreOrden(r.hijoIzq);
            PreOrden(r.hijoDer);
        }
    }
          public void PostOrden(Nodo r) {
        if (r != null) {
            PostOrden(r.hijoIzq);
            PostOrden(r.hijoDer);
            System.out.println(r);
        }
    }
  }
 


