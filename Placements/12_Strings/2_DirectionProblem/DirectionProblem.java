//Find the shortest path to reach the destination
//WNSEEWNESNES
import java.util.*;

public class DirectionProblem {
    public static void shortestDistance(String input){
        String cleanInput = input.replaceAll(" ","").toUpperCase();

        int x = 0;
        int y = 0;

        for(int i = 0; i < cleanInput.length(); i++){
            char dir = cleanInput.charAt(i);
            
            if(dir == 'N'){
                x++;
            }
            else if(dir == 'S'){
                x--;
            }
            else if(dir == 'E'){
                y++;
            }
            else if(dir == 'W'){
                y--;
            }
            else{
                System.out.println("Invalid input.");
            }
        }

        System.out.println("(x,y): " + "("+ x + "," + y + ")");

        //Calculating the Displacement

        double displacement = Math.sqrt((x*x)+(y*y));

        System.out.println("The shortest distance is: " + displacement);
    }   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        shortestDistance(inputString);

        sc.close();
    }
}

