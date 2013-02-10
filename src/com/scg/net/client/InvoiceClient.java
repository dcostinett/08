package com.scg.net.client;

import com.scg.domain.TimeCard;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 12:23 PM
 *
 * The client of the InvoiceServer.
 */
public class InvoiceClient {
    private String host;
    private int port;
    private List<TimeCard> timeCardList;

    /**
     * Construct an InvoiceClient with a host and port for the server.
     * @param host - the host for the server.
     * @param port - the port for the server.
     * @param timeCardList - the list of timeCards to send to the server
     */
    public InvoiceClient(String host, int port, List<TimeCard> timeCardList) {
        this.host = host;
        this.port = port;
        this.timeCardList = timeCardList;
    }

    /**
     * Runs this InvoiceClient, sending clients, consultants, and time cards to the server, then sending the command
     * to create invoices for a specified month.
     */
    public void run() {

    }

    /**
     * Send the clients to the server.
     * @param out - the output stream connecting this client to the server.
     */
    public void sendClients(java.io.ObjectOutputStream out) {


    }

    /**
     * Send the consultants to the server.
     * @param out - the output stream connecting this client to the server.
     */
    public void sendConsultants(java.io.ObjectOutputStream out) {

    }

    /**
     * Send the time cards to the server.
     * @param out - the output stream connecting this client to the server.
     */
    public void sendTimeCards(java.io.ObjectOutputStream out) {

    }

    /**
     * Send the disconnect command to the server.
     * @param out - the output stream connecting this client to the server.
     */
    public void sendDisconnect(java.io.ObjectOutputStream out) {

    }

    /**
     * Send the command to the server to create invoices for the specified month.
     * @param out - the output stream connecting this client to the server.
     * @param month - the month to create invoice for
     * @param year - the year to create invoice for
     */
    public void createInvoices(java.io.ObjectOutputStream out,
                               int month,
                               int year) {

    }

    /**
     * Send the quit command to the server.
     */
    public void sendQuit() {

    }
}
