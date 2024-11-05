package Oct.ex11102024_ECapssulation.ecap.Accesmodifiers.police;
public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }

}