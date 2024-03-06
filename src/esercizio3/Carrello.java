package esercizio3;

import java.util.Arrays;

public class Carrello {
    private Articolo[] articoli;
    private Cliente cliente;
    private double totCosto;

    public double calcoloSomma() {
        for (Articolo articolo : articoli) {
            totCosto += articolo.getArticlePrice();
        }
        return totCosto;
    }

    public Carrello(Articolo[] articoli, Cliente cliente) {
        this.articoli = articoli;
        this.cliente = cliente;
        this.totCosto = calcoloSomma();
    }

    @Override
    public String toString() {
        return "{" +
                " articoli='" + Arrays.toString(articoli) + "'" +
                ", cliente='" + cliente + "'" +
                ", totCosto='" + totCosto + "'" +
                "}";
    }

}
