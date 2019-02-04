import java.util.ArrayList;

public class Shiritori {
    public String[] game;

    public Shiritori(String[] game){
        this.game = game;
    }

    public ArrayList<String> thisGame(){;
        ArrayList<String> thisRound = new ArrayList<String>();
        for (int i = 0; i < game.length - 1; i++){
            thisRound.add(game[i]);
            char last = game[i].charAt(game[i].length() - 1);
            char first = game[i+1].charAt(0);
            if (first != last) {
                break;
            }
        }
        return thisRound;
    }
}
