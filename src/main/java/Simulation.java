import java.util.Map;
import java.util.Set;

public class Simulation {

private int diceNum;
private int tossNum;
private Dice dice;
private Bins bin;

    public Simulation(int diceNum, int tossNum, Dice dice, Bins bin) {
        this.diceNum = diceNum;
        this.tossNum = tossNum;
        this.dice = dice;
        this.bin = bin;

    }


    public void runSimulation(){
        for(int i = 0; i < tossNum; i++){
             bin.IncrementBin(dice.tossAndSum());
        }
    }


    public void printBinValues(){
        runSimulation();

        StringBuilder sb = new StringBuilder();
        sb.append("**\nSimulation of " + diceNum + " dice tossed for " + tossNum + " times.\n** \n\n\n");

        Map<Integer,Integer> map = bin.getBins();
        Set<Integer> keySet = map.keySet();



        for(Integer key : keySet){
            sb.append(String.format("%3d : " + "%8d : " + "%.2f", key, map.get(key), (double)map.get(key)/(double)tossNum * 100.0));
            sb.append("\t");
           // int starCount = (int) ((map.get(key)/tossNum) * 100);
            for (int i = 0; i < (double)map.get(key)/(double)tossNum * 100.0; i++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        sb.append("\n");

        System.out.println(sb.toString());


    }

}
