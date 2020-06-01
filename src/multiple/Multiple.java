package multiple;

import java.util.Arrays;

public class Multiple {

    public static void main(String[] args) {
        //multiples();
        //fibonacci();
        //fibonacciEven();
//        primeFactor();
//        prime();
//          palindrome();
//           permute();
//            checkDuplicate();
            //factorial();
            int result = recursivefactorial(3);
            System.out.println("Result :  " + result);
            int fac = factorial2();
            System.out.println("Result :  " + fac);
//                reverseNum();
//            removeChar();
//                search();
                //removeString();
//                largestPalindrome();
//                firstPrime();
    }
    
    //233168
    private static void multiples(){
        //multiples of 3 and 5 between 1 - 100
        int num1 = 3;
        int num2 = 5;
        int res = 0;
        for(int i = 0; i < 1000; i++){
            if(i % num1 == 0 || i % num2 == 0){
                System.out.print(i + " ");
                res = res + i;
            }
            
        }
        System.out.println("\n"+res);
        //System.out.println("");
    }
    
    private static void fibonacci(){
        int num1 = 1;
        int num2 = 2;
        int temp;
        for(int i = 0; i <= 10; i++){
            
            System.out.println(num1);
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
            
        }
    }
    
    private static void fibonacciEven(){
        int x = 0; int y = 1; int z = x + y; int sumEven = 0;
        
        while(z < 4000000){
            x = y; y = z; z = x + y;
            if(z % 2 == 0){
                sumEven += z;
            }
        }
        System.out.println("Sum of even valued terms: " + sumEven);
    }
    
    private static void primeFactor(){
        long num = 600851475143L;
        for(int i = 2; i < num/i; i++){
            while(num % i == 0){
                System.out.printf("%d X %d, ", num, i);
                num = num/i;
            }
        }
        if(num > 1)
            System.out.println(num);
    }
    
    private static void prime(){
        int num = 9;
        boolean isPrime = true;
        int temp;
        for(int i = 2; i <= num/2; i++){
            temp = num % i;
            if(temp == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a prime Number");
        }
    }
    
    private static void permute(){
        String word = "MTO0A";
        String permute = "";
        permutation(word, permute);
   }
    
    private static void permutation(String word, String permute){
        if(word.length() == 0){
            System.out.println(permute);
        }
        
        for(int i = 0; i < word.length(); i++){
            char toAppend = word.charAt(i);
            String remaining = word.substring(0, i) + word.substring(i + 1);
            permutation(remaining, permute + toAppend);
        }
    }
    
    
    
    private static void palindrome(){
        String word = "hanna";
        String result = "";
        
        for(int i = word.length()-1; i >= 0; i--){
            char letter = word.charAt(i);
            result += letter;
        }
        System.out.println(result);
    }
    
    private static void checkDuplicate(){
        int[] array = {4, 8, 8, 4};
        
        for(int i = 0; i < array.length; i++){
            
            for(int j = i + 1; j < array.length; j++){
                if(array[i] == array[j]){
                    System.out.println("Duplicate Found j: " + array[j] + " i: " + array[i]);
                }
            }
        }
    }
    
    public static void factorial(){
        int num = 10;
        
        for(int i = num-1; i > 0; i--){
            num = num * i;
        }
        System.out.println("Factoral is " + num);
        String check = "opp";
        
        System.out.println(check.getClass().getName());
    }
    
    public static int factorial2(){
        int num = 3;
        
        if(num == 0){
            return 1;
        }
        
        int factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        
        return factorial;
        
    }
    
    public static int recursivefactorial(int num){
        
        if(num == 0){
            return 1;
        }
        
        return num * recursivefactorial(num - 1);
    }
    
    public static void reverseNum(){
        int num = 109;
        int reverseNum = 0;
        while(num != 0){
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num%10;
            num = num/10;
        }
        System.out.println(reverseNum);
    }
    
    public static void removeChar(){ 
        String letter = "ABC";
        char find = 'B';
        char[] character = letter.toCharArray();
        //char[] result = new char[character.length];
        String result = "";
        for(int i = 0; i < character.length; i++){
            char current = character[i];
            if(current != find){
                //result[i] = current;
                result += current;
            }
        }
        //String modified = Arrays.toString(result);
        //System.out.println(modified);
        System.out.println(result);
    }
    
    public static void search(){
        String letter = "ABC";
        int index = letter.indexOf("AB");
        if(index == -1){
            System.out.println("String Not Found");
        }else{
            System.out.println("String Found");
        }
    }
    
    public static void removeString(){
        String letter = "ABCD";
        
        String answer;
        int index = letter.lastIndexOf("BC");
        
        if(index == -1){
            System.out.println("No String Found to Replace");
        }else{
            answer = letter.substring(0, index) + letter.substring(index + 1);
            System.out.println(answer);
        }
        
    }
    
    public static void largestPalindrome() {
        int num = 0;
        
        for(int i = 100; i<1000; i++){
            for(int j = 100; j < 1000; j++){
                int check = j*i;
                
                //rerverse check
                int reversedValue = reverse(check);
                if(reversedValue == check){ //number is a palindrome
                    //System.out.println("Palindrome number: " + j + "X" + i + " = " + check);
                    num = Math.max(check, num);
                    break;
                }
            }
        }
        System.out.println("Largest : " + num);
    }
    
    public static int reverse(int num) {
        int reverse = 0;
        while(num != 0){
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        return reverse;
    }
    
    public static void firstPrime() {
        //104743    2, 3, 5, 7, 11, 13
        int sequence = 10001;
        int num = 2;
        int check = 0;
        int answer = 0;
        int temp;
        boolean isPrime = true;
        
        
        for (int i = 0; i < sequence; ) {
            for(int j = 2; j <= num/2; j++){
                //check for prime number
                temp = num%j;
                if(temp == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                num = Math.max(check, num);
                i++;
            }
            answer = num;
            isPrime = true;
            num++;
        }
        System.out.println(answer);
        
    }
    
    public static void smallestMultiple() {
        
    }
    
    
    //jdbc
    //converting a list to a linkedlist
    //revision collections
}

//600851475143   13195  ::: 5, 7, 13, 29
