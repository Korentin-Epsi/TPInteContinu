package org.example;

public class Bonjour {

    public String saluer(String nom)
    {

        //Code si différent de vide ou null

            int compteurMaj=0;
        for (int i=0;i<nom.length();i++)
        {
            if(Character.isUpperCase(nom.indexOf(i)))
            {
                compteurMaj=+1;
            }
        }
        if (compteurMaj <=1)
        {
            return "Bonjour, "+nom+".";
        }
        


        return "";
    }
}
