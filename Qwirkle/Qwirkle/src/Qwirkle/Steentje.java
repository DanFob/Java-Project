package Qwirkle;

/**
 * @author Daniëla Foblets
 * @version 1.0 26/01/2020 13:52
 */
public class Steentje {
    Vorm vorm;
    Kleur kleur;
    private int x;
    private int y;

    public Steentje(Vorm vorm, Kleur kleur, int x, int y) {
        this.vorm = vorm;
        this.kleur = kleur;
        this.x = x;
        this.y = y;
    }

    public Vorm getVorm() {
        return vorm;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
