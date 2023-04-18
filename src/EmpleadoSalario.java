import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpleadoSalario extends JDialog{
    private JPanel Main;
    private JTextField txtNames;
    private JTextField txtValor;
    private JTextField txtHours;
    private JButton mostrarBttn;
    private JButton salirBttn;
    private JButton borrarBttn;

    public EmpleadoSalario(JFrame parent) {
        super(parent);
        setTitle("Empleado-Salario");
        setContentPane(Main);
        setMinimumSize(new Dimension(450,300));
        setModal(true);
        setLocationRelativeTo(parent);


        mostrarBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Names miNombre = new Names();
                Salario miSalario = new Salario();

                String name = txtNames.getText();
                miNombre.setName(name);
                double valorHora = Double.parseDouble(txtValor.getText());
                miSalario.setValorHora(valorHora);
                int horas = Integer.parseInt(txtHours.getText());
                miSalario.setHoras(horas);

                JOptionPane.showMessageDialog(null, miSalario.getSalario(name));

            }
        });

        borrarBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNames.setText("");
                txtValor.setText("");
                txtHours.setText("");
            }
        });

        salirBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        EmpleadoSalario form = new EmpleadoSalario(null);
    }
}
