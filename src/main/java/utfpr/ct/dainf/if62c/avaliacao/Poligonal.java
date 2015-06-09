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
public class Poligonal {

    protected int vert;
    protected Ponto2D vertices[];

    private static final String MSG_2VERT = "Poligonal deve ter ao menos 2 vértices";
    private static final String MSG_PLANOS = "Vértices devem estar no mesmo plano";

    public Poligonal(int vert) {
        this.vert = vert;
        if (vert < 2) {
            throw new RuntimeException(MSG_2VERT);
        } else {
            vertices = new Ponto2D[vert];
        }
    }

    public int getN() {
        return vert;
    }

    public Ponto2D get(int A) {
        if (A < 0 || A >= this.vert) {
            return null;
        } else {
            return vertice[A];
        }
    }    
public void set(int A, Ponto2D ponto){
    if (A<0  ||  A>= this.vert)
        return;
    else  for(int j=0, j<vert, j++)
    {
        if(vertices[j]!= null && ponto.getClass() != vertices[j].getClass())
        {
            throw new RuntimeException(MSG_PLANOS);
        }
    }
    vertices[A] = ponto;
}

    public double getComprimento() {
        double comprimento  = 0.0;
        
        for (int j=0, j<vert, j++)
        {
            comprimento += vertices[j].dist(vertices[j+1]);
        }
        
        return comprimento;
    }

}
