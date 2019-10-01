import java.util.ArrayList;
import java.util.List;

public class Instituicao {
    String nome;
    List<Avaliacao> avaliacoes = new ArrayList<>();

    public Instituicao(String nome){
        this.nome = nome;
    }

    public double mediaDoCurso(Curso curso){
        double total = 0;
        double notas = 0;

        for (Avaliacao avaliacao: this.avaliacoes) {
            if(avaliacao.curso.nome.equals(curso.nome)){
                System.out.println(avaliacao.nota);
                total++;
                notas+= avaliacao.nota;
            }
        }

        return notas / total;
    }

    public double mediaDoAluno(Aluno aluno){
        double total = 0;
        double notas = 0;

        for (Avaliacao avaliacao: this.avaliacoes) {
            if(avaliacao.aluno.nome.equals(aluno.nome)){
                System.out.println(avaliacao.nota);
                total++;
                notas+= avaliacao.nota;
            }
        }

        return notas / total;
    }

    public double mediaDaSerie(Serie serie){
        double total = 0;
        double notas = 0;

        for (Avaliacao avaliacao: this.avaliacoes) {
            if(avaliacao.serie.descricao.equals(serie.descricao)){
                System.out.println(avaliacao.nota);
                total++;
                notas+= avaliacao.nota;
            }
        }

        return notas / total;
    }

    public double mediaDaDiciplina(Disciplina disciplina){
        double total = 0;
        double notas = 0;

        for (Avaliacao avaliacao: this.avaliacoes) {
            if(avaliacao.disciplina.nome.equals(disciplina.nome)){
                System.out.println(avaliacao.nota);
                total++;
                notas+= avaliacao.nota;
            }
        }

        return notas / total;
    }
}
