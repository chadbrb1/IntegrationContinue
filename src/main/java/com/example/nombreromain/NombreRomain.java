package com.example.nombreromain;

public class NombreRomain {
    public static String convertirChiffreArabeEnChiffreRomaine(int chiffreArabe) {
        String[] chiffreRomain = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
        String resultat = chiffreRomain[chiffreArabe];
        return resultat;
    }

    //public static String convertirChiffreArabeEnChiffre
}
