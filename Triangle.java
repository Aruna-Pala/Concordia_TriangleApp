
public class Triangle {
    public static void main(String[] args) {
        System.out.println("------Started------");
        Triangle t1 = new Triangle();
        System.out.println("Please Enter the values between 1 to 8");
        System.out.println("Enter the value side a :");
        String a = System.console().readLine();
        int side_a = validateSidesValue(Integer.parseInt(a));
        System.out.println("Enter the value side b :");
        String b = System.console().readLine();
        int side_b = validateSidesValue(Integer.parseInt(b));
        System.out.println("Enter the value side c :");
        String c = System.console().readLine();
        int side_c = validateSidesValue(Integer.parseInt(c));
        t1.isATriangle(side_a,side_b,side_c);
        System.out.println("------Finished------");
    }

    public static int validateSidesValue(int side){

        while (true){
                boolean  status = validateSidesValueInRange(side);
                if (!status){
                    System.out.println("The Given value is not in the range 1 to 8");
                    System.out.println("Please Enter the values between 1 to 8");
                    String a = System.console().readLine();
                    side = Integer.parseInt(a);
                }else{
                    break;
                }
            }
            return side;
    }

    public static boolean validateSidesValueInRange(int side){
        boolean isRange = true;
            if (side > 8 || side ==0){
                isRange = false;
            }
        return isRange;
    }

    public boolean isATriangle(int a,int b,int c){
        boolean isTriangle = false;
        System.out.println("Given values are a :"+a+" b :"+b+" c :"+c);
        if(((a + b) > c)  &&   ((c + b) > a)  &&  ((a + c) > b)   ){
            System.out.println("True , Given sides Form the Triangle");
            return true;
        }
        System.out.println("False , Given sides Failes to Form the Triangle");
        return isTriangle;
    }

}