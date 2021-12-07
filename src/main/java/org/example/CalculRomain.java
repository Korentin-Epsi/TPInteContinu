package org.example;

import java.util.ArrayList;

public class CalculRomain {
    public int isCalculRomain(String suiteNbRomain)
    {
        int calcul=0;
        ArrayList<Integer> nombreConvertie=new ArrayList<>();
        for (int i=0;i<suiteNbRomain.length();i++)
        {
            char lettre=suiteNbRomain.charAt(i);
            if(lettre=='I')
            {
                nombreConvertie.add(1);
            }
            if(lettre=='V')
            {
                nombreConvertie.add(5);
            }
            if(lettre=='X')
            {
                nombreConvertie.add(10);
            }
            if(lettre=='L')
            {
                nombreConvertie.add(50);
            }
            if(lettre=='C')
            {
                nombreConvertie.add(100);
            }
            if(lettre=='D')
            {
                nombreConvertie.add(500);
            }
             if(lettre=='M')
            {
                nombreConvertie.add(1000);
            }

        }

        for (int x=0;x<nombreConvertie.size();x++)
        {
                calcul=calcul+nombreConvertie.get(x);

        }
        return calcul;
    }
}
