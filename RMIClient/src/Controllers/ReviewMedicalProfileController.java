/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import RMI.DoctorMedicalFunctionalities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import RMIClient.*;
import RMI.MedicalProInterface;

/**
 *
 * @author noura
 */
public class ReviewMedicalProfileController {

    ReviewMedicalProfileGUI gui;
    Registry r;

    public ReviewMedicalProfileController(ReviewMedicalProfileGUI gui, Registry r) {
        this.gui = gui;
        this.r = r;
        gui.getjButton3().addActionListener(new reviewMedicalClass());
    }

    class reviewMedicalClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                
                
                DoctorMedicalFunctionalities re = (DoctorMedicalFunctionalities) r.lookup("DoctorMedicalFunctionalities");
                
                 String name = gui.getjTextField1().getText();
                
                re.reviewMedicalProfile("name");
                
                
            //    gui.getjLabel3().setText();

            } catch (RemoteException ex) {

            } catch (NotBoundException ex) {
                Logger.getLogger(CreateAccountController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
