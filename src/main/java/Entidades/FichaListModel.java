
package Entidades;

import Entidades.Ficha_Avaliativa;
import java.util.List;

 class FichaListModel {
     private List<Ficha_Avaliativa> fichas;

    public FichaListModel(List<Ficha_Avaliativa> fichas) {
        this.fichas = fichas;
    }

    @Override
    public int getSize() {
        return fichas.size();
    }

    @Override
    public String getElementAt(int index) {
        Ficha_Avaliativa ficha = fichas.get(index);
        return "Nome: " + ficha.getNome() + ", Idade: " + ficha.getIdade() + ", Altura: " + ficha.getAltura() + ", Peso: " + ficha.getPeso();
    }

    public void setFichas(List<Ficha_Avaliativa> fichas) {
        this.fichas = fichas;
        fireContentsChanged(this, 0, fichas.size() - 1);
    }
}
