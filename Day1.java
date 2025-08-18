











public class Day1{
    public static void main(String[] args){
        // primitive in java
        // int a = 10;
        // double b =2.20d;
        // char c = 'M';
        // boolean status = true;
        // float numberofFloart = 2.5f;
        // byte minNumber = 1;
        // short minShort = 2;
        // long bigNumber = 10000000000L;

        // System.out.println(a +"\n" + b+"\n"+c+"\n"+status+"\n"+numberofFloart+"\n"+minNumber+"\n"+minShort+"\n"+bigNumber);
        
        // primitive in bolean


        // int a =10;
        // int b = 20;
        // int c = 30;
        // double sum = a + b +c;
        // System.out.println(sum);
        // int x = 5;
        // System.out.println(x++ + ++x);
        // String s1 = "Hello";
        // String s2 = "Horld";
        // System.out.println(s1 == s2);
        // System.out.println(s1.concat(s2));

        // int num1 = 10;
        // int num2 = 50;
        // System.out.println(num1 + num2);
        // String numS1 = "10";
        // String numS2 = "50";
        // System.out.println(numS1 + numS2);


        // find to max or min number of java

        // int maxA = 5;
        // int maxB = 10;
        // System.out.println("Max Number of Row this :" +Math.max(maxA,maxB) + "\n" +"Min Number of Row this : " + Math.min(maxA,maxA));
        // int randomNumber = (int)(Math.random() * 100);
        // System.out.println( randomNumber + "   "+ (int)(Math.sqrt(randomNumber)) + " default random number is :"  + (int)(Math.sqrt(randomNumber)) * (int)(Math.sqrt(randomNumber)));

        // boolean isTrue = true;
        // if(isTrue){
        //     System.out.println("This is condition is True");
        // }else{
        //     System.out.println("This is condition is False");
        // }


        // int a = 20;
        // int b = 10;
        // if(a <= b){
        //     System.out.println("A is less than B");
        // }
        // // else if(a >= b){
        // //     System.out.println("A is greater than B");
        // // }
        // else if(a == b){
        //     System.out.println("A is not equal to B");
        // }

        // int number = a > b ? a : b;
        // System.out.println(number);

        // Scanner obj = new Scanner(System.in);
        // System.out.println("Enter your Number of Car: ");
        // int carNumber = obj.nextInt();
        // switch(carNumber){
        //     case 1:
        //         System.out.println("Car is number 100");
        //         break;
        //     case 2:
        //         System.out.println("Car is number 200");
        //         break;
        //     case 3:
        //         System.out.println("Car is number 300");
        //         break;
        //     case 4:
        //         System.out.println("Car is number 400");
        //         break;
        //     default:
        //         System.out.println("Car is not available");
        //         break;
        // }

        int[]  numberArr = new int[5];
        numberArr[0] = 10;
        numberArr[1] = 20;
        numberArr[2] = 30;
        numberArr[3] = 40;
        numberArr[4] = 50;
        // boolean isTrueG = true;
        // int i =0;
        // while(isTrueG){
        //     System.out.println(numberArr[i]); 
        //     i++;
        // }

        // do{
        //     System.out.println(numberArr[i]);
        //     i++;
        // }while(i<numberArr.length -1);
    
        String[] idstudent = {"001","002","003"};
        int i =0;
        do { 
            System.out.println(idstudent[i]);
            i++;
            if(i == 2){
                break;
            }
        } while (true);


        // for loop in java
        for (int h =0;h <numberArr.length;h++){
            if(h == 4){
                break;  // or continue
            }
            System.out.println(numberArr[h]);
        }
        

        for(int numberArray : numberArr){
            System.out.println(numberArray);
        }


    }
}