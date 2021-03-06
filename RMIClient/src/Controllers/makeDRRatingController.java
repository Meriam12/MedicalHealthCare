/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import RMI.DoctorInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import RMI.MedicineInterface;
import RMIClient.PostMedicineGUI;
import RMIClient.makeDRRatingGUI;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Mariam
 */
public class makeDRRatingController {
        // We have reference to both the GUI and the rmi registry
    makeDRRatingGUI gui = new makeDRRatingGUI();
    Registry r;
    
    
    public makeDRRatingController() throws RemoteException
    {
           r=LocateRegistry.getRegistry(1099);
           gui.setLocationRelativeTo(null); // This makes the window appears centered
           gui.setVisible(true); // This shows the gui
           makeDRRatingController gui_controller1 = new makeDRRatingController(gui, r);
    
    }
    // The constructor takes the gui and the rmi registry as paramaters
    public makeDRRatingController(makeDRRatingGUI gui, Registry r)
    {
        this.gui = gui;
        this.r = r;
        // This registers the button with our action listener below (the inner class)
       

 gui.getjButton1().addActionListener(new makeDRRatingClass() );
    }
        
            // This class is responsible for handling the button click
       class makeDRRatingClass implements ActionListener {

        // Whatever written inside this function will execute when the button is clicked
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {

                // We try to obtain a remote reference to the grade remote object
                // that lives on the client. (using the registry object obtained from
                // the constructor above)
                
                DoctorInterface p = (DoctorInterface) r.lookup("DoctorInterface");

                
                // Get the grade (in numbers) as it is written inside the text field
                // Please note that we are able to interact with the gui elements through
                // the getters that we have set up earlier
                
                // Also we are parsing to int below because by default, the text field
                // will return a string
                
                
               

                int rating = Integer.parseInt(gui.getjTextField4().getText());

                String name = gui.getjTextField3().getText();
                
                // Once we have the grade as numbers, we can pass it to the remote
                // function getGrade using our remote reference g
               
                

             p.makeRating(rating,name);

                
                // Once we got the result from our remote object, we can set it to
                // appear inside the gui using the jLabel
                


               gui.getjLabel7().setText("Rating changed!");

               
            } catch (RemoteException ex) {
                Logger.getLogger(PostMedicineController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(PostMedicineController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    



    
}
