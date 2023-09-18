public class TimeConversion {
    String string = "01:23:54PM";
    public void result(){
        String hour = string.substring(0,2);
        String minAndSec = string.substring(2,8);
        String meridiem = string.substring(8);
        System.out.println(hour+"$"+minAndSec+"$"+meridiem);


        if(hour.equals("12") && meridiem.equals("AM")){
            string = "00" + minAndSec;
            } else if ((!hour.equals("12")) && meridiem.equals("PM")) {
                int hours = 12 + Integer.parseInt(hour);
                string = hours + minAndSec;
             }else string = hour+minAndSec;
        System.out.println(string);
    }

}
