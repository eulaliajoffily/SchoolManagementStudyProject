public class Literatura extends Aluno {
    private int obrasLidas;

    public int getObrasLidas() {
        return obrasLidas;
    }

    public void setObrasLidas(int obrasLidas) {
        this.obrasLidas = obrasLidas;
    }

    @Override
    public double calcularMedia() {
        if (getObrasLidas() >= 5) {
            setNotas(10);
        }
        if (getObrasLidas() < 5 && getObrasLidas() >= 3) {
            setNotas(7);
        }
        if (getObrasLidas() < 3 && getObrasLidas() > 1) {
            setNotas(5);
        }
        if (getObrasLidas() < 1) {
            setNotas(0);
        }
        return getNotas();
    }
}
