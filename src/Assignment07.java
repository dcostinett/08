import com.scg.domain.ClientAccount;
import com.scg.domain.Invoice;
import com.scg.persistent.DbServer;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 9:37 AM
 */
public class Assignment07 {

    public static void main(String[] args) {
        DbServer db = new DbServer("jdbc:mysql://localhost/scgDB", "student", "student");
        try {
            List<ClientAccount> clients = db.getClients();

            for (ClientAccount client : clients) {
                Invoice invoice = db.getInvoice(client, Calendar.FEBRUARY, 2006);
                System.out.println(invoice);
                invoice = db.getInvoice(client, Calendar.MARCH, 2006);
                System.out.println(invoice);
                invoice = db.getInvoice(client, Calendar.APRIL, 2006);
                System.out.println(invoice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
