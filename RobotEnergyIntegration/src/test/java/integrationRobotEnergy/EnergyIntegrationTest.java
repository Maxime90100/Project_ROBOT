package integrationRobotEnergy;

import org.junit.jupiter.api.*;
import robot.Robot;

public class EnergyIntegrationTest {
    private Robot robot;

    @BeforeEach
    public void setup(){
        robot = new Robot();
    }
    @Test
    public void testRobotDeployPanned(){
        int energy = robot.deployer(1);
        Assertions.assertEquals(10,energy);
    }
}
