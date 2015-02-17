package org.usfirst.frc.team1559.robot;
public class Wiring{
	
	//driving
	public static final int JOYSTICK_1 = 0;
	public static final int JOYSTICK_2 = 1;
	public static final int LEFT_FRONT_MOTOR_ID = 9;
	public static final int LEFT_REAR_MOTOR_ID = 6;
	public static final int RIGHT_FRONT_MOTOR_ID = 8;
	public static final int RIGHT_REAR_MOTOR_ID = 7;
	public static final double STUPID_CHASSIS_CORRECTION = -.023;
	public static final double STUPID_CHASSIS_SIDEWAYS = -.05;
	public static final double AUTO_SPEED = 1;
	public static final double MAX_SPEED = .625;

	//sensors
	public static final int GYRO_ID = 0;
	public static final int SONAR_ID = 1;

	//lifter
	public static final int LIFTER_JAGUAR_VALUE = 15;
	public static final double TOTE_HEIGHT = 32.0;
	public static final double DRIVE_HEIGHT = 8.74;
	public static double GATHERER_HEIGHT = 25; //11.54
	public static final int LEFT_GATHER_MOTOR = 4;
	public static final int RIGHT_GATHER_MOTOR = 5;
	public static final int GATHER_ARMS_IN = 0;
	public static final int GATHER_ARMS_OUT = 1;
	
	//gatherer
	public static final double GATHER_IN_SPEED = .4;
	public static final double GATHER_OUT_SPEED = .5;
	public static final double GATHER_ROTATE_SPEED = .5;

	//pixy
	public static final int PIXY_HALF_BAND = 3;
	
	//controls!
	public static final int GATHER_IN_BUT = 4;
	public static final int GATHER_OUT_BUT = 3;
	public static final int WINGS_BUT = 6;
	public static final int RESET_GYRO_BUT = 7;
	public static final int COPILOT_T1 = 5;
	public static final int COPILOT_T2 = 6;
	public static final int COPILOT_T3 = 7;
	public static final int COPILOT_T4 = 8;
	public static final int COPILOT_T5 = 9;
	public static final int COPILOT_T6 = 10;
	public static final int COPILOT_T7 = 11;
	public static final int COPILOT_T8 = 12;
	public static final int COPILOT_RED_LIGHT = 2;
	public static final int COPILOT_TRIGGER = 1;
	public static final int PILOT_ROTATE_RIGHT = 11;
	public static final int PILOT_ROTATE_LEFT = 12;
}