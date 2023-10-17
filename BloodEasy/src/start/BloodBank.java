package start;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.border.TitledBorder;
import java.awt.Toolkit;
public class BloodBank extends JFrame {

	private JPanel contentPane;
	Connection con;
    PreparedStatement pst;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BloodBank frame = new BloodBank();
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
	public BloodBank() {
		setTitle("BloodEasy");
		setIconImage(Toolkit.getDefaultToolkit().getImage(BloodBank.class.getResource("/start/blood-drop-blood-png-clipart-best-28.png")));
		Connect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane_1.setBackground(new Color(255, 255, 255));
		contentPane_1.setBounds(0, 0, 878, 541);
		contentPane.add(contentPane_1);
		
		JLabel lblLogOut = new JLabel("");
		lblLogOut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login page = new Login();
				page.frmBloodeasy.setVisible(true);
				dispose();
			}
		});
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("/logout2.jpg"));
		lblLogOut.setIcon(img7);
		lblLogOut.setForeground(new Color(169, 169, 169));
		lblLogOut.setFont(new Font("Sitka Banner", Font.BOLD, 15));
		lblLogOut.setBounds(233, 11, 40, 40);
		contentPane_1.add(lblLogOut);
		
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Inside in = new Inside();
				in.setVisible(true);
				dispose();
			}
		});
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Backmain2.png"));
		lblBack.setIcon(img6);
		lblBack.setBounds(183, 11, 40, 40);
		contentPane_1.add(lblBack);
		
		JLabel lblNewLabel = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Screenshot__42_-removebg-preview (1).png"));
		lblNewLabel.setIcon(img);
		lblNewLabel.setBounds(678, 11, 190, 47);
		contentPane_1.add(lblNewLabel);
		
		JPanel panelBRCBB = new JPanel();
		panelBRCBB.setBackground(new Color(255, 255, 255));
		panelBRCBB.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(105, 105, 105), new Color(105, 105, 105)));
		panelBRCBB.setBounds(183, 79, 685, 141);
		contentPane_1.add(panelBRCBB);
		panelBRCBB.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Bangladesh Red Crescent Blood Bank");
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(28, 11, 289, 21);
		panelBRCBB.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Availabe Groups:    A+ B+ AB+ O+ A- B- AB- O-");
		lblNewLabel_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(353, 12, 300, 17);
		panelBRCBB.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Address:  7/5, Aurongzeb Road, Mohammadpur, Dhaka.");
		lblNewLabel_2_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1.setBounds(28, 43, 355, 17);
		panelBRCBB.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Contact Number: +88029116563, +88028121497.");
		lblNewLabel_2_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1.setBounds(28, 65, 308, 17);
		panelBRCBB.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Open Hours: 24 Hours");
		lblNewLabel_2_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_1.setBounds(28, 86, 143, 17);
		panelBRCBB.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Google Map Location: https://maps.app.goo.gl/No6Qpntwcgktzzjb7");
		lblNewLabel_2_1_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_2.setBounds(28, 109, 434, 17);
		panelBRCBB.add(lblNewLabel_2_1_1_1_2);
		
		JButton btnNewButton = new JButton("Order Online");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order order = new Order();
				order.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton.setBounds(548, 86, 127, 28);
		panelBRCBB.add(btnNewButton);
		
		JPanel panelQBL = new JPanel();
		panelQBL.setLayout(null);
		panelQBL.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(105, 105, 105), new Color(105, 105, 105)));
		panelQBL.setBackground(new Color(255, 255, 255));
		panelQBL.setBounds(183, 231, 685, 141);
		contentPane_1.add(panelQBL);
		
		JLabel lblNewLabel_2_2 = new JLabel("Quantum Blood Lab");
		lblNewLabel_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2_2.setBounds(28, 11, 156, 21);
		panelQBL.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Availabe Groups:    A+ B+ AB+ O+ A- AB-");
		lblNewLabel_2_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_2.setBounds(353, 12, 264, 17);
		panelQBL.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Address:  31/V Shilpacharya Zainul Abedin Sarak, Shantinagar, 1217.");
		lblNewLabel_2_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_2.setBounds(28, 43, 438, 17);
		panelQBL.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("Contact Number: +88029351969, +88028322987, +8801714010869.");
		lblNewLabel_2_1_1_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_3.setBounds(28, 65, 428, 17);
		panelQBL.add(lblNewLabel_2_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Open Hours: 24 Hours");
		lblNewLabel_2_1_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_1_1.setBounds(28, 86, 143, 17);
		panelQBL.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("Google Map Location: https://maps.app.goo.gl/ho8MJc3cgavA4Mvu9");
		lblNewLabel_2_1_1_1_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_2_1.setBounds(28, 109, 441, 17);
		panelQBL.add(lblNewLabel_2_1_1_1_2_1);
		
		JButton btnNewButton_1 = new JButton("Order Online");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order order = new Order();
				order.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBounds(548, 86, 127, 28);
		panelQBL.add(btnNewButton_1);
		
		JPanel panelSDMC = new JPanel();
		panelSDMC.setLayout(null);
		panelSDMC.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(105, 105, 105), new Color(105, 105, 105)));
		panelSDMC.setBackground(new Color(255, 255, 255));
		panelSDMC.setBounds(183, 383, 685, 141);
		contentPane_1.add(panelSDMC);
		
		JLabel lblNewLabel_2_3 = new JLabel("Sandhani (DMC)");
		lblNewLabel_2_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2_3.setBounds(28, 11, 130, 21);
		panelSDMC.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Availabe Groups:    A+ B+ AB+ O+ A- B- AB- O-");
		lblNewLabel_2_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_3.setBounds(353, 11, 300, 17);
		panelSDMC.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Address:  Dhaka Medical College Unit, Dhaka.");
		lblNewLabel_2_1_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_3.setBounds(28, 43, 295, 17);
		panelSDMC.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_4 = new JLabel("Contact Number: +88029668609, +88029668690, +8801819284878.");
		lblNewLabel_2_1_1_1_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_4.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_4.setBounds(28, 65, 433, 17);
		panelSDMC.add(lblNewLabel_2_1_1_1_4);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Open Hours: 24 Hours");
		lblNewLabel_2_1_1_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_1_2.setBounds(28, 86, 143, 17);
		panelSDMC.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_2 = new JLabel("Google Map Location: https://maps.app.goo.gl/bjozZZDAQPQpw7jn7");
		lblNewLabel_2_1_1_1_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_2_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1_1_1_2_2.setBounds(28, 109, 441, 17);
		panelSDMC.add(lblNewLabel_2_1_1_1_2_2);
		
		JButton btnNewButton_2 = new JButton("Order Online");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Order order = new Order();
				order.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		btnNewButton_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setBounds(548, 86, 127, 28);
		panelSDMC.add(btnNewButton_2);
		
		JLabel lblBB = new JLabel("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/[removal.ai]_ee7256b3-2cbe-4667-8208-7d8216c35f7a-8-egbkv61avlu9dez.png"));
		lblBB.setIcon(img5);
		lblBB.setBounds(38, 22, 105, 105);
		contentPane_1.add(lblBB);
		
		JLabel bloodOne = new JLabel("BLOOD BANK");
		bloodOne.setOpaque(true);
		bloodOne.setHorizontalAlignment(SwingConstants.CENTER);
		bloodOne.setForeground(new Color(240, 248, 255));
		bloodOne.setFont(new Font("Rockwell", Font.BOLD, 10));
		bloodOne.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), null, null, null));
		bloodOne.setBackground(Color.RED);
		bloodOne.setBounds(53, 154, 76, 17);
		contentPane_1.add(bloodOne);
		
		JLabel lblBG = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/red_wavy_with_halftone_background.jpg"));
		lblBG.setIcon(img2);
		lblBG.setBounds(0, 0, 878, 541);
		contentPane_1.add(lblBG);
		
	}
}
