package Pessoas;

import Pessoas.Funcionarios.Funcionarios;

import java.util.ArrayList;
import java.util.Scanner;
import static Utilitarios.Tratamento_erro.*;

public class Socio_torcedor {
    public ArrayList <Socio_torcedor> torcedor = new ArrayList<>();
    public ArrayList<String> inTime = new ArrayList<>();
    public ArrayList<String> notInTime = new ArrayList<>();

    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String address;
    private Double contribution;
    private String type;
    private boolean status;

    public ArrayList<Socio_torcedor> getTorcedor() {
        return torcedor;
    }

    public ArrayList<String> getInTime() {
        return inTime;
    }

    public ArrayList<String> getNotInTime() {
        return notInTime;
    }

    public Socio_torcedor(String name, String email, String cpf, String phone, String address, Double contribution,
                          String type, boolean status)
    {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.phone = phone;
        this.address = address;
        this.contribution = contribution;
        this.type = type;
        this.status = status;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public  Double getContribution() {
        return contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

    public  String getType() {
        return type;
    }

    public  void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public  String isStatus() {
        if (status)
        {
            return "Adimplente";
        }
        else
        {
            return "Inadimplente";
        }
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Socio_torcedor getCheerer()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        setName(input.nextLine());
        System.out.println("Email:");
        setEmail(input.nextLine());
        System.out.println("CPF:");
        setCpf(input.nextLine());
        System.out.println("Telefone:");
        setPhone(input.nextLine());
        System.out.println("Endereço:");
        setAddress(input.nextLine());
        System.out.println("Valor da contribuição:");
        setContribution(checkContribution());
        System.out.println("Status do pagamento: (1 para adimplente ou 0 para inadimplente)");
        int option = checkInt();
        if (option == 1)
        {
            setStatus(true);
            inTime.add(name);
        }
        else if(option == 0)
        {
            setStatus(false);
            notInTime.add(name);
        }
        else
        {
           while(true)
           {
               System.out.println("Por favor digite 0 ou 1");
               option = checkInt();

               if (option == 1 || (option == 0))
               {
                   if (option == 1)
                   {
                       setStatus(true);
                       inTime.add(name);
                   }
                   else if (option == 0)
                   {
                      setStatus(false);
                      notInTime.add(name);
                   }
                   break;
               }
           }
        }
        torcedor.add(new Socio_torcedor(getName(),getEmail(),getCpf(),getPhone(),getAddress(),getContribution(),checkType(getContribution()),getStatus()));
        return torcedor.get(torcedor.size()-1);
    }

    public Double checkContribution()
    {
        if (contribution != 50 && contribution != 110 && contribution != 180)
        {
            while(true)
            {
                System.out.println("Por favor escolha 50,110 ou 180");
                contribution = checkDouble();
                if (contribution == 50 || contribution == 110 || contribution == 180)
                {
                    return contribution;
                }
            }
        }
        else
        {
            return contribution;
        }
    }

    public String checkType(Double contribution)
    {
        if (contribution == 50)
        {
            type = "Júnior";
        }
        else if(contribution == 110)
        {
            type = "Sênior";
        }
        else if(contribution == 180)
        {
            type = "Elite";
        }
        else
        {
            while(true)
            {
                System.out.println("Por favor escolha 50,110 ou 180");
                setContribution(checkDouble());
                if (getContribution() == 50)
                {
                    type = "Júnior";
                }
                else if(getContribution() == 110)
                {
                    type = "Sênior";
                }
                else if(getContribution() == 180)
                {
                    type = "Elite";
                }
                break;

            }
        }
        return type;
    }

    public String toString()
    {
        return("Nome: " + this.getName() + System.lineSeparator() +
        "Email: " + this.getEmail() + System.lineSeparator() +
        "CPF: " + this.getPhone() + System.lineSeparator() +
        "Endereço: " + this.getAddress() + System.lineSeparator() +
        "Contribuição: " + this.getContribution() + System.lineSeparator() +
        "Tipo: " + this.getType() + System.lineSeparator() +
        "Situação de pagamento: " + this.isStatus() + System.lineSeparator());
    }

    public void editContributionValue()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o sócio-torcedor");
        String cheerer = input.nextLine();
        for (int i = 0; i < torcedor.size() ; i++)
        {
            if (torcedor.get(i).getName().equals(cheerer))
            {
                System.out.println("Digite o novo valor da contribuição");
                contribution = checkDouble();
                System.out.println("Digite a nova situação de pagamento (1 para adimplente ou 0 para inadimplente)");
                int statusint = checkInt();
                if (statusint == 1)
                {
                    status = true;
                }
                else if (statusint == 0)
                {
                    status = false;
                }
                else
                {
                    while(true)
                    {
                        System.out.println("Por favor digite 1 ou 0!");
                        statusint = checkInt();
                        if (statusint == 1)
                        {
                            status = true;
                            break;
                        }
                        else if ( statusint == 0)
                        {
                            status = false;
                            break;
                        }
                    }
                }

            }
            else
            {
                System.out.println("Sócio-torcedor não encontrado");
            }
        }
    }
}
