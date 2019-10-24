class Shinobi{
  private String noreg, nama, rank;

  public void setnoreg(String noreg){
    this.noreg = noreg;
  }
  public String getnoreg(){
    return noreg;
  }
  public void setnama(String nama){
    this.nama = nama;
  }
  public String getnama(){
    return nama;
  }
  public void setrank(String rank){
    this.rank = rank;
  }
  public String getrank(){
    return rank;
  }
}
public class Main{
  public static void main(String[] args) {
    Shinobi[] s = new Shinobi[3];

    s[0] = new Shinobi();
    s[0].setnoreg("012606");
    s[0].setnama("Uchiha Sasuke");
    s[0].setrank("Genin");

    s[1] = new Shinobi();
    s[1].setnoreg("012607");
    s[1].setnama("Uzumaki Naruto");
    s[1].setrank("Genin");

    s[2] = new Shinobi();
    s[2].setnoreg("012601");
    s[2].setnama("Haruno Sakura");
    s[2].setrank("Chunin");

    System.out.println("Data Calon Hokage \n");
    for(Shinobi x:s){
      System.out.println("No.Registrasi : "+x.getnoreg());
      System.out.println("Nama : "+x.getnama());
      System.out.println("Peringkat : "+x.getrank());
      System.out.println();
    }
  }
}
