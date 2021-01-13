/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.util.ArrayList;

/**
 *
 * @author meriam
 */
public class MedicalProfile {
    private ArrayList<String> drFollowup = new ArrayList();
    private ArrayList<String> chronicDisease = new ArrayList();
    private ArrayList<Medicine> medicines = new ArrayList();
    private String bloodType;
    private ArrayList<Appointment> pastAppointments = new ArrayList();
    private ArrayList<Prescription> prescriptions = new ArrayList();

}
