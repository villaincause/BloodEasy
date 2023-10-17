package start;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.awt.Toolkit;
public class Order extends JFrame {

	private JPanel contentPane;
	private JTextField delAddTxt;
	private JTextField VolumeTxt;
	Connection con;
    PreparedStatement pst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void Connect()
    {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/bloodeasy", "root","");
        }
        catch (ClassNotFoundException ex) 
        {
          ex.printStackTrace();
        }
        catch (SQLException ex) 
        {
               ex.printStackTrace();
        }

    }
	/**
	 * Create the frame.
	 */
	public Order() {
		setTitle("BloodEasy");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Order.class.getResource("/start/blood-drop-blood-png-clipart-best-28.png")));
    	Connect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel delAdd = new JLabel("Delivery Address");
		delAdd.setFont(new Font("Sitka Text", Font.BOLD, 15));
		delAdd.setBounds(41, 200, 136, 30);
		contentPane.add(delAdd);
		
		delAddTxt = new JTextField();
		delAddTxt.setHorizontalAlignment(SwingConstants.CENTER);
		delAddTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		delAddTxt.setColumns(10);
		delAddTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		delAddTxt.setBackground(new Color(240, 255, 240));
		delAddTxt.setBounds(218, 202, 272, 27);
		contentPane.add(delAddTxt);
		
		JLabel lblNewLabel_3_4 = new JLabel("Select Blood Group");
		lblNewLabel_3_4.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(40, 87, 160, 30);
		contentPane.add(lblNewLabel_3_4);
		
		final JRadioButton buttonAplus = new JRadioButton("A+");
		buttonAplus.setBackground(new Color(255, 255, 255));
		buttonAplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAplus.setBounds(214, 76, 47, 23);
		contentPane.add(buttonAplus);
		
		final JRadioButton buttonBplus = new JRadioButton("B+");
		buttonBplus.setBackground(new Color(255, 255, 255));
		buttonBplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonBplus.setBounds(296, 76, 47, 23);
		contentPane.add(buttonBplus);
		
		final JRadioButton buttonABplus = new JRadioButton("AB+");
		buttonABplus.setBackground(new Color(255, 255, 255));
		buttonABplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonABplus.setBounds(360, 76, 49, 23);
		contentPane.add(buttonABplus);
		
		final JRadioButton buttonOplus = new JRadioButton("O+");
		buttonOplus.setBackground(new Color(255, 255, 255));
		buttonOplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonOplus.setBounds(443, 76, 47, 23);
		contentPane.add(buttonOplus);
		
		final JRadioButton buttonOminus = new JRadioButton("O-");
		buttonOminus.setBackground(new Color(255, 255, 255));
		buttonOminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonOminus.setBounds(443, 103, 47, 23);
		contentPane.add(buttonOminus);
		
		final JRadioButton buttonABminus = new JRadioButton("AB-");
		buttonABminus.setBackground(new Color(255, 255, 255));
		buttonABminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonABminus.setBounds(360, 102, 49, 23);
		contentPane.add(buttonABminus);
		
		final JRadioButton buttonBminus = new JRadioButton("B-");
		buttonBminus.setBackground(new Color(255, 255, 255));
		buttonBminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonBminus.setBounds(296, 102, 47, 23);
		contentPane.add(buttonBminus);
		
		final JRadioButton buttonAminus = new JRadioButton("A-");
		buttonAminus.setBackground(new Color(255, 255, 255));
		buttonAminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAminus.setBounds(214, 103, 47, 23);
		contentPane.add(buttonAminus);
		
		final JRadioButton btnWb = new JRadioButton("Whole Blood");
		btnWb.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWb.setBackground(Color.WHITE);
		btnWb.setBounds(395, 165, 95, 23);
		contentPane.add(btnWb);
		
		final JRadioButton btnRc = new JRadioButton("Red Cells");
		btnRc.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRc.setBackground(Color.WHITE);
		btnRc.setBounds(291, 134, 77, 23);
		contentPane.add(btnRc);
		
		final JRadioButton btnPlatelets = new JRadioButton("Platelets");
		btnPlatelets.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlatelets.setBackground(Color.WHITE);
		btnPlatelets.setBounds(214, 134, 75, 23);
		contentPane.add(btnPlatelets);
		
		final JRadioButton btnCryo = new JRadioButton("Cryo");
		btnCryo.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCryo.setBackground(Color.WHITE);
		btnCryo.setBounds(439, 134, 51, 23);
		contentPane.add(btnCryo);
		
		final JRadioButton btnPlasma = new JRadioButton("Plasma");
		btnPlasma.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlasma.setBackground(Color.WHITE);
		btnPlasma.setBounds(370, 134, 67, 23);
		contentPane.add(btnPlasma);
		
		final JRadioButton btnWC = new JRadioButton("White Cells");
		btnWC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnWC.setBackground(Color.WHITE);
		btnWC.setBounds(214, 165, 87, 23);
		contentPane.add(btnWC);
		
		final JRadioButton btnGranulocytes = new JRadioButton("Granulocytes");
		btnGranulocytes.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGranulocytes.setBackground(Color.WHITE);
		btnGranulocytes.setBounds(298, 165, 101, 23);
		contentPane.add(btnGranulocytes);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Screenshot__42_-removebg-preview (1).png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(178, 11, 190, 47);
		contentPane.add(lblNewLabel);
		
		JLabel Volume = new JLabel("Total Volume (in ml)");
		Volume.setFont(new Font("Sitka Text", Font.BOLD, 15));
		Volume.setBounds(40, 245, 184, 30);
		contentPane.add(Volume);
		
		JButton btnPlaceOrder = new JButton("Place Order");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bGroup = null, component = null;
				float multiplier = 0;
				if(buttonAplus.isSelected()) {
					bGroup = "A+";
				}
				else if(buttonAminus.isSelected()) {
					bGroup = "A-";
				}
				else if(buttonBplus.isSelected()) {
					bGroup = "B+";
				}
				else if(buttonBminus.isSelected()) {
					bGroup = "B-";
				}
				else if(buttonABplus.isSelected()) {
					bGroup = "AB+";
				}
				else if(buttonABminus.isSelected()) {
					bGroup = "AB-";
				}
				else if(buttonOplus.isSelected()) {
					bGroup = "O+";
				}
				else if(buttonOminus.isSelected()) {
					bGroup = "O-";
				}
				String delAddress = delAddTxt.getText();
				
				if(btnPlatelets.isSelected()) {
					multiplier = 2;
				}
				else if(btnRc.isSelected()) {
					multiplier = (float) 1.15;
					component = "Red Cells";
				}
				else if(btnWb.isSelected()) {
					multiplier = (float) 1.9;
					component = "Whole Blood";
				}
				else if(btnPlasma.isSelected()) {
					multiplier = (float) 1.6;
					component = "Plasma";
				}
				else if(btnCryo.isSelected()) {
					multiplier = (float) 1.5;
					component = "Cryo";
				}
				else if(btnWC.isSelected()) {
					multiplier = (float) 1.25;
					component = "White Blood Cells";
				}
				else if(btnGranulocytes.isSelected()) {
					multiplier = (float) 1.2;
					component = "Granulocytes";
				}
				String address = delAddTxt.getText();
				int volume = Integer.parseInt(VolumeTxt.getText());
				float price = (float) (volume * multiplier);
				int mainPrice = (int) price;
				if(!bGroup.equals(null) && !delAddress.equals(null) && volume != 0 && multiplier != 0) {
					try {
	                    // Ensure that the 'con' variable is not null
	                    if (con != null) {
	                        pst = con.prepareStatement("INSERT INTO orders (BloodGroup, Component, Volume, Address, Price) VALUES (?, ?, ?, ?, ?)");

	                        pst.setString(1, bGroup);
	                        pst.setString(2, component);
	                        pst.setLong(3, volume);
	                        pst.setString(4, address);
	                        pst.setLong(5, mainPrice);

	                        int rowsInserted = pst.executeUpdate();
	                        
	                        }
	                    
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            
				Component show = null;
				JOptionPane.showMessageDialog(show, "Order Placed"+"\n"+volume+"ml "+bGroup+" "+component+"\n"+"Price: "+mainPrice+" TK  (Pay In Cash)");
				}
				if(multiplier == 0 || bGroup.equals(null)) {
					Component show = null;
					JOptionPane.showMessageDialog(show, "Complete All Sections");
				}
			}
		});
		btnPlaceOrder.setForeground(new Color(240, 255, 255));
		btnPlaceOrder.setFont(new Font("Sitka Heading", Font.BOLD, 16));
		btnPlaceOrder.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		btnPlaceOrder.setBackground(new Color(105, 105, 105));
		btnPlaceOrder.setBounds(354, 296, 136, 30);
		contentPane.add(btnPlaceOrder);
		
		VolumeTxt = new JTextField();
		VolumeTxt.setHorizontalAlignment(SwingConstants.CENTER);
		VolumeTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		VolumeTxt.setColumns(10);
		VolumeTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		VolumeTxt.setBackground(new Color(240, 255, 240));
		VolumeTxt.setBounds(218, 244, 272, 27);
		contentPane.add(VolumeTxt);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Select Component");
		lblNewLabel_3_4_1.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNewLabel_3_4_1.setBounds(41, 145, 183, 30);
		contentPane.add(lblNewLabel_3_4_1);
		
	}
}
