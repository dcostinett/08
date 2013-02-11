import com.scg.domain.ClientAccount;
import com.scg.domain.Consultant;
import com.scg.domain.TimeCard;
import com.scg.net.AddClientCommand;
import com.scg.net.AddConsultantCommand;
import com.scg.net.AddTimeCardCommand;
import com.scg.util.Name;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 11:26 AM
 *
 * The client application for Assignment08.
 *
    The client program, Assignment08, will perform the following:

    1. Create the time card list as before (using ListFactory).
    2. Set up a network connection with the Assignment08Server running on localhost port 10888.
    3. Create an ObjectOutputStream for the connection.
    4. Send several new Consultants (consultants not used in the timecards/invoices) to the server encapsulated in an
        AddConsultantCommand object.
    5. Send several new Clients (clients not used in the timecards/invoices) to the server encapsulated in an
        AddClientCommand object.
    6. Send the TimeCards to the server, each encapsulated in an AddTimeCardCommand object.
    7. Send a CreateInvoicesCommand to the server, with the month for which invoices are to be created encapsulated in
        a CreateInvoicesCommand object.
    8. Send the DisconnectCommand to the server, and close the connection.
    9. Create a new connection to the server, send the ShutdownCommand to the server, and close the connection and exit.
 *
 */
public class Assignment08 {

    public static final int DEFAULT_PORT = 10888;

    private static Socket socket;
    /**
     * Instantiates an InvoiceClient, provides it with a set of timecards to server the server and starts it running.
     * @param args - Command line parameters, not used.
     */
    public static void main(@SuppressWarnings("unused") String[] args) {

        List<ClientAccount> clients = new ArrayList<ClientAccount>();
        List<Consultant> consultants = new ArrayList<Consultant>();
        List<TimeCard> timeCards = new ArrayList<TimeCard>();
        ListFactory.populateLists(clients,  consultants, timeCards);

        Name bob = new Name("Cowboy", "Bob", "The");
        Name bill = new Name("Cowboy", "Bill", "The");
        Name charlie = new Name("Cowboy", "Charlie", "The");
        Consultant cowboyBob = new Consultant(bob);
        Consultant cowboyBill = new Consultant(bill);
        Consultant cowboyCharlie = new Consultant(charlie);

        ClientAccount client1 = new ClientAccount("Bob's Rodeo", bob);
        ClientAccount client2 = new ClientAccount("Bill's Rodeo", bill);
        ClientAccount client3 = new ClientAccount("Chuck's Rodeo", charlie);

        try {
            socket = new Socket("localhost", DEFAULT_PORT);

            ObjectOutputStream oStream = new ObjectOutputStream(socket.getOutputStream());

            oStream.writeObject(new AddConsultantCommand(cowboyBob));
            oStream.writeObject(new AddConsultantCommand(cowboyBill));
            oStream.writeObject(new AddConsultantCommand(cowboyCharlie));

            oStream.writeObject(new AddClientCommand(client1));
            oStream.writeObject(new AddClientCommand(client2));
            oStream.writeObject(new AddClientCommand(client3));

            for (TimeCard tc : timeCards) {
                oStream.writeObject(new AddTimeCardCommand(tc));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
