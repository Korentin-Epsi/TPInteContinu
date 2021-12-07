package org.example;

public class TataYoyo {
    public String isTataYoyo(int nb)
    {
        if(nb % 3 ==0 && nb % 5 ==0)
        {
            return "TataYoyo";
        }
         if(nb % 3 == 0)
        {
            return "Tata";
        }
            if(nb % 5 == 0)
            {
            return "Yoyo";
        }

        return  Integer.toString(nb);
    }
}
