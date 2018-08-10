package Recursos;

import java.util.ArrayList;
import java.util.Scanner;
import Menu.*;

import static Utilitarios.Tratamento_erro.checkInt;

public class Estadio extends Recurso {
    public ArrayList<Estadio> stadium = new ArrayList<>();
    private int cheerers;
    private int toilets;
    private int snackbars;

    public int getToilets() {
        return toilets;
    }

    public void setToilets() {
        System.out.println("Número de banheiros:");
        this.toilets = checkInt();
    }

    public int getCheerers() {
        return cheerers;
    }

    public void setCheerers() {
        System.out.println("Número de torcedores:");
        this.cheerers = checkInt();
    }

    public int getSnackbars() {
        return snackbars;
    }

    public void setSnackbars() {
        System.out.println("Número de lanchonetes:");
        this.snackbars = checkInt();
    }

    public String isAvailable() {
        if (isAvailability()) {
            return "Disponível";
        } else {
            return "Não disponível";
        }
    }

    public Estadio(String type,String name, int cheerers, int snackbars, int toilets, boolean availability) {
        super(type , name, availability);
        this.toilets = toilets;
        this.cheerers = cheerers;
        this.snackbars = snackbars;
    }
}

   /* public void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar estádio");
        System.out.println("2: Verificar estádio");
        System.out.println("3: Verificar disponibilidade");
        System.out.println("4: Voltar ao menu");

        int choice = checkInt();

        switch (choice)
        {
            case 1:
                addStadium();
                break;

            case 2:
                findStadium();
                break;

            case 3:
                checkAvailability();
                break;

            case 4:
                selectResource();
                break;
        }

    }

    public void addStadium()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome do estádio");
        String stadiumname = input.nextLine();
        System.out.println("Número de torcedores");
        int cheerers = checkInt();
        System.out.println("Lanchonetes");
        int snackbars = checkInt();
        System.out.println("Banheiros");
        int toilets = checkInt();
        System.out.println("Disponível para uso? (Sim ou Não)");
        String availability = input.nextLine();
        if (availability.equals("Sim"))
        {
            stadium.add(new Estadio(stadiumname,cheerers,snackbars,toilets,true));
        }
        else if(availability.equals("Não"))
        {
            stadium.add(new Estadio(stadiumname,cheerers,snackbars,toilets,false));
        }
        else
        {
            while(true)
            {
                System.out.println("Por favor digite Sim ou Não!");
                availability = input.nextLine();
                if (availability.equals("Sim"))
                {
                    stadium.add(new Estadio(stadiumname,cheerers,snackbars,toilets,true));
                }
                else if(availability.equals("Não"))
                {
                    stadium.add(new Estadio(stadiumname,cheerers,snackbars,toilets,false));
                }
                break;
            }
        }

    }

    public String toString()
    {
        return("Nome do estádio: " + this.getName() + System.lineSeparator() +
                "Número de torcedores: " + this.getCheerers() + System.lineSeparator() +
                "Lanchonetes: " + this.getSnackbars() + System.lineSeparator() +
                "Banheiros: " + this.getToilets() + System.lineSeparator() +
                "Disponibilidade: " + this.isAvailable() + System.lineSeparator());
    }

    public  void findStadium()
    {
        Scanner input = new Scanner(System.in);

        if (stadium.isEmpty())
        {
            System.out.println("Não há recursos disponíveis");
        }
        else
        {
            System.out.println("Estádio a ser procurado");
            String nome = input.nextLine();
            for (int i = 0; i < stadium.size(); i++)
            {
                if (stadium.get(i).getName().equals(nome))
                {
                    System.out.println(stadium);
                }
                else
                {
                    System.out.println("Não encontrado");
                }
            }
        }
    }

    public static void checkAvailability()
    {
        int i = 0;
        if (!stadium.isEmpty())
        {
            for (Estadio list : stadium)
            {
                if (list.isAvailability())
                {
                    i++;
                }
            }
            System.out.print("Estádios disponíveis:");
            System.out.println(i);
        }
        else
        {
            System.out.println("Não há recursos disponíveis");
        }
    }

}*/
