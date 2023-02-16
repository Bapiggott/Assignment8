public class App {
    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(args[0]);
        System.out.println(Fibanacci(n));
        Write(n);
    }
       public static int Fibanacci(int n){
       int a = 1, b = 1, k = 3, t =0;
        if(n<=2 && n>0){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        else{
        while(true){
            if(k == n){
                return a+b;
            }
            k++;
            t = a + b;
            a = b;
            b = t;
        }
    }
    }
    public static String Write(int n){
        for(int i= 0; i<= n; i++){
        System.out.print(Fibanacci(i) + " ");
        }
        return null;
        
     }
}