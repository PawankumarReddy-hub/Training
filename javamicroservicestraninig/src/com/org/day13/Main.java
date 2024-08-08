package com.org.day13;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        
        List<Employe> empList = getEmpList();
        empList.stream().filter(e -> e.getGender().equals("Female")).forEach(e -> System.out.println(e));
        
        empList.stream().filter(e -> e.getNewJoiner().equals("True")).forEach(e -> System.out.println(e));
        
        empList.stream()
        .sorted(Comparator.comparing(Employe::getRating))
        .forEach(e -> System.out.println(e));
        
        empList.stream()
        .sorted(Comparator.comparing(Employe::getRating).reversed())
        .forEach(e -> System.out.println(e));
        
        empList.stream()
        .sorted(Comparator.comparing(Employe::getSalary))
        .sorted(Comparator.comparing(Employe::getRating))
        .forEach(e -> System.out.println(e));
        
        boolean isSalary = empList.stream()
                .allMatch(e -> e.getSalary() > 1000);
        System.out.println(isSalary);
        
        empList.stream()
        .max(Comparator.comparing(Employe::getSalary))
        .ifPresent(System.out::println);
        
        empList.stream()
        .max(Comparator.comparing(Employe::getRating))
        .ifPresent(System.out::println);
        
        empList.stream()
        .min(Comparator.comparing(Employe::getSalary))
        .ifPresent(System.out::println);
        
        empList.stream()
        .min(Comparator.comparing(Employe::getRating))
        .ifPresent(System.out::println);
        
        Map<String, List<Employe>> employeesBygender = empList.stream()
                .collect(Collectors.groupingBy(Employe::getGender));
employeesBygender.forEach(((g,e)->{
            System.out.println(g);
            e.forEach(System.out::println);
        }));
}
    
    
public static List<Employe> getEmpList(){
        return Arrays.asList(
                new Employe("59-385-1088","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0),
                new Employe("73-274-6476","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2),
                new Employe("85-939-9584","Axe","Gumb","agumb2@twitter.com","Female","FALSE",62291,4),
                new Employe("08-180-8292","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4),
                new Employe("21-825-2623","Ulick","Burrel","uburrel4@google.ru","Male","FALSE",128764,5),
                new Employe("66-708-5539","Tailor","Ridding","Ridding","Female","FALSE",152924,4),
                new Employe("81-697-2363","Joete","Braybrooke","jbraybrooke6@prnewswire.com","Male","TRUE",128907,0),
                new Employe("63-019-1110","Elroy","Baverstock","ebaverstock7@ehow.com","Male","TRUE",2510,0)
        );
    }


}
