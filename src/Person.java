 class Person {
     public String Name;
     public double Salary;

     public double Employee(String Name, double vararg []) {
         double res = 0;
         for (double x : vararg) {
             res +=x;  }
         System.out.print(Name+" zarabotal : "+res +"$");
         return res;   }}
