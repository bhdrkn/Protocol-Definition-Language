
package com.generated.java.source;

import java.util.Hashtable;

import protocol.cipher.BaseCipher;
import example.protocol.message.Message;
import source.Arbitrator;

public class Trent<Cipher extends BaseCipher> extends
        Arbitrator<Message, Cipher> {
    
    public Trent(Alice<Cipher> alice, Bob<Cipher> bob) {
    // Alice And Bob Must be generated... How to get The Generated Class Names???
        super(new Hashtable<String, Cipher>());
        super.addCipher(Alice.class.getSimpleName(), alice.getCipher());
        super.addCipher(Bob.class.getSimpleName(), bob.getCipher());
    }

    public Trent(Hashtable<String, Cipher> cipherTable) {
        super(cipherTable);
    }

    @Override
    public void sendMessage(Message msg) {
        setChanged();
        notifyObservers(msg);
    }

}
    