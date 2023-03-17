package EnergyModulTest;

import EnergyModul.Energy;
import EnergyModul.EnergyException;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class EnergyTest {

    @Test
    public void testDeployer() {
        Energy energy = mock(Energy.class);
        energy.deployer(5);
        verify(energy, times(1)).deployer(5);
    }

    @Test
    public void testReplier() {
        Energy energy = mock(Energy.class);
        energy.replier();
        verify(energy, times(1)).replier();
    }

    @Test
    public void testGetChargeLevel() throws EnergyException {
        Energy energy = mock(Energy.class);
        when(energy.getChargeLevel()).thenReturn(50.0f);
        assert(energy.getChargeLevel() == 50.0f);
        verify(energy, times(1)).getChargeLevel();
    }

    @Test
    public void testGive() throws EnergyException {
        Energy energy = mock(Energy.class);
        energy.give(10.0);
        verify(energy, times(1)).give(10.0);
    }
}

