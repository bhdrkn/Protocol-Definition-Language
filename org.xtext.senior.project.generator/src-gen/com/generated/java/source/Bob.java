
package com.generated.java.source;

import protocol.cipher.BaseCipher;
import example.message.Message;
import source.Participant;

public class Bob<Cipher extends BaseCipher> extends Participant<Message, Cipher>{

    public Bob(Cipher cipher) {
        super(cipher);
    }

    @Override
    public void sendMessage(Message msg) {
        setChanged();
        notifyObservers(msg);
    }

}
    