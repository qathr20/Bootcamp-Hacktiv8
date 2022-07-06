public class restoran {

    private String menu;
    private double harga;
    private boolean spesial;

   
    /**
     * @return String return the menu
     */
    public String getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(String menu) {
        this.menu = menu;
    }

    /**
     * @return double return the harga
     */
    public double getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }

    /**
     * @return boolean return the spesial
     */
    public boolean isSpesial() {
        return spesial;
    }

    /**
     * @param spesial the spesial to set
     */
    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }

}
