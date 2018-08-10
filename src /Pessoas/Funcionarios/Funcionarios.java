package Pessoas.Funcionarios;

import java.util.ArrayList;
import Utilitarios.Tratamento_erro;
import java.util.Scanner;

import static Utilitarios.Tratamento_erro.checkDouble;

public class Funcionarios {
    private ArrayList<Funcionarios> employee = new ArrayList<>();
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private Double salary;
    private String employeeType;

    public ArrayList<Funcionarios> getEmployee() {
        return employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public Funcionarios setEmployeeType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de funcionário:");
        this.employeeType = input.nextLine();
        return manageEmployeeType(employeeType);
    }
    public Funcionarios(String employeeType,String name, String email, String cpf,String phone, Double salary)
    {
        this.employeeType = employeeType;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.salary = salary;
    }

    public Funcionarios manageEmployeeType(String employeeType)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        setName(input.nextLine());
        System.out.println("Email:");
        setEmail(input.nextLine());
        System.out.println("CPF:");
        setCpf(input.nextLine());
        System.out.println("Salário:");
        setSalary(checkDouble());
        System.out.println("Telefone:");
        setPhone(input.nextLine());
        switch(employeeType)
        {
            case "Médico":
                System.out.println("CRM:");
                String crm = input.nextLine();
                employee.add(new Medico(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary(),crm));
                break;

            case "Motorista":
                System.out.println("Número de habilitação");
                String licensenumber = input.nextLine();
                employee.add(new Motorista(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary(),licensenumber));
                break;

            case "Jogador":

                System.out.println("Posição do jogador:");
                String position = input.nextLine();
                System.out.println("Disponível(Sim ou Não):");
                String availability = input.nextLine();
                if (availability.equals("Sim")) {
                    employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(),
                            getPhone(), getSalary(),
                            position, true));
                    Jogador.able.add(getName());
                }
                else if (availability.equals("Não")) {
                    employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(),
                            getPhone(), getSalary(),
                            position, false));
                    Jogador.unable.add(getName());
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Por favor digite Sim ou Não!");
                        availability = input.nextLine();
                        if (availability.equals("Sim") || (availability.equals("Não")))
                        {
                            if (availability.equals("Sim"))
                            {
                                employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(), getPhone(), getSalary(),
                                        position, true));
                                Jogador.able.add(getName());
                            }
                            else if (availability.equals("Não"))
                            {
                                employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(), getPhone(), getSalary(),
                                        position, false));
                                Jogador.unable.add(getName());
                            }
                            break;
                        }
                    }
                }
                break;

            case "Presidente":
                employee.add(new Presidente(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Preparador Físico":
                employee.add(new Preparador_Fisico(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Cozinheiro":
                employee.add(new Cozinheiro(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Advogado":
                employee.add(new Advogado(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Treinador":
                employee.add(new Treinador(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;
        }
            return employee.get(employee.size()-1);
        }

        public String toString()
        {
            String values ="";
            for (Funcionarios list : employee)
            {
                values += list.toString() + " ";
                values += "\n";
            }
            return values;
        }
}




    /*public void manageEmployeeType(String employeeType)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        setName(input.nextLine());
        System.out.println("Email:");
        setEmail(input.nextLine());
        System.out.println("CPF:");
        setCpf(input.nextLine());
        System.out.println("Salário:");
        setSalary(checkDouble());
        input.nextLine();
        System.out.println("Telefone:");
        setPhone(input.nextLine());
        switch(employeeType)
        {
            case "Médico":
                System.out.println("CRM:");
                String crm = input.nextLine();
                employee.add(new Medico(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary(),crm));
                for (Funcionarios list: employee)
                {
                    System.out.println(list);
                }
                break;

            case "Motorista":
                System.out.println("Número de habilitação");
                String licensenumber = input.nextLine();
                employee.add(new Motorista(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary(),licensenumber));
                break;

            case "Jogador":

                System.out.println("Posição do jogador:");
                String position = input.nextLine();
                System.out.println("Disponível(Sim ou Não):");
                String availability = input.nextLine();
                if (availability.equals("Sim")) {
                    employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(),
                            getPhone(), getSalary(),
                            position, true));
                    Jogador.able.add(getName());
                }
                else if (availability.equals("Não")) {
                    employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(),
                            getPhone(), getSalary(),
                            position, false));
                    Jogador.unable.add(getName());
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Por favor digite Sim ou Não!");
                        availability = input.nextLine();
                        if (availability.equals("Sim") || (availability.equals("Não")))
                        {
                            if (availability.equals("Sim"))
                            {
                                employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(), getPhone(), getSalary(),
                                        position, true));
                                Jogador.able.add(getName());
                            }
                            else if (availability.equals("Não"))
                            {
                                employee.add(new Jogador(getEmployeeType(), getName(), getEmail(), getCpf(), getPhone(), getSalary(),
                                        position, false));
                                Jogador.unable.add(getName());
                            }
                            break;
                        }
                    }
                }
                break;

            case "Presidente":
                employee.add(new Presidente(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Preparador Físico":
                employee.add(new Preparador_Fisico(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Cozinheiro":
                employee.add(new Cozinheiro(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Advogado":
                employee.add(new Advogado(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;

            case "Treinador":
                employee.add(new Treinador(getEmployeeType(),getName(),getEmail(),getCpf(),getPhone(),getSalary()));
                break;
        }
    }*/

