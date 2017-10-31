package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.Robot;
import org.usfirst.frc.team2509.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpDrive extends Command {
	private Drivetrain DRIVE = Robot.driveTrain;
	public OpDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(8)
    			||org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(7)){
    		DRIVE.AltOperatorControl();
    	}else if(!(org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(8)
    			||org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(7))
    			&&org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(2)){
    		DRIVE.ReverseOperatorControl();
    	}else if((org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(8)
    			||org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(7))
    			&&(org.usfirst.frc.team2509.robot.OI.getOPStick().getRawButton(2))){
    		DRIVE.AltReverseOperatorControl();
    	}else{
    		DRIVE.OperatorControl();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
