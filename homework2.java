import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] studentArray = new Student[3];
        studentArray[0] = new Student();
        studentArray[1] = new Student();
        studentArray[2] = new Student();
        for (int i = 0; i < 3; i++) {
            System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            studentArray[i].setSchool_id(sc.nextInt());
            studentArray[i].setName(sc.next());
            studentArray[i].setMajor(sc.next());
            studentArray[i].setNum(sc.nextLong());
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d %s %s %s\n",studentArray[0].getSchool_id(), studentArray[0].getName(), studentArray[0].getMajor(), studentArray[0].getNum());
        }

    }
}

class Student{
    int school_id;
    String name;
    String major;
    long num;

    void setSchool_id(int school_id){
        this.school_id = school_id;
    }
    void setName(String name){
        this.name = name;
    }
    void setMajor(String major){
        this.major = major;
    }
    void setNum(long num){
        this.num = num;
    }
    int getSchool_id(){
        return school_id;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }
    String getNum(){
        String num2 = Long.toString(num);
        return "010-" + num2.substring(3,7) + "-" + num2.substring(7);
    }
}