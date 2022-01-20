public class magic {

    public static void main(String[] args) {
        if ( ismagic( Integer.parseInt(args[0] )  , Integer.parseInt(args[1] ), Integer.parseInt(args[2] ) )) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    static boolean ismagic(Integer s1, Integer  s2, Integer s3 ){
        if (s1*s2 == s3 % 10  ){
            return true;
        }
        else {
            if (s1*s2 == s3 % 100 ){
                return true;
            }
            else {
                if (s1*s2 == s3 % 1000  ){
                    return true;
                }
                else { return false; }
            }
        }

    }
}





