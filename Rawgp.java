
package Rawgp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.text.NumberFormatter;

public class Rawgp {
    CgpaFunct funct= new CgpaFunct();
  JFrame jfm;
  JFrame f;
 private JPanel jp1;
 private JPanel jp2;
 private JPanel jp3;
 private JLabel jl1;
 private JTextField jtf;
 private Box box;
 private JTextField jtf3;
 private JTextField jtf5;
 private JTextField jtf1;
 private JTextField jtf2;
 private JComboBox jcb1;
 private JFrame jf;
 private Box bx1;
 private JPanel panel;
 private  JFormattedTextField jtf8;
 private JComboBox[] score;
 JTextField showgp;
 private NumberFormat format;
 private NumberFormatter formatter;
 private JComboBox[] unit;
 private JTextField[] field;
 double outercgpa;
 int nc=0;
 int ncc=0;
 String[] outercn;
 int[] outersko;
 int[] outerunit;
 int outerunitsum;
 String[] outergrade;
 double[] outerpoint;
 double[] outeruntpoint;
 double outerupsum;
 JPanel pl;
 GridLayout rid;
 JLabel jbl1,jbl2,jbl3,jbl4,jbl5,jbl6,jbl7,jbl8,jbl9,jbl10,jbl11,jbl12,crs,unite,scre,
         gde,pt,up;
 JScrollPane jsp;
 JScrollPane jsp1;
 JPanel pn;
 String outerguage;
 
