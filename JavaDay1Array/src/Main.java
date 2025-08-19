import java.util.Arrays;
import java.util.Scanner;

public  class Main{
    public static void main(String[] args){


//        String[] name = {"Developer","Designer","Mobile App"};
//        System.out.println("Name In Array index Normal Specific Index:" + name[0]);
//
//
//        System.out.println("===================  Loop with array  ===================");
//        for(int i =0;i<= name.length-1;i++){
//            System.out.println("Name In Array index Not Specific Index:" +name[i]);
//        }

        // use input to array
//        String[] InputName = new String[3];
//        Scanner objInput = new Scanner(System.in);
//        for (int i =0;i<= InputName.length -1;i++){
//            System.out.println("Please Input Name of Array Index" + i + ":");
//            InputName[i] = objInput.next();
//        }
//        System.out.println("Output Array " + Arrays.toString(InputName));


//        array two

//        int[][] ArrayId = new int[1][2];
//        Scanner ObjArrayId = new Scanner(System.in);
//        for(int i =0;i<=ArrayId.length-1;i++){
//            for(int j= 0;j<=ArrayId[i].length-1;j++){
//                ArrayId[i][j] = ObjArrayId.nextInt();
//            }
//
//        }
//        for(int i =0;i<=ArrayId.length-1;i++){
//            System.out.println(Arrays.toString(ArrayId[i]));
//        }


        // create information employee with 2d array
        int employeeNumber = 2;
        int employessInformation = 5;
        Scanner objEmployee = new Scanner(System.in);
        String[][] employee = new String[employeeNumber][employessInformation];
        String dateOfBirth;
        for(int i = 0 ; i <= employee.length - 1;i++){
            for(int j = 0 ; j <= employee[i].length - 1;j++){
                employee[i][j] =  objEmployee.next();
            }
        }
        for (int i = 0 ; i <= employee.length - 1;i++){
            System.out.println(Arrays.toString(employee[i]));
        }


    }
}