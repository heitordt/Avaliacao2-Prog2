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
public class PoligonalFechada extends Poligonal {

    public PoligonalFechada(int vert) {
        super(vert);
    }

    @Override
    public double getComprimento() {
        double comprimento = 0.0;

        for (int j = 0; j < vert; j++) {
            if (j == vert - 1) {
                comprimento += vertices[j].dist(vertices[0]);
            } else {
                comprimento += vertices[j].dist(vertices[j + 1]);
            }
        }
        return comprimento;
    }

}