 Rawgp(){
     
   jfm = new JFrame("GPA Calculator");
   //Toolkit theKit = jfm.getToolkit(); 
	//Dimension wndSize = theKit.getScreenSize();
	jfm.setBounds(2,2,392, 540);
	        //((wndSize.width/4)+1, (wndSize.height/50)+1, wndSize.width/2, wndSize.height-50);
	jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	GridLayout gl= new GridLayout(2,1);
	Container content = jfm.getContentPane(); // Get the content pane
	content.setLayout(gl);
	    jfm.setResizable(false);
            
     //
	    GridBagLayout gbjp1= new GridBagLayout();
	    jp1= new JPanel();
	    String std="STUDENT INFO";
	    jp1.setBorder( new TitledBorder(new EtchedBorder(), std));
	   jp1.setSize(150,540);
	   FlowLayout flowjp1 = new FlowLayout();
	   jp1.setLayout(gbjp1);
	   jfm.add(jp1);
	   
	   box= Box.createHorizontalBox();
	   jfm.add(box);
	   
	   box.add(box.createHorizontalStrut(25));
	   
	   jp2= new JPanel();
	   jp2.setBorder(BorderFactory.createBevelBorder(
	           BevelBorder.RAISED, Color.cyan, Color.BLUE, Color.DARK_GRAY, Color.LIGHT_GRAY));
	   box.add(jp2);
	   
	     
	   jl1= new JLabel("SCHOOL:           ");
	   GridBagConstraints cstjl1= new GridBagConstraints();
	   cstjl1.gridx=0;
	   cstjl1.gridy=0;
	   jp1.add(jl1, cstjl1);
	   
	   jtf= new JTextField(15);
	   GridBagConstraints cstjtf= new GridBagConstraints();
	   cstjtf.gridx=1;
	   cstjtf.gridy=0;
	   jp1.add(jtf, cstjtf);
	   
	   JLabel jl2= new JLabel("FACULTY:          ");
	   GridBagConstraints cstjl2= new GridBagConstraints();
	   cstjl2.weighty=1;
	   cstjl2.gridx=0;
	   cstjl2.gridy=1;
	   jp1.add(jl2, cstjl2);
	   
	   jtf1= new JTextField(15);
	   GridBagConstraints cstjtf1= new GridBagConstraints();
	   cstjtf1.gridx=1;
	   cstjtf1.gridy=1;
	   jp1.add(jtf1, cstjtf1);
	   
	   JLabel jl6= new JLabel("DEPARTMENT:  ");
	   GridBagConstraints cstjl6= new GridBagConstraints();
	   cstjl6.gridx=0;
	   cstjl6.gridy=3;
	   jp1.add(jl6, cstjl6);
	   
	   jtf2= new JTextField(15);
	   GridBagConstraints cstjtf2= new GridBagConstraints();
	   cstjtf2.gridx=1;
	   cstjtf2.gridy=3;
	   jp1.add(jtf2, cstjtf2);
	   
	   JLabel jl3= new JLabel("SURNAME:         ");
	   GridBagConstraints cstjl3= new GridBagConstraints();
	   cstjl3.gridx=0;
	   cstjl3.gridy=4;
	   cstjl3.weighty=1;
	   jp1.add(jl3, cstjl3);
	   
	   jtf3= new JTextField(15);
	   GridBagConstraints cstjtf3= new GridBagConstraints();
	   cstjtf3.gridx=1;
	   cstjtf3.gridy=4;
	   jp1.add(jtf3, cstjtf3);
	   
	   JLabel jl4= new JLabel("GENDER:            ");
	   GridBagConstraints cstjl4= new GridBagConstraints();
	   cstjl4.gridx=0;
	   cstjl4.gridy=6;
	   cstjl4.weighty=1;
	   jp1.add(jl4, cstjl4);
	   
	   jcb1= new JComboBox();
	   jcb1.addItem("MALE");
	   jcb1.addItem("FEMALE");
	   GridBagConstraints cstjcb1= new GridBagConstraints();
	   cstjcb1.gridx=1;
	   cstjcb1.gridy=6;
	   jp1.add(jcb1, cstjcb1);
	   
	   JLabel jl5= new JLabel("NAME(S):           ");
	   GridBagConstraints cstjl5= new GridBagConstraints();
	   cstjl5.gridx=0;
	   cstjl5.gridy=5;
	   jp1.add(jl5, cstjl5);
	   
	   jtf5= new JTextField(15);
	   GridBagConstraints cstjtf5= new GridBagConstraints();
	   cstjtf5.gridx=1;
	   cstjtf5.gridy=5;
	   jp1.add(jtf5, cstjtf5);
	   
	   Box b1= Box.createVerticalBox();
	   jp2.add(b1);
	   
	   Box b2= Box.createVerticalBox();
	   jp2.add(b2);
	   
	   Box b3= Box.createVerticalBox();
	   jp2.add(b3);
	   
	   box.add(box.createHorizontalStrut(25));
	   
	   JLabel jl7= new JLabel("GRADING SYSTEM:");
	   b1.add(jl7);
	   
	   b1.add(Box.createVerticalStrut(20));
	   
	   JLabel jl8= new JLabel("NO OF COURSES:");
	   b1.add(jl8);
	   
	   b1.add(Box.createVerticalStrut(20));
	   
	   JButton jb1= new JButton("SUBMIT");
	   b1.add(jb1); 
           
           jb1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
                    f.setTitle(getfullname()+"'S COURSE FORM");
                list();
                
                f.setVisible(true);
            jfm.setEnabled(false);
                //jfm.setVisible(false);
                }});
	   
	   JTextField jtf9= new JTextField("4 PT", 4);
           jtf9.setEditable(false);
	   b2.add(jtf9);
	   
	   b2.add(Box.createVerticalStrut(15));
	   
           format= NumberFormat.getInstance();
           formatter= new NumberFormatter(format);
           formatter.setValueClass(Integer.class);
           formatter.setMinimum(0);
           formatter.setMaximum(Integer.MAX_VALUE);
           formatter.setCommitsOnValidEdit(true);
	   jtf8= new JFormattedTextField(formatter);
	   b2.add(jtf8);
	   
	   b2.add(Box.createVerticalStrut(40));
	   
	   b3.add(Box.createVerticalStrut(200));
	   
	   /*ImageIcon img= new ImageIcon("image/star.gif");
	   JLabel show= new JLabel();
	   show.setIcon(img);
	   b3.add(show);*/
	   
	   JLabel name= new JLabel("Powered By Michael Anetor...");
	   name.setFont( new Font(name.getName(), Font.ITALIC, 10));
	   b3.add(name);
           jfm.setVisible(true);
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
            f= new JFrame();
     f.setBounds(180,28,524,530);
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //f.setResizable(false);
     
     Box bx= Box.createVerticalBox();
     f.add(bx);
     
     bx1= Box.createVerticalBox();
     
     //JPanel pan= new JPanel();
     panel= new JPanel();
     GridLayout grd= new GridLayout(0,4);
     panel.setLayout(grd);
     bx1.add(panel);
     bx1.add(Box.createVerticalStrut(410));
   
     //
     //
      JScrollPane sp= new JScrollPane(bx1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
     //sp.setSize((wndSize.width/3)-5, wndSize.height-65);
      //pan.add(sp);
      bx.add(sp);
      
      
     Box bx2= Box.createHorizontalBox();
     
     
     JButton compile= new JButton("COMPILE");
     bx2.add(compile);
     compile.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
                    jf.setTitle(getfullname()+"'S RESULT INFO");
     info();
                try {
                    textFile();
                } catch (IOException ex) {
                    Logger.getLogger(Rawgp.class.getName()).log(Level.SEVERE, null, ex);
                }
     
     f.setEnabled(false);
                jf.setVisible(true);
                }});
     
    /* JButton close= new JButton("GO BACK");
     bx2.add(close);
     close.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
                    jfm.setEnabled(true);
                    
          //      jfm.setVisible(true);
                f.setVisible(false);
                //jf.setVisible(false);
                }});*/
     
     bx.add(bx2);
     
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
	    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     jf= new JFrame();
     //Toolkit tk= jf.getToolkit();
     //Dimension s= tk.getScreenSize();
     jf.setBounds(440,54,582,500);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setResizable(false);
     Box boxe= (Box.createVerticalBox());
     
     
     //jsp1= new JScrollPane(pn, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
     jf.add(boxe);
     
     
     pl= new JPanel();
     rid= new GridLayout(0,6);
     pl.setLayout(rid);
     
     
     
     JLabel jbl1= new JLabel("COURSES");
     JLabel jbl2= new JLabel("UNIT");
     JLabel jbl3= new JLabel("SCORE");
     JLabel jbl4= new JLabel("GRADE");
     JLabel jbl5= new JLabel("POINT");
     JLabel jbl6= new JLabel("UNT*PT");
     pl.add(jbl1);
     pl.add(jbl2);
     pl.add(jbl3);
     pl.add(jbl4);
     pl.add(jbl5);
     pl.add(jbl6);
     
     Box boxy= (Box.createVerticalBox());
     boxy.add(pl);
     boxy.add(Box.createVerticalStrut(395));
     
    jsp= new JScrollPane(boxy, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);            
     
    boxe.add(jsp);
      
     
     
         
     
     
     
     
     JPanel pne= new JPanel();
     boxe.add(pne);
     
     showgp= new JTextField();
     showgp.setText("");
     showgp.setEditable(false);
     pne.add(showgp);
     
     JLabel tip= new JLabel("YOUR TRANSCRIPT IS @ DIRECTORY YOU HAVE APP STORED.");
     pne.add(tip);
     
     
     
     
     
     
     
     
     
     
     
     
     //jfm.setVisible(true);
     //f.setVisible(false);
	   // f.pack();
             //jf.setVisible(true);
	}
	  
	    public static void main(String[] args){
                
                try{
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                }
                catch(Exception e){
                }
                
	        SwingUtilities.invokeLater(new Runnable(){
	        public void run(){
	            new Rawgp();
	        }
	        });
}    
        
 private String fullname(){
     String f= jtf3.getText();
     String n= jtf5.getText();
     String fn="";
 if(f.isEmpty()&& n.isEmpty())
     fn="NO NAME";
 else if(f.isEmpty()|| n.isEmpty())
 {
 if(f.isEmpty())
     fn=n;
 else
     fn= f;
 }
 
 else
     fn=f+" "+n;
 return fn.toUpperCase();
 }
 
  public String getfullname(){
            return fullname();
            }
  
 
 
                    
                    private int count(){
                    String word= jtf8.getValue().toString();
     if(word.isEmpty()|| jtf8.getValue()==null){
         nc=0;}
     else
     nc= Integer.parseInt(word);
     return nc;
                    }
 
 
 
 
 
           
            
            Box b;
            private void list(){
                int n= count();
                
                JLabel lb4;
                JLabel lb= new JLabel("NO.");
                JLabel lb1= new JLabel("COURSE CODE");
                JLabel lb2= new JLabel("UNIT");
                JLabel lb3= new JLabel("SCORE");
                panel.add(lb);
                panel.add(lb1);
                panel.add(lb2);
                panel.add(lb3);
              
                int no= 0;
               field= new JTextField[n];
               unit= new JComboBox[n];
       //unit.setName("UNIT"+i);
                
                
                score= new JComboBox[n];
               
            for(int i=0; i<n; i++){
                no= i+1;
                lb4= new JLabel(no+".");
                panel.add(lb4);
                
                    
                field[i]= new JTextField();
            panel.add(field[i]);
               
            
             
                unit[i]= new JComboBox();
                unit[i].addItem("1");
                unit[i].addItem("2");
                unit[i].addItem("3");
                unit[i].addItem("4");
              panel.add(unit[i]);
                
                
               
            
            //score.setName("SCORE"+i);
            score[i]= new JComboBox();
                for(int s=0; s<=100; s++){
                score[i].addItem(s);
                }
                panel.add(score[i]);
            }
            }
            
            
           private void info(){
               int ncc= count();
               
               
               CgpaFunct s2g= new CgpaFunct();
      String[] cn= new String[ncc]; 
      int[] unt= new int[ncc];
      int[] sko= new int[ncc];
      String[] grade= new String[ncc];
      double[] untpoint= new double[ncc];
      double[] point=  new double[ncc];
      int unitsum= 0;
      double upsum=0;
      double cgpa=0;
        
       outercn= new String[ncc];
       outersko= new int[ncc];
       outerunit= new int[ncc];
       outerunitsum=0;
       outergrade= new String[ncc];
       outerpoint= new double[ncc];
       outeruntpoint= new double[ncc];
       outerupsum=0;
       outercgpa=0;
               
               
     
     for(int d=0; d<ncc; d++){
         addspace();addspace();addspace();addspace();addspace();addspace();
         
                cn[d]=field[d].getText().toUpperCase();
                int cut=8;
                int charno=cn[d].length();
                if(charno==0)
                    outercn[d]="CDE000";
                else if(charno<11 && charno>0)
            outercn[d]=cn[d];
                else if(charno>10){
                    outercn[d]=cn[d].substring(0, 5);}
         crs= new JLabel(outercn[d]+"");
         pl.add(crs);
         
         //unit.setName("UNIT"+d);
                unt[d]=Integer.parseInt(unit[d].getSelectedItem().toString());
                outerunit[d]= unt[d];
              unitsum= unitsum+unt[d];
              outerunitsum = unitsum;
         unite= new JLabel(outerunit[d]+"");
         pl.add(unite);
         
         //score.setName("SCORE"+d);
                sko[d]=Integer.parseInt(score[d].getSelectedItem().toString());
                outersko[d]= sko[d];
               
         scre= new JLabel(outersko[d]+"");
         pl.add(scre);
         
         grade[d]=s2g.gradesMethod(sko[d]);
                outergrade[d]= grade[d];
         gde= new JLabel(outergrade[d]);
         pl.add(gde);
         
         point[d]= s2g.scores2point(sko[d]);
                outerpoint[d]= point[d];
         pt= new JLabel(outerpoint[d]+"");
         pl.add(pt);
         
         untpoint[d]= unt[d]*point[d];
                outeruntpoint[d]= untpoint[d];
         up= new JLabel(outeruntpoint[d]+"");
         pl.add(up);
         
         upsum= upsum+untpoint[d];
                        String gge= String.format("%.2f", upsum);
                outerupsum= Double.parseDouble(gge);
     
                addspace();addspace();addspace();addspace();addspace();addspace();
                addspace();addspace();addspace();addspace();addspace();addspace();
     } 
     cgpa= upsum/unitsum;
     if (unitsum==0)
         outercgpa=0;
     else
            outercgpa=cgpa;
            
     jbl7= new JLabel("");
     jbl8= new JLabel(outerunitsum+"");
     jbl9= new JLabel("");
     jbl10= new JLabel("");
     jbl11= new JLabel("");
     jbl12= new JLabel(outerupsum+"");
     pl.add(new JSeparator(SwingConstants.HORIZONTAL));
     pl.add(new JSeparator(SwingConstants.HORIZONTAL));
     pl.add(new JSeparator(SwingConstants.HORIZONTAL));
     pl.add(new JSeparator(SwingConstants.HORIZONTAL));
     pl.add(new JSeparator(SwingConstants.HORIZONTAL));
     pl.add(new JSeparator(SwingConstants.HORIZONTAL));
     pl.add(jbl7);
     pl.add(jbl8);
     pl.add(jbl9);
     pl.add(jbl10);
     pl.add(jbl11);
     pl.add(jbl12);
     String guage= String.format("%.2f", outercgpa);
     showgp.setText(guage);
     outerguage=guage;
           } 
            public void addspace(){
            JLabel sp= new JLabel("");
            pl.add(sp);
            }
            
            public void textFile () throws IOException {
		String sch= "";
                if(jtf.getText().isEmpty())
                  sch= "UNIVERSITY"; 
                else
                    sch= jtf.getText().toUpperCase();
                
		String fac="";
                if(jtf1.getText().isEmpty())
                  fac= "FACULTY"; 
                else
                    fac= jtf1.getText().toUpperCase();
                
		String dept="";
                if(jtf2.getText().isEmpty())
                  dept= "DEPARTMENT"; 
                else
                    dept= jtf2.getText().toUpperCase();
                
		String nom=getfullname();
		String gen= jcb1.getSelectedItem().toString();
		
	
	String fileName= getfullname()+".txt";
       // File dir= new File("C:\\Users\\");
    PrintWriter pen= new PrintWriter(new FileWriter(fileName));
    
    pen.println("************************************************************************************************************************");
    pen.println("************************************************************************************************************************");
    pen.println("************************************************************************************************************************");
    pen.println("***        "+sch+"                                                                                 ");
    pen.println("***  FACULTY: "+fac+"                                                                                                                ");
    pen.println("***  DEPARTMENT: "+dept+"                                                                                                                ");
    pen.println("***  NAME: "+nom+"                                                   ");
    pen.println("***  GENDER: "+gen+"                                                                       ");
    pen.println("***                                                                                                                  ");
    pen.println("***                                                                                                                  ");
    pen.println("***  NO.\tCOURSE\t\t\tUNIT\t\tSCORE\t\tGRADE\t\tPOINT\t\tUNIT*POINT   ");
	for (int i=0; i<count(); i++){
		pen.println("***  "+(i+1)+"\t\t"+outercn[i]+"\t\t\t"+outerunit[i]+"\t\t"+outersko[i]+
		"\t\t"+outergrade[i]+"\t\t"+outerpoint[i]+"\t\t"+outeruntpoint[i]+"                     ");
	
	}
	pen.println("***                                     ----                                                            ----");
	pen.println("***                                     "+outerunitsum+"                                                               "+outerupsum);
	pen.println("***  CGPA: "+outerguage+"/4                                                                                               ");
	pen.println("***                                                                                                                  ");
	pen.println("***                                                                                                                  ");
    pen.println("************************************************************************************************************************");
    pen.println("************************************************************************************************************************");
    pen.println("************************************************************************************************************************");
    pen.close();
	
}
}
