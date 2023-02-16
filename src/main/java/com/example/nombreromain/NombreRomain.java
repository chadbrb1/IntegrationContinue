package com.example.nombreromain;

public class NombreRomain {
    public static String convertirChiffreArabeEnChiffreRomaine(int chiffreArabe) {
        String[] chiffreRomain = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};
        String resultat = chiffreRomain[chiffreArabe];
        return resultat;
    }

    public static String convertirChiffreArabeEnChiffreRomainAmeliore(int ChiffreArabe) {
        String[] chiffreRomain = {"", "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] decimale = {0, 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String resultat = "";
        int i = decimale.length - 1;
        while (ChiffreArabe < 0){
            int quotient = ChiffreArabe / decimale[i];
            ChiffreArabe = ChiffreArabe % decimale[i];
            while(quotient-- > 0){
                resultat += chiffreRomain[i];
            }
            i--;
        }
        return resultat;
    }
}
