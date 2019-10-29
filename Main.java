
package test1;


public class Main{
public static void main (String[]args){
    Switcher switcher=new Switcher();
    Cooker noiCom=new Cooker("sonny",140,"122",true,false);
    Fan mayQuat=new Fan("lg",60,"436",true,2,true);
    switcher.addDevice(noiCom);
    switcher.addDevice(mayQuat);
    switcher.hienThi();
    switcher.turnOff();
    }
}