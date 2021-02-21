import java.time.ZonedDateTime;

/**
 * TODO
 * Date: 2021-01-02
 *
 * @author: 漂泊
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();//默认时区
        System.out.println(zonedDateTime);
        //2021-01-02T15:55:32.023+08:00[Asia/Shanghai]
    }
}
