public class Primes{
    public static void main(String args[]){
        String res="2";
        for(int i=3;i<101;i++){
            if(IsPrime(i)){
                res+=" "+String.valueOf(i);
            }
        }
        System.out.println(res);
        return;
    }
    public static boolean IsPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}