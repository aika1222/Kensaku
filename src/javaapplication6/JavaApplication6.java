/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;


import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.util.HashMap;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package setterandgetter;

/**
 *
 * @author devit
 */
public class JavaApplication6 extends JFrame implements ActionListener{
    JLabel label;
    JTextField text1;
    HashMap<String,Integer> map;
       static String atai;
       static char atai2;
    public JavaApplication6(){
    Container ctnFoundation=getContentPane();
    JButton btn1=new JButton("push");
    text1=new JTextField("moji",10);
    JPanel p1=new JPanel();
    p1.setBackground(Color.ORANGE);
    p1.add(text1);
    p1.add(btn1);
    label=new JLabel();
    
    JPanel p2=new JPanel();
    p2.setLayout(new FlowLayout(FlowLayout.CENTER));
    p2.add(label);

   
    try{
        File file = new File("C:\\Users\\devit\\Documents\\NetBeansProjects\\JavaApplication6\\src\\javaapplication6\\fairumei.txt");
    
   FileReader ins1=new FileReader(file);
   BufferedReader br = new BufferedReader(ins1);
    //String str;
        atai=br.readLine();
//while((atai= br.readLine()) != null){
          //System.out.println(1+atai);
        //}
   //int ch;
    //while((ch = ins1.read()) != -1){

//atai=(char)ch;
//System.out.println(atai);
    

//atai=(char)ins1.read();
//２０１６．１１．２９変数ataiをグローバルにしなければ下でチェックするときも使えない
}catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }

   
    
    //        btn1=new JButton("1");
    //        btn2=new JButton("2");
    //        btn3=new JButton("3");
            //ctnFoundation.add(btn1,FlowLayout.LEFT);
btn1.addActionListener(this);
//label=new JLabel();
//ctnFoundation.add(p, FlowLayout.LEFT);
//ctnFoundation.add(btn2,FlowLayout.CENTER);
//text1 = new JTextField("moji", 10);

//ctnFoundation.add(btn3,FlowLayout.RIGHT);
getContentPane().add(p1,BorderLayout.PAGE_START);
getContentPane().add(p2,BorderLayout.PAGE_END);
                   
     // System.out.println(map.get("坂口渚沙"));
     //label.setText("get"); 
    
    }
    public void actionPerformed(ActionEvent e){
   //System.out.println(atai);
  String target =atai;
    String item = text1.getText();
   
   Pattern p=Pattern.compile(item);
   //System.out.println(target);
   Matcher m=p.matcher(target);
    int count=0;
    int s=0;
    while(m.find(s)){
        count++;
        s=m.end();
    }
    System.out.println(count); // 3
String ms=String.valueOf(count);
label.setText(ms);
    //}
    }
    
public static void main(String[] args){
JavaApplication6 button=new JavaApplication6();


button.setSize(300,200);
button.setTitle("javaapplication6");
button.setVisible(true);
button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }

    /**
     * @param args the command line arguments
     */

    
}

