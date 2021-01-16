/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import RMIServer.Appointment;
import RMIServer.Medicine;
import RMIServer.Prescription;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author noura
 */
public interface MedicalProInterface extends Remote{
    
    
    public void uploadMedicalHistory(String chronicDisease,String medicine,String patientName) throws RemoteException;
    
     public void editMedicalProfile( ArrayList<String> drFollowup, ArrayList<String> chronicDisease, ArrayList<Medicine> medicines , 
            String bloodType, ArrayList<Appointment> pastAppointments, ArrayList<Prescription> prescriptions) throws RemoteException;
}
