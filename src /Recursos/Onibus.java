package Recursos;

import Menu.*;

import java.util.ArrayList;
import java.util.Scanner;

import static Utilitarios.Tratamento_erro.checkInt;

public class Onibus extends Recurso{
    public ArrayList<Onibus> bus = new ArrayList<>();

    public Onibus(String type,String name, boolean availability)
    {
        super(type,name,availability);
    }
   /* public void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Adicionar transporte");
        System.out.println("2: Verificar transporte");
        System.out.println("3: Verificar disponibilidade");
        System.out.println("4: Voltar ao menu");
        int choice = checkInt();

            switch (choice) {
                case 1:
                    addBus();
                    break;

                case 2:
                    findBus();
                    break;

                case 3:
                    checkAvailability();
                    break;

                case 4:
                    selectResource();
                    break;
            }
    }

    public void addBus()
    {
        Scanner input = new Scanner(System.in);
    }

    public void findBus()
    {
        if (bus.isEmpty())
        {
            System.out.println("Não há recursos disponíveis");
        }
        else {
            for (Onibus list : bus) {
                    System.out.print("Ônibus : ");
                    System.out.println(list.getName());
            }
        }
    }

    public void checkAvailability()
    {
        int i = 0;
        if (!bus.isEmpty()) {
            for (Onibus list : bus) {
                if (list.isAvailability()) {
                    i++;
                }
            }
        }
        else
        {
            System.out.println("Não há recursos disponíveis");
        }
        System.out.print("Ônibus disponíveis:");
        System.out.println(i);
    }*/
}
