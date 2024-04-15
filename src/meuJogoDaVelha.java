import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class meuJogoDaVelha extends JFrame{
    JButton [] bt = new JButton[9];
    JLabel placar  = new JLabel("placar");
    JButton novo = new JButton("novo jogo");
    JButton zerar = new JButton("zerar placar");
    JLabel x = new JLabel("[X: 0]");
    JLabel o = new JLabel("[O: 0]");

    int pX, pO;
    boolean [] click = new boolean[9];
    boolean xo = false;
    public meuJogoDaVelha(){
        setResizable(false);
        setVisible(true);
        setTitle("Jogo da velha");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(250,100,700,500);
        add(placar);
        add(x);
        add(o);
        add(novo);
        add(zerar);
        placar.setBounds(407, 50,100,30);
        x.setBounds(400, 75,100,30);
        o.setBounds(450, 75,100,30);
        novo.setBounds(400, 150, 135, 40);
        zerar.setBounds(400, 220, 135, 40);

        placar.setFont(new Font("Arial", Font.BOLD , 25));
        o.setFont(new Font("Arial", Font.BOLD , 18));
        x.setFont(new Font("Arial", Font.BOLD , 18));
        zerar.setFont(new Font("Arial", Font.BOLD , 15));
        novo.setFont(new Font("Arial", Font.BOLD , 15));


        novo.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                limpar();
            }
        });
        zerar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pO = 0;
                pX = 0;
                atualizar();
                limpar();
            }
        });

        int count =0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bt[count] = new JButton();
                add(bt[count]);
                bt[count].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
                bt[count].setFont(new Font("Arial", Font.BOLD , 50));
                count++;
            }
        }

        for (int i = 0; i < 9; i++) {
            click [i] = false;
        }


        bt[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[0]) {
                    click[0] = true;
                    mudar(bt[0]);
                }
            }
        });
        bt[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[1]) {
                    click[1] = true;
                    mudar(bt[1]);
                }
            }
        });
        bt[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[2]) {
                    click[2] = true;
                    mudar(bt[2]);
                }
            }
        });
        bt[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[3]) {
                    click[3] = true;
                    mudar(bt[3]);
                }
            }
        });
        bt[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[4]) {
                    click[4] = true;
                    mudar(bt[4]);
                }
            }
        });
        bt[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[5]) {
                    click[5] = true;
                    mudar(bt[5]);
                }
            }
        });
        bt[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[6]) {
                    click[6] = true;
                    mudar(bt[6]);
                }
            }
        });
        bt[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[7]) {
                    click[7] = true;
                    mudar(bt[7]);
                }
            }
        });
        bt[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!click[8]) {
                    click[8] = true;
                    mudar(bt[8]);
                }
            }
        });

    }
    public void mudar(JButton bt){
        if(xo){
            bt.setText("O");
            xo=false;
        }else{
            bt.setText("X");
            xo=true;
        }
ganhou();
    }
    public void ganhou(){
        int count = 0;

        for (int i = 0; i < 9; i++) {
            if(click[i]){
                count++;
            }
        }

        if((bt[0].getText()=="X" && bt[1].getText()=="X" && bt[2].getText()=="X")
                || (bt[5].getText()=="X" && bt[4].getText()=="X" && bt[3].getText()=="X")
                ||(bt[8].getText()=="X" && bt[7].getText()=="X" && bt[6].getText()=="X")
                ||(bt[0].getText()=="X" && bt[3].getText()=="X" && bt[6].getText()=="X")
                ||(bt[1].getText()=="X" && bt[4].getText()=="X" && bt[7].getText()=="X")
                ||(bt[2].getText()=="X" && bt[5].getText()=="X" && bt[8].getText()=="X")
                ||(bt[2].getText()=="X" && bt[4].getText()=="X" && bt[6].getText()=="X")
                ||(bt[0].getText()=="X" && bt[4].getText()=="X" && bt[8].getText()=="X")){
            JOptionPane.showMessageDialog(null, "[X] ganhou");
            pX++;
            limpar();
            atualizar();

        }else if((bt[0].getText()=="O" && bt[1].getText()=="O" && bt[2].getText()=="O")
                || (bt[5].getText()=="O" && bt[4].getText()=="O" && bt[3].getText()=="O")
                ||(bt[8].getText()=="O" && bt[7].getText()=="O" && bt[6].getText()=="O")
                ||(bt[0].getText()=="O" && bt[3].getText()=="O" && bt[6].getText()=="O")
                ||(bt[1].getText()=="O" && bt[4].getText()=="O" && bt[7].getText()=="O")
                ||(bt[2].getText()=="O" && bt[5].getText()=="O" && bt[8].getText()=="O")
                ||(bt[2].getText()=="O" && bt[4].getText()=="O" && bt[6].getText()=="O")
                ||(bt[0].getText()=="O" && bt[4].getText()=="O" && bt[8].getText()=="O")){
            JOptionPane.showMessageDialog(null, "[O] ganhou");
            pO++;
            limpar();
            atualizar();

        }else{
            if (count ==9){
                JOptionPane.showMessageDialog(null, "deu velha :(");
                limpar();
            }

        }

    }

    public void atualizar(){
        x.setText("[X: "+ pX +"]");
        o.setText("[O: "+pO +"]");
    }

    public void limpar(){
        for (int i = 0; i < 9; i++) {
            bt[i].setText("");
            click[i] = false;
        }
    }

    public static void main(String[] args) {
        new meuJogoDaVelha();
    }
}
