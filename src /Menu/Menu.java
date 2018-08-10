package Menu;
import Pessoas.Funcionarios.*;
import Pessoas.Socio_torcedor;
import Pessoas.Administrador;
import Information.*;
import Recursos.*;

import java.util.*;

import static Utilitarios.Tratamento_erro.checkInt;

public class Menu {
    private ArrayList<Funcionarios> employee = new ArrayList<>();
    private ArrayList<Socio_torcedor> torcedor = new ArrayList<>();
    private ArrayList<Recurso> resource = new ArrayList<>();
    static boolean isLogged = false;

    public void displayMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao iSoccer!");
        if (!isLogged) {
            System.out.println("Login: ");
            String login = input.nextLine();
            System.out.println("Senha: ");
            String password = input.nextLine();
            Administrador admin = new Administrador(login, password);
            if (login.equals(admin.getLogin()) && password.equals(admin.getPassword())) {
                    isLogged = true;
                    System.out.println("Administrador logado com sucesso!");
                }
            else
            {
                System.out.println("Usuário ou senha inválidos");
            }

        } else {
            System.out.println("1: Adicionar funcionário");
            System.out.println("2: Adicionar sócio-torcedor");
            System.out.println("3: Editar sócio-torcedor");
            System.out.println("4: Adicionar recurso");
            System.out.println("5: Relatórios");

            int choice = checkInt();

            switch (choice) {
                case 1:
                    Funcionarios func = new Funcionarios(null,null,null,null,null,0.0);
                    func.setEmployeeType();
                    employee.add(func);
                    break;

                case 2:
                    Socio_torcedor torc = new Socio_torcedor(null,null,null,null,null,
                            0.0, null,false);
                    torc.getCheerer();
                    torcedor.add(torc);
                    break;


                case 3:
                   // torcedor.editContributionValue();
                    break;

                case 4:
                    Recurso rec = new Recurso(null,null,false);
                    rec.selectResource();
                    resource.add(rec);
                    System.out.println(resource.toString());
                    break;

                case 5:
                   // new Relatorios().Menu();
                    break;
            }
        }
    }
}

