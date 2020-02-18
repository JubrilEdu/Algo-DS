package HackerRank;


public class PriorityQueueSolution {

    public class Student {
        private String name;
        private int id;
        private double cgpa;

        public Student(int id, String name, double cgpa){
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getId(){
            return  id;
        }

        public String getName(){
            return name;
        }

        public double getCgpa(){
            return  cgpa;
        }
    }
}
