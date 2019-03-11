package day5;

public class Test {

    // variables
    int number1;
    int number2;
    int number3;

    //default Constructor
    public Test (){

     }

    //constractor overloading
    public Test(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int multiply (){
        return this.number1 * this.number2 * this.number3 ;
    }
}
