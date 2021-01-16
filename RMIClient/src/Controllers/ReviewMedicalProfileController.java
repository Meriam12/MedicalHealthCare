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
import RMI.ReviewMedicalProInterface;
import RMIClient.ReviewMedicalProfile;

/**
 *
 * @author noura
 */
public class ReviewMedicalProfileController {

    ReviewMedicalProfile gui;
    Registry r;

    public ReviewMedicalProfileController(ReviewMedicalProfile gui, Registry r) {
        this.gui = gui;
        this.r = r;
        gui.getjButton2().addActionListener(new reviewMedicalClass());
    }

    class reviewMedicalClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                ReviewMedicalProInterface re = (ReviewMedicalProInterface) r.lookup("ReviewMedicalProInterface");
                re.ReviewMedicalProfile();

            } catch (RemoteException ex) {

            } catch (NotBoundException ex) {
                Logger.getLogger(CreateAccountController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
