package integrationRobotEnergy;

import cartography.EspaceNonCartographieException;
import cartography.InaccessibleCoordinate;
import cartography.InaccessibleCoordinateException;
import energy.EnergyException;
import org.junit.jupiter.api.*;
import energy.Energy;
import robot.Robot;
import robot.UnlandedRobotException;
import routeCalculation.RoadBookCalculator;

public class RobotIntegrationTest {

    Robot robot;
    Energy energyModule;
    RoadBookCalculator roadBookCalculator;

    @BeforeEach
    public void init() throws EnergyException, InterruptedException {
        energyModule = new Energy();
        roadBookCalculator = new RoadBookCalculator();
        robot = new Robot(energyModule,roadBookCalculator);
        robot.deployerPanneaux(1);
    }
    @Test
    public void testRobotDeployPanned() throws EnergyException {
        Assertions.assertEquals(10, robot.getChargeLevel());
    }

    @Test
    public void testMoveForward() throws EnergyException, UnlandedRobotException, EspaceNonCartographieException, InaccessibleCoordinate {
        float baseCharge = robot.getChargeLevel();
        robot.moveForward();
        Assertions.assertEquals(baseCharge-10, robot.getChargeLevel());
        Assertions.assertThrows(EnergyException.class , ()-> robot.moveForward());
    }

    @Test
    public void testMoveBackWard() throws EnergyException, UnlandedRobotException, InaccessibleCoordinateException, EspaceNonCartographieException, InaccessibleCoordinate {
        float baseCharge = robot.getChargeLevel();
        robot.moveBackward();
        Assertions.assertEquals(baseCharge-10, robot.getChargeLevel());
        Assertions.assertThrows(EnergyException.class , ()-> robot.moveBackward());

    }

    @Test
    public void testTurnLeft() throws EnergyException, UnlandedRobotException {
        float baseCharge = robot.getChargeLevel();
        robot.turnLeft();
        Assertions.assertEquals(baseCharge-10, robot.getChargeLevel());
    }

    @Test
    public void testTurnRight() throws EnergyException, UnlandedRobotException {
        float baseCharge = robot.getChargeLevel();
        robot.turnRight();
        Assertions.assertEquals(baseCharge-10, robot.getChargeLevel());
    }
}
