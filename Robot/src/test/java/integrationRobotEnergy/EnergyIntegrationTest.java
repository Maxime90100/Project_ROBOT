package integrationRobotEnergy;

import org.junit.jupiter.api.*;
import energy.Energy;
import robot.Robot;

public class EnergyIntegrationTest {
    private Robot robot;

    @BeforeEach
    public void setup() {
        Energy energyModule = new Energy();
        robot = new Robot(energyModule);
    }
    @Test
    public void testRobotDeployPanned() {
        /*robot.deployerPanneaux(1);
        robot.getChargeLevel();
        Assertions.assertEquals(10, robot.getChargeLevel());*/
    }
}
