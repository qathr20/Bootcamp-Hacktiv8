public class makanan {
    public static void main(String[] args) {
        restoran data = new restoran();

        data.setMenu("Ayam Goreng");
        data.setHarga(17000);
        data.setSpesial(true);

       String menu = data.getMenu();
       double harga = data.getHarga();
       boolean isSpesial = data.isSpesial();


        System.out.println("Menu Makanan: "+menu);
        System.out.println("Menu Makanan: Rp."+harga);
        System.out.println("Menu Spesial: "+isSpesial);
    }
    
}
