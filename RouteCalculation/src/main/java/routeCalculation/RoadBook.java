package routeCalculation;

import java.util.ArrayList;

public class RoadBook {

    public enum Instruction {TURNLEFT,BACKWARD,TURNRIGHT,FORWARD}

    public ArrayList<Instruction> instructions;

    public RoadBook(){
        this.instructions = new ArrayList<Instruction>();
    }
    public boolean hasInstruction(){
        return this.instructions.size() > 0;
    }

    public Instruction next(){
        return null;
    }
}
