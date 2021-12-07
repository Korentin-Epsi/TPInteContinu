package org.example;

import java.util.Locale;

public class Bonjour {

    public String saluer(String nom)
    {
        if(nom==null || nom=="")
        {
            return "Bonjour, l'ami.";
        }
        //Code si différent de vide ou null
        else{
            int compteurMaj=0;
            for (int i=0;i<nom.length();i++)
            {
                char character = nom.charAt(i);
                if(Character.isUpperCase(character))
                {
                    compteurMaj++;
                }
            }
            if (compteurMaj <=1)
            {
                return "Bonjour, "+nom+".";
            }
            if (compteurMaj >=2)
            {
                return "BONJOUR," ;
            }
        }



        return "";
    }
}
