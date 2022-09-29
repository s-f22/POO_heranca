public class TesteHeranca1 {

  public static void main(String[] args) {
    AlunoDeGraduacao aluno = new AlunoDeGraduacao();

    aluno.nome = "João";
    aluno.idade = 17;

    System.out.printf(
        "Nome: %s \nIdade: %d \n",
        aluno.nome,
        aluno.idade);
  }

}
