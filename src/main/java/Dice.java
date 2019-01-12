public class Dice {
    private int noOfDies;
   // private Bins bin;

    public Dice(int number){
        this.noOfDies = number;
       // bin = new Bins(noOfDies);
    }





    public int tossAndSum(){
        int sum = 0;
        for(int i=0;i<this.noOfDies;i++){
            int toss = (int)(Math.random()*6 + 1);
            ////bin.IncrementBin(toss);
            sum += toss;
        }
        return sum;
    }



}
