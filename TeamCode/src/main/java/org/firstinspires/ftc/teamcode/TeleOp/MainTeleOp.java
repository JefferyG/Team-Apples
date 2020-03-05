package org.firstinspires.ftc.teamcode.TeleOp;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;


@TeleOp(name = "MainTeleOp", group = "Apples")
public class MainTeleOp extends OpMode {

    private ElapsedTime runtime = new ElapsedTime();

    DcMotor lb;
    DcMotor lf;
    DcMotor rb;
    DcMotor rf;

    @Override
    public void init() {
        lb = hardwareMap.dcMotor.get("lb");
        lf = hardwareMap.dcMotor.get("lf");
        rb = hardwareMap.dcMotor.get("rb");
        rf = hardwareMap.dcMotor.get("rf");
        lb.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        lf.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rb.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rf.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rb.setDirection(DcMotorSimple.Direction.REVERSE);
        rf.setDirection(DcMotorSimple.Direction.REVERSE);

    }


    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_y) > .1) {
            lb.setPower(gamepad1.left_stick_y);
            lf.setPower(gamepad1.left_stick_y);
            rb.setPower(gamepad1.left_stick_y);
            rf.setPower(gamepad1.left_stick_y);
      } else {
            lb.setPower(0);
            lf.setPower(0);
            rb.setPower(0);
            rf.setPower(0);
        }
        if ((gamepad1.right_stick_x) >.1) {
            lb.setPower(0.75);
            lf.setPower(0.75);
        } else {
            lb.setPower(0);
            lf.setPower(0);
        }
       if ((gamepad1.right_stick_x)< -.1) {
           rb.setPower(0.75);
           rf.setPower(0.75);
       } else {
           rb.setPower(0);
           rf.setPower(0);
        }
    }

    @Override
    public void stop() {

    }


}
