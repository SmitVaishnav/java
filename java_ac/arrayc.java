public class arrayc {
    public static void main(String[] args) {
        String[] copyFrom={
                "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"
        };
        String[] copyTo=new String[7];
        System.arraycopy(copyFrom,0,copyTo,0,7);
        for (String coffee:copyTo){
            System.out.println(coffee+" ");
        }
    }
}
