package LocadoraVeiculos.Utils;

public class Validacao {

    public static boolean isNullOrEmpty(String s){
        if (s == null) return true; 

        if(s.isBlank() || s.isEmpty()) return true;
        
        return false;
    }

}
