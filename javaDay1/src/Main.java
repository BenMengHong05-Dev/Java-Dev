import java.util.Date;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner objInput = new Scanner(System.in);
        int id;
        String name;
        String sex;
        int age;
        String dateOfBirth;
        System.out.println("=============================>> Please Input Information <<=============================");

            System.out.println("Please Input Id : ");
            id = objInput.nextInt();

            System.out.println("Please Input Name : ");
            name = objInput.next();

            System.out.println("Please Input Sex : ");
            sex = objInput.next();

            System.out.println("Please Input Age : ");
            age = objInput.nextInt();

            System.out.println("Please Input DateOfBirth : ");
            dateOfBirth = objInput.next();

        InformationStudent(id,name,sex,age,dateOfBirth);


    }
    static void InformationStudent(int id ,String name ,String sex ,int age ,String dateOfBirth){
        System.out.println("=============================>> Output Information Student <<=============================");
        System.out.println("Student Id : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Student Sex : " + sex);
        System.out.println("Student Age : " + age);
        System.out.println("Student DateOfBirth : " + dateOfBirth);

    }
}