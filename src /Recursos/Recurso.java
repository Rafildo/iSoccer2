package Recursos;

import java.util.ArrayList;
import java.util.Scanner;

import static Utilitarios.Tratamento_erro.checkInt;

public class Recurso {

    public static boolean var = false;
    private String type;
    private String name;
    private boolean availability;

    private ArrayList<Recurso> recursos = new ArrayList<>();

    public ArrayList<Recurso> getRecursos() {
        return recursos;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Recurso(String type, String name, boolean availability)
    {
        this.type = type;
        this.name = name;
        this.availability = availability;
    }
    public Recurso selectResource()
    {
            System.out.println("1: Transporte");
            System.out.println("2: Centro de treinamento");
            System.out.println("3: Estádio");
            System.out.println("4: Voltar");
            int choice = checkInt();
            switch (choice) {
                case 1:
                    getResourceCommonData();
                    recursos.add(new Onibus("Ônibus",getName(),isAvailability()));
                    break;

                case 2:
                    getResourceCommonData();
                    Centro_treinamento centre = new Centro_treinamento(null,null,0,false);
                    centre.setDormitories();
                    recursos.add(new Centro_treinamento("Centro de treinamento",getName(),centre.getDormitories(),isAvailability()));
                    break;

                case 3:
                    getResourceCommonData();
                    Estadio stadium = new Estadio(null,null,0,0,0,false);
                    stadium.setCheerers();
                    stadium.setSnackbars();
                    stadium.setToilets();
                    recursos.add(new Estadio("Estádio",getName(),stadium.getCheerers(),stadium.getSnackbars(),stadium.getSnackbars(),availability));
                    break;
            }
            return recursos.get(recursos.size()-1);
    }

    public void getResourceCommonData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome/Código do recurso:");
        setName(input.nextLine());
        System.out.println("Disponível (Sim ou Não):");
        String available = input.nextLine();
        if (available.equals("Sim"))
        {
            setAvailability(true);
        }
        else if (available.equals("Não"))
        {
            setAvailability(false);
        }
    }

    public String toString()
    {
        String values = "";
        for (Recurso list : recursos)
        {
            values += list.toString() + " ";
            values += "\n";
        }
        return values;
    }
}