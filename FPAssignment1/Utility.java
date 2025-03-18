package FPAssignment1;
public  class Utility {
    public static boolean isNumerical(String str){
        try {
           return str.chars().allMatch(Character::isDigit);
            
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean isYN(String str){
        str = str.toLowerCase();
        if(str.length() != 1) return false;
        if(!Character.isAlphabetic(str.charAt(0))) return false;
        if(str.charAt(0) == 'y' || str.charAt(0) == 'n'){
            return true;
        }
        return false;
    }
    public static boolean isInt(String str){
        try{
            Integer.valueOf(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
