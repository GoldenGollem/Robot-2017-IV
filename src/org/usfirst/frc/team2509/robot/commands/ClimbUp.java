package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.Robot;
import org.usfirst.frc.team2509.robot.subsystems.Climb;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClimbUp extends Command {
	private Climb CLIMB = Robot.climb;
    public ClimbUp() {
    	requires(CLIMB);
    }

    protected void initialize() {
    	CLIMB.Up();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	CLIMB.Stop();
    }

    protected void interrupted() {
    	end();
    }
}
