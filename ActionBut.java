package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionBut implements ActionListener {
    private JButton button;

    public ActionBut(JButton button){
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("REDY TO GO");
    }
}

