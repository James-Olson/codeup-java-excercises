package grades;

import java.util.ArrayList;

public class Student {

        private String name;
        private ArrayList <Integer> grades;

        public Student(String name) {
                this.name = name;
                this.grades = new ArrayList <>();
        }

        public String getName(){
                return name;
        }
        public void addGrade(int grade){
                this.grades.add(grade);
        }
        // returns the average of the students grades
        // could use .filter if in script
        //double sum = 0;
        //public double getGradeAverage(int grades){
        //        return for(int i=0; i < args.length; i++){
        //}



        

}
