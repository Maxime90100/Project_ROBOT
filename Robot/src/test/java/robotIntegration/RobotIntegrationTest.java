package robotIntegration;

import cartography.Coordinates;
import cartography.EspaceNonCartographieException;
import cartography.InaccessibleCoordinate;
import cartography.InaccessibleCoordinateException;
import energy.EnergyException;
import org.junit.jupiter.api.*;
import energy.Energy;
import robot.Robot;
import robot.UndefinedRoadbookException;
import robot.UnlandedRobotException;
import routeCalculation.RoadBook;
import routeCalculation.RoadBookCalculator;

import javax.print.attribute.standard.Destination;

public class RobotIntegrationTest {

    Robot robot;
    Energy energyModule;
    RoadBookCalculator roadBookCalculator;
    RoadBook roadBook;

    @BeforeEach
    public void init() throws EnergyException, InterruptedException {
        energyModule = new Energy();
        roadBookCalculator = new RoadBookCalculator();
        roadBook = new RoadBook();
        robot = new Robot(energyModule,roadBookCalculator,roadBook);
        robot.deployerPanneaux(1);
    }

    @Test
    public void testRoadBook() throws UndefinedRoadbookException, UnlandedRobotException {
        Assertions.assertFalse(robot.getRoadBook().hasInstruction());
        robot.computeRoadTo(new Coordinates(1,1),1);
        Assertions.assertTrue(robot.getRoadBook().hasInstruction());
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
