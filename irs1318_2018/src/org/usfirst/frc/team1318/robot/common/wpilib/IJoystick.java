package org.usfirst.frc.team1318.robot.common.wpilib;

import edu.wpi.first.wpilibj.Joystick.AxisType;

public interface IJoystick
{
    double getAxis(AxisType relevantAxis);

    int getPOV();

    boolean getRawButton(int value);
}
