import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {

        Date lastUpdate = new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(lastUpdate);
        System.out.println(dateFormat.format(lastUpdate));
        System.out.println(Date.class.isInstance(lastUpdate));
        System.out.println(String.class.isInstance(dateFormat.format(lastUpdate)));
        System.out.println("分支操作");
        System.out.println("Dev");
        System.out.println("Dev22");
        System.out.println("Dev");System.out.println("Dev");
        }

    }
