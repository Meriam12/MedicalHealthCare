/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIClient;

import RMI.MedicineDTO;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import RMI.MedicineFacadeInterface;

/**
 *
 * @author meriam
 */
public class RMIClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(1099);

            // Search for the stub "calc"
            MedicineFacadeInterface f = (MedicineFacadeInterface) registry.lookup("fac");

             //Invoke the remote methods on the remote object
//           f.SetCourseData("AOOSE ", "10110ch ", " Advanced object oriented SE");
//           
//           String CourseInfo =f.getCouseData();
//           System.out.println("Couse info  : "+CourseInfo);
            
           f.SetMedicineData("s ", "s ", " s",2,3);
           MedicineDTO c= f.getMedicine();
           System.out.println("Medicine name "+c.getName());
            
           
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
        
        
    }
    
}