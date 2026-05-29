import java.util.ArrayList;

class Course{
private String name;
private int credits;
private double grades;

Course(String name, int credits){
    this.name=name;
    this.credits=credits;
}
public void setgrades(double grades){
    this.grades=grades;
}
public double getgrades(){
    return grades;
}
public int getcredits(){
    return credits;
}
public String getname(){
    return name;
}
public String GetLettergrade(){
    if(grades>=4.0) return "A";
    else if (grades >= 3.7) return "A-";
    else if (grades >= 3.4) return "B+";
    else if (grades >= 3.1) return "B";
    else if (grades >= 2.9) return "B-";
    else return "C";
}
}
class Student{
    private String name;
    private int Id;
    private ArrayList<Course> courses;

Student(String name, int Id){
    this.name=name;
    this.Id=Id;
    courses= new ArrayList<>();


}
public void addCourse(Course course){
    courses.add(course);
}
public void removeCourse(Course course){
    courses.remove(course);
}
public double getGPA(){
    if(courses.isEmpty()){
        return 0.0;
    }
    double total=0;
    for(Course course:courses){
        total+=course.getgrades();
    }
return total/courses.size();

}
public String gettransscript(){
    StringBuilder transcript=new StringBuilder();
    transcript.append("name:").append(name).append("\n");
    transcript.append("Id").append(Id).append("\n");
    for(Course course:courses){
        transcript.append("Course:").append(course.getname()).append("(").append(course.getcredits()).append("credits)\n").append("grade").append(course.getgrades()).append("(").append(course.GetLettergrade()).append(")\n\n");
        }
        return transcript.toString();
    
    }

}
public class Encap {
    public static void main(String[] args) {
        Course cs=new Course("Computer science",4);
        cs.setgrades(3.7);
        Student bob=new Student("bob", 67);
        bob.addCourse(cs);
        Course math=new Course("math",4);
        bob.addCourse(math);
        math.setgrades(4.0);
        Student jeffbazos=new Student("JeffBazos", 4);
        Course jeffbazos_cs=new Course("computer science", 4);
        jeffbazos_cs.setgrades(3.9);
        jeffbazos.addCourse(jeffbazos_cs);
        Course jeffbazos_math = new Course("math", 4);
        jeffbazos_math.setgrades(3.9);
        jeffbazos.addCourse(jeffbazos_math);
        System.out.println(" bob's Gpa is "+bob.getGPA());
        System.out.println("jeffbazos's Gpa is "+bob.getGPA());

      }
    
}




