package factorialproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class frame1 extends JFrame{
    Container c; JPanel p1,p2,p3,p4; String msg1,msg2,msg3,msg4,msg5,msg6; JLabel l1,l2,l3,l4,l5,l6,l7; JButton b1,b2;int flag=0;
    JTextField j1;
    frame1()
   {
    c=this.getContentPane();
    c.setLayout(null);
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    p4=new JPanel();
    
    p1.setBackground(new Color(255,255,0));
    p1.setBounds(0,0,1500,100);
    p1.setLayout(null);
    
    p2.setBackground(new Color(51,255,204));
    p2.setBounds(30,150,700,500);
    p2.setLayout(null);
    p4.setBackground(new Color(51,255,204));
    p4.setBounds(800,150,500,500);
    p4.setLayout(null);
    
    p3.setBackground(new Color(102,102,255));
    p3.setBounds(0,100,1500,800);
    p3.setLayout(null);
    
   
    
    msg1="FACTORIAL CALCULATION PROGRAM";
    msg2="ENTER A NUMBER:";
    msg3="    ABOVE PROGRAM DO:    ";
    msg4="    TO FIND FACTORIAL    ";
    msg5="    CHECK FOR PRIME NO.   ";
    l1=new JLabel(msg1);
    l1.setFont(new Font("Algerian",Font.BOLD,60));
    l1.setForeground(Color.black);
    l1.setBounds(125,35,10000,40);
    l2=new JLabel(msg2);
    l2.setFont(new Font("Arial Black",Font.BOLD,26));
    l2.setForeground(Color.black);
    l2.setBounds(20,100,1500,40);
    l3=new JLabel();
    l3.setBounds(20,350,1500,40);
    l3.setFont(new Font("Arial Black",Font.BOLD,26));
    l3.setForeground(Color.black);
    l4=new JLabel();
    l4.setBounds(20,400,1500,40);
    l4.setFont(new Font("Arial Black",Font.BOLD,26));
    l4.setForeground(Color.black);
    l5=new JLabel(msg3);
    l5.setBounds(10,80,1500,40);
    l5.setFont(new Font("Arial Black",Font.BOLD,26));
    l5.setForeground(Color.black);
    l6=new JLabel(msg4);
    l6.setBounds(10,200,1500,40);
    l6.setFont(new Font("Arial Black",Font.BOLD,26));
    l6.setForeground(Color.black);
    l7=new JLabel(msg5);
    l7.setBounds(10,320,1500,40);
    l7.setFont(new Font("Arial Black",Font.BOLD,26));
    l7.setForeground(Color.black);
    
    j1=new JTextField();
    j1.setBounds(350,100,150,40);
    b1=new JButton("FIND");
    b1.setBounds(350,200,150,40);
    b2=new JButton("RESET");
    b2.setBounds(350,280,150,40);
    c.add(p1);
    c.add(p2); 
    c.add(p4);
    c.add(p3);
    
    p1.add(l1);
    p2.add(l2);
    p2.add(l3);
    p2.add(l4);
    p4.add(l5);
    p4.add(l6);
    p4.add(l7);
    p2.add(j1);
    p2.add(b1);
    p2.add(b2);
   b1.addActionListener(new java.awt.event.ActionListener()
   {
     public void actionPerformed(ActionEvent ae)
     {
         String s=ae.getActionCommand();
         double n =Double.parseDouble(j1.getText());
         if(s.equals("FIND"))
         {  
             int f=1;double m=n/2; 
             for(int i=1;i<=n;i++)
             {  f=f*i;  }
             l3.setText("RESULT IS:"+f);
             if(n==0||n==1)
             {
               l4.setText("ITS NOT A PRIME NUMBER");
           
             }
             else
             {
                for(int i=2;i<=m;i++)
                {
                  if(n%i==0)
                  {
                    flag=1;
                    break;
             
                  }
         
                }
                if(flag==0)
                {
                   l4.setText("ITS A PRIME NUMBER");
                }
                else if(flag==1)
                {
                   l4.setText("NOT A PRIME NUMBER");
                }
                
                
            }
     
        }
    
     }
     
   });
   b2.addActionListener(new java.awt.event.ActionListener()
   {
      public void actionPerformed(ActionEvent ae)
      {
          String s1=ae.getActionCommand();
          if(s1.equals("RESET"))
          {
              j1.setText(null);
              l3.setText(null);
              l4.setText(null);
          }
      }
    });
   
   
 }
}
public class factorial {

    public static void main(String[] args) {
        frame1 f=new frame1();
        //f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,300);
        
        
    }
    
}
