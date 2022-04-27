package Shapes;

public class Point {
    public double hd;
    public double td;
    public char c;
    public String tendiem;
    public double AB ,BC, AC,CD,DA;
    public Point(){}

    public Point(double x, double y) {
        this.hd = x;
        this.td = y;
    }
    public double gethd() {
        return hd;
    }
    public double getAB() {
        return AB;
    }

    public double getAC() {
        return AC;
    }
    public double getBC() {
        return BC;
    }

    public void setAB( double AB) {
        this.AB=AB;
    }
    public void setAC( double AC) {
        this.AC=AC;
    }
    public void setBC( double BC) {
        this.BC=BC;
    }

    public void sethd(double hd){
        this.hd = hd;
    }

    public double gettd() {
        return td;
    }

    public void settd(double td) {
        this.td = td;
    }

    public void setPointXY(String tendiem,double td, double hd){
        this.tendiem=tendiem;
        this.hd = hd;
        this.td = td;
    }
    public void setCXY(char c,double hd,double td){
        this.c=c;
        this.td=td;
        this.hd=hd;
    }
    public void getPointXY(){
        System.out.println("Diem co toa do la: " + tendiem+"("+hd  +";" +td+")");
    }


}