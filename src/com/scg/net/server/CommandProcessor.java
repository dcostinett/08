package com.scg.net.server;

import com.scg.domain.ClientAccount;
import com.scg.domain.Consultant;
import com.scg.net.*;

import java.net.Socket;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 11:43 AM
 *
 * The command processor for the invoice server. Implements the receiver role in the Command design pattern.
 *
 * The CommandProcessor executes the Command in the execute method that is called. Processing of the add commands
 * should simply add the target object to the appropriate list. In the case of the CreateInvoicesCommand, the invoice
 * should be created and the invoice text should be written to a file whose name is of the form:
 * <ClientName>-<MonthName>-Invoice.txt. Please do not leave any spaces in the file name. In the case of the
 * DisconnectCommand the server should cease reading commands and close the connection.
 */
public class CommandProcessor implements Runnable {
    private Socket connection;
    private List<ClientAccount> clientList;
    private List<Consultant> consultantList;
    private InvoiceServer server;

    private String outPutDirectoryName;

    public CommandProcessor(Socket connection,
                            List<ClientAccount> clientList,
                            List<Consultant> consultantList,
                            InvoiceServer server) {
        this.connection = connection;
        this.clientList = clientList;
        this.consultantList = consultantList;
        this.server = server;
    }

    /**
     * Set the output directory name.
     * @param outPutDirectoryName - the output directory name.
     */
    public void setOutPutDirectoryName(String outPutDirectoryName) {
        this.outPutDirectoryName = outPutDirectoryName;
    }

    /**
     * execute an AddTimeCardCommand command.
     * @param command - the command to execute.
     */
    public void execute(AddTimeCardCommand command) {

    }

    /**
     * execute an AddClientCommand command.
     * @param command - the command to execute.
     */
    public void execute(AddClientCommand command) {
        clientList.add(command.getTarget());
    }

    /**
     * execute an AddConsultantCommand command.
     * @param command - the command to execute.
     */
    public void execute(AddConsultantCommand command) {
        consultantList.add(command.getTarget());
    }

    /**
     * Execute an CreateInvoicesCommand command.
     * @param command - the command to execute.
     */
    public void execute(CreateInvoicesCommand command) {

    }

    /**
     * Execute an DisconnectCommand command.
     * @param command - the command to execute.
     */
    public void execute(DisconnectCommand command) {

    }

    /**
     * Execute a ShutdownCommand. Closes any current connections, stops listening for connections and then
     * terminates the server, without calling System.exit.

     * @param command - the input ShutdownCommand.
     */
    public void execute(ShutdownCommand command) {

    }

    @Override
    public void run() {

    }
}
