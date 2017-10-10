package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.Robot;
import org.usfirst.frc.team2509.robot.subsystems.Sweeper;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SweeperForward extends Command {
	private Sweeper SWEEPER = Robot.sweeper;
    public SweeperForward() {
    	requires(SWEEPER);
    }

    protected void initialize() {
    	SWEEPER.Forward();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	SWEEPER.Stop();
    }

    protected void interrupted() {
    	end();
    }
}
