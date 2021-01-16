/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import RMIClient.AdminFunc;
import java.rmi.registry.Registry;

/**
 *
 * @author Toumie
 */
public class AdminFuncController {
    
    AdminFunc gui;
    Registry r;
    
   
     public AdminFuncController(AdminFunc gui, Registry r)
    {
        this.gui = gui;
        this.r = r;
        // This registers the button with our action listener below (the inner class)
        gui.getCreateAccountButton().addActionListener(new AccountClass() );
        gui.getUpdateAccountButton().addActionListener(new AccountClass() );
        gui.getDeleteAccountButton().addActionListener(new AccountClass() );
        gui.getNotifyAllButton().addActionListener(new AccountClass() );
    }
    
    
    
}
