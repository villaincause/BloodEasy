package start;
import java.sql.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxt;
	private JTextField passTxt;
	private JTextField CpassTxt;
	private JTextField dobTxt;
	private JTextField nationTxt;
	private JTextField addressTxt;
	private JTextField mailTxt;
	private JTextField numberTxt;
	Connection con;
    PreparedStatement pst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
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
	public Registration() {
		setTitle("BloodEasy");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registration.class.getResource("/start/blood-drop-blood-png-clipart-best-28.png")));
		
	    Connect();
		setForeground(new Color(192, 192, 192));
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login page = new Login();
				page.frmBloodeasy.setVisible(true);
				dispose();
			}
		});
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/Backmain2.png"));
		lblNewLabel_6.setIcon(img3);
		lblNewLabel_6.setBounds(452, 11, 40, 40);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7_1_1_1_1_1_1 = new JLabel("“O positive”");
		lblNewLabel_7_1_1_1_1_1_1.setForeground(new Color(107, 142, 35));
		lblNewLabel_7_1_1_1_1_1_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1_1_1_1_1_1.setBounds(33, 495, 99, 25);
		contentPane.add(lblNewLabel_7_1_1_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1_2 = new JLabel("Be");
		lblNewLabel_7_1_1_1_1_2.setForeground(new Color(107, 142, 35));
		lblNewLabel_7_1_1_1_1_2.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1_1_1_1_2.setBounds(10, 474, 20, 25);
		contentPane.add(lblNewLabel_7_1_1_1_1_2);
		
		JLabel lblNewLabel_7_1_1_1_1_1 = new JLabel("“A negative”");
		lblNewLabel_7_1_1_1_1_1.setForeground(new Color(107, 142, 35));
		lblNewLabel_7_1_1_1_1_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1_1_1_1_1.setBounds(29, 452, 99, 25);
		contentPane.add(lblNewLabel_7_1_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1 = new JLabel("Don’t be");
		lblNewLabel_7_1_1_1_1.setForeground(new Color(107, 142, 35));
		lblNewLabel_7_1_1_1_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1_1_1_1.setBounds(10, 424, 67, 25);
		contentPane.add(lblNewLabel_7_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Donate blood");
		lblNewLabel_7_1_1_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_7_1_1_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1_1_1.setBounds(309, 256, 104, 25);
		contentPane.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Eat right");
		lblNewLabel_7_1_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_7_1_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1_1.setBounds(343, 284, 70, 25);
		contentPane.add(lblNewLabel_7_1_1);
		
		
		JLabel lblNewLabel_7_1 = new JLabel("Stay fit");
		lblNewLabel_7_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_7_1.setFont(new Font("Sylfaen", Font.BOLD, 18));
		lblNewLabel_7_1.setBounds(356, 229, 57, 25);
		contentPane.add(lblNewLabel_7_1);
		

		
		
		
		JLabel lblNewLabel_5 = new JLabel("DD/MM/YY");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(169, 169, 169));
		lblNewLabel_5.setFont(new Font("Sitka Small", Font.ITALIC, 12));
		lblNewLabel_5.setBounds(673, 181, 176, 38);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblBElogo = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Screenshot__42_-removebg-preview (1).png"));
		lblBElogo.setIcon(img);
		lblBElogo.setBounds(141, 83, 190, 47);
		contentPane.add(lblBElogo);
		
		JLabel lblSide = new JLabel("");
		lblSide.setBorder(null);
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/07-blood-donation-smg.png"));
		lblSide.setIcon(img2);
		lblSide.setBounds(0, 0, 480, 541);
		contentPane.add(lblSide);
		
		JLabel lblNewLabel_2 = new JLabel("Register");
		lblNewLabel_2.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(527, 16, 101, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblName.setBounds(527, 60, 136, 30);
		contentPane.add(lblName);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblPass.setBounds(527, 101, 136, 30);
		contentPane.add(lblPass);
		
		JLabel lblCPass = new JLabel("Confirm Password");
		lblCPass.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblCPass.setBounds(527, 142, 143, 30);
		contentPane.add(lblCPass);
		
		JLabel lblDOB = new JLabel("Date of Birth");
		lblDOB.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblDOB.setBounds(527, 183, 136, 30);
		contentPane.add(lblDOB);
		
		JLabel lblBGroup = new JLabel("Blood Group");
		lblBGroup.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblBGroup.setBounds(527, 234, 136, 30);
		contentPane.add(lblBGroup);
		
		JLabel lblNation = new JLabel("Nationality");
		lblNation.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNation.setBounds(527, 284, 136, 30);
		contentPane.add(lblNation);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblAddress.setBounds(527, 325, 136, 30);
		contentPane.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblEmail.setBounds(527, 366, 136, 30);
		contentPane.add(lblEmail);
		
		JLabel lblNumber = new JLabel("Mobile Number");
		lblNumber.setFont(new Font("Sitka Text", Font.BOLD, 15));
		lblNumber.setBounds(527, 407, 136, 30);
		contentPane.add(lblNumber);
		
		nameTxt = new JTextField();
		nameTxt.setHorizontalAlignment(SwingConstants.CENTER);
		nameTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		nameTxt.setBackground(new Color(240, 255, 240));
		nameTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		nameTxt.setColumns(10);
		nameTxt.setBounds(673, 62, 176, 27);
		contentPane.add(nameTxt);
		
		final JRadioButton buttonAplus = new JRadioButton("A+");
		buttonAplus.setBackground(new Color(255, 255, 255));
		buttonAplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAplus.setBounds(669, 228, 47, 23);
		contentPane.add(buttonAplus);
		
		final JRadioButton buttonBplus = new JRadioButton("B+");
		buttonBplus.setBackground(new Color(255, 255, 255));
		buttonBplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonBplus.setBounds(715, 228, 47, 23);
		contentPane.add(buttonBplus);
		
		final JRadioButton buttonABplus = new JRadioButton("AB+");
		buttonABplus.setBackground(new Color(255, 255, 255));
		buttonABplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonABplus.setBounds(764, 228, 49, 23);
		contentPane.add(buttonABplus);
		
		final JRadioButton buttonAminus = new JRadioButton("A-");
		buttonAminus.setBackground(new Color(255, 255, 255));
		buttonAminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonAminus.setBounds(669, 255, 47, 23);
		contentPane.add(buttonAminus);
		
		final JRadioButton buttonBminus = new JRadioButton("B-");
		buttonBminus.setBackground(new Color(255, 255, 255));
		buttonBminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonBminus.setBounds(715, 255, 47, 23);
		contentPane.add(buttonBminus);
		
		final JRadioButton buttonABminus = new JRadioButton("AB-");
		buttonABminus.setBackground(new Color(255, 255, 255));
		buttonABminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonABminus.setBounds(764, 255, 49, 23);
		contentPane.add(buttonABminus);
		
		final JRadioButton buttonOplus = new JRadioButton("O+");
		buttonOplus.setBackground(new Color(255, 255, 255));
		buttonOplus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonOplus.setBounds(815, 228, 47, 23);
		contentPane.add(buttonOplus);
		
		final JRadioButton buttonOminus = new JRadioButton("O-");
		buttonOminus.setBackground(new Color(255, 255, 255));
		buttonOminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonOminus.setBounds(815, 255, 47, 23);
		contentPane.add(buttonOminus);
		
		JLabel lblChoose = new JLabel("Become a");
		lblChoose.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblChoose.setBounds(527, 448, 73, 30);
		contentPane.add(lblChoose);
		
		final JRadioButton memberButton = new JRadioButton("Member");
		memberButton.setBackground(new Color(255, 255, 255));
		memberButton.setFont(new Font("Sitka Text", Font.BOLD, 14));
		memberButton.setBounds(613, 449, 83, 30);
		contentPane.add(memberButton);
		
		final JRadioButton donorButton = new JRadioButton("Donor");
		donorButton.setBackground(new Color(255, 255, 255));
		donorButton.setFont(new Font("Sitka Text", Font.BOLD, 14));
		donorButton.setBounds(698, 449, 67, 30);
		contentPane.add(donorButton);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uName = nameTxt.getText();
				String pass = passTxt.getText();
				String cpass = CpassTxt.getText();
				String dob = dobTxt.getText();
				String nationality = nationTxt.getText();
				String bGroup = null;
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
				String address = addressTxt.getText();
				String email = mailTxt.getText();
				String number = numberTxt.getText();
				boolean donor = false;
				boolean eligable = false;
				if(donorButton.isSelected() || memberButton.isSelected()) {
					eligable = true;
				}
			
				if(eligable == true && !uName.isEmpty() && !pass.isEmpty() && !dob.isEmpty() && !nationality.isEmpty() && !bGroup.isEmpty() && !address.isEmpty() && !email.isEmpty() && !number.isEmpty()) {
				Component show = null;
				try {
                    // Ensure that the 'con' variable is not null
                    if (con != null) {
                        pst = con.prepareStatement("INSERT INTO members (DName, Password, DofB, BloodGroup, Nationality, Address, Email, Number) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

                        pst.setString(1, uName);
                        pst.setString(2, pass);
                        pst.setString(3, dob);
                        pst.setString(4, bGroup);
                        pst.setString(5, nationality);
                        pst.setString(6, address);
                        pst.setString(7, email);
                        pst.setString(8, number);

                        int rowsInserted = pst.executeUpdate();
                        if(donorButton.isSelected()) {
                        	if (con != null) {
                                pst = con.prepareStatement("INSERT INTO donors (Donor, BloodGroup, Address, Number) VALUES (?, ?, ?, ?)");

                                pst.setString(1, uName);
                                pst.setString(2, bGroup);
                                pst.setString(3, address);
                                pst.setString(4, number);
                                
                                int rowsInsertedDonor = pst.executeUpdate();
                        }
                        }
                        if (rowsInserted > 0) {
                        	JOptionPane.showMessageDialog(show, "Registered Successfully");
            				Login page = new Login();
            				page.frmBloodeasy.setVisible(true);
            				dispose();
                            
                        } else {
                            JOptionPane.showMessageDialog(null, "User-registration failed.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Database connection is not established.");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
				
				else if(!pass.equals(cpass)) {
					Component show = null;
					JOptionPane.showMessageDialog(show, "Passwords Don't Match");
				}
				else {
					Component show = null;
					JOptionPane.showMessageDialog(show, "Complete All Sections");
				}
			}
		});
		btnNewButton.setForeground(new Color(240, 255, 255));
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD, 16));
		btnNewButton.setBounds(777, 488, 85, 30);
		contentPane.add(btnNewButton);
		
		passTxt = new JTextField();
		passTxt.setHorizontalAlignment(SwingConstants.CENTER);
		passTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		passTxt.setColumns(10);
		passTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		passTxt.setBackground(new Color(240, 255, 240));
		passTxt.setBounds(673, 103, 176, 27);
		contentPane.add(passTxt);
		
		CpassTxt = new JTextField();
		CpassTxt.setHorizontalAlignment(SwingConstants.CENTER);
		CpassTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		CpassTxt.setColumns(10);
		CpassTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		CpassTxt.setBackground(new Color(240, 255, 240));
		CpassTxt.setBounds(673, 144, 176, 27);
		contentPane.add(CpassTxt);
		
		dobTxt = new JTextField();
		dobTxt.setHorizontalAlignment(SwingConstants.CENTER);
		dobTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		dobTxt.setColumns(10);
		dobTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		dobTxt.setBackground(new Color(240, 255, 240));
		dobTxt.setBounds(673, 185, 176, 27);
		contentPane.add(dobTxt);
		
		nationTxt = new JTextField();
		nationTxt.setHorizontalAlignment(SwingConstants.CENTER);
		nationTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		nationTxt.setColumns(10);
		nationTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		nationTxt.setBackground(new Color(240, 255, 240));
		nationTxt.setBounds(673, 290, 176, 27);
		contentPane.add(nationTxt);
		
		addressTxt = new JTextField();
		addressTxt.setHorizontalAlignment(SwingConstants.CENTER);
		addressTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		addressTxt.setColumns(10);
		addressTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		addressTxt.setBackground(new Color(240, 255, 240));
		addressTxt.setBounds(673, 329, 176, 27);
		contentPane.add(addressTxt);
		
		mailTxt = new JTextField();
		mailTxt.setHorizontalAlignment(SwingConstants.CENTER);
		mailTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		mailTxt.setColumns(10);
		mailTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		mailTxt.setBackground(new Color(240, 255, 240));
		mailTxt.setBounds(673, 368, 176, 27);
		contentPane.add(mailTxt);
		
		numberTxt = new JTextField();
		numberTxt.setHorizontalAlignment(SwingConstants.CENTER);
		numberTxt.setFont(new Font("Sitka Display", Font.BOLD, 13));
		numberTxt.setColumns(10);
		numberTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		numberTxt.setBackground(new Color(240, 255, 240));
		numberTxt.setBounds(673, 409, 176, 27);
		contentPane.add(numberTxt);
		
		
		
		
		
	}
}
