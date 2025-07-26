package OO.Composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Breno");
        Aluno aluno2 = new Aluno("Gabriel");
        Aluno aluno3 = new Aluno("Mateus");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("NodeJS Avançado");
        Curso curso3 = new Curso("Web Completo");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno3);

        aluno2.adicionarCurso(curso2);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno: curso3.alunos) {
            System.out.println("Estou no curso: " + curso3.nome + ".");
            System.out.println("Meu nome é " + aluno.nome);
        }

    }
}
