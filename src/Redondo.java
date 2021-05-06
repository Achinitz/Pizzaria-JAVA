import java.lang.Math;
public class Redondo extends Forma{
    private double raio;
    
    public Redondo(double raio){
        super(1);
        this.raio = raio;
    }
    
    @Override
    public double cm2() {
        return Math.PI * Math.pow(this.raio, 2);
    }
    
}
