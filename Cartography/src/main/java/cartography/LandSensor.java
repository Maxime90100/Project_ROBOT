package cartography;

public class LandSensor {

    public double getPointToPointEnergyCoefficient(Coordinates coordinate1, Coordinates coordinate2) throws InaccessibleCoordinate, EspaceNonCartographieException {
        return 0;
    }
    public boolean isAccessible(Coordinates coordinates) {
        return false;
    }
    public void cartographier(Coordinates currentPosition) throws LandSensorDefaillance {

    }
    public LandMap getCarte() {
        return null;
    }

}
