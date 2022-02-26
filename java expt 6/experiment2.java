public class experiment2 {
    
    public static void main(String args[]){
            try {
                int b=400;
                if (b<500)
                    throw new balanceException("Low Balance");
            }
            catch (balanceException e) {
                System.out.println(e);
            }
    }
}
class balanceException extends Exception {
    public balanceException(String s) {
        super(s);
    }
}