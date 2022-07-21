package aula7;

import java.lang.Math;

public class Delta extends Equacao {
    private double delta;
    private double raizDeDelta;

    //#region
    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
    //#endregion

    public double finalDelta(){
    delta = (Math.pow(super.getB(), 2)) - (4 * super.getA() * super.getC());
    raizDeDelta = Math.sqrt(delta);
    return raizDeDelta;
    }
    
}
