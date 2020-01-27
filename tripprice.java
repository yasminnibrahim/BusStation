/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yasmin
 */
public class tripprice implements Ticket{

    @Override
    public void TripPrices() {
    BusStation n=new BusStation();
        try {
            n.Cairo("Tripss.txt");
            n.Alexandria("Tripss.txt");
            n.Lybia("Tripss.txt");
            n.Sharm("Tripss.txt");
            n.Ismailia("Tripss.txt");
        } catch (IOException ex) {
            Logger.getLogger(tripprice.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
}
