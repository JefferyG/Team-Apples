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
        lb.setDirection(DcMotorSimple.Direction.REVERSE);
        lf.setDirection(DcMotorSimple.Direction.REVERSE);

    }


    @Override
    public void loop() {
        if (Math.abs(gamepad1.left_stick_x) {
            lb.setPower(gamepad1.left_stick_y);
            lf.setPower(gamepad1.left_stick_y);
            rb.setPower(gamepad1.left_stick_y);
            rf.setPower(gamepad1.left_stick_y);
    }
    }

    @Override
    public void stop() {

    }
    

}


