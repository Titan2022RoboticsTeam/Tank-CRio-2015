package org.titans2022.crio2015.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.titans2022.crio2015.RobotMap;
import org.titans2022.crio2015.commands.TankCommand;

import edu.wpi.first.wpilibj.Talon;

public class TankSubsystem extends Subsystem {
	private Talon frontLeft, frontRight, backLeft, backRight;
	private double leftSpeed, rightSpeed;
	
	public TankSubsystem() {
		frontLeft = new Talon(RobotMap.frontLeftMotor);
		frontRight = new Talon(RobotMap.frontRightMotor);
		backLeft = new Talon(RobotMap.backLeftMotor);
		backRight = new Talon(RobotMap.backRightMotor);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankCommand());
	}
	
	public double getLeftSpeed() {
		return leftSpeed;
	}

	public double getRightSpeed() {
		return rightSpeed;
	}

	public void setLeftSpeed(double left) {
		leftSpeed = left;
		frontLeft.set(left);
		backLeft.set(left);
	}

	public void setRightSpeed(double right) {
		rightSpeed = right;
		frontRight.set(right);
		backRight.set(right);
	}
	
	public void stop() {
		frontRight.set(0);
		frontLeft.set(0);
		backRight.set(0);
		backLeft.set(0);
		rightSpeed = 0;
		leftSpeed = 0;
	}

}
