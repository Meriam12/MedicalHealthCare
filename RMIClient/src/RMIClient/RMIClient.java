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
import Controllers.PostMedicineController;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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
            
            
                    // We create an object from the GUI window
            PostMedicine gui = new PostMedicine();
            gui.setLocationRelativeTo(null); // This makes the window appears centered
            gui.setVisible(true); // This shows the gui
        

        
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(1099);

            
            PostMedicineController gui_controller = new PostMedicineController(gui, registry);

          


//  MedicineFacadeInterface f = (MedicineFacadeInterface) registry.lookup("fac");



             //Invoke the remote methods on the remote object
//           f.SetCourseData("AOOSE ", "10110ch ", " Advanced object oriented SE");
//           
//           String CourseInfo =f.getCouseData();
//           System.out.println("Couse info  : "+CourseInfo);


            
            
       //    f.SetMedicineData("s ", "s ", " s",2,3);
      //     MedicineDTO c= f.getMedicine();
         //  System.out.println("Medicine name "+c.getName());
            
           
        } catch (Exception ex) {
            System.out.println("Exception occured");
        }
        
        
    }
    
}
