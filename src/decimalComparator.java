public class decimalComparator {

    //public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){

       // String a = String.format("%.3f", number1);
        //String b = String.format("%.3f", number2);

        //if( a == b){
         //   return true;
        //}else {
        //    return false;
        //}
   // }


    public static boolean areEqualByThreeDecimalPlaces(double N1, double N2){

        int N1f = (int) (N1 * 1000);
        int N2f = (int) (N2 * 1000);

        if (N1f == N2f){
            return true;
        }

        return false;
    }
}
