public class test{
    public class Student{
        int prn;
        String name;

        Student(int prn, String name){
            this.prn = prn;
            this.name = name;
        }

        public String toString(){
            return "\nPRN: " +prn+ "\nName: " + name;
        }
    }

    public static void main(String[] args){
        test instance = new test();
        Student s1 = instance.new Student(58,"Om");
        System.out.println(s1.toString());
    }    
}