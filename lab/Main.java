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
    int X = (int)Math.round(Math.random() * (59 - 0) + 0);
    System.out.println(X);
    
    int n = 0;

    if( X <= 15){
        n = 1;
    } else if (X >= 16 && X <=30){
        n = 2;
    } else if (X >= 31 && X <=45){
        n = 3;
    } else if(X >= 46&& X <=59){
        n = 4;
    }

    switch(n){
        case 1:
            System.out.println("Перша чверть");
            break;
        case 2:
            System.out.println("Друга чверть");
            break;
        case 3:
            System.out.println("Третя чверть");
            break;
        case 4:
            System.out.println("Четверта чверть");
            break;
        default:
            System.out.println("Помилка");
    }}

    }


