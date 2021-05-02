package techex;

public class DecisionMaking {
    public static void main(String[] args) {
        // if-else
        // Find whether user can vote by his age
        int age = 15;

        if(age > 18){
            System.out.println("User can vote");
        }else{
            System.out.println("User can't vote");
        }


        // if-else if
        // Find the grade by marks
        int marks = 64;

        if(marks > 75){
            System.out.println("A");
        }else if(marks > 65){
            System.out.println("B");
        }else if(marks > 55){
            System.out.println("C");
        }else{
            System.out.println("F");
        }


        // switch-case
        // print what action to do by the color light

        String color = "red";

        switch(color){
            case "green":
                System.out.println("GO");
                break;
            case "yellow":
                System.out.println("READY");
                break;
            case "red":
                System.out.println("STOP");
                break;
            default:
                System.out.println("Obey the policeman");
        }

    }
}
