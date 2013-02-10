package com.scg.net;

import com.scg.domain.Consultant;

/**
 * Created with IntelliJ IDEA.
 * User: dcostinett
 * Date: 2/10/13
 * Time: 12:08 PM
 */
public class AddConsultantCommand extends Command<Consultant> {
    Consultant target;

    /**
     *
     * @param target
     */
    public AddConsultantCommand(Consultant target) {
        super(target);
        target = target;
    }

    @Override
    public void execute() {
        getReceiver().execute(this);
    }
}
