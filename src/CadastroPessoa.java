import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    Scanner sc = new Scanner(System.in);
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    ArrayList<Programador> listaProgramador = new ArrayList<>();
    ArrayList<Cibersecurity> listaCiber = new ArrayList<>();
    int contador;


    public void adicionarPessoa() {
        int opcaoPessoa;

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); //limpeza

        System.out.println("Digite seu telefone: ");
        String telefone = sc.nextLine();

        System.out.println("╔════════════════════════════╗\n" +
                           "║          PROFISSÃO         ║\n" +
                           "╠════════════════════════════╣\n" +
                           "║   1- Programador           ║\n" +
                           "║   2- Cibersecurity         ║\n" +
                           "╚════════════════════════════╝");
        opcaoPessoa = sc.nextInt();
        sc.nextLine();

        switch (opcaoPessoa) {
            case 1:
                System.out.println("Digite sua linguagem de programação principal: ");
                String linguagem = sc.nextLine();
                Programador programador = new Programador(nome, idade, telefone, linguagem);
                System.out.println("Usuário cadastrado: " + programador.getNome());
                listaPessoa.add(programador);
                break;

            case 2:
                System.out.println("Digite sua distribuição Linux favorita: ");
                String distroLinux = sc.nextLine();

                Cibersecurity cibersecurity = new Cibersecurity(nome, idade, telefone, distroLinux);
                System.out.println("Usuário cadastrado: " + cibersecurity.getNome());
                listaPessoa.add(cibersecurity);
                break;
        }
    }

    public void lerPessoas() {
        int i = 0;

        System.out.println("Programadores");
        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getClass().getSimpleName().equals("Programador")) {
                System.out.println(( i + 1 ) + " - " + pessoa);
            i++;
            }
        }

        System.out.println("Cibersecurities");
        for (Pessoa pessoa : listaPessoa) {
            if (pessoa.getClass().getSimpleName().equals("Cibersecurity")) {
                System.out.println(( i + 1 ) + " - " + pessoa);
            i++;
            }
        }
    }

    public void editarPessoa() {
        System.out.println("Qual deseja editar? ");
        lerPessoas();
        int opcaoEditar = sc.nextInt();
        sc.nextLine(); // limpeza

        System.out.print("Sua escolha: " + listaPessoa.get(opcaoEditar - 1) + "\nO que deseja editar? 1 - Nome | 2 - Idade | 3 - Telefone | 4 - Atributo Específico");
        int opcaoEditarAtributo = sc.nextInt();
        sc.nextLine(); // limpeza

        switch (opcaoEditarAtributo){
            case 1:
                System.out.println("Digite o nome para substituir: ");
                String novoNome = sc.nextLine();
                listaPessoa.get(opcaoEditar - 1).setNome(novoNome);
                System.out.println("Nome Editado com Sucesso!");
                break;

            case 2:
                System.out.println("Digite a idade para substituir: ");
                int novaIdade = sc.nextInt();
                sc.nextLine(); // limpeza
                listaPessoa.get(opcaoEditar - 1).setIdade(novaIdade);
                System.out.println("Idade Editado com Sucesso!");
                break;

            case 3:
                System.out.println("Digite o telefone para substituir: ");
                String novoTelefone = sc.nextLine();
                listaPessoa.get(opcaoEditar - 1).setTelefone(novoTelefone);
                System.out.println("Telefone Editado com Sucesso!");
                break;

            case 4:
                if (listaPessoa.get(opcaoEditar - 1).getClass().getSimpleName().equals("Programador")) {
                    System.out.println("Digite a linguagem para substituir: ");
                    String novaLinguagem = sc.nextLine();
                    listaProgramador.get(opcaoEditar).setLinguagem(novaLinguagem);
                } else {
                    System.out.println("Digite a distribuição Linux para substituir: ");
                    String novaDistro = sc.nextLine();
                    listaCiber.get(opcaoEditar - 1).setDistroLinux(novaDistro);
                }

                System.out.println("Linguagem Editada com Sucesso!");
                break;
        }

    }

    public void deletarPessoa() {
        System.out.println("Qual deseja deletar? ");
        contador = 1;
        for (Object pessoa : listaPessoa) {
            System.out.println(contador + " - " + pessoa);
            contador++;
        }
        int opcaoDeletar = sc.nextInt();
        sc.nextLine(); // limpar scanner
        listaPessoa.remove(opcaoDeletar - 1);
        System.out.println("Usuário Deletado com Sucesso! ");

    }
}
