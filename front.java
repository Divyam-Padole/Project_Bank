package project2;
//Generated by GuiGenie - Copyright (c) 2004 Mario Awad.
//Home Page http://guigenie.cjb.net - Check often for new versions!

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class front extends JPanel implements ItemListener, ActionListener {
    private final JButton numpad1;
    private final JButton numpad2;
    private final JButton numpad3;
    private final JButton numpad4;
    private final JButton numpad5;
    private final JButton numpad6;
    private final JButton numpad7;
    private final JButton numpad8;
    private final JButton numpad9;
    private final JButton numpad0;
    private final JButton cancel;
    private final JButton clear;
    private final JButton enter;

    private final JButton account_detail;

    private final JTextField pinTextBox;

    private final JTextArea display;

    private final JRadioButton insert;

    private  String user_id,user_pin;

    String option= """

                DEPOSIT\t                    BALANCE


                NEW PIN\t        MINI STATEMENT


                WITHDRAW                      DETAILS\
            """;
    String proc="\n\n\n\n           CARD IS UNDER PROCESS\n           (Don't remove until told)";
    String start= """



                              WELCOME  TO

                                 AXIS  BANK\
            """;

    String pin="\n\n\n\n                    INSERT PIN";

    String null_enter="\n\n\n\n                PLEASE ENTER INPUT";

    String pin_error= """




                               WRONG INPUT
                        You can remove your card\
            """;

    int count=0,word=0,limit_flag=0,pin_count=0;
    public front() {
        Font font = new Font("Consolas", Font.BOLD, 20);
        //construct components
        numpad1 = new JButton ("1");
        numpad2 = new JButton ("2");
        numpad3 = new JButton ("3");
        numpad4 = new JButton ("4");
        numpad5 = new JButton ("5");
        numpad6 = new JButton ("6");
        numpad7 = new JButton ("7");
        numpad8 = new JButton ("8");
        numpad9 = new JButton ("9");
        numpad0 = new JButton ("0");
        cancel = new JButton ("CANCEL");
        clear = new JButton ("CLEAR");
        enter = new JButton ("ENTER");

        //adjust size and set layout
        setPreferredSize (new Dimension (627, 250));
        setLayout (null);

        //add components
        add (numpad1);
        add (numpad2);
        add (numpad3);
        add (numpad4);
        add (numpad5);
        add (numpad6);
        add (numpad7);
        add (numpad8);
        add (numpad9);
        add (numpad0);
        add (cancel);
        add (clear);
        add (enter);

        //set component bounds (only needed by Absolute Positioning)
        numpad1.setBounds (255, 340, 110, 40);
        numpad1.setFont(font);
        numpad2.setBounds (375, 340, 110, 40);
        numpad2.setFont(font);
        numpad3.setBounds (495, 340, 110, 40);
        numpad3.setFont(font);
        numpad4.setBounds (255, 395, 110, 40);
        numpad4.setFont(font);
        numpad5.setBounds (375, 395, 110, 40);
        numpad5.setFont(font);
        numpad6.setBounds (495, 395, 110, 40);
        numpad6.setFont(font);
        numpad7.setBounds (255, 450, 110, 40);
        numpad7.setFont(font);
        numpad8.setBounds (375, 450, 110, 40);
        numpad8.setFont(font);
        numpad9.setBounds (495, 450, 110, 40);
        numpad9.setFont(font);
        numpad0.setBounds (375, 500, 110, 40);
        numpad0.setFont(font);
        cancel.setBounds (615, 340, 130, 40);
        cancel.setFont(font);
        clear.setBounds (615, 395, 131, 40);
        clear.setFont(font);
        enter.setBounds (615, 450, 130, 40);
        enter.setFont(font);

//        -------------------------------------------------------------

        JButton deposit = new JButton();
        JButton new_pin = new JButton();
        JButton withdraw = new JButton();
        JButton balance = new JButton();
        JButton mini_stat = new JButton();
        account_detail = new JButton();
        display = new JTextArea();
        pinTextBox=new JTextField();
        insert = new JRadioButton("CARD STATUS");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 558));
        setLayout (null);

        //add components
        add (deposit);
        add (new_pin);
        add (withdraw);
        add (balance);
        add (mini_stat);
        add (account_detail);
        add(display);
        add(pinTextBox);
        add(insert);

        //set component bounds (only needed by Absolute Positioning)
        deposit.setBounds (32, 95, 225, 70);
        deposit.setText(">>");
        deposit.setHorizontalAlignment(JTextField.CENTER);
        
        new_pin.setBounds (32, 165, 225, 70);
        new_pin.setText(">>");
        new_pin.setHorizontalAlignment(JTextField.CENTER);
        
        withdraw.setBounds (32, 235, 225, 70);
        withdraw.setText(">>");
        withdraw.setHorizontalAlignment(JTextField.CENTER);

        balance.setBounds (692, 95, 225, 70);
        balance.setText("<<");
        balance.setHorizontalAlignment(JTextField.CENTER);

        mini_stat.setBounds (692, 165, 225, 70);
        mini_stat.setText("<<");
        mini_stat.setHorizontalAlignment(JTextField.CENTER);

        account_detail.setBounds (692, 235, 225, 70);
        account_detail.setText("<<");
        account_detail.setHorizontalAlignment(JTextField.CENTER);

        display.setBounds(257,95,435,210);
        display.setText(start);
        display.setEditable(false);
        display.setFont(font);


        pinTextBox.setBounds(257, 305, 435, 30);
        pinTextBox.setFont(font);
        pinTextBox.setBorder(null);
        pinTextBox.setVisible(false);
        pinTextBox.setEditable(false);
        pinTextBox.setBackground(new Color(0xFFFFFF));
        pinTextBox.setHorizontalAlignment(JTextField.CENTER);


        insert.setLocation(50, 400);
        insert.setSize(200,20);
        insert.setFont(font);

        //--------------------------

        insert.addItemListener(this);
        enter.addActionListener(this);
        clear.addActionListener(this);
        cancel.addActionListener(this);
        numpad1.addActionListener(this);
        numpad2.addActionListener(this);
        numpad3.addActionListener(this);
        numpad4.addActionListener(this);
        numpad5.addActionListener(this);
        numpad6.addActionListener(this);
        numpad7.addActionListener(this);
        numpad8.addActionListener(this);
        numpad9.addActionListener(this);
        numpad0.addActionListener(this);
        account_detail.addActionListener(this);
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setResizable(false);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new front());
        frame.pack();
        frame.setVisible (true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange()== ItemEvent.SELECTED)
        {
            pinTextBox.setVisible(true);

            display.setText(proc);
        }
        else{
            pinTextBox.setVisible(false);
            display.setText(start);
            pinTextBox.setText(null);
            word=0;
            pin_count=0;
            user_pin=null;
            user_id=null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if(insert.isSelected() ) {
                if((limit_flag==0 && word<12)||(limit_flag==1 && pin_count<4)){
                if(e.getSource()== numpad1){

                    pinTextBox.setText(pinTextBox.getText()+"1");
                }
                if(e.getSource()== numpad2){
                    pinTextBox.setText(pinTextBox.getText()+"2");
                }
                if(e.getSource()== numpad3){
                    pinTextBox.setText(pinTextBox.getText()+"3");
                }
                if(e.getSource()== numpad4){
                    pinTextBox.setText(pinTextBox.getText()+"4");
                }
                if(e.getSource()== numpad5){
                    pinTextBox.setText(pinTextBox.getText()+"5");
                }
                if(e.getSource()== numpad6){
                    pinTextBox.setText(pinTextBox.getText()+"6");
                }
                if(e.getSource()== numpad7){
                    pinTextBox.setText(pinTextBox.getText()+"7");
                }
                if(e.getSource()== numpad8){
                    pinTextBox.setText(pinTextBox.getText()+"8");
                }if(e.getSource()== numpad9){
                    pinTextBox.setText(pinTextBox.getText()+"9");
                }
                if(e.getSource()== numpad0){
                    pinTextBox.setText(pinTextBox.getText()+"0");
                }
                if(limit_flag==0 )
                {
                  word+=1;
                }
                else {
                    pin_count+=1;
                }

            }}
            if(e.getSource() == clear ){
                    String text= pinTextBox.getText();
                    if(text.length()>0) {
                        pinTextBox.setText(text.substring(0, text.length() - 1));
                        if (limit_flag == 0) {
                            word -= 1;
                        } else {
                            pin_count -= 1;
                        }
                    }
                    else{
                        word=0;
                        pin_count=0;
                    }

            }
            if (e.getSource() == cancel)
            {
                display.setText(start);
                insert.setSelected(false);
                pinTextBox.setText(null);
                word=0;
                pin_count=0;
                user_id=null;
                user_pin=null;
            }



//            ------------------------------------------
            if (e.getSource() == enter) {

                if (pinTextBox.isVisible()) {

                    if (pinTextBox.getText().equals("")) {
                        display.setText(null_enter);
                    } else {
                        String a = pinTextBox.getText();
                        if(count==0) {
                            ResultSet result = connection_mysql.connectToDB("SELECT * FROM DETAIL WHERE ACCOUNT_NO=" + a + ";");
                            assert result != null;
                            result.next();
                            user_id=result.getString(2);
                            user_pin=result.getString(3);

                        }

                        if (a.equals(user_id)){
                            pinTextBox.setText(null);
                            display.setText(pin);
                            count=1;
                            limit_flag=1;
                        }
                        else if (a.equals(user_pin)) {
                            if(count==1) {
                                pinTextBox.setVisible(false);
                                display.setText(option);
                                count = 0;
                            }
                        }
                        else {
                            display.setText(pin_error);
                            pinTextBox.setText(null);
                            pinTextBox.setVisible(false);
                        }
                    }

                    }
                word=0;
                pin_count=0;
                }

            //--------------------------------------------------------------------

            if(e.getSource()==account_detail)
            {
                detail d= new detail();
                display.setText(d.detail_screen());
            }

        }
        catch(Exception f)
        {
            System.out.println(f);
        }
    }
}

