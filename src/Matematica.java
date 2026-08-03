public class Matematica extends Aluno {
    private double coeficienteDificuldade;

    @Override
    public double calcularMedia() {
        coeficienteDificuldade = 3;
        setNotas(getNotas() * coeficienteDificuldade/2);
        if (getNotas() > 10){
            setNotas(10);
        }
        return getNotas();
    }
}
