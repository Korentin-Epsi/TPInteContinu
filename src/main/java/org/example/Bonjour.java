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
        int compteurMaj=0;
        int compteurVirgule=0;
        for (int i=0;i<nom.length();i++)
        {
            char character = nom.charAt(i);
            if(Character.isUpperCase(character))
            {
                compteurMaj++;

            }
            if(character==',')
            {
                compteurVirgule++;
            }
        }

        //sert à faire la gestion des virgules pour la question 4, 5
        if(compteurVirgule>=1)
        {
            String[] nomSplit =nom.split(",");
            String laPhraseMaj="";
            String laPhrase="";
            for(int x=0;x<nomSplit.length;x++)
            {
                String unNom=nomSplit[x];
                boolean nomMaj=true;
                for(int a=0;a<unNom.length();a++)
                {
                    if(!Character.isUpperCase(unNom.charAt(a)))
                    {
                        nomMaj=false;
                    }
                }
                if(nomMaj==true)
                {
                   laPhraseMaj="ET BONJOUR "+nomSplit[x]+".";
                }
                if(x == nomSplit.length-1)
                {
                    laPhrase=laPhrase+" et "+nomSplit[x];
                }
                else
                {
                    laPhrase=laPhrase+","+nomSplit[x];
                }

            }
            return "Bonjour"+laPhrase+"."+laPhraseMaj;
        }
        if (compteurMaj <=1)
        {
            return "Bonjour, "+nom+".";
        }
        if (compteurMaj >=2)
        {
            return "BONJOUR, "+nom.toUpperCase()+"." ;
        }






        return "";
    }
}
