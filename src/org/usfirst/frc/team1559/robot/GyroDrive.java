package org.usfirst.frc.team1559.robot;
import  edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;

public class GyroDrive extends RobotDrive {
	Gyro g;
	Joystick joy;
	public GyroDrive(SpeedController frontLeftMotor, SpeedController rearLeftMotor,
            SpeedController frontRightMotor, SpeedController rearRightMotor){
		super(frontLeftMotor,  rearLeftMotor, frontRightMotor,  rearRightMotor);
		g = new Gyro(Wiring.GYRO_ID);
		joy = new Joystick(0);
		
	}
	public void mecGyroDrive(double x, double y, double initRotation, double gyroAngle){
		double rotation = (-g.getAngle()*.03);
		super.mecanumDrive_Cartesian(x, y, rotation, gyroAngle);
		
	}
}
