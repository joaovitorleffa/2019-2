package Aula05_Exercicios;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class RetornaMes {

    public void getMesPorExtenso (int codigo, int num) {
        if (codigo == 1) {
            if (num == 1) {
                JOptionPane.showMessageDialog(null, "Mês: Janeiro");
            } else if (num == 2) {
                JOptionPane.showMessageDialog(null, "Mês: Fevereiro");
            } else if (num == 3) {
                JOptionPane.showMessageDialog(null, "Mês: Março");
            } else if (num == 4) {
                JOptionPane.showMessageDialog(null, "Mês: Abril");
            } else if (num == 5) {
                JOptionPane.showMessageDialog(null, "Mês: Maio");
            } else if (num == 6) {
                JOptionPane.showMessageDialog(null, "Mês: Junho");
            } else if (num == 7) {
                JOptionPane.showMessageDialog(null, "Mês: Julho");
            } else if (num == 8) {
                JOptionPane.showMessageDialog(null, "Mês: Agosto");
            } else if (num == 9) {
                JOptionPane.showMessageDialog(null, "Mês: Setembro");
            } else if (num == 10) {
                JOptionPane.showMessageDialog(null, "Mês: Outubro");
            } else if (num == 11) {
                JOptionPane.showMessageDialog(null, "Mês: Novembro");
            } else {
                JOptionPane.showMessageDialog(null, "Mês: Dezembro");
            }
        }

        if (codigo == 2) {
            if (num == 1) {
                JOptionPane.showMessageDialog(null, "Mês: January");
            } else if (num == 2) {
                JOptionPane.showMessageDialog(null, "Mês: February");
            } else if (num == 3) {
                JOptionPane.showMessageDialog(null, "Mês: March");
            } else if (num == 4) {
                JOptionPane.showMessageDialog(null, "Mês: April");
            } else if (num == 5) {
                JOptionPane.showMessageDialog(null, "Mês: May");
            } else if (num == 6) {
                JOptionPane.showMessageDialog(null, "Mês: June");
            } else if (num == 7) {
                JOptionPane.showMessageDialog(null, "Mês: July");
            } else if (num == 8) {
                JOptionPane.showMessageDialog(null, "Mês: August");
            } else if (num == 9) {
                JOptionPane.showMessageDialog(null, "Mês: September");
            } else if (num == 10) {
                JOptionPane.showMessageDialog(null, "Mês: October");
            } else if (num == 11) {
                JOptionPane.showMessageDialog(null, "Mês: November");
            } else {
                JOptionPane.showMessageDialog(null, "Mês: December");
            }
        }
    }
}
