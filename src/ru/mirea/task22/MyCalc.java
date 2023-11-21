package ru.mirea.task22;

import java.awt.*;
import java.awt.event.*;
class MyCalc extends WindowAdapter implements ActionListener{
    Frame f;
    Label l1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button badd,bsub,bmult,bdiv,bcalc,bclr,bpts,bback,bspace;

    MyCalc(){
        f= new Frame("MY CALCULATOR");
// Инициализация кнопок
        l1=new Label();
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(50,50,260,60);


        b1=new Button("1");
        b1.setBounds(50,340,50,50);
        b2=new Button("2");
        b2.setBounds(120,340,50,50);
        b3=new Button("3");
        b3.setBounds(190,340,50,50);
        b4=new Button("4");
        b4.setBounds(50,270,50,50);
        b5=new Button("5");
        b5.setBounds(120,270,50,50);
        b6=new Button("6");
        b6.setBounds(190,270,50,50);
        b7=new Button("7");
        b7.setBounds(50,200,50,50);
        b8=new Button("8");
        b8.setBounds(120,200,50,50);
        b9=new Button("9");
        b9.setBounds(190,200,50,50);
        b0=new Button("0");
        b0.setBounds(50,410,50,50);
        bpts=new Button(".");
        bpts.setBounds(120,410,50,50);
        bback=new Button("Back");
        bback.setBounds(120,130,50,50);

        badd=new Button("+");
        badd.setBounds(260,340,50,50);
        bsub=new Button("-");
        bsub.setBounds(260,270,50,50);
        bmult=new Button("*");
        bmult.setBounds(260,200,50,50);
        bdiv=new Button("/");
        bdiv.setBounds(260,410,50,50);
        bcalc=new Button("=");
        bcalc.setBounds(190,410,50,50);
        bclr=new Button("C");
        bclr.setBounds(50,130,50,50);
        bspace=new Button("Space");
        bspace.setBounds(190,130,50,50);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        bpts.addActionListener(this);
        bback.addActionListener(this);

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bcalc.addActionListener(this);
        bclr.addActionListener(this);
        bspace.addActionListener(this);

        f.addWindowListener(this);
//ADDING TO FRAME
        f.add(l1);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4); f.add(b5);f.add(b6); f.add(b7); f.add(b8);f.add(b9);f.add(b0);

        f.add(badd); f.add(bsub); f.add(bmult); f.add(bdiv);f.add(bcalc);

        f.add(bclr); f.add(bpts); f.add(bback); f.add(bspace);

        f.setSize(360,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    //Закрытие окна
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e){
        String z,zt, input;
        //ЦИФРЫ
        if(e.getSource()==b1){
            zt=l1.getText();
            z=zt+"1";
            l1.setText(z);
        }
        if(e.getSource()==b2){
            zt=l1.getText();
            z=zt+"2";
            l1.setText(z);
        }
        if(e.getSource()==b3){
            zt=l1.getText();
            z=zt+"3";
            l1.setText(z);
        }
        if(e.getSource()==b4){
            zt=l1.getText();
            z=zt+"4";
            l1.setText(z);
        }
        if(e.getSource()==b5){
            zt=l1.getText();
            z=zt+"5";
            l1.setText(z);
        }
        if(e.getSource()==b6){
            zt=l1.getText();
            z=zt+"6";
            l1.setText(z);
        }
        if(e.getSource()==b7){
            zt=l1.getText();
            z=zt+"7";
            l1.setText(z);
        }
        if(e.getSource()==b8){
            zt=l1.getText();
            z=zt+"8";
            l1.setText(z);
        }
        if(e.getSource()==b9){
            zt=l1.getText();
            z=zt+"9";
            l1.setText(z);
        }
        if(e.getSource()==b0){
            zt=l1.getText();
            z=zt+"0";
            l1.setText(z);
        }

        if(e.getSource()==bpts){  //Точка
            zt=l1.getText();
            z=zt+".";
            l1.setText(z);
        }

        if(e.getSource()==bback){  // Стирание
            zt=l1.getText();
            try{
                z=zt.substring(0, zt.length()-1);
            }catch(StringIndexOutOfBoundsException f){return;}
            l1.setText(z);
        }
        //АРИФМЕТИКА
        if(e.getSource()==badd){                     //Сложение
            zt = l1.getText();
            z=zt + " +";
            l1.setText(z);
        }
        if(e.getSource()==bsub){                    //Вычитание
            zt = l1.getText();
            z=zt + " -";
            l1.setText(z);
        }
        if(e.getSource()==bmult){                   //Умножение
            zt = l1.getText();
            z=zt + " *";
            l1.setText(z);
        }
        if(e.getSource()==bdiv){                   //Деление
            zt = l1.getText();
            z=zt + " /";
            l1.setText(z);
        }
        //Кнопка вычисления
        if(e.getSource()==bcalc){
            input = l1.getText();
            try{
                l1.setText(String.valueOf(RPN.evaluate(input)));
            } catch (NullPointerException ex) {
                l1.setText("Невозможно выполнить POP, стэк пуст");
            } catch(Exception ex)
            {
                l1.setText("Недопустимое выражение");
            }
        }
        //Очистка
        if(e.getSource()==bclr){
            z="";
            l1.setText(z);
        }
        //Добавление пробелов
        if(e.getSource()==bspace){
            zt = l1.getText();
            z = zt + " ";
            l1.setText(z);
        }

    }
    //Main
    public static void main(String[] args){
        new MyCalc();
    }
}