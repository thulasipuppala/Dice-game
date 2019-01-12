public class MainApplication {

    public static void main(String[] args) {

        Dice dice = new Dice(2);
        Bins bins = new Bins(2);

        Simulation simulation = new Simulation(2,1000000, dice, bins);

        simulation.runSimulation();

        simulation.printBinValues();


    }
}
