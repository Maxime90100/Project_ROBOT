package robot;

import energy.Energy;
import org.mockito.Mockito;

public class Robot {
    
    Robot fakeRobot;
    Energy energyModule;

    public Robot(Energy energyModule) {
        this.fakeRobot = Mockito.mock(Robot.class);
        this.energyModule = energyModule;
    }

    public void deployerPanneaux(long time) {
        energyModule.deployer(time);
    }

    public float getChargeLevel(){
        return energyModule.getChargeLevel();
    }
}
