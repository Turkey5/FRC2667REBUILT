package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ReadElastic {
    public void periodic() {
        double Pv = SmartDashboard.getNumber("Input kP", 0);
        System.out.println(Pv);
    }

}
