package routeCalculation;

import cartography.LandSensor;
import cartography.Coordinates;

public class RoadBookCalculator {
    public enum Direction {NORTH,WEST,SOUTH,EAST}

    public RoadBook calculateRoadBook(Direction direction, LandSensor sensor, Coordinates position, Coordinates destination, int mode){
        return null;
    }

    public Coordinates nextForwardPosition(Coordinates position, Direction direction) {
        return position;
    }

    public Coordinates nextBackwardPosition(Coordinates position, Direction direction) {
        return position;
    }

    public Direction counterclockwise(Direction direction) {
        return direction;
    }

    public Direction clockwise(Direction direction) {
        return direction;
    }
}
