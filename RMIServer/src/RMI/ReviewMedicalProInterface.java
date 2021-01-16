/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author noura
 */
public interface ReviewMedicalProInterface extends Remote{
    public void reviewMedicalProfile() throws RemoteException;
}
