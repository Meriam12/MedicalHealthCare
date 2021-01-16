/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import RMI.MedicineInterface;
import RMIClient.DeleteMedicineGUI;

/**
 *
 * @author Mariam
 */
public class DeleteMedicineController {
        // We have reference to both the GUI and the rmi registry
    DeleteMedicineGUI gui;
    Registry r;
    
    // The constructor takes the gui and the rmi registry as paramaters
    public DeleteMedicineController(DeleteMedicineGUI gui, Registry r)
    {
        this.gui = gui;
        this.r = r;
        // This registers the button with our action listener below (the inner class)
       

 gui.getjButton1().addActionListener(new deleteMedicineClass() );
    }
        
            // This class is responsible for handling the button click
       class deleteMedicineClass implements ActionListener {

        // Whatever written inside this function will execute when the button is clicked
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {

                // We try to obtain a remote reference to the grade remote object
                // that lives on the client. (using the registry object obtained from
                // the constructor above)
                
                MedicineInterface p = (MedicineInterface) r.lookup("MedicineInterface");

                
                // Get the grade (in numbers) as it is written inside the text field
                // Please note that we are able to interact with the gui elements through
                // the getters that we have set up earlier
                
                // Also we are parsing to int below because by default, the text field
                // will return a string
                
                
                String name = gui.getjTextField1().getText();




                
                // Once we have the grade as numbers, we can pass it to the remote
                // function getGrade using our remote reference g
               
                

              p.deleteMedicine(name);

                
                // Once we got the result from our remote object, we can set it to
                // appear inside the gui using the jLabel
                


               gui.getjLabel7().setText("Medicine deleted");

               
            } catch (RemoteException ex) {
                Logger.getLogger(PostMedicineController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(PostMedicineController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    



    
}
