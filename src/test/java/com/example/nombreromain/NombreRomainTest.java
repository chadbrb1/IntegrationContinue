package com.example.nombreromain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NombreRomainTest {
    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 1" +
                    "QUAND on le transforme en chiffre Romain" +
                    "ALORS on obtient I")
    public void Test_Chiffre_Arabe_1_En_Chiffre_Romain_I() {
        // ETANT donné un chiffre Arabe 1
        int chiffreArabeInitial = 1;
        String chiffreRomainInitial = "I";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient I
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 2" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient II")
    public void Test_Chiffre_Arabe_2_En_Chiffre_Romain_II() {
        // ETANT donné un chiffre Arabe 2
        int chiffreArabeInitial = 2;
        String chiffreRomainInitial = "II";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient II
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 3" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient III")
    public void Test_Chiffre_Arabe_3_En_Chiffre_Romain_III() {
        // ETANT donné un chiffre Arabe 3
        int chiffreArabeInitial = 3;
        String chiffreRomainInitial = "III";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient III
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 4" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient IV")
    public void Test_Chiffre_Arabe_4_En_Chiffre_Romain_IV() {
        // ETANT donné un chiffre Arabe 1
        int chiffreArabeInitial = 4;
        String chiffreRomainInitial = "IV";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient IV
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 5" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient V")
    public void Test_Chiffre_Arabe_5_En_Chiffre_Romain_V() {
        // ETANT donné un chiffre Arabe 5
        int chiffreArabeInitial = 5;
        String chiffreRomainInitial = "V";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient V
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 6" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient VI")
    public void Test_Chiffre_Arabe_6_En_Chiffre_Romain_VI() {
        // ETANT donné un chiffre Arabe 6
        int chiffreArabeInitial = 6;
        String chiffreRomainInitial = "VI";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient VI
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 7" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient VII")
    public void Test_Chiffre_Arabe_7_En_Chiffre_Romain_VII() {
        // ETANT donné un chiffre Arabe 7
        int chiffreArabeInitial = 7;
        String chiffreRomainInitial = "VII";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient VII
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 8" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient VIII")
    public void Test_Chiffre_Arabe_8_En_Chiffre_Romain_VIII() {
        // ETANT donné un chiffre Arabe 1
        int chiffreArabeInitial = 1;
        String chiffreRomainInitial = "I";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient I
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 9" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient IX")
    public void Test_Chiffre_Arabe_9_En_Chiffre_Romain_X() {
        // ETANT donné un chiffre Arabe 9
        int chiffreArabeInitial = 9;
        String chiffreRomainInitial = "IX";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient IX
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 10" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient X")
    public void Test_Chiffre_Arabe_10_En_Chiffre_Romain_X() {
        // ETANT donné un chiffre Arabe 10
        int chiffreArabeInitial = 10;
        String chiffreRomainInitial = "X";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient X
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 11" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient XI")
    public void Test_Chiffre_Arabe_11_En_Chiffre_Romain_XI() {
        // ETANT donné un chiffre Arabe 1
        int chiffreArabeInitial = 11;
        String chiffreRomainInitial = "XI";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient XI
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }

    @Test
    @DisplayName(   "ETANT donné un chiffre Arabe 12" +
            "QUAND on le transforme en chiffre Romain" +
            "ALORS on obtient XII")
    public void Test_Chiffre_Arabe_12_En_Chiffre_Romain_XII() {
        // ETANT donné un chiffre Arabe 12
        int chiffreArabeInitial = 12;
        String chiffreRomainInitial = "XII";

        // QUAND on le transforme en chiffre Romain
        String chiffreRomainFinal = NombreRomain.convertirChiffreArabeEnChiffreRomaine(chiffreArabeInitial);

        // ALORS on obtient XII
        assertEquals(chiffreRomainFinal, chiffreRomainInitial);
    }




}
