package com.projet.orientation;

public class Personnage {

    public String tourner(int n) {
        String[] tab = new String[]{"nord","est","sud","ouest"};
        int r = n%4;
        switch(r){
            case 0 : return tab[0];
            case 1 : return tab[1];
            case 2 : return tab[2];
            case 3 : return tab[3];
        }
        return "";
    }
}

