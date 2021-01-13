/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mariam
 */
public interface MedicalProfileFacadeInterface extends Remote {
       public void SetMedicalProfileData(ArrayList<String> drFollowup, ArrayList<String> chronicDisease, ArrayList<Medicine> medicines , 
            String bloodType, ArrayList<Appointment> pastAppointments, ArrayList<Prescription> prescriptions)throws RemoteException;
      
       public ArrayList<String> getMedicalProfileData()throws RemoteException;
}
