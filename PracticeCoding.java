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

   public boolean CheckStringRotation(String s1,String s2){
        String s3=  s1+s1;
        if(s1.length()==s1.length() && s3.contains(s2)){
            return true;
        }
        else{
            return false;
        }
   }
}  
public class PracticeCoding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         sol obj= new sol();
        // int n=sc.nextInt();
       
        // System.out.println(obj.isPrime(n));
        
        // String s="a2b3c1";
        //  System.out.println(obj.CheckString(s));
      
         String mystr="ABCD";
         String s2="BCDA";
         System.out.println(obj.CheckStringRotation(mystr, s2));
    
    }
    
}
