import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    Scanner sc = new Scanner(System.in);
    ArrayList<Programador> listaProgramador = new ArrayList<>();
    ArrayList<Cibersecurity> listaCiber = new ArrayList<>();


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
                listaProgramador.add(programador);
                break;

            case 2:
                System.out.println("Digite sua distribuição Linux favorita: ");
                String distroLinux = sc.nextLine();

                Cibersecurity cibersecurity = new Cibersecurity(nome, idade, telefone, distroLinux);
                System.out.println("Usuário cadastrado: " + cibersecurity.getNome());
                listaCiber.add(cibersecurity);
                break;
        }
    }

    public void lerPessoas() {

        System.out.println("\nProgramadores");
        for (Pessoa pessoa : listaProgramador) {
            if (pessoa.getClass().getSimpleName().equals("Programador")) {
                System.out.println(pessoa);
            }
        }

        System.out.println("\nCibersecurities");
        for (Pessoa pessoa : listaCiber) {
            if (pessoa.getClass().getSimpleName().equals("Cibersecurity")) {
                System.out.println(pessoa);
            }
        }
    }

    // parte para refatorar
    public void editarPessoa() {
        lerPessoas();
        System.out.println("\nQual deseja editar? | 1- Programador | 2- Cibersecurity |");
        int opcaoArea = sc.nextInt();

        if (opcaoArea == 1) {
            int i = 0;
            for (Pessoa pessoa : listaProgramador) {
                if (pessoa.getClass().getSimpleName().equals("Programador")) {
                    System.out.println((i + 1) + " - " + pessoa);
                    i++;
                }
            }

            System.out.println("Qual deles deseja editar? ");
            int opcaoEditarProg = sc.nextInt();
            sc.nextLine();
            System.out.print("Sua escolha: " + listaProgramador.get(opcaoEditarProg - 1) + "\nO que deseja editar? | 1 - Nome | 2 - Idade | 3 - Telefone | 4 - Linguagem de Programação | ");
            int opcaoEditarAtributoProg = sc.nextInt();
            sc.nextLine(); // limpeza

            switch (opcaoEditarAtributoProg) {
                case 1:
                    System.out.println("\nDigite o nome para substituir: ");
                    String novoNome = sc.nextLine();
                    listaProgramador.get(opcaoEditarProg - 1).setNome(novoNome);
                    System.out.println("Nome Editado com Sucesso!");
                    break;

                case 2:
                    System.out.println("\nDigite a idade para substituir: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine(); // limpeza
                    listaProgramador.get(opcaoEditarProg - 1).setIdade(novaIdade);
                    System.out.println("Idade Editado com Sucesso!");
                    break;

                case 3:
                    System.out.println("\nDigite o telefone para substituir: ");
                    String novoTelefone = sc.nextLine();
                    listaProgramador.get(opcaoEditarProg - 1).setTelefone(novoTelefone);
                    System.out.println("Telefone Editado com Sucesso!");
                    break;

                case 4:
                    System.out.println("\nDigite a linguagem para substituir: ");
                    String novaLinguagem = sc.nextLine();
                    listaProgramador.get(opcaoEditarProg - 1).setLinguagem(novaLinguagem);
                    System.out.println("Linguagem Editada com Sucesso!");
                    break;
            }

        } else {
            int i = 0;
            for (Pessoa pessoa : listaCiber) {
                System.out.println((i + 1) + " - " + pessoa);
                i++;
            }

            System.out.println("Qual deles deseja editar? ");
            int opcaoEditarCib = sc.nextInt();
            sc.nextLine();
            System.out.print("Sua escolha: " + listaCiber.get(opcaoEditarCib - 1) + "\nO que deseja editar? 1 - Nome | 2 - Idade | 3 - Telefone | 4 - Linguagem de Programação ");
            int opcaoEditarAtributoCib = sc.nextInt();
            sc.nextLine(); // limpeza

            switch (opcaoEditarAtributoCib) {
                case 1:
                    System.out.println("Digite o nome para substituir: ");
                    String novoNome = sc.nextLine();
                    listaCiber.get(opcaoEditarCib - 1).setNome(novoNome);
                    System.out.println("Nome Editado com Sucesso!");
                    break;

                case 2:
                    System.out.println("Digite a idade para substituir: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine(); // limpeza
                    listaCiber.get(opcaoEditarCib - 1).setIdade(novaIdade);
                    System.out.println("Idade Editado com Sucesso!");
                    break;

                case 3:
                    System.out.println("Digite o telefone para substituir: ");
                    String novoTelefone = sc.nextLine();
                    listaCiber.get(opcaoEditarCib - 1).setTelefone(novoTelefone);
                    System.out.println("Telefone Editado com Sucesso!");
                    break;

                case 4:
                    System.out.println("Digite a linguagem para substituir: ");
                    String novaDistro = sc.nextLine();
                    listaCiber.get(opcaoEditarCib - 1).setDistroLinux(novaDistro);
                    System.out.println("Linguagem Editada com Sucesso!");
                    break;
            }
        }
    }

    public void deletarPessoa() {

        System.out.println("\nDe qual setor deseja deletar um usuário? | 1- Programador | 2- Cibersecurity |");
        int opcaoAreaDelete = sc.nextInt();
        sc.nextLine(); //limpeza

        ArrayList listaSelecionada = new ArrayList<>();


        if (opcaoAreaDelete == 1) {
            listaSelecionada = listaProgramador;
        } else if (opcaoAreaDelete == 2) {
            listaSelecionada = listaCiber;
        }

            System.out.println("Qual deseja deletar? ");
            int contador = 1;
            for (Object pessoa : listaSelecionada) {
                System.out.println(contador + " - " + pessoa);
                contador++;
            }
            int opcaoDeletar = sc.nextInt();
            sc.nextLine(); // limpar scanner
            listaSelecionada.remove(opcaoDeletar - 1);
            System.out.println("Usuário Deletado com Sucesso! ");
    }
}
