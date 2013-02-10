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
 */
public class CommandProcessor {
    private Socket connection;
    private List<ClientAccount> clientList;
    private List<Consultant> consultantList;
    private InvoiceServer server;

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
    public void setOutPutDirectoryName(java.lang.String outPutDirectoryName) {

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

    }

    /**
     * execute an AddConsultantCommand command.
     * @param command - the command to execute.
     */
    public void execute(AddConsultantCommand command) {

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
}
