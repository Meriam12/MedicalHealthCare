/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import RMIServer.OperationRoom;
import java.rmi.RemoteException;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 *
 */
public class JUnitTesting  {

    @Test
    public void testRequestOperationRoom() throws RemoteException{
        OperationRoom o = new OperationRoom();
        String result = o.RequestOperationRoom(1, 'A', "Dr.Mina@yahoo.com");
        assertEquals("Room is requested successfully", result);
    }

//
//    @Test
//    public void testSub() {
//        Calculator c = new Calculator();
//        int result = c.sub(6, 1);
//        assertEquals(4, result);
//    }

}
