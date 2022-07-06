interface Binatang {

    public void bunyiBinatang(String binatang);

}

class Harimau implements Binatang {

    @Override
    public void bunyiBinatang(String binatang) {
        System.out.println(binatang + "Bunyi Harimau : mau mau mau ");
    }
}

class Serigala implements Binatang {

    @Override
    public void bunyiBinatang(String binatang) {
        System.out.println(binatang + "Bunyi Serigala : la la la");
    }
}

public class Tampil2 {

    public static void main(String[] args) {

        Binatang harimau = new Harimau();
        harimau.bunyiBinatang("harimau");
        Binatang serigala = new Serigala();
        serigala.bunyiBinatang("serigala");

    }

}