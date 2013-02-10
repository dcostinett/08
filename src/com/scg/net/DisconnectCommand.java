package com.scg.net;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 12:14 PM
 *
 * The command to disconnect, this commandhas no target.
 */
public class DisconnectCommand extends Command<Object> {

    /**
     * Construct an DisconnectCommand.
     */
    public DisconnectCommand() {
        super(null);
    }

    /**
     * Execute this Command by calling receiver.execute(this).
     */
    @Override
    public void execute() {
        getReceiver().execute(this);
    }
}
