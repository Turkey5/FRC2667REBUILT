// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;

public class Elastic extends SubsystemBase {
  public Elastic() {

  }
  public void initialize() {
    SmartDashboard.putNumber("Input kP", Constants.ElasticConstants.Kp);
  }
  @Override
  public void periodic() {
    double kP = SmartDashboard.getNumber("Input kP", Constants.ElasticConstants.Kp);
    //System.out.println(kP);
    SmartDashboard.putNumber("Return kP", kP);
  }
}
