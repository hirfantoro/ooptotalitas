public abstract class Karakter {
    private int maxhp;
    private int hp;
    private int STR;
    private int maxatk;
    private int atk;
    private int VIT;
    private int INT;
    private int mp;
    private int maxmp;
    private String nama;
    private int level=1;
    private int kill=0;
    private boolean die;
    
    public Karakter(String nama, int STR, int VIT, int INT){
        this.nama= nama;
        this.STR=STR;
        maxatk=2*STR;
        this.VIT=VIT;
        maxhp=10*VIT;
        this.INT=INT;
        maxmp=10*INT;
        level=1;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    
    public void setSTR(int STR){
        this.STR=STR;
        maxatk=2*STR;
    }
    
    public void setINT(int INT){
        this.INT=INT;
        maxmp=10*INT;
    }
    
    public void setVIT(int VIT){
        this.VIT=VIT;
        maxhp=10*VIT;
    }
    
    public int getSTR(){
        return STR;
    }
    
    public int getATK(){
        return atk;
    }
    
    public int getVIT(){
        return VIT;
    }
    
    public int getINT(){
        return INT;
    }
    
    public int getMP(){
        return mp;
    }
    
    public int getLVL(){
        return level;
    }
    
    public String getNama(){
        return nama;
    }
    
   // public cekHP
    
    
    
}
