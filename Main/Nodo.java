package Main;
public class Nodo {
  int dato;
  Nodo Hijoizquierdo, Hijoderecho;

    public Nodo(int dat) {
        this.dato = dat;
        this.Hijoizquierdo = null;
        this.Hijoderecho = null;
    }

    public int getDato() {
        return dato;
    }
    public Nodo getHijoIzq() {
        return Hijoizquierdo;
    }
    public Nodo getHijoDer() {
        return Hijoderecho;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public void setHijoIzq(Nodo Hijoizquierdo) {
        this.Hijoizquierdo = Hijoizquierdo;
    }
    public void setHijoDer(Nodo Hijoderecho) {
        this.Hijoderecho = Hijoderecho;
    }

    @Override
    public String toString() {
        return "[" + dato + "]";
    }

}
     
   
