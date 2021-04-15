package exercise3;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ServerTextApplication extends Frame implements Runnable
{
 //Declarations
 TextArea ta;
 ServerSocket ss;
 Socket s;
 PrintWriter pw;
 BufferedReader br;
 Thread th;
 
 public ServerTextApplication()
 {
  Frame f=new Frame("Server Side Words Calculator");//Frame for Server
  f.setLayout(new FlowLayout());//set layout
  ta=new TextArea(20,28);
  ta.setEditable(false);
  f.addWindowListener(new W1());//add Window Listener to the Frame
  f.add(ta);//Add TextArea to the frame
  
  try{
   ss=new ServerSocket(4223);//Socket for server
   s=ss.accept();//accepts request from client
   System.out.println(s);
   //below line reads input from InputStreamReader
   br=new BufferedReader(new InputStreamReader(s.getInputStream()));
   //below line writes output to OutPutStream
   pw=new PrintWriter(s.getOutputStream(),true);
  }catch(Exception e){}
  
  th=new Thread(this);//start a new thread
  th.setDaemon(true);//set the thread as demon
  th.start();
  setFont(new Font("Arial",Font.BOLD,20));
  f.setSize(200,200);//set the size
  f.setLocation(300,300);//set the location
  f.setVisible(true);
  f.validate();
 }
 
 //method required to close the Frame on clicking "X" icon.
 private class W1 extends WindowAdapter
 {
  public void windowClosing(WindowEvent we) 
  {
   System.exit(0);
  }
 }
 
 //Thread running as a process in background
 public void run()
 {
  while(true)
  {
   try{
    String text=br.readLine();//reads the input from textfield
    ta.append("Text : " + text+"\n");//Append to TextArea
    
    // perform the required operation.
    int w = text.split("\\s+").length;

    pw.println("Words " + w);//write the result into PrintWriter
   }catch(Exception e){}
  } 
 }

 //Main method
 public static void main(String args[]) 
 {
  //Instantiate ServerTextApplication class
	 ServerTextApplication server = new ServerTextApplication();
 }
} 
