/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.ipmi.protocol.packet.ipmi.command;

/**
 *
 * @author shevek
 */
public abstract class AbstractIpmiSessionResponse extends AbstractIpmiSessionCommand {

    @Override
    /* pp */ byte toWireNetworkFunction() {
        return (byte) (super.toWireNetworkFunction() + 1);
    }
}
