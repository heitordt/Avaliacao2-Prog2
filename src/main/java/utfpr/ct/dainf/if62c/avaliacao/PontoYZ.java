/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author a1611810
 */
public class PontoYZ extends Ponto2D {
    private double x,y,z;
    
    public PontoYZ(){
        super();
    }
    
    public PontoYZ(double y,  double z){
        super(0.0,y,z);
    }
    
    @Override
    public String toString(){
        return String.format("%s(%.5f,%.5f)" this.getNome(), this.y, this.z));
    }
}
