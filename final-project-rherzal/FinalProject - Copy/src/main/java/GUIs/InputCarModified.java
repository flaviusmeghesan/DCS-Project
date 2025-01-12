package GUIs;

import DataObjects.DataCar;
import DataOnly.Car;
import Utilities.DataOverNetwork;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class InputCarModified extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				InputCarModified frame = new InputCarModified();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public InputCarModified() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtNumber = new JTextPane();
		txtNumber.setText("number");
		txtNumber.setBounds(10, 92, 285, 20);
		contentPane.add(txtNumber);

		JTextPane petriname = new JTextPane();
		petriname.setText("1080");
		petriname.setBounds(10, 159, 285, 20);
		contentPane.add(petriname);

		JTextPane txtModel = new JTextPane();
		txtModel.setText("model");
		txtModel.setBounds(10, 61, 285, 20);
		contentPane.add(txtModel);

		JTextPane txtTarget = new JTextPane();
		txtTarget.setText("target");
		txtTarget.setBounds(10, 123, 285, 20);
		contentPane.add(txtTarget);

		JTextPane txtPlace = new JTextPane();
		txtPlace.setText("P");
		txtPlace.setBounds(10, 21, 285, 20);
		contentPane.add(txtPlace);

		JCheckBox chkTaxi = new JCheckBox("Taxi");
		chkTaxi.setBounds(10, 190, 100, 20);
		contentPane.add(chkTaxi);

		JCheckBox chkBus = new JCheckBox("Bus");
		chkBus.setBounds(120, 190, 100, 20);
		contentPane.add(chkBus);

		JCheckBox chkPriority = new JCheckBox("Priority");
		chkPriority.setBounds(230, 190, 150, 20);
		contentPane.add(chkPriority);

		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Socket s;
				try {
					s = new Socket(InetAddress.getByName("localhost"), Integer.parseInt(petriname.getText()));
					ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
					DataOverNetwork DataToSend = new DataOverNetwork();

					DataCar temp = new DataCar();
					Car c = new Car(txtModel.getText(), txtNumber.getText(), txtTarget.getText().split(","));

					// Set the properties based on the checkbox states
					c.isTaxi = (chkTaxi.isSelected());
					c.isBus = (chkBus.isSelected());
					c.isPriority = (chkPriority.isSelected());

					temp.SetValue(c);
					temp.SetName(txtPlace.getText());
					DataToSend.petriObject = temp;

					DataToSend.NetWorkPort = Integer.parseInt(petriname.getText());
					oos.writeObject(DataToSend);
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		btnSend.setBounds(10, 220, 285, 44);
		contentPane.add(btnSend);
	}
}
