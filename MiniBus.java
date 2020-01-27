/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author Yasmin
 */
public class MiniBus extends AbstractClass{

    @Override
    public String Date() {
Calendar timer= Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");   
    SimpleDateFormat tDate=new SimpleDateFormat("dd-MMM-yyyy");
        return (tDate.format(timer.getTime()));}
    
}
