// Copyright (c) FIRST and other WPILib contributors.

// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivebase extends SubsystemBase
{
    private TalonSRX leftMotor1;
    private TalonSRX leftMotor2;
    private TalonSRX rightMotor1;
    private TalonSRX rightMotor2;
    
    /** Creates a new ExampleSubsystem. */
    public Drivebase()
    {
        leftMotor1 = new TalonSRX(3);
        leftMotor2 = new TalonSRX(4);
        rightMotor1 = new TalonSRX(1);
        rightMotor2 = new TalonSRX(2);
    }
    
    public void setThrottle(double leftThrottle, double rightThrottle)
    {
        leftMotor1.set(TalonSRXControlMode.PercentOutput, -leftThrottle);
        leftMotor2.set(TalonSRXControlMode.PercentOutput, -leftThrottle);
        rightMotor1.set(TalonSRXControlMode.PercentOutput, rightThrottle);
        rightMotor2.set(TalonSRXControlMode.PercentOutput, rightThrottle);
    }
    
    @Override
    public void periodic()
    {
        // This method will be called once per scheduler run
    }


    @Override
    public void simulationPeriodic()
    {
        // This method will be called once per scheduler run during simulation
    }
}
