//ProfessorPesquisador É-UM Professor
//Professor É-UM Pessoa
public class ProfessorPesquisador extends Professor {

  public void pesquisar() {

    System.out.printf(
        "%s pesquisando...",
        nome);
  }
}
