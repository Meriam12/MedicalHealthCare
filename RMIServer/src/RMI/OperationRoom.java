/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

/**
 *
 * @author meriam
 */
import java.util.*;

public class OperationRoom {
    private int ID;
    private char Type;
    private Doctor ReservedDoctor; 

    public OperationRoom() {
    }
    

    public OperationRoom(int ID, char Type, Doctor ReservedDoctor) {
        this.ID = ID;
        this.Type = Type;
        this.ReservedDoctor = ReservedDoctor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char getType() {
        return Type;
    }

    public void setType(char Type) {
        this.Type = Type;
    }

    public Doctor getReservedDoctor() {
        return ReservedDoctor;
    }

    public void setReservedDoctor(Doctor ReservedDoctor) {
        this.ReservedDoctor = ReservedDoctor;
    }
    
    public void RequestOperationRoom(int id, char type,Doctor RD){
    
    
    }
    
       public void addDoctor(Doctor d)
    {
       this.ReservedDoctor=d ;
    }
    
}