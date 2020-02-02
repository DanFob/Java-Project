package Qwirkle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Daniëla Foblets
 * @version 1.0 26/01/2020 13:45
 */
public class Speler {
    private String naam;
    private static final int MAX_STEENTJES = 6;
    private List<Steentje> steentjesInBezit;
    private int score;
    private boolean beurt = true;
    private int aantal = 0;


    public Speler(String naam) {
        this.naam = naam;
        steentjesInBezit = new ArrayList<>();
        score = 0;
    }

    public void neemSteentje(Steentje steentje){
        if (aantal<MAX_STEENTJES) {
            steentjesInBezit.add(aantal++, steentje);
        }
        // exception als meer dan 6 steentjes
    }


    public boolean isAanBeurt(){
        return beurt;
        // uitwerken
    }

    public void legSteentje(Steentje steentje){
        for (Steentje steen : steentjesInBezit){
            if (steen.equals(steentje)){

                aantal--;
            }
        }

        // uitwerken met iterator
    }

    public void ruilSteentjes(Steentje [] steentjes){
        steentjesInBezit.clear();
        steentjesInBezit.addAll(Arrays.asList(steentjes));
    }

    public boolean steentjesOp (){
        if (aantal != 0){
            return false;
        }
        return true;
    }

    public void legCombinatie(){

    }

    public void toonSteentjes(){

    }

}
