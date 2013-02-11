package com.scg.net.server;

import com.scg.domain.ClientAccount;
import com.scg.domain.Consultant;
import com.scg.persistent.DbServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 11:46 AM
 */
public class InvoiceServer implements Runnable {
    private int port;
    private List<ClientAccount> clientList;
    private List<Consultant> consultantList;

    /**
     * Construct an InvoiceServer with a port.
     * @param port - The port for this server to listen on
     * @param clientList - the initial list of clients
     * @param consultantList - the initial list of consultants
     * @throws IOException - in the event of any IO errors
     */
    public InvoiceServer(int port, List<ClientAccount> clientList, List<Consultant> consultantList) throws IOException {
        this.port = port;
        this.clientList = clientList;
        this.consultantList = consultantList;
    }

    /**
     * Run this server, establishing connections, receiving commands, and sending them to the CommandProcesser.
     */
    public void run() {
    }

    /**
     * Shutdown the server
     */
    void shutdown() {

    }
}
