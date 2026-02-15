package frc.robot.subsystems;

//import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;

public class Elastic {
    SmartDashboard dashboard;
    public static void main() {
        SmartDashboard.putNumber("Kp", Constants.ElasticConstants.Kp);
    }

}
