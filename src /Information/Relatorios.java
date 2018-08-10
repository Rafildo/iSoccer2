package Information;
import Pessoas.*;
import Pessoas.Funcionarios.*;
import Pessoas.Socio_torcedor.*;
import Recursos.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Utilitarios.Tratamento_erro.checkInt;

public class Relatorios {

    private ArrayList<Funcionarios> employee;
    public ArrayList<Recurso> resource = new Recurso(null,null,false).getRecursos();
    public ArrayList<Socio_torcedor> torcedor = new Socio_torcedor(null,null,null,null,
            null,0.0,null,false).getTorcedor();

    /*public Relatorios() {

    }

    public Relatorios(ArrayList<Funcionarios> employee) {
        this.employee = employee;
    }*/

    public Relatorios()
    {
        this.employee = new Funcionarios(null,null,null,null,null,0.0).getEmployee();
    }

    public ArrayList<Funcionarios> getEmployee(){
        return employee;
    }

    public void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Relatório do time");
        System.out.println("2: Lista de jogadores aptos");
        System.out.println("3: Lista de jogadores não aptos");
        System.out.println("4: Lista de funcionários");
        System.out.println("5: Lista de recursos");
        System.out.println("6: Lista de sócios-torcedores");
        System.out.println("7: Teste");

        int choice = checkInt();
        switch (choice)
        {
            case 1:
                teamReport();
                break;

            case 2:
                playerStatus(1);
                break;

            case 3:
                playerStatus(0);
                break;

            case 4:
                employeeReport();
                break;

            case 5:
                resourceReport();
                break;

            case 6:
                cheererReport();
                break;

            case 7:
                test();
                break;

        }

    }

    public void test()
    {
        System.out.println();
    }

    public void teamReport()
    {

        if (!employee.isEmpty()) {
            System.out.println("oi");
            for (int i = 0; i < employee.size(); i++) {
                if (employee.get(i).getEmployeeType().equals("Treinador")) {
                    System.out.println(employee);
                    break;
                } else {
                    System.out.println("Treinador não encontrado");
                    break;
                }
            }
            for (int i = 0; i < employee.size(); i++) {
                if (employee.get(i).getEmployeeType().equals("Jogador")) {
                    System.out.println(employee);
                } else {
                    System.out.println("Não foram encontrados jogadores");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Não há funcionários");
        }
    }

    public void playerStatus(int i)
    {
        if (!Jogador.able.isEmpty()) {
            if (i == 1) {
                for (String list : Jogador.able) {
                    System.out.println(list);
                }
            }
        }
        if (Jogador.unable.isEmpty()) {
            if (i == 0) {
                for (String list : Jogador.unable) {
                    System.out.println(list);
                }
            }
        }
        else
        {
            System.out.println("Não há jogadores");
        }
    }

    public void employeeReport()
    {
        Scanner input = new Scanner(System.in);
        if (!employee.isEmpty()) {
            System.out.println("Tipo de funcionário a ser listado");
            String type = input.nextLine();

            switch (type) {
                case "Médico":
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getEmployeeType().equals("Médico")) {
                            System.out.println(employee);
                        } else {
                            System.out.println("Não foi encontrado médico");
                        }
                    }
                    break;

                case "Presidente":
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getEmployeeType().equals("Presidente")) {
                            System.out.println(employee);
                        } else {
                            System.out.println("Não foi encontrado presidente");
                        }
                    }
                    break;

                case "Preparador Físico":
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getEmployeeType().equals("Preparador Físico")) {
                            System.out.println(employee);
                        } else {
                            System.out.println("Não foram encontrados preparadores físicos");
                        }
                    }
                    break;

                case "Motorista":
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getEmployeeType().equals("Motorista")) {
                            System.out.println(employee);
                        } else {
                            System.out.println("Não foram encontrados motoristas");
                        }
                    }
                    break;

                case "Cozinheiro":
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getEmployeeType().equals("Cozinheiro")) {
                            System.out.println(employee);
                        } else {
                            System.out.println("Não foram encontrados cozinheiros");
                        }
                    }
                    break;

                case "Advogado":
                    for (int i = 0; i < employee.size(); i++) {
                        if (employee.get(i).getEmployeeType().equals("Advogado")) {
                            System.out.println(employee);
                        } else {
                            System.out.println("Não foram encontrados advogados");
                        }
                    }
                    break;
            }
        }
        else
        {
            System.out.println("Não há funcionários");
        }
    }

    public void resourceReport()
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("Escolha o recurso: (Ônibus , Centro de treinamento ou Estádio)");
        String resourcekind = input.nextLine();
        switch(resourcekind)
        {
            case "Ônibus":
                if (!resource.isEmpty()) {
                    for (Recurso list : resource ) {
                        if (list.getType().equals("Ônibus")) {
                            System.out.print("Ônibus:");
                            System.out.println(list);
                        }
                    }
                }
                else
                {
                    System.out.println("Não foram encontrados transportes");
                }
                break;

            case "Centro de treinamento":
               if (!resource.isEmpty())
               {
                   for (Recurso list : resource)
                   {
                       if (list.getType().equals("Centro de treinamento")){
                           if (list.isAvailability())
                           {
                               System.out.println("Disponível");
                           }
                           else
                           {
                               System.out.println("Não disponível");
                           }
                       }
                   }
               }
               else
               {
                   System.out.println("Não foi encontrado centro de treinamento");
               }
               break;

            case "Estádio":
                if (!resource.isEmpty())
                {
                    for (Recurso list : resource)
                    {
                        if (list.getType().equals("Estádio")){
                            if (list.isAvailability())
                            {
                                System.out.println("Disponível");
                            }
                            else
                            {
                                System.out.println("Não disponível");
                            }
                        }

                    }
                }
                else
                {
                    System.out.println("Não foi encontrado estádio");
                }
        }

    }

    public void cheererReport()
    {
        ArrayList<String> adimplente = new Socio_torcedor(null,null,null,null,
                null,0.0,null,false).getInTime();
        ArrayList<String> inadimplente = new Socio_torcedor(null,null,null,null,
                null,0.0,null,false).getNotInTime();

        if (!adimplente.isEmpty()) {
            System.out.println("Lista de sócios-torcedores adimplentes:");
            for (String list : adimplente) {
                System.out.println(list);
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista de sócios-torcedores inadimplentes");
            for (String list : inadimplente) {
                System.out.println(list);
            }
            System.out.println();
            System.out.print("Quantidade:");
            System.out.println(torcedor.size());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista com dados individuais");
                for (Socio_torcedor list : torcedor) {
                    System.out.println(list);
                }
            } else {
                System.out.println("Não foram encontrados sócios-torcedores");
            }
        }
    }

