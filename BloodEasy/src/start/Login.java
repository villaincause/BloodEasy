package start;
import java.sql.*;
import java.util.Arrays;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Point;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class Login {

	public JFrame frmBloodeasy;
	private JTextField uNameTxt;
	private JPasswordField passTxt;
	Connection con;
    PreparedStatement pst;
	protected Object frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmBloodeasy.setVisible(true);
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
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Connect();
		frmBloodeasy = new JFrame();
		frmBloodeasy.setTitle("BloodEasy");
		frmBloodeasy.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/start/blood-drop-blood-png-clipart-best-28.png")));
		frmBloodeasy.setForeground(new Color(192, 192, 192));
		frmBloodeasy.setBackground(new Color(192, 192, 192));
		frmBloodeasy.setBounds(100, 100, 894, 580);
		frmBloodeasy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLocation(new Point(0, 2));
		
		panel.setBackground(new Color(255, 245, 238));
		panel.setForeground(new Color(0, 128, 128));
		frmBloodeasy.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblGreetings = new JLabel("Greetings, Saviour!");
		lblGreetings.setForeground(new Color(105, 105, 105));
		lblGreetings.setBounds(32, 28, 176, 27);
		lblGreetings.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 18));
		panel.add(lblGreetings);
		
		
		JLabel UserID = new JLabel("User ID");
		UserID.setBounds(270, 276, 75, 26);
		UserID.setFont(new Font("Sitka Text", Font.BOLD, 20));
		panel.add(UserID);
		
		JLabel pass = new JLabel("Password");
		pass.setHorizontalAlignment(SwingConstants.TRAILING);
		pass.setBounds(250, 346, 95, 26);
		pass.setFont(new Font("Sitka Text", Font.BOLD, 20));
		panel.add(pass);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(105, 105, 105));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String userName = uNameTxt.getText();
				char[] passWord = passTxt.getPassword();
				pst = con.prepareStatement("SELECT password FROM members WHERE DName=?");
                pst.setString(1, userName);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    char[] passDB = rs.getString(1).toCharArray();
                    
                    if (Arrays.equals(passWord, passDB)) {
                    	
                        Inside in = new Inside();
                        in.setVisible(true);
                        frmBloodeasy.setVisible(false);
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Passwords do not match"); // Add this line for debugging
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "User not found"); // Add this line for debugging
                }
			}
				catch (SQLException e2) {
	                e2.printStackTrace();            }
			}
			
		});
		btnNewButton.setBounds(630, 411, 88, 31);
		btnNewButton.setFont(new Font("Sitka Heading", Font.BOLD, 16));
		panel.add(btnNewButton);
		
		JLabel lblBElogo = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("/364231549_313790831093022_7457252381361390437_n - Copy.png"));
		lblBElogo.setIcon(img);
		lblBElogo.setBounds(490, 11, 388, 137);
		panel.add(lblBElogo);
		
		JLabel lblRegisterNow = new JLabel("Register Now");
		lblRegisterNow.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Registration register = new Registration();
				register.setVisible(true);
				frmBloodeasy.setVisible(false);
			}
		});
		lblRegisterNow.setForeground(new Color(105, 105, 105));
		lblRegisterNow.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 18));
		lblRegisterNow.setBounds(758, 491, 99, 23);
		panel.add(lblRegisterNow);
		
		JLabel lblNotAMember = new JLabel("Not a member yet?");
		lblNotAMember.setForeground(new Color(105, 105, 105));
		lblNotAMember.setFont(new Font("Sitka Banner", Font.BOLD | Font.ITALIC, 18));
		lblNotAMember.setBounds(608, 491, 140, 23);
		panel.add(lblNotAMember);
		
		uNameTxt = new JTextField();
		uNameTxt.setHorizontalAlignment(SwingConstants.CENTER);
		uNameTxt.setFont(new Font("Sitka Display", Font.BOLD, 18));
		uNameTxt.setColumns(10);
		uNameTxt.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		uNameTxt.setBackground(new Color(240, 255, 240));
		uNameTxt.setBounds(368, 271, 295, 38);
		panel.add(uNameTxt);
		
		passTxt = new JPasswordField();
		passTxt.setHorizontalAlignment(SwingConstants.CENTER);
		passTxt.setFont(new Font("Sitka Display", Font.BOLD, 18));
		passTxt.setBackground(new Color(240, 255, 240));
		passTxt.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		passTxt.setBounds(368, 341, 293, 38);
		panel.add(passTxt);
		
		JLabel lblBG = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/Capture.PNG"));
		lblBG.setIcon(img2);
		lblBG.setBounds(0, 0, 878, 541);
		panel.add(lblBG);
		
		
	}
}
