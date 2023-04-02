package energy;

import org.mockito.Mockito;

public class Energy {
    private final Energy fakeEnergyModule;
    private float chargeLevel;

    public Energy() throws EnergyException {
        fakeEnergyModule = Mockito.mock(Energy.class);
        Mockito.doAnswer((invocation) -> {
            long time = invocation.getArgument(0);
            chargeLevel += 10*time;
            this.replier();
            return null;
        }).when(fakeEnergyModule).deployer(Mockito.anyLong());
        Mockito.doAnswer((invocation) -> {
            double energy = invocation.getArgument(0);
            if(chargeLevel>=energy) chargeLevel-=energy;
            else throw new EnergyException();
            return null;
        }).when(fakeEnergyModule).give(Mockito.anyDouble());
    }

    public void deployer(long time) {
        fakeEnergyModule.deployer(time);
    }

    public void replier() {

    }

    public float getChargeLevel() throws EnergyException {
        return chargeLevel;
    }

    public void give(double neededEnergy) throws EnergyException {
        fakeEnergyModule.give(neededEnergy);
    }
}
