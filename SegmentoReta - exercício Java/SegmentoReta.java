public class SegmentoReta{
    
    private Ponto p1;
    private Ponto p2;
    
    
    public SegmentoReta(Ponto p1, Ponto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public double DistReta(){
        double dx = p2.getPontoX() - p1.getPontoX();
        double dy = p2.getPontoY() - p1.getPontoY();
        
        return Math.sqrt((dx * dx) + (dy * dy));
    }
    
    
}