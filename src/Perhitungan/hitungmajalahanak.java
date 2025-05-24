package Perhitungan;

public class hitungmajalahanak implements hitungan{

    private double jumlah;
    private double harga = 12700;
    
    public hitungmajalahanak(double jumlah){
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
        return jumlah * harga;
    }

    @Override
    public double JumlahRemaja() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double JumlahDewasa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
