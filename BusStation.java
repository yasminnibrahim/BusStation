/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.station;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.util.Arrays.equals;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Line;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;


/**
 *
 * @author Yasmin
 */
public class BusStation  {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Main m=new Main ();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    
    } 
    
    

public double Cairo (String fileName) throws IOException{
  fileName="Tripss.txt";
  File file=new File ("Tripss.txt");
       
       double priceCairo = 0 ;  
      
    String line;
    String[] liner;
    boolean found= false; 
        
         try{
         BufferedReader input=new BufferedReader (new FileReader(fileName));
         
         if(!input.ready())//check the file can be read or no//
         {
        throw new IOException();
        
         } while ((line=input.readLine()) != null){
             liner = line.split(" ");
             ArrayList<String> TripLine = new ArrayList<String>();  
             TripLine.add(liner[0]);
            // System.out.println(liner[0]);
             TripLine.add(liner[1]);
          //   System.out.println(liner[1]);
             Public.Trips.add(TripLine);
          
         }
          input.close();
         }
         
         catch (IOException e){
         System.out.println(e);
         }
         //System.out.println(Public.Trips.size());
         //System.out.println(Public.Trips.get(0).get(0));
             for (int l=0;l<Public.Trips.size();l++)
             {
                 
             if((Public.Trips.get(l).get(0)).equalsIgnoreCase("Cairo"))
             
            {
             found=true;
              priceCairo=Double.parseDouble(Public.Trips.get(l).get(1));
            
             break;
            
            }
         
         }
             System.out.println(priceCairo);
         return  priceCairo;
         }
              
       public void EDITFILE (String fileName) throws IOException{
       fileName="Tripss.txt";
  File file=new File ("Tripss.txt");
 String line;
   String[] liner;
     
        try{
        BufferedReader input=new BufferedReader (new FileReader(fileName));
        
        if(!input.ready())        {
      throw new IOException();
       
       
    
        } while ((line=input.readLine()) != null){
            liner = line.split(" ");
            ArrayList<String> TripLine = new ArrayList<String>();  
            TripLine.add(liner[0]);
//           //  System.out.println(liner[0]);
            TripLine.add(liner[1]);
//          //   System.out.println(liner[1]);
            Public.Trips.add(TripLine);
         
         }
          input.close();         }
         
         catch (IOException e){
        System.out.println(e);
        }
           Desktop desktop =Desktop.getDesktop();
        if(file.exists())
         desktop.open(file);
       }
public double Alexandria(String fileName) throws IOException{
  fileName="Tripss.txt";
  File file=new File ("Tripss.txt");
     
       double priceAlexandria = 0 ;    
    String line;
    String[] liner;
    boolean found= false; 
        
         try{
         BufferedReader input=new BufferedReader (new FileReader(fileName));
         
         if(!input.ready())//check the file can be read or no//
         {
        throw new IOException();
        
         } while ((line=input.readLine()) != null){
             liner = line.split(" ");
             ArrayList<String> TripLine = new ArrayList<String>();  
             TripLine.add(liner[0]);
           //  System.out.println(liner[0]);//
             TripLine.add(liner[1]);
           //  System.out.println(liner[1]);
             Public.Trips.add(TripLine);
          
         }
          input.close();
         }
         
         catch (IOException e){
         System.out.println(e);
         }
         
             for (int l=0;l<Public.Trips.size();l++)
             {
                 
             if((Public.Trips.get(l).get(0)).equalsIgnoreCase("Alexandria"))
             
            {
             found=true;
              priceAlexandria=Double.parseDouble(Public.Trips.get(l).get(1));
            
             break;
            
            }
             }return priceAlexandria;}
public double Lybia(String fileName) throws IOException{
  fileName="Tripss.txt";
  File file=new File ("Tripss.txt");
     
       double priceLybia = 0 ;    
    String line;
    String[] liner;
    boolean found= false; 
        
         try{
         BufferedReader input=new BufferedReader (new FileReader(fileName));
         
         if(!input.ready())//check the file can be read or no//
         {
        throw new IOException();
        
         } while ((line=input.readLine()) != null){
             liner = line.split(" ");
             ArrayList<String> TripLine = new ArrayList<String>();  
             TripLine.add(liner[0]);
            // System.out.println(liner[0]);
             TripLine.add(liner[1]);
            // System.out.println(liner[1]);
             Public.Trips.add(TripLine);
          
         }
          input.close();
         }
         
         catch (IOException e){
         System.out.println(e);
         }
         
             for (int l=0;l<Public.Trips.size();l++)
             {
                 
             if((Public.Trips.get(l).get(0)).equalsIgnoreCase("Lybia"))
             
            {
             found=true;
              priceLybia=Double.parseDouble(Public.Trips.get(l).get(1));
            
             break;
            
            }
             }return priceLybia;}
public double Sharm(String fileName) throws IOException{
  fileName="Tripss.txt";
  File file=new File ("Tripss.txt");
     
       double priceSharm = 0 ;    
    String line;
    String[] liner;
    boolean found= false; 
        
         try{
         BufferedReader input=new BufferedReader (new FileReader(fileName));
         
         if(!input.ready())//check the file can be read or no//
         {
        throw new IOException();
        
         } while ((line=input.readLine()) != null){
             liner = line.split(" ");
             ArrayList<String> TripLine = new ArrayList<String>();  
             TripLine.add(liner[0]);
            // System.out.println(liner[0]);
             TripLine.add(liner[1]);
           //  System.out.println(liner[1]);
             Public.Trips.add(TripLine);
          
         }
          input.close();
         }
         
         catch (IOException e){
         System.out.println(e);
         }
         
             for (int l=0;l<Public.Trips.size();l++)
             {
                 
             if((Public.Trips.get(l).get(0)).equalsIgnoreCase("SharmElSheikh"))
             
            {
             found=true;
              priceSharm=Double.parseDouble(Public.Trips.get(l).get(1));
            
             break;
            
            }
             }return priceSharm;}
public double Ismailia(String fileName) throws IOException{
  fileName="Tripss.txt";
  File file=new File ("Tripss.txt");
     
       double priceIsmailia  = 0 ;    
    String line;
    String[] liner;
    boolean found= false; 
        
         try{
         BufferedReader input=new BufferedReader (new FileReader(fileName));
         
         if(!input.ready())//check the file can be read or no//
         {
        throw new IOException();
        
         } while ((line=input.readLine()) != null){
             liner = line.split(" ");
             ArrayList<String> TripLine = new ArrayList<String>();  
             TripLine.add(liner[0]);
            // System.out.println(liner[0]);
             TripLine.add(liner[1]);
         //    System.out.println(liner[1]);
             Public.Trips.add(TripLine);
          
         }
          input.close();
         }
         
         catch (IOException e){
         System.out.println(e);
         }
         
             for (int l=0;l<Public.Trips.size();l++)
             {
                 
             if((Public.Trips.get(l).get(0)).equalsIgnoreCase("Ismailia"))
             
            {
             found=true;
              priceIsmailia=Double.parseDouble(Public.Trips.get(l).get(1));
            
             break;
            
            }
             }
             return priceIsmailia ;}




   
    /*public void TripPrice() {
       BusStation n=new BusStation();
        try {
           
            double c;
            c=n.Cairo("Tripss.txt");
            System.out.println(c);
            double a;
            a=n.Alexandria("Tripss.txt");
            
        } catch (IOException ex) {
            Logger.getLogger(BusStation.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
         } 
//             
//   
//        
           
            
       


//}
     



       
    
    

