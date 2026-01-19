import java.util.Scanner;
                          
class sol
{
    public boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0){
                return false;
            }
        }
         return true;
    }

    public String CheckString(String s)
    {
          String[] a=s.split("\\d+");
        String[] b=s.substring(1).split("\\D");

        String res="";
        for (int i = 0; i < a.length; i++) {
            String x="";
            for (int j = 1; j <= Integer.parseInt(b[i]); j++) {
                x+=a[i];
            }
            res+=x;
        }

        return res;
    }

   
}  
public class PracticeCoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        sol obj= new sol();
        System.out.println(obj.isPrime(n));
        
        String s="a2b3c1";
         System.out.println(obj.CheckString(s));
      
    
    }
    
}
