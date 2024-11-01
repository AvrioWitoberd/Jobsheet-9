import java.util.Scanner;

public class MenuCafe04 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) { 
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Makanan '" + makananDicari + "' tersedia di menu.");
        } else {
            System.out.println("Makanan '" + makananDicari + "' tidak ada di menu.");
        }

        sc.close();
    }
}
