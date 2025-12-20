package org.bluescope.problems;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Employee {

  int id;
  String name ;
  double Salary;
  String Gender;


public Employee(int id,String name,double Salary,String Gender){
    this.id=id;
    this.name=name;
    this.Salary=Salary;
    this.Gender=Gender;

}

}


class table{

    public static void main (String[] args){
        Map<Integer, Employee> mp=new HashMap<>();
        Employee emp1=new Employee(1,"Sasi",35000,"Male");
        Employee emp2 =new Employee(2,"Bharani",2500,"Male");
        Employee emp3=new Employee(3,"Thanush",60000,"Male");
        Employee emp4=new Employee(4,"Yudhika",75000,"Female");
        Employee emp5=new Employee(5,"jaya",22000,"Female");


        mp.put(1,emp1);
        mp.put(2,emp2);
        mp.put(3,emp3);
        mp.put(4,emp4);
        mp.put(5,emp5);

      double Highest=Double.MIN_VALUE;
      double lowest=Double.MAX_VALUE;

      String nameM ="";
      String nameF="";

      for(Employee em :mp.values()){
          if(em.Gender.equalsIgnoreCase("Male")){
              if(em.Salary>Highest){
                  Highest=em.Salary;
                  nameM=em.name;
              }
          }

          if(em.Gender.equalsIgnoreCase("Female")){
              if(em.Salary<Highest){
                  lowest=em.Salary;
                  nameF=em.name;
              }
          }
      }

      System.out.println("Highest salary  " + " " +nameM + ":" +Highest);
      System.out.println("Lowest salary  " + " " + nameF + " " +lowest);

    }



}