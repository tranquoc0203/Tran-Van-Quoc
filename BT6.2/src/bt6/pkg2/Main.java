
package bt6.pkg2;

public class Main {

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        tuDien.them("SuperMan", new Nghia("Siêu Nhân", "Danh từ", "You is SuperMan"));
        tuDien.them("Fly", new Nghia("Bay", "Động từ", "I fly on sky"));
        tuDien.them("Lazy", new Nghia("Lười Biếng", "Tính từ", "My sister very lazy"));
       

        System.out.println("Tra từ \"Student\":" + tuDien.tra("Student"));

        //Liệt kê toàn bộ các từ của từ điển
        System.out.println("Từ Điển Anh-Việt:");
        tuDien.hienThi();
    }
}
