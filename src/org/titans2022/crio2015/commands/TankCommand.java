package org.titans2022.crio2015.commands;

import org.titans2022.crio2015.*;
import org.titans2022.crio2015.subsystems.TankSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class TankCommand extends Command{
	
	OI oi = Robot.oi;
	TankSubsystem tankSubsystem;
	
	public TankCommand() {
		requires(Robot.tankSubsystem);
		tankSubsystem = Robot.tankSubsystem;
	}	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		double speedModifier = 1;
		double right = oi.attack3.getYAxis();
		double left = oi.attack4.getYAxis();
		
		tankSubsystem.setLeftSpeed(left * speedModifier);
		tankSubsystem.setRightSpeed(right * speedModifier);
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.tankSubsystem.stop();
		
	}

	@Override
	protected void interrupted() {
		end();
	}

}
