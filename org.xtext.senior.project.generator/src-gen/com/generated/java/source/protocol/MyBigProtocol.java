
package com.generated.java.source.protocol;

import com.generated.java.source.*;

import java.util.Observable;
import java.util.Observer;

import protocol.cipher.BaseCipher;

import example.protocol.message.Message;

public class MyBigProtocol<Cipher extends BaseCipher> implements Observer{
    
    
    
        private Alice<Cipher> alice = null;

        private Bob<Cipher> bob = null;

        private Trent<Cipher> trent = null;

    
    
    
    public MyBigProtocol (
    
        Alice alice,
    

    
        Bob bob,
    

    
        Trent trent
    
){
        
        this.alice = alice;
        this.alice.addObserver(this);    

        this.bob = bob;
        this.bob.addObserver(this);    

        this.trent = trent;
        this.trent.addObserver(this);    

        init();
    }

    
    public void init(){
    
    
            
    if( 
    
        true
    
){
        // Expand to Operation what about arg....
        
    
        
// exchangeOperation
    trent.addCipher(alice.getClass().getSimpleName(),alice.getCipher());

    

     }
    
    if( 
    
        true
    
){
        // Expand to Operation what about arg....
        
    
        
// exchangeOperation
    trent.addCipher(bob.getClass().getSimpleName(),bob.getCipher());

    

     }

    

    

    

    

    }
        
    @Override
    public void update(Observable o, Object arg) {
       //TODO - This part must be generated from States
       Message msg = (Message) arg;
       
       
    

    
        if( o instanceof Trent ){
            
    if( 
    
        msg.getFrom().compareTo("alice") == 0
    
){
        // Expand to Operation what about arg....
        
    
        
    // CALL    
    trentFromAliceAction(msg);

    

     }
    
    if( 
    
        msg.getFrom().compareTo("bob") == 0
    
){
        // Expand to Operation what about arg....
        
    
        
    // CALL    
    trentFromBobAction(msg);

    

     }

    }
    

    
        if( o instanceof Alice ){
            
    if( 
    
        true
    
){
        // Expand to Operation what about arg....
        
    
        
    // CALL    
    AliceAction(msg);

    

     }

    }
    

    
        if( o instanceof Bob ){
            
    if( 
    
        true
    
){
        // Expand to Operation what about arg....
        
    
        
    // CALL    
    BobAction(msg);

    

     }

    }
    

    }
    
    
    
    private void trentFromAliceAction (
    
    Message m
    
){
        
    
        
// DECRYPT
try{
    byte[] cryptedMessage = m.getMessage();
    byte[] realMsg = alice.getCipher().decrypt(cryptedMessage);
    m.setMessage(realMsg);
   } catch(Exception e){
    e.printStackTrace();
   }

    

    
        
// ENCRYPT
try{
    byte[] realMsg = m.getMessage();
    byte[] cryptedMessage = bob.getCipher().encrypt(realMsg);
    m.setMessage(cryptedMessage);
    }catch(Exception e){
    e.printStackTrace();
    }

    

    
        
    // SEND
    m.setFrom(trent.getClass().getSimpleName());
    m.setTo(bob.getClass().getSimpleName());
    trent.sendMessage(m);

    

    }

    private void trentFromBobAction (
    
    Message m
    
){
        
    
        
// DECRYPT
try{
    byte[] cryptedMessage = m.getMessage();
    byte[] realMsg = bob.getCipher().decrypt(cryptedMessage);
    m.setMessage(realMsg);
   } catch(Exception e){
    e.printStackTrace();
   }

    

    
        
// ENCRYPT
try{
    byte[] realMsg = m.getMessage();
    byte[] cryptedMessage = alice.getCipher().encrypt(realMsg);
    m.setMessage(cryptedMessage);
    }catch(Exception e){
    e.printStackTrace();
    }

    

    
        
    // SEND
    m.setFrom(trent.getClass().getSimpleName());
    m.setTo(alice.getClass().getSimpleName());
    trent.sendMessage(m);

    

    }

    private void AliceAction (
    
    Message m
    
){
        
    
        
// DECRYPT
try{
    byte[] cryptedMessage = m.getMessage();
    byte[] realMsg = alice.getCipher().decrypt(cryptedMessage);
    m.setMessage(realMsg);
   } catch(Exception e){
    e.printStackTrace();
   }

    

    
        
    // PRINT
    System.out.println(m.toString());

    

    }

    private void BobAction (
    
    Message m
    
){
        
    
        
// DECRYPT
try{
    byte[] cryptedMessage = m.getMessage();
    byte[] realMsg = bob.getCipher().decrypt(cryptedMessage);
    m.setMessage(realMsg);
   } catch(Exception e){
    e.printStackTrace();
   }

    

    
        
    // PRINT
    System.out.println(m.toString());

    

    }

}
    