package Perhitungan;

public class hitungmajalahdewasa implements hitungan{

    private double jumlah;
    private double harga = 26900;
    
    public hitungmajalahdewasa(double jumlah){
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double JumlahDewasa() {
        return jumlah * harga;
    }
    
}
