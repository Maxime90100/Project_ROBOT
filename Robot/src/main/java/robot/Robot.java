package robot;

import org.mockito.Mockito;

public class Robot {
    private final Robot fakeRobot;

    public Robot(){
        fakeRobot = Mockito.mock(Robot.class);
        Mockito.when(deployer(1)).thenReturn(10);
    }

    public int deployer(long time){ return fakeRobot.deployer(time);}
}
