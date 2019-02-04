import java.util.ArrayList;

public class Shiritori {
    private String[] game;

    public Shiritori(String[] game){
        this.game = game;
    }

    public ArrayList<String> thisGame(){
        public ArrayList<String> thisRound = new ArrayList<String>();
        for (int i = 0; i < game.length - 1; i++){
            thisRound.add(sample[i]);
            char last = sample[i].charAt(sample[i].length() - 1);
            char first = sample[i+1].charAt(0);
            if (first != last) {
                break;
            }
        }
        return thisRound;
    }
}
