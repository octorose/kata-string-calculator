package fr.norsys.stringcalculator;

import java.util.Arrays;

public class Clazz {
    public String extractdelimite(String s){
        String result = s.split("\n")[0];
        //filter
        String [] filterr= result.split("");
        String [] semifiltred = Arrays.copyOfRange(filterr, 2, filterr.length);
        String filted = String.join("", semifiltred);
        //filtered
        return '\\'+filted;
    }
    public int add(String number) {
        String deli = "";
        String[] arrOfStr = number.split(",|\n");
        if(number==""){
            return 0;
        }
        if(number.startsWith("//")){
            //extract delimiter
            deli = extractdelimite(number);
            //remove the delimiter decla from the string
            String onlyData = removeDeli(number);
            arrOfStr = onlyData.split(deli);
        }

        int res = 0;
        for (int i = 0; i < arrOfStr.length; i++) {
            if (Integer.parseInt(arrOfStr[i] )> 1000) continue;
            res = res + Integer.parseInt(arrOfStr[i]);
        }
        return res;
    }

    private String removeDeli(String number) {
        String[] arrOfStr = Arrays.copyOfRange(number.split("\n"), 1, number.split("\n").length);
        String result = String.join("", arrOfStr);
        return result;

    }
}
