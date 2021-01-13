/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
/**
 *
 * @author Mariam
 */


//public class MedicalProfileFacade extends UnicastRemoteObject implements MedicalProfileFacadeInterface{
//    
//    MedicalProfile medProf;
//    
//    public MedicalProfileFacade() throws RemoteException{
//        medProf = new MedicalProfile(new ArrayList<String>(),new ArrayList<String>(),new ArrayList<Medicine>(),"",new ArrayList<Appointment>(),new ArrayList<Prescription>());
//    }
//    
//    @Override
//    public void SetMedicalProfileData(ArrayList<String> drFollowup, ArrayList<String> chronicDisease, ArrayList<Medicine> medicines , 
//            String bloodType, ArrayList<Appointment> pastAppointments, ArrayList<Prescription> prescriptions)throws RemoteException{
//            medProf.setDrFollowup(drFollowup);
//            medProf.setChronicDisease(chronicDisease);
//            medProf.setMedicines(medicines);
//            medProf.setBloodType(bloodType);
//            medProf.setPastAppointments(pastAppointments);
//            medProf.setPrescriptions(prescriptions);
//    }
//
//   // @Override
//    //public ArrayList<String> getMedicalProfileData() throws RemoteException {
//        //ArrayList<String> MedicalProfileData=medProf.getDrFollowup() + medProf.getChronicDisease() + medProf.getMedicines() + medProf.getBloodType() + medProf.getPastAppointments() + medProf.getPrescriptions();
//        //return MedicalProfileData;
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    //}
//
//}
