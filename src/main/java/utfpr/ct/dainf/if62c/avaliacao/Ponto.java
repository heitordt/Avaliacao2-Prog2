package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Ponto {
    private double x, y, z;

    /**
     * Retorna no nome não-qualificado da classe.
     * @return O nome não qualificado da classe.
     */
    public Ponto(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public Ponto (double  X, double Y, double Z){
    this.x = X;
    this.y = Y;
    this.z = Z;
    
    }
    
    @Override
    public String toString(){
        return String.format("%s(%.5f,%.5f,%.5f"this.getNome(), this.x, this.y, this.z);
    }
    
    /**
     *
     * @param ponto
     * @return
     */
    public boolean equals(Object ponto){
        Ponto test = (Ponto) ponto;
        
        if(test.getX()==this.x && test.getY()==this.y && test.getZ()==this.z){
            return true;
        }
        else
            return false;
        
    }
           
    public double dist(Ponto ponto){
        return (Math.sqrt(Math.pow((this.x - ponto.getX()), 2) + Math.pow((this.y - ponto.getY()), 2) + Math.pow((this.z - ponto.getZ()), 2)));
    }
    public String getNome() {
        return getClass().getSimpleName();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.x) ^ (Double.doubleToLongBits(this.x) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.y) ^ (Double.doubleToLongBits(this.y) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.z) ^ (Double.doubleToLongBits(this.z) >>> 32));
        return hash;
    }

}
