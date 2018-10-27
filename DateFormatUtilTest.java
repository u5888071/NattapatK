import static org.junit.Assert.*;
 
import java.util.Calendar;
import java.util.GregorianCalendar;
 
import org.junit.Test;
 
public class DateFormatUtilTest {
 
    @Test
    public void testParseSimpleThaiFormat() {
        DateFormatUtil format = new DateFormatUtil();
        Calendar calendar = new GregorianCalendar();
        calendar.set(2012, 0, 25);
         
        assertEquals("-", format.parseSimpleThaiFormat(null));
        assertEquals("25/01/2555", format.parseSimpleThaiFormat(calendar.getTime()));
    }
 
}
