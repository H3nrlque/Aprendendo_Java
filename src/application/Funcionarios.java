package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("How many employees will be registered: ");
        int n = tc.nextInt();
        Employee[] vetor = new Employee[n];
        System.out.println();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(STR."Employee #\{i + 1}: ");
            System.out.print("Id: ");
            int id = tc.nextInt();
            list.add(id);
            tc.nextLine();
            System.out.print("Name: ");
            String name = tc.nextLine();
            System.out.print("Salary: ");
            double salary = tc.nextDouble();
            System.out.println();
            vetor[i] = new Employee(id, name, salary);
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int increase = tc.nextInt();
        String r = null;
        for (int i = 0; i < vetor.length; i++) {
            if (list.get(i) == increase) {
                System.out.print("Enter the percentage: ");
                double percentage = tc.nextDouble();
                vetor[i].IncreaseSalary(vetor[i].getSalary(), percentage);
            } else if(list.get(i) != increase){
                 r = "This id does not exist!";
            }
        }
        System.out.println(r);
        System.out.println();
        System.out.println("List of employees: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);

        }
















    }
}
