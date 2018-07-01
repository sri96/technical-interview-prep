import java.util.*;

public class FizzBuzz{

    public static void main(String [] args){

    int loopVariable = 100;
        
    for(int outerIndexVariable = 1; outerIndexVariable <= loopVariable; outerIndexVariable++){
        if(outerIndexVariable%3==0 && outerIndexVariable%5 ==0){
            System.out.println("FizzBuzz" + "");
        }
        else if(outerIndexVariable%3 == 0){
            System.out.println("Fizz" + "");
        }
        else if(outerIndexVariable%5 ==0){
            System.out.println("Buzz" + "");
        }
        else{
            System.out.println(outerIndexVariable + "");
        }
    }
}
}