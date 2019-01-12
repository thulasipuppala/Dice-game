import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bins {


    private int min, max;
    private Map<Integer, Integer> bins;
    private int noOfDies;

    public Map<Integer, Integer> getBins() {
        return bins;
    }

    public Bins(int noOfDies){
        min= noOfDies;
        max = noOfDies*6;
        bins = new HashMap<Integer, Integer>();
        this.noOfDies = noOfDies;


        //bins = new int[((noOfDies*6)-noOfDies)+1];
        createBins();
    }

    private void createBins(){
        for(int i=min; i<=max;i++)
        {
            bins.put(i,0);
        }
    }

    public void IncrementBin(int toss){

       if(bins.containsKey(toss)){
           int value = bins.get(toss);
           bins.put(toss,value+1);
       }

    }

    public int getBin(int toss){

        if(bins.containsKey(toss)){
            return bins.get(toss);
        }
        return 0;
    }




}
