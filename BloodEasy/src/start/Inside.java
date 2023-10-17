package start;

import java.awt.EventQueue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
public class Inside extends JFrame {

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
					Inside frame = new Inside();
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
	public Inside() {
		Connect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel donorOne = new JLabel("DONOR");
		donorOne.setHorizontalAlignment(SwingConstants.CENTER);
		donorOne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Donor donor = new Donor();
				donor.setVisible(true);
				dispose();
			}
		});
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("/Backmain2.png"));
		
		JTextArea txtrBloodeasy = new JTextArea();
		txtrBloodeasy.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrBloodeasy.setForeground(new Color(255, 255, 255));
		txtrBloodeasy.setBackground(new Color(112, 128, 144));
		txtrBloodeasy.setText("     The app is called\r\n       'BloodEasy'\r\n     It was developed\r\n     for the Regional\r\n     Center for Blood\r\n    Donation and Blood\r\n Treatment in Bangladesh.\r\n   The goal of the app\r\n   was to make blood\r\n     donations easier,\r\n    more accessible &\r\n     finding donors,\r\n    blood banks easier,\r\n    which in turn was\r\n   expected to increase\r\n   the amount of donated\r\n    blood & finding it.\r\n   The app was designed\r\n    to be user-friendly,\r\n useful, and well-working.\r\n    It was intended to\r\n   contribute to saving\r\n  human life by providing\r\n    a tool that makes\r\n  finding blood donations\r\n easier & more accessible.");
		txtrBloodeasy.setBounds(0, 58, 186, 483);
		contentPane.add(txtrBloodeasy);
		donorOne.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), null, null, null));
		donorOne.setForeground(new Color(255, 255, 255));
		donorOne.setBackground(new Color(255, 0, 0));
		donorOne.setOpaque(true);
		donorOne.setFont(new Font("Rockwell", Font.BOLD, 8));
		donorOne.setBounds(658, 177, 36, 14);
		contentPane.add(donorOne);
		
		JLabel bloodOne = new JLabel("BLOOD BANK");
		bloodOne.setHorizontalAlignment(SwingConstants.CENTER);
		bloodOne.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				BloodBank bank = new BloodBank();
				bank.setVisible(true);
				dispose();
			}
		});
		bloodOne.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), null, null, null));
		bloodOne.setForeground(new Color(240, 248, 255));
		bloodOne.setBackground(new Color(255, 0, 0));
		bloodOne.setOpaque(true);
		bloodOne.setFont(new Font("Rockwell", Font.BOLD, 8));
		bloodOne.setBounds(769, 177, 61, 14);
		contentPane.add(bloodOne);
		
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
		lblLogOut.setBounds(196, 11, 40, 40);
		contentPane.add(lblLogOut);
		
		JLabel lblBElogo = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/364231549_313790831093022_7457252381361390437_n - Copy.png"));
		lblBElogo.setIcon(img);
		lblBElogo.setBounds(185, 62, 388, 129);
		contentPane.add(lblBElogo);
		
		JLabel lblChoose = new JLabel("Choose a Section");
		lblChoose.setForeground(new Color(220, 20, 60));
		lblChoose.setHorizontalAlignment(SwingConstants.CENTER);
		lblChoose.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 29));
		lblChoose.setBounds(623, 11, 235, 29);
		contentPane.add(lblChoose);
		
		JLabel lblBDtips = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/sept30 - Copy.jpg"));
		lblBDtips.setIcon(img3);
		lblBDtips.setBorder(null);
		lblBDtips.setBounds(185, 214, 693, 327);
		contentPane.add(lblBDtips);
		
		JTextArea txtrOurGoal = new JTextArea();
		txtrOurGoal.setText("\r\n\r\n       OUR GOAL");
		txtrOurGoal.setForeground(Color.WHITE);
		txtrOurGoal.setFont(new Font("Berlin Sans FB", Font.BOLD, 20));
		txtrOurGoal.setBackground(new Color(112, 128, 144));
		txtrOurGoal.setBounds(0, -39, 186, 98);
		contentPane.add(txtrOurGoal);
		
		JLabel lblDonor = new JLabel("");
		lblDonor.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Donor donor = new Donor();
				donor.setVisible(true);
				dispose();
			}
		});
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/[removal.ai]_f711eebe-0993-47a5-81e8-744712a0925f-8-c5cyxw4hxw470h1.png"));
		lblDonor.setIcon(img4);
		lblDonor.setBounds(640, 57, 69, 105);
		contentPane.add(lblDonor);
		
		JLabel lblBB = new JLabel("");
		lblBB.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				BloodBank bank = new BloodBank();
				bank.setVisible(true);
				dispose();
			}
		});
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/[removal.ai]_ee7256b3-2cbe-4667-8208-7d8216c35f7a-8-egbkv61avlu9dez.png"));
		lblBB.setIcon(img5);
		lblBB.setBounds(748, 57, 105, 105);
		contentPane.add(lblBB);
		
	}
}
