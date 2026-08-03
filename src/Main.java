import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Matematica M = new Matematica();
        Literatura L = new Literatura();
        Aluno A = new Aluno();

        A.setNome(JOptionPane.showInputDialog("Insira aqui seu nome"));
        A.setCurso(JOptionPane.showInputDialog("Insira aqui a matéria que você cursou: "));

        if (A.getCurso().equals("Matemática")) {
            M.setNotas(Double.parseDouble(JOptionPane.showInputDialog("Insira aqui sua nota da avaliação de " + A.getCurso() + ": ")));
            JOptionPane.showMessageDialog(null, "Olá, " + A.getNome() + " sua média de " + A.getCurso() + " foi de " + M.calcularMedia());
        } else if (A.getCurso().equals("Literatura")) {
            L.setObrasLidas(Integer.parseInt(JOptionPane.showInputDialog("Insira aqui quantas obras você leu: ")));
            JOptionPane.showMessageDialog(null, "Olá, " + A.getNome() + " sua média de " + A.getCurso() + " foi de " + L.calcularMedia());
        } else {
            JOptionPane.showMessageDialog(null, "Esta disciplina não está disponível");
        }
    }
}