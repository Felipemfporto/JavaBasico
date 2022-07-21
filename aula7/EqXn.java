package aula7;


public class EqXn extends Equacao {
    private double x1;
    private double x2;
    
    //#region    
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) {
        this.x1 = x1;
    }
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) {
        this.x2 = x2;
    }
    //#endregion

    public double calculaXn(Delta y){
        x1 = (-(y.getB()) - y.finalDelta()) / (2 * y.getA());
        return x1;
    }

    public double calculaXp(Delta x){
       x2 = (-(x.getB()) + x.finalDelta()) / (2 * x.getA());
        return x2;
    }
    
}
