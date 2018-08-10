package Recursos;
import Menu.*;

import java.util.ArrayList;

import static Utilitarios.Tratamento_erro.checkInt;

public class Centro_treinamento extends Recurso {
    public ArrayList<Centro_treinamento> centre = new ArrayList<>();

    private int dormitories;

    public Centro_treinamento(String type,String name,int dormitories,boolean availability)
    {
        super(type,name,availability);
        this.dormitories = dormitories;
    }

    public int getDormitories() {
        return dormitories;
    }

    public void setDormitories() {

        System.out.println("Número de dormitórios:");
        this.dormitories = checkInt();
    }



    /*public void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar centro de treinamento");
        System.out.println("2: Verificar disponibilidade");
        System.out.println("3: Ver número de dormitórios");
        System.out.println("4: Voltar ao menu");

        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                addCentre();
                break;

            case 2:
                checkAvailability();
                break;

            case 3:
                findDormitories();
                break;

            case 4:
                selectResource();
        }
    }

    public void addCentre()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Número de dormitórios:");
        int dormitories = checkInt();
        if (availability.equals("Sim"))
        {
            centre.add(new Centro_treinamento(centrename,dormitories,true));
        }
        else if (availability.equals("Não"))
        {
            centre.add(new Centro_treinamento(centrename,dormitories,false));
        }
    }

    public void findDormitories()
    {
        Scanner input = new Scanner(System.in);

        if (centre.isEmpty())
        {
            System.out.println("Não há recursos disponíveis");
        }
        else
        {
            System.out.println("Centro a ser procurado:");
            String nome = input.nextLine();

            for (int i = 0; i < centre.size(); i++)
            {
                if (centre.get(i).getName().equals(nome))
                {
                    System.out.println(centre.get(i).getDormitories());
                }
                else
                {
                    System.out.println("Não encontrado");
                }
            }
        }
    }

    public void checkAvailability()
    {
        int i = 0;
        if (!centre.isEmpty())
        {
            for (Centro_treinamento list : centre)
            {
                if (list.isAvailability())
                {
                    i++;
                }
            }
            System.out.print("Centros disponíveis:");
            System.out.println(i);
        }
        else
        {
            System.out.println("Não há recursos disponíveis");
        }
    }*/

}