package exercism.java;

public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int timeInTheOven){
        return expectedMinutesInOven()-timeInTheOven;
    }
    

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layers){
        return layers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers, int timeInTheOven){
        return preparationTimeInMinutes(layers) + timeInTheOven;
    }

    public static void main(String[] args){
        Lasagna lasagna = new Lasagna();

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(20));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(3,20));
        
    }
}
