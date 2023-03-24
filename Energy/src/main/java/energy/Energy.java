package energy;

import org.mockito.Mockito;

public class Energy {
    private final Energy fakeEnergyModule;
    private float chargeLevel;

    public Energy() {
        fakeEnergyModule = Mockito.mock(Energy.class);
        Mockito.doAnswer((invocation) -> {
            long time = invocation.getArgument(0);
            chargeLevel += 10*time;
            return null;
        }).when(fakeEnergyModule).deployer(Mockito.anyLong());
    }

    public void deployer(long time) {
        fakeEnergyModule.deployer(time);
    }

    public float getChargeLevel() {
        return chargeLevel;
    }
}
