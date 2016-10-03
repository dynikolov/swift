


//not finished but.. on the right way maybe
public class Lection2_6 {
    public static void main(String[]args){
        int sec = 1234567;
        int sec2= sec/86400;
        
        int days = sec / 86400;
        System.out.print(days + " Days, ");
        int hours = ((sec%86400)/3600);

        System.out.print(hours + " Hours, ");
       // int min = (((sec%86400))/60);
        //System.out.print(min+ " Minutes, ");
        //int s = (60*(min % 1));
        //System.out.print(s + " Seconds");
    }
}
