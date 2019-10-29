
package test1;


public class Cooker extends ElectricalDevice {
    protected boolean cooking;  
   
    public Cooker(String manuFacture, int price, String id, boolean switcher,boolean cooKing) {
    super(manuFacture, price, id, switcher);
    this.cooking = cooKing;
    }

    public boolean getCooking(){
        return cooking;
    }
    public void setCooking(boolean x){
        cooking=x;
    }
    public void cook(){
        cooking=true;
    }
    public void warm(){
        cooking=false;
    }
    public void update(){
        if(cooking==true)
            switcher=true;
        else switcher=false;
    }
   
}


