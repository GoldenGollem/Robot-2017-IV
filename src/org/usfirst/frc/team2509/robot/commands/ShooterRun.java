package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.OI;
import org.usfirst.frc.team2509.robot.Robot;
import org.usfirst.frc.team2509.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterRun extends Command {
	private Shooter SHOOT = Robot.shooter;
	private double TargetSpeed = OI.SPEED;
    public ShooterRun() {
    	requires(SHOOT);
    }

    protected void initialize() {
    	SHOOT.StartShooter(TargetSpeed);
    	Timer.delay(0.5);
    	SHOOT.OpenGate();
    	SHOOT.StartAuger();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	SHOOT.StopShooter();
    	SHOOT.StopAuger();
    	SHOOT.CloseGate();
    }

    protected void interrupted() {
    	end();
    }
}
