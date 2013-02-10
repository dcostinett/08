package com.scg.net;

import com.scg.domain.Invoice;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 12:12 PM
 *
 * The command to create invoices for a specified month.
 */
public class CreateInvoicesCommand extends Command<Date> {
    Date target;

    /**
     * Construct a CreateInvoicesCommand with a target month, which should be obtained by getting the desired month
     * constant from Calendar.
     * @param target - the target month.
     */
    public CreateInvoicesCommand(Date target) {
        super(target);
        target = target;
    }

    @Override
    public void execute() {
        getReceiver().execute(this);
    }
}
