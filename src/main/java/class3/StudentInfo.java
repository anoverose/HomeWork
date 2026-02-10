package class3;
import java.util.ArrayList;
public class StudentInfo {
    String nameOfStudent;
    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<Integer> greades = new ArrayList<>();

    public StudentInfo(String nameOfStudent){
        this.nameOfStudent =nameOfStudent;
    }
    void addSubject(String subject){
        subjects.add(subject);
    }
    void addgreads (int greade){
        greades.add(greade);
    }
    double avarage(){
        if(greades.size()==0)return 0;
        int sum = 0;

        for(int grade: greades){
            sum+=grade;
        }
        return sum/greades.size();
    }
    void printInfo(){
        System.out.println("Student name: "+nameOfStudent);
        System.out.println("Subject: "+subjects);
        System.out.println("Greades: "+ greades);
        System.out.println("Average: "+ avarage());

    }

    public void addProduct(String subject) {
    }
}
