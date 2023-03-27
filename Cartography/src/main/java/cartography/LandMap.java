package cartography;

public class LandMap {
    public enum Land {Terre,Roche,Boue,Sable,Infranchissable}

    public Land getLandNature(Coordinates coordinates) throws EspaceNonCartographieException, InaccessibleCoordinateException, LandSensorDefaillance {
        return Land.Boue;
    }
}
