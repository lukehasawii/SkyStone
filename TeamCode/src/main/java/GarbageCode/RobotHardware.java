package GarbageCode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

public class RobotHardware {

    /* Public OpMode members. */
    private Servo testServo;
    public DcMotor leftDriveForwards   = null;
    public DcMotor rightDriveForwards  = null;
    public DcMotor leftDriveBackwards  = null;
    public DcMotor rightDriveBackwards  = null;

    public DcMotor  leftArm     = null;
    public Servo leftClaw    = null;
    public Servo    rightClaw   = null;

    public static final double MID_SERVO       =  0.5 ;
    public static final double ARM_UP_POWER    =  0.45 ;
    public static final double ARM_DOWN_POWER  = -0.45 ;

    /* local OpMode members. */
    HardwareMap hwMap           =  null;
    HardwareMap constructorHwMap   =  null;

    private ElapsedTime period  = new ElapsedTime();

    /* Constructor */
   // public RobotHardware(HardwareMap hardWareMap){
    public RobotHardware(HardwareMap hardWareMap){
  //  constructorHwMap = hardWareMap;

    }
    /* Initialize standard Hardware interfaces */
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        leftDriveForwards  = hwMap.get(DcMotor.class, "left_drive_forwards");
        rightDriveForwards = hwMap.get(DcMotor.class, "right_drive_forwards");
        leftDriveBackwards  = hwMap.get(DcMotor.class, "left_drive_backwards");
        rightDriveBackwards = hwMap.get(DcMotor.class, "right_drive_backwards");

        leftArm    = hwMap.get(DcMotor.class, "left_arm");
        leftDriveForwards.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        leftDriveBackwards.setDirection(DcMotor.Direction.FORWARD); // Set to REVERSE if using AndyMark motors
        rightDriveForwards.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors
        rightDriveBackwards.setDirection(DcMotor.Direction.REVERSE);// Set to FORWARD if using AndyMark motors

        // Set all motors to zero power
        leftDriveBackwards.setPower(0);
        leftDriveForwards.setPower(0);
        rightDriveBackwards.setPower(0);
        rightDriveForwards.setPower(0);
        leftArm.setPower(0);

        // Set all motors to run without encoders.
        // May want to use RUN_USING_ENCODERS if encoders are installed.
        leftDriveForwards.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDriveForwards.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        rightDriveBackwards.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        leftDriveBackwards.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        leftArm.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        // Define and initialize ALL installed servos.
        leftClaw  = hwMap.get(Servo.class, "left_hand");
        rightClaw = hwMap.get(Servo.class, "right_hand");
        leftClaw.setPosition(MID_SERVO);
        rightClaw.setPosition(MID_SERVO);
    }

}
