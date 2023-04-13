package lab;


public class Main {
    public static void main(String[] args){
    System.out.println("input number");
    Count num = new Count();
    double x = num.x;
    double y = 0;

    if( x < 0){
        y = Math.pow( Math.sin(x),2) -  Math.pow(Math.cos(x),2);
    } else if( 0 <=x && x <= 2){
        y = Math.log(3*x + 2);
    } else if(x > 2){
        y = Math.pow(x,2) - Math.pow(x,3);
    }

    System.out.println(y);
    }
}
