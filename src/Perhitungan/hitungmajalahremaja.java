package Perhitungan;

public class hitungmajalahremaja implements hitungan{

    private double jumlah;
    private double harga = 15200;
    
    public hitungmajalahremaja(double jumlah){
        this.jumlah = jumlah;
    }
    
    public double getjumlah(){
        return jumlah;
    }
    
    public void setjumlah(double jumlah){
        this.jumlah = jumlah;
    }
    
    @Override
    public double JumlahAnak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double JumlahRemaja() {
        return jumlah * harga;
    }

    @Override
    public double JumlahDewasa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
