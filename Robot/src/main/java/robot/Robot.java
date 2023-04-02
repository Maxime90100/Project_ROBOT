package robot;

import cartography.*;
import energy.*;
import routeCalculation.*;

import java.util.List;

public class Robot {

    Energy energyModule;
    RoadBookCalculator roadBookCalculator;

    public Robot(Energy energyModule, RoadBookCalculator roadBookCalculator) {
        this.energyModule = energyModule;
        this.roadBookCalculator = roadBookCalculator;
    }

    public void land(Coordinates landPosition, LandSensor sensor) throws LandSensorDefaillance {

    }
    public void moveForward() throws UnlandedRobotException, InaccessibleCoordinate, EspaceNonCartographieException, EnergyException {
        energyModule.give(10);
    }
    public void moveBackward() throws UnlandedRobotException, InaccessibleCoordinate, EspaceNonCartographieException, EnergyException {
        energyModule.give(10);
    }
    public void turnLeft() throws UnlandedRobotException, EnergyException {
        energyModule.give(10);
    }
    public void turnRight() throws UnlandedRobotException, EnergyException {
        energyModule.give(10);
    }
    public int getXposition() throws UnlandedRobotException {
        return 0;
    }
    public int getYposition() throws UnlandedRobotException {
        return 0;
    }
    public RoadBookCalculator.Direction getDirection() throws UnlandedRobotException {
        return null;
    }
    public List<CheckPoint> letsGo() throws UnlandedRobotException, UndefinedRoadbookException, InaccessibleCoordinate, EspaceNonCartographieException, EnergyException {
        return null;
    }
    public void computeRoadTo(Coordinates destination, int mode) throws UnlandedRobotException, UndefinedRoadbookException, ImpraticableRoadException {

    }
    public void cartographier() throws LandSensorDefaillance, UnlandedRobotException {

    }
    public RoadBook getRoadBook() {
        return null;
    }
    public LandMap getMap() throws UnlandedRobotException {
        return null;
    }
    public LandMap.Land getLandNature(Coordinates coordinate) throws EspaceNonCartographieException {
        return null;
    }
    public void deployerPanneaux(long time) throws InterruptedException, EnergyException {
        energyModule.deployer(time);
    }
    public void replierPanneaux() throws EnergyException {

    }
    public float getChargeLevel() throws EnergyException {
        return energyModule.getChargeLevel();
    }
}
