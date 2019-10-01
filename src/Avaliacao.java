public class Avaliacao {
    Curso curso;
    Serie serie;
    Disciplina disciplina;
    Aluno aluno;
    double nota;

    public Avaliacao(Curso curso, Serie serie, Disciplina disciplina, Aluno aluno, double nota){
        this.curso = curso;
        this.serie = serie;
        this.disciplina = disciplina;
        this.aluno = aluno;
        this.nota = nota;
    }
}
