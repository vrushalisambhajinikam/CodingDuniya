import java.util.*;

class ExampleDEmo {
    Scanner sc=new Scanner(System.in);
    ExampleDEmo() {
        Greeting();     //Namste Duniya
        Add();       //Addition Demo
        All_InBuiltFunctions();
        Printing();
        maxnum();
        Factorial(5);
        Fibonancci(5);
        reverseNo(123);
        checkPal();
        MaxArrayEle();
        ArraySum();
        LinearSearch();
        findGCD(48, 18);
        CheckPrime();
        secondLargest();
        RemoveDuplicate();
        countvowel();
        MergeSortedArray();
        CheckAnagramString();
        MissingNumberInSeq();
        PowerOfNumberWithoutBuiltInFun();
        CheckArmstrong();
        SwapNumberWithoutThird();
        CountFreq();
        PrintAllPair();
        RightRotation();
        FindAngle();
        ReverseString();
        UserNumberSumUntilZero();
        PrintTabe();
        PrintFloydTriangle();
        PrintFloydTriangle2();
        reverseString();
    }

    public static void Greeting() {
        System.out.println("Let's start today's coding with Vrushali Mam");
    }

    public void Add() {
        int a = 10, b = 20;
        System.out.println("Addtion of two ele is :" + (a + b));
    }

    public void All_InBuiltFunctions() {
        //String
        String str1 = "Vrushali";
        System.out.println(str1.charAt(3));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.repeat(3));
        System.out.println(str1.getBytes());
        System.out.println(str1.getClass());

        System.out.println(str1.toString());

