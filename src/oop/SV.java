package oop;

import java.util.Date;

public class SV {
	
    private String hoTen;
    private Date ngaySinh;
    private double dtb;
    
    public SV (String hoTen,Date ngaySinh,double dtb){
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.dtb=dtb;
    }
    
    public String layHoTen(){
        return hoTen;
    }
    
    public void ganHoTen(String ht){
        hoTen=ht;
    }
    
    public Date layNgaySinh(){
        return ngaySinh;
    }
    
    public void ganNgaySinh(Date ns){
        ngaySinh=ns;
    }
    
     public double laydtb(){
        return dtb;
    }
     
    public void gandtb(double dtb){
        this.dtb=dtb;
    }
    
    public void hienThi(){
    	
        System.out.println("ten la:"+hoTen+"\nngay sinh la: "+ngaySinh
                +"\ndtb la: "+dtb+"\nlay tuoi: "
                +this.laytuoi()+"\nho: "+this.layHo()+"\nten: "
                +this.layTen()+"\nho dem: "
                +this.layhodem()+"\ntuoi: "+this.laytuoi()+"\nxep loai: "+this.xepLoai());
    }
    
    public String layHo(){
        String ho;
        int i= hoTen.indexOf(' ');
        ho =hoTen.substring(0,i);
        return ho;
    }
    
    public String layTen(){
        String Ten;
       
        int i= hoTen.lastIndexOf(' ');
        Ten =hoTen.substring(i+1);
        return Ten;
    }
   
    public String layhodem(){
        String hoDem;
        hoDem =hoTen.substring(hoTen.indexOf(' '),hoTen.lastIndexOf(' '));
        return hoDem;
    }
    
    public int laytuoi(){
        int yearsNow;
        int bd;
        yearsNow=new Date().getYear()+1900;
        bd= ngaySinh.getYear()+1900;
        return yearsNow-bd;
    }
    
    public String xepLoai(){
        String xepLoai ="";
        if(dtb<5){
            xepLoai= "yeu";
        }    
        else if(dtb<7){
            xepLoai= "Trung binh";
        }
        else if(dtb<8){
            xepLoai= "kha";
        }
        else{
            xepLoai= "gioi";
        }
        return xepLoai;
    }  
       
   
    public static void main(String[] args) {
       SV p = new SV("Tran Van Quoc",new Date("02/03/2000"),10);
       p.hienThi();
    }
   
}

