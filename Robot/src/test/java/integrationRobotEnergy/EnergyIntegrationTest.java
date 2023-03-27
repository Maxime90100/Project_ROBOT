package integrationRobotEnergy;

import energy.EnergyException;
import org.junit.jupiter.api.*;
import energy.Energy;
import robot.Robot;

public class EnergyIntegrationTest {
    @Test
    public void testRobotDeployPanned() throws InterruptedException, EnergyException {
        Energy energyModule = new Energy();
        Robot robot = new Robot(energyModule);
        robot.deployerPanneaux(1);
        Assertions.assertEquals(10, robot.getChargeLevel());
    }
}
