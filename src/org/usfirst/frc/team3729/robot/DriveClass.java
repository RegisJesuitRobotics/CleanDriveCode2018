package org.usfirst.frc.team3729.robot;

import java.util.Date;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveClass {
	PlayStationController playStation;
	PortMap Map;
	// AutoCalledMethods Auto;

	public DriveClass(PlayStationController playStation) {
		Map = PortMap.getInstance();

	}

	// THESE ARE THE TELEOP METHODS THEY'RE CALLED IN ROBOT.JAVA UNDER TELEOP
	// PERIODIC
	public void TeleOpDrive() {
		double deadZone = 0.1;
		
		// Gas is right trigger
		// Direction of driving is left thumbstick		
		double gas=playStation.GetRightTrigger();
		double forwardOrReverse=playStation.GetLeftSTickAxisY();
		double leftOrRight=playStation.GetLeftStickAxisX();
		
		
		/*
		double RightTrigger = playStation.GetRightTrigger();
		double LeftTrigger = playStation.GetLeftTrigger();
		double LeftStick = playStation.GetLeftStickAxisX();
		double Deadzone = 0.1;
		double RightPower;
		double LeftPower;
		double Power;
		double Limiter = 1;
		double turn = 2 * LeftStick;
		Power = RightTrigger - LeftTrigger;
		// System.out.println("left"+LeftStick);
		if (LeftStick > Deadzone) {

			RightPower = Power - (turn * Power);
			LeftPower = Power;
		} else if (LeftStick < -Deadzone) {

			LeftPower = Power + (turn * Power);
			RightPower = Power;
		} else {
			LeftPower = Power;
			RightPower = Power;
		}

		Map.LeftDriveMotorFront.set(-LeftPower * Limiter * SideCompensation);
		Map.RightDriveMotorFront.set(RightPower * Limiter);
		Map.RightDriveMotorBack.set(RightPower * Limiter);
		Map.LeftDriveMotorBack.set(-LeftPower * Limiter * SideCompensation);
		*/
	}
}