public class MethodChallenge {

    public static void main(String[] args) {
        int highScorePosition;

    }
    public static String displayHighScorePosition(String playerName, String playerPosition) {
        String message = ( playerName + "managed to get into position " + playerPosition + " on the high score list.");


        return message;
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000 ) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        }else {
            return 4;
        }

    }
}
