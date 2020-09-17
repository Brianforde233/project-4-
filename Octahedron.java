import java.text.DecimalFormat;
/**.
* Project 4 define Octahedron objects
*@author Brian Forde
*@version 9/16/20
*/
public class Octahedron {

   //intance variables 
   private String label = "";
   private String color = "";
   private double edge = 0;
  
  
  
  // constructor 
  /**
  *@param labelIn uses input for label
  *@param colorIn uses input for color 
  *@param edgeIn uses input for edge 
  */
  
   public Octahedron(String labelIn, String colorIn, double edgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
   }
  
 //methods 
 /**
 *@return returns a String representing the label
  */
   public String getLabel()
   {
      return label;
   } 
   /** 
   *@param labelIn takes String parameter 
   *@return returns a boolean 
   */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true; }
      else { 
         return false;
      }
   }
/**
*@return returns a String representing color field 
*/
   public String getColor() {
      return color;
   
   } 
/**
*@param colorIn takes String parameter 
*@return returns a bollean
*/
   public boolean setColor(String colorIn) { 
      if (colorIn != null)  {
         color = colorIn.trim();
         return true; } 
      else { 
         return false;
      }
   } 

/**
*@return returns double representing edge field 
*/

   public double getEdge() {
      return edge;
    
   }

/**
@param edgeIn accepts a double parameter 
@return return a boolean 
*/
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) { 
         edge = edgeIn;
         return true; } 
      else { 
         return false;
      }
   }
/**
*@return returns double value for SA using value for edge 
*/
   public double surfaceArea() {
      return 2 * Math.sqrt(3 * Math.sqrt(1)) * Math.pow(edge, 2);
   }

/**
@return double value for volume using value for edge
*/
   public double volume() 
   {
      return (Math.sqrt(2) / 3) * Math.pow(edge, 3);
   
   }

/**
*@return returns double value by diving the SA by V
*/
   public double surfaceToVolumeRatio() { 
      return surfaceArea() / volume();
   
   }
  
  
/** 
*@return returns String containing info about Octahedron
*/
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0###");
      return "Octahedron \"" + label + "\" is \"" +  color 
         + "\" with 12 edges of length " + edge + " units.\n\t"
         + "surface area = " + fmt.format(surfaceArea()) + " square units\n\t"
         + "volume = " + fmt.format(volume()) + " cubic units\n\t"
         + "surface/volume ratio = " + fmt.format(surfaceToVolumeRatio());
   }
}
  

  


