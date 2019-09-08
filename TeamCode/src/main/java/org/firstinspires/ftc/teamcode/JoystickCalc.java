package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class JoystickCalc {
    private OpMode opmode;

    double leftStickY;
    double leftStickX;
    double rightStickX;
    double rightStickY;
    boolean xButton;
    boolean yButton;
    boolean aButton;
    boolean bButton;

    public JoystickCalc(OpMode opmode){
        this.opmode = opmode;
    }
    public void calculate(){
         leftStickY = opmode.gamepad1.left_stick_y;
         leftStickX = opmode.gamepad1.left_stick_x;
         rightStickX = opmode.gamepad1.right_stick_x;
         rightStickY = opmode.gamepad1.right_stick_y;
         xButton = opmode.gamepad1.x;
         yButton = opmode.gamepad1.y;
         aButton = opmode.gamepad1.b;
         bButton = opmode.gamepad1.a;
    }

}
