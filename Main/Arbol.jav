package Main;


public class Arbol {
    
    Nodo RaizNormal;
    Nodo RaizEspejo;

    public boolean EstaVacioNormal() {
        return RaizNormal == null;
    }

    public boolean EstaVacioEspejo() {
        return RaizEspejo == null;
    }
    //Aqui se mandan a traer los datos 
    public Nodo getRaizNormal() {
        return RaizNormal;
    }

    public Nodo getRaizEspejo() {
        return RaizEspejo;
    }
    //aqui se hace un metodo añadir lo de las raices se hacen dos para la normal y la de espejo
    public void Anadir(int Dato) {
        Anadir(RaizNormal, RaizEspejo, Dato);
    }
     //aqui se hace un Nodo raiz1 para el derecho y otro para el izquierdo
      private void Anadir(Nodo raiz1, Nodo raiz2, int Dato) {
        if (EstaVacioNormal()) {
            RaizNormal = new Nodo(Dato);
            RaizEspejo = new Nodo(Dato);
            
            
        } else if (raiz1.getDato() > Dato) {
            //aqui se encuentran los datos del lado hizquierdo
            if (raiz1.getHijoIzq() == null) {
                raiz1.setHijoIzq(new Nodo(Dato));
                raiz2.setHijoDer(new Nodo(Dato));
            } else {
                Anadir(raiz1.getHijoIzq(), raiz2.getHijoDer(),Dato);
               
                
            }
        } else {
            //aqui se encuentran los datos del lado derecho
            if (raiz1.getHijoDer() == null) {
                raiz1.setHijoDer(new Nodo(Dato));
                raiz2.setHijoIzq(new Nodo(Dato));
            } else {
                Anadir(raiz1.getHijoDer(), raiz2.getHijoIzq(), Dato);
            }
        }
    }
      
   //Aqui se realizaron los metodos  In-Orden, Pre-Orden, Post-Orden
    public void InOrden(Nodo r) {
            if (r!= null) {
            InOrden(r.getHijoIzq());
            System.out.print(r);
            InOrden(r.getHijoDer());
        }
    }

    public void PreOrden(Nodo r) {
        if (r!= null) {
            System.out.print(r);
            PreOrden(r.getHijoIzq());
            PreOrden(r.getHijoDer());
        }
    }
    
    public void PostOrden(Nodo r) {
            if (r != null) {
            PostOrden(r.getHijoIzq());
            PostOrden(r.getHijoDer());
            System.out.print(r);
        }
    }
}


