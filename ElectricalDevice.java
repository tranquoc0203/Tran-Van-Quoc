
package test1;

class ElectricalDevice implements Switchable{
   
protected String manuFacture;
    protected int price;
    protected String id;
    protected boolean switcher;
   
    public  ElectricalDevice(String manuFacture,int price,String id, boolean switcher){
       
    this.manuFacture = manuFacture;
        this.price = price;
        this.id=id;
        this.switcher=switcher;
}
   
   public String manuFacture(){
       return manuFacture;
   }
 
    public void setmanuFacture(String manuFacture) {
        this.manuFacture = manuFacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getSwitcher() {
        return switcher;
    }

    public void setSwitcher(boolean switcher) {
        this.switcher = switcher;
    }
   
   
    public String toString() {
        return "nha san xuat: " + manuFacture
                + "\n" + "gia ban: " + price
                + "\n" + "ma id: " + id
                + "\n" + "cong tac: " + switcher;

    }
    public void turnOn(){
        switcher=true;
    }
    public void turnOff(){
        switcher=false;
    }
   
}
