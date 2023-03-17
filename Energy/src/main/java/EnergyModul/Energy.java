package EnergyModul;

public class Energy {
    private float chargeLevel;
    private boolean deployed;
    public void deployer(long time) {
        this.deployed = true;
        System.out.println("Deploying solar panels for " + time + " seconds...");
        long endTime = System.currentTimeMillis() + time*1000; // calculate end time in milliseconds
        int rechargeRate = 10; // units per second
        while (System.currentTimeMillis() < endTime) {
            this.chargeLevel += rechargeRate;
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fold solar panels... current level: " + this.chargeLevel);
        replier();
    }
    public void replier(){
        this.deployed = false;
    }
    public float getChargeLevel() throws EnergyException {
        if (this.deployed)
            throw new EnergyException("Device is deployed");
        return this.chargeLevel;
    }
    public void give(double neededEnergy) throws EnergyException{
        if(this.deployed)
            throw new EnergyException("Device is deployed");
        if(neededEnergy > this.chargeLevel)
            throw new EnergyException("Energy requested cannot be supplied");
        this.chargeLevel -= neededEnergy;
    }
}
