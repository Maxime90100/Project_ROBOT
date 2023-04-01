package integrationRobotEnergy;

import energy.EnergyException;
import org.junit.jupiter.api.*;
import energy.Energy;
import robot.Robot;

public class EnergyIntegrationTest {

    Robot robot;

    @BeforeEach
    public void init(){
        Energy energyModule = new Energy();
        robot = new Robot(energyModule);
    }
    @Test
    public void testRobotDeployPanned() throws InterruptedException, EnergyException {
        robot.deployerPanneaux(1);
        Assertions.assertEquals(10, robot.getChargeLevel());
    }
}
