
public class TennisGame1 implements TennisGame {
    
    private int player1Score = 0;
    private int player2Score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {

        if (playerName == "player1")
            player1Score += 1;
        else
            player2Score += 1;
    }


    public String getScore() {

        String score;
//        int scoreDifference = player1Score - player2Score;

        if (ScoresAreEqual())
        {
            score = scoreForTie();
        }
        else if (anyScoreBiggerThanFour()){

            if (hasAdvantagePlayer1()) {
                score = advantageToString(player1Name);
            }
            else if (hasAdvantagePlayer2()) {
                score = advantageToString(player2Name);
            }
            else if (hasWonPlayer1()) {
                score = winToString(player1Name);
            } else {
                score = winToString(player2Name);
            }
        } else {

            score = nameFor(player1Score) + "-" + nameFor(player2Score);
         }
        return score;
    }

    private String scoreForTie() {
        String score;
        if (player1Score >= 3) {
            score = "Deuce";
        } else {
            score = nameFor(player1Score) + "-All";
        }
        return score;
    }

    private String winToString(String playerName) {
        return "Win for " + playerName;
    }

    private String advantageToString(String playerName) {
        return "Advantage " + playerName;
    }

    private boolean hasWonPlayer1() {
        return getPlayerScoreDifference() >= 2;
    }

    private boolean hasAdvantagePlayer2() {
        return getPlayerScoreDifference() == -1;
    }

    private boolean hasAdvantagePlayer1() {
        return getPlayerScoreDifference() == 1;
    }

    private int getPlayerScoreDifference() {
        return player1Score - player2Score;
    }

    private String getLeader() {
        int max = Math.abs()
    }

    private String nameFor(int playerScore) {
        String score = "";
        switch(playerScore) {

            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
        }
        return score;
    }

    private boolean ScoresAreEqual() {
        return player1Score == player2Score;
    }

    private boolean anyScoreBiggerThanFour() {
        return player1Score >=4 || player2Score >=4;
    }
}
