package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI
{
    Joystick leftStick;
    Joystick rightStick;
    
    public OI()
    {
        leftStick = new Joystick(0);
        rightStick = new Joystick(1);
    }
    
    public double getLeftY()
    {
        return leftStick.getY();
    }
    
    public double getRightY()
    {
        return rightStick.getY();
    }
}
