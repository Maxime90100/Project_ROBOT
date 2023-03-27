package robot;

import cartography.*;
import energy.*;
import routeCalculation.*;

import java.util.List;

public class Robot {

    Energy energyModule;

    public Robot(Energy energyModule) {
        this.energyModule = energyModule;
    }

    public void land(Coordinates landPosition, LandSensor sensor) throws LandSensorDefaillance {

    }
    public void moveForward() throws UnlandedRobotException, InaccessibleCoordinate, EspaceNonCartographieException, EnergyException {

    }
    public void moveBackward() throws UnlandedRobotException, InaccessibleCoordinate, EspaceNonCartographieException, EnergyException {

    }
    public void turnLeft() throws UnlandedRobotException, EnergyException {

    }
    public void turnRight() throws UnlandedRobotException, EnergyException {

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
