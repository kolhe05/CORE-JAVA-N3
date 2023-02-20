package org.tnsif.threaddemo;

//Driver class 
public class SenderExecutor
{ 
  public static void main(String args[]) 
  { 
    Sender sender = new Sender(); 
    SendUsingThreads senderA = new SendUsingThreads( "C2TC" , sender);
    SendUsingThreads senderB =  new SendUsingThreads( "Welcome to TNS India", sender);

    // Start two threads of SendUsingThreads type 
    
    senderA.start(); 
    senderB.start(); 
    
    
    // wait for threads to end 
    try
    { 
      senderA.join(); 
      senderB.join(); 
    } 
    catch(Exception e) 
    { 
      System.out.println("Interrupted"); 
    } 
  

  }
}
