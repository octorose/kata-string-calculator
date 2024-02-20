package fr.norsys.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Clazz{

    public int add(String numbers) {
        // nigqtives nombres
        List<Integer> negativesNumbers = new ArrayList<>();
        int sum = 0;
        if (numbers.isEmpty()) {
            return 0;
        } else  {
            String delimiters = ",|\n";

            String[] numbs = numbers.split(delimiters);


            for (String num : numbs) {
                if (!num.isEmpty()) {
                    int numValue = Integer.parseInt(num);
                    // Vérifier si le nombre est négatif
                    if (numValue < 0) {
                        negativesNumbers.add(numValue);
                    }
                    // Ignorer les nombres supérieurs à 1000
                    else if (numValue <= 1000) {
                        sum += numValue;
                    }
                }
            }
            // Si des nombres négatifs ont été trouvés, lancer une exception
            if (!negativesNumbers.isEmpty()) {
                throw new IllegalArgumentException("negatives not allowed: " + negativesNumbers);
            }
            return sum;
        }
    }
}





