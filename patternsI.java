public class patternsI{
    public static void main (String args []){
        /* Print STAR Pattern
        *
        **
        ***
        ****
        for (int line = 1; line <= 4; line ++){
            //one line
            for (int star = 1; star <= line; star ++){
                System.out.print("*");
            }
            //move to next line
            System.out.println();
        }
        */

       /* Inverted STAR pattern
       ****
       ***
       **
       *
       for (int line = 1; line <= 4; line ++){
        for (int star = 1; star <= 4 - line + 1; star ++){
            System.out.print("*");
        }
        System.out.println();
       }
       */
       
       /* HAlf Pyramid Pattern
       1
       12
       123
       1234
       for (int line = 1; line <= 4; line++){
        for (int number = 1; number <= line; number ++){
            System.out.print(number);
        }
        System.out.println();
       }
       */

      /* Character pattern
      A
      BC
      DEF
      GHIJ
       int n = 4;
       char ch = 'A';
       for (int line = 1; line <= n; line ++){
        for (int chars = 1; chars <= line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
       }
       */

    }
}