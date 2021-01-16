/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIClient;

import Controllers.CreateAccountController;
import Controllers.DeleteAccountController;
import RMI.MedicineDTO;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import RMI.MedicineFacadeInterface;
import Controllers.PostMedicineController;
import Controllers.RequestOperationRoomController;
import Controllers.UpdateAccountController;
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
            

        

        
            // Connecting to the RMI Registry created on the server
            Registry registry = LocateRegistry.getRegistry(1099);

                        
                    // We create an object from the GUI window
            PostMedicine gui = new PostMedicine();
            gui.setLocationRelativeTo(null); // This makes the window appears centered
            gui.setVisible(false); // This shows the gui
            PostMedicineController gui_controller = new PostMedicineController(gui, registry);
//
//            UpdateAccount guix = new UpdateAccount();
//            guix.setLocationRelativeTo(null); // This makes the window appears centered
//            guix.setVisible(true); // This shows the gui
//            UpdateAccountController gui_controller1 = new UpdateAccountController(guix, registry);
//          DeleteAccount guib = new DeleteAccount();
//            guib.setLocationRelativeTo(null); // This makes the window appears centered
//            guib.setVisible(true); // This shows the gui
//            DeleteAccountController gui_controller1 = new DeleteAccountController(guib, registry);

         // We create an object from the GUI window
            CreateAccount guia = new CreateAccount();
            guia.setLocationRelativeTo(null); // This makes the window appears centered
            guia.setVisible(false); // This shows the gui
            CreateAccountController gui_controller1 = new CreateAccountController(guia, registry);
            
            
            RequestOperationRoomGUI gui_op = new RequestOperationRoomGUI();
            gui_op.setLocationRelativeTo(null); // This makes the window appears centered
            gui_op.setVisible(true); // This shows the gui
            RequestOperationRoomController gui_controller_op = new RequestOperationRoomController(gui_op, registry);
            

          

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
