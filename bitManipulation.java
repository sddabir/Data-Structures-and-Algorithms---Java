public class bitManipulation{
    /*
    public static void main (String args[]){
        System.out.print(5 & 6); //binary operator AND & returns 1 only if 1 & 1. else returns 0
    }
    */
   /*
   public static void main (String args[]){
        System.out.print(5 | 6); //binary operator OR | returns 0 only if 0 | 0. else returns 1
    }
    */
   /*
   public static void main (String args[]){
        System.out.print(5 ^ 6); //binary operator XOR ^ returns 0 only if 0 ^ 0 and 1 ^ 1. else returns 1
    }
    */
    /*
    public static void main (String args[]){
        System.out.println(~5); //binary operator One's complement ~ returns 0 if 1 and 1 if 0. if MSB (leftmost bit) is 0 then positive no. if MSB = 1 then negative
        System.out.println(~0); //to find out binary number use 2's complement for details refer notes
    }
    */

    //left shift
    /*
    public static void main (String args[]){
        System.out.println(5<<2);
    }
    */

    //right shift
    /*
    public static void main (String args[]){
        System.out.println(6>>1);
    }
    */

    public static void oddEven (int n){
        int bitMask = 1;
        if ((n & bitMask)==0){
            //even number (LSB of even is 0 amd if we do & of n & 1 if LSB of n is 0 we will get 0, if LSB of n is 1 we will get 1)
            System.out.println("The number is even");
        }
        else{ //odd (n & 1 = 1 i.e LSB of n is also 1)
            System.out.println("The number is odd");
        }
    }

    public static void main (String args[]){
        oddEven(3);
        oddEven(11);
        oddEven(14);
    }

}