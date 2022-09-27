package reverse.hack;

import java.util.Stack;

public class StackGame {
    public void gameStack(int a, int b, int c, int d,int r){
        //Using Stack
        Stack num = new Stack<>();
        Object[] oprat = new Object[]{"+","-","*","/"};
        /* Create a number stack and oparator array.
        for input perform the oparation by using operator array.
        if any possibility is there don't go for next operator array.
        otherwise continue the process  by left rotate the operator array continue the same process
         */
        Stack op2 = new Stack<>();
        Stack op3 = new Stack<>();
        Stack op4 = new Stack<>();
        Stack op5 = new Stack<>();
        Stack op6 = new Stack<>();Stack op7 = new Stack<>();
        num.push(a);
        num.push(b);
        num.push(c);
        num.push(d);



    }
}
