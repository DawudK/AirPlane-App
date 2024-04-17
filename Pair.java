package AirPlane;

public class Pair <Y, N>{

    public static void myHeader(int a){//create header method
        System.out.println("=======================================================");
        System.out.println("Welcome to the Dawud Airlines!");
        System.out.println("=======================================================");
    }

    public static void myFooter(int a){// creates a footer method
        System.out.println("=======================================================");
        System.out.println("Thank you for choosing Dawud Airlines");
        System.out.println("=======================================================");
    }

    private Y key; //create a private variables of type Y and N called key
    private N value;

    public Pair(Y key, N value){ //instantiating the values key and value
        this.key= key;
        this.value = value;
    }

    public void  setKey(Y key){// making setter methods
        this.key = key;
    }// setters
    public void setValue(N value){
        this.value = value;
    }


    public Y getKey(){// making getting methods
        return key;
    }// getters
    public N getValue(){
        return value;
    }

    @Override
    public String toString() {// overridden toString method
        return "[YR: " + key + ", NM: " + value + "]";


    }
}
