public class Programa {

    public static void main(String[] args){
        Instituicao unifeob = new Instituicao("UNIFEOB");

        Curso ads = new Curso("ADS");

        Serie serieDois = new Serie("2");
        Serie serieQuatro = new Serie("4");

        Disciplina ltp = new Disciplina("LTPIV");
        Disciplina so = new Disciplina("SO");

        Aluno anderson = new Aluno("Anderson");
        Aluno joao = new Aluno("João");
        Aluno joaquim = new Aluno("Joaquim");
        Aluno maria = new Aluno("Maria");


        unifeob.avaliacoes.add(new Avaliacao(ads, serieQuatro, ltp, anderson, 7.5));
        unifeob.avaliacoes.add(new Avaliacao(ads, serieQuatro, ltp, joao, 7.0));
        unifeob.avaliacoes.add(new Avaliacao(ads, serieDois, so, joaquim, 3.5));
        unifeob.avaliacoes.add(new Avaliacao(ads, serieDois, so, maria, 4.5));
        unifeob.avaliacoes.add(new Avaliacao(ads, serieDois, so, anderson, 3.5));


        System.out.println("Média do curso ADS: " + unifeob.mediaDoCurso(ads));
        System.out.println("Média da série 2: " + unifeob.mediaDaSerie(serieDois));
        System.out.println("Média da disciplina LTP IV: " + unifeob.mediaDaDiciplina(ltp));
        System.out.println("Média do aluno Anderson: " + unifeob.mediaDoAluno(anderson));





    }

}
