package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.RobotComponents.RobotWheels;

public class Robot {
    public RobotWheels robotWheels = new RobotWheels();
    public void init(HardwareMap hardwareMap, boolean resetEncoders){
        robotWheels.init(hardwareMap);
    }
}
