import java.util.*;

class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      Collections.sort(studentList,new Comparator<Student>(){
         public int compare(Student a,Student b)
             {
             if(b.getCgpa()!=a.getCgpa())
                 return new Double(b.getCgpa()).compareTo(new Double(a.getCgpa()));
             else if(b.getFname().compareTo(a.getFname())!=0)
                 return a.getFname().compareTo(b.getFname());
             else
                 return new Integer(a.getId()).compareTo(new Integer(b.getId()));
                 
         }
      });
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
