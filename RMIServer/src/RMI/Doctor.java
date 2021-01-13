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
public class Doctor extends Account{
    private int rating;
    private String levelOfExpertise;
    private ArrayList<Nurse> nurse = new ArrayList();
    private ArrayList<String> timeSlots = new ArrayList();
    private Account account;
    private ArrayList<OperationRoom> operationRooms = new ArrayList();
    private DoctorAppointmentFunctionalities doctorAppointmentFunctionalities;
    private DoctorMedicalFunctionalities doctorMedicalFunctionalities;


}
