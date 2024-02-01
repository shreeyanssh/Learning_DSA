public class GameOver{
    public static void main(String[] args){

        displayHighScorePosition("Shreyansh" , calculateHighScorePosition(1500));

        displayHighScorePosition("Ram" , calculateHighScorePosition(900));

        displayHighScorePosition("Sam" , calculateHighScorePosition(400));

        displayHighScorePosition("Tim" , calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int calculateHighScorePosition){
        System.out.println(playerName + " managed to get into position " + calculateHighScorePosition + 
        " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }
         else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }
        else{
            return 4;
        }
    }
}