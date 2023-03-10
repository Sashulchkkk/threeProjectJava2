public class BmiService {
   public int calculate(double metr, double kg){
       double index = kg/(metr * metr);
       int indexs = (int) index ;

       return indexs;
   }
}
