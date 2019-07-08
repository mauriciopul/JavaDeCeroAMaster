public class Caja {
    int ancho;
    int alto;
    int profundo;

    Caja() {
    }

    Caja(int an, int al, int prof) {
        this.ancho = an;
        this.alto = al;
        this.profundo = prof;
    }

    public int calcularVolumen() {
        return ancho * alto * profundo;
    }


}
