package io.bitcoinsv.headerSV.service.consumer;


import com.nchain.jcl.net.network.PeerAddress;
import com.nchain.jcl.net.protocol.messages.common.BitcoinMsg;
import com.nchain.jcl.net.protocol.messages.common.Message;

/**
 * Distributed under the Open BSV software license, see the accompanying file LICENSE
 * Copyright (c) 2020 Bitcoin Association
 *
 * @author m.fletcher@nchain.com
 */
public interface MessageConsumer {
    /** message listener to consume given message */
    void consume(BitcoinMsg message, PeerAddress peerAddress);
}