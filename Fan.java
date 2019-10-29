package test1;
class Fan extends ElectricalDevice{
    protected int speed;
    protected boolean swing;
    public Fan(String manuFacture, int price, String id,  boolean switcher,int tocdo,boolean swig) {
    super(manuFacture, price, id, switcher);
        speed=tocdo;
        swing=swig;
    }
    public void setSpeed(int x){
        speed=x;
    }
    public void setSwing(boolean x){
        swing=x;
    }
    public int getSpeed(){
        return speed;
    }
    public boolean getSwing(){
        return swing;
    }
    public void incSpeed(){
        if(speed>=3)
            speed=0;
        else speed++;
    }
    public void update(){
        if(speed==0)
            swing=false;
        else swing=true;
    }
}