        char strarr[] = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(strarr[i] + " ");
        }

        System.out.println();
        //Array
        int arr[] = {10, 20, 30, 40, 50};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println(arr.length);
        System.out.println(arr.clone());
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println(Arrays.stream(arr).average());

        //ASCII
        char ch = 'v';
        int asciival = (int) ch;
        System.out.println(asciival);

        char ch2 = 'p';
        int aschiival2 = (int) ch2;
        System.out.println(aschiival2);


    }


    //1 Print Hello World
    public void Printing() {
        System.out.println("Hello World");
    }

    //2 Find maximum of two numbers
    public void maxnum() {
        System.out.println(Math.max(10, 28));
    }

    //3 Calculate factorial of a number
    public void Factorial(int n) {
        int no = n;
        int fact = 1;
        while (no >= 1) {
            fact *= no;   //5 20 60 120
            no--;       //4 3 2 1 0
        }
        System.out.println("Factorial of given number is :" + fact);
    }

    //4 Print Fibonacci series up to n terms
    public void Fibonancci(int n) {
        int fno = 0, sno = 1, tno = 0;

        while (n > 0) {
            tno = fno + sno;
            System.out.print(tno + " ");
            fno = sno;
            sno = tno;
            n--;
        }
        System.out.println(tno);
    }

    //5 Reverse a string
    public void reverseNo(int n) {
        int no = 123;
        while (no != 0) {
            int lno = no % 10;
            System.out.print(lno);
            no = no / 10;
        }
        System.out.println();
    }

    //6 Check if a string is a palindrome
    public void checkPal() {
        int no = 121;
        int temp = no;
        int newno = 0;
        while (no != 0) {
            int lno = no % 10;
            newno = newno * 10 + lno;
            no = no / 10;
        }
        System.out.println(newno);
        if (newno == temp) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not palindrone number");
        }
    }

    //7 Find the largest element in an array
    public void MaxArrayEle() {
        int arr[] = {10, 55, 30, 22, 120, 33};
        Arrays.sort(arr);
        int len = arr.length;
        System.out.println(arr[len - 1]);
    }

    //8 Sum of elements in an array
    public void ArraySum() {
        int arr[] = {10, 55, 30, 22, 120, 33};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array ele is :" + sum);
    }

    //9 Simple linear search in an array
    public void LinearSearch() {
        int arr[] = {10, 55, 30, 22, 120, 33};
        int key = 33;
        boolean found = false;
        for (int ele : arr) {
            if (ele == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Ele Found");
        } else {
            System.out.println("Not Found");
        }


    }

    //10. Find GCD (Greatest Common Divisor) of two numbers
    //gcd(48,18)=6
    /*
    Step 1: Divide the larger number by the smaller number.
Step 2: Take the remainder.
Step 3: Replace the larger number with the smaller number, and the smaller number with the remainder.
Step 4: Repeat until remainder = 0.
Step 5: The last non-zero remainder is the GCD.

    gcd(48,18)  48%18=12
    gcd(18,12)  18%12=6
    gcd(12,6)   12%6=0
    ans=6

     */

    public void findGCD(int num1, int num2) {
        int maxnum = Math.max(num1, num2);
        int minnum = Math.min(num1, num2);
        int rem = maxnum % minnum;
        if (rem == 0) {
            System.out.println("GCD of two number is:" + minnum);
        } else {
            maxnum = minnum;
            minnum = rem;
            findGCD(maxnum, minnum);
        }
    }

    //11.Check prime number
    public void CheckPrime() {
        int num = 45;
        boolean flag = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Number not is prime");
        } else {
            System.out.println("Number is prime");
        }

    }

    //12.Find second largest element in an array
    public void secondLargest() {
        int arr[] = {12, 43, 98, 21, 20, 11};
        Arrays.sort(arr);
        int len = arr.length;
        System.out.println(arr[len - 2]);
    }

    //13. Remove duplicates from an array
    public void RemoveDuplicate() {
        int arr[] = {10, 20, 30, 40, 10, 4, 30};
        HashSet<Integer> myuniqueele = new HashSet<>();
        for (int ele : arr) {
            myuniqueele.add(ele);
        }
        System.out.println(myuniqueele);
    }

    //14. Count vowels in a string
    public void countvowel() {
        String str = "VrushaliNikam";
        char ch[] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            //       System.out.print(ch[i]+" ");
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
            }
        }
        System.out.println("Totoal vowel in string is:" + count);
    }

    //15.Merge two sorted arrays
    public void MergeSortedArray() {
        int arr[] = {10, 20, 30, 40, 50};
        int arr2[] = {60, 70, 80, 90, 100};

        //Approach-1
        /*int resarr[]=new int[arr.length+arr2.length];
        for (int i = 0; i < arr.length; i++) {
            resarr[i] = arr[i];
        }
        int i2=0;
        for (int i = arr2.length; i <resarr.length ; i++) {
            resarr[i]=arr2[i2];
            i2++;
        }
        System.out.println("Merged sorted ele are: ");
        for (int ele:resarr){
            System.out.print(ele+" ");
        }*/

        //Approach-2
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.stream(arr).boxed().toList());
        list1.addAll(Arrays.stream(arr2).boxed().toList());
        System.out.println(list1);

    }


    //16.Check if two strings are anagrams
    public void CheckAnagramString() {
        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {

            char ch[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();

            Arrays.sort(ch);
            Arrays.sort(ch2);

            boolean ans = (Arrays.equals(ch, ch2));
            System.out.println((ans) ? "Yes String are anagram" : "No Strings are not anagram");
        }

    }

    //17.Find missing number in a sequence
    public void MissingNumberInSeq() {
        int arr[] = {1, 2, 3, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        Arrays.sort(arr);
        int len = arr.length;
        int maxele = arr[len - 1];
        int expectedsum = 0;
        for (int i = 1; i <= maxele; i++) {
            expectedsum += i;
        }
        System.out.println(expectedsum);
        System.out.println("Missing number in sequence is: " + (expectedsum - sum));

    }


    //18.Calculate power of a number (using loops or recursion)
    public void PowerOfNumberWithoutBuiltInFun() {
        int base = 2, exp = 3;
        int res = 1;
        for (int i = 0; i < exp; i++) {
            res *= base;
        }
        System.out.println("Result is:" + res);

    }

    //Check Armstrong number.
    public void CheckArmstrong() {
        int num = 153;
        int temp = num, sum = 0;
        int dig = (int) Math.log10(num) + 1;

        while (num > 0) {
            int ldig = num % 10;
            sum += Math.pow(ldig, dig);
            num /= 10;
        }
        if (sum == temp) {
            System.out.println("Yes it is Armstrong Number");
        } else {
            System.out.println("No it is not Armstrong Number");
        }
    }

    //20 Swap two numbers without using third variable.
    public void SwapNumberWithoutThird() {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }

    // 21. Count frequency of each element in an array.
    public void CountFreq() {
        int arr[] = {10, 20, 33, 30, 10, 20, 70, 100};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int ele : arr) {
            freq.put(ele, freq.getOrDefault(ele, 0) + 1);
        }
        System.out.println(freq);
    }

    //22.Print all pairs with a given sum.
    public void PrintAllPair() {
        int arr[] = {2, 4, 3, 5, 3, 7, 8, 5};
        int targetsum = 10;

        //Approch-1
       /* for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetsum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }*/

        //Optimal Approach (O(n) time, O(n) space)

        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<String> printed = new HashSet<>();

        System.out.println("Pair with given sum are: ");
        for (int num : arr) {
            int required = targetsum - num;

            if (map.containsKey(required)) {
                int a = Math.min(num, required);
                int b = Math.max(num, required);
                String pair = a + "," + b;

                if (!printed.contains(pair)) {
                    System.out.println("(" + a + ", " + b + ")");
                    printed.add(pair);
                }
            }

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

    }

    //23.Rotate an array by k positions
    public void RightRotation() {
        int rotation[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = rotation.length;
        reverse(rotation, 0, n - 1);
        reverse(rotation, 0, n - 1);
        reverse(rotation, 0, n - 1);

        for (int ele:rotation){
            System.out.print(ele+" ");
        }
    }

    private static void reverse ( int[] rotation, int start, int end){
        while (start<end) {
            int temp=rotation[start];
            rotation[start]=rotation[end];
            rotation[end]=temp;
            start++;
            end--;
        }
    }


    //24Angle between hour hand and minute hand of a clock.
    //Angle= | 30H-11.0/2M |
    public void FindAngle(){
        System.out.println();
        int hr=11,min=30;
        double angle=((30*hr)-((11.0/2)*min));
        angle = Math.abs(angle); // absolute value
        angle = Math.min(angle, 360 - angle); // smaller angle
        System.out.println("Angle between two hands is: "+angle);
    }


    //25 Reverse String without using the built-in function
    public void ReverseString(){

        String str="Vrushali";

        //Approach-1
        char[] chars=str.toCharArray();
        int n=chars.length;
        for(int i=0;i<n/2;i++){
            char temp=chars[i];
            chars[i]=chars[n-i-1];
            chars[n-i-1]=temp;

        }
        String reversed=new String(chars);
        System.out.println("Reversed String is :"+reversed);

        //Apporoch-2
        String reversed1 = "";  // start with empty string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed1 += str.charAt(i);  // add characters from end
        }

        System.out.println("Reversed string: " + reversed1);

    }

    //26 write a program to add numbers until user enters zero.
    public void UserNumberSumUntilZero(){

        int num,sum=0;
        do {
            System.out.println("Enter any interger number: ");
            num=sc.nextInt();
            sum+=num;

        }while (num!=0);
        System.out.println("Sum of User Input is: "+sum);
    }

    //27. Print Table of Given Number
    public void PrintTabe(){
        System.out.println("Enter any interger number for Table Printing: ");
        int num=sc.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }

    //28. Write a program to display Floyd’s triangle as-follow :
    /*
        1
        2   3
        4   5   6
        7   8   9   10
  */
    public void PrintFloydTriangle(){
        int num=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    //29. Write a program to display Floyd’s triangle as-follow :
    /*
        1
        2   2
        3   3   3
        4   4   4   4
  */
    public void PrintFloydTriangle2(){
        int num=1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }
    //30 program to reverse a string without builtin fun
    public void reverseString(){
        String str="Vrushali";
        String rev="";
        for (int i = str.length()-1; i >=0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String is:"+rev);
    }
}
    public class All_Basic_Coding {
        public static void main(String[] args) {
            System.out.println("Heyy! A Fresh Good Morning Ever");
            ExampleDEmo ed = new ExampleDEmo();
        }

}