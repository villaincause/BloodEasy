package start;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import java.awt.Font;

import javax.swing.border.SoftBevelBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
public class Donor extends JFrame {

	private JPanel contentPane;
	Connection con;
    PreparedStatement pst;
    
    private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Donor frame = new Donor();
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
	public void table_load()
    {
        try 
        {
        pst = con.prepareStatement("select * from donors");
        ResultSet rs = pst.executeQuery();
        table.setModel(DbUtils.resultSetToTableModel(rs));
    } 
        catch (SQLException e) 
         {
            e.printStackTrace();
      } 
    }
	/**
	 * Create the frame.
	 */
	public Donor() {
		setTitle("BloodEasy");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Donor.class.getResource("/start/blood-drop-blood-png-clipart-best-28.png")));
		Connect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		contentPane_1.setBackground(new Color(255, 255, 255));
		contentPane_1.setBounds(0, 0, 878, 541);
		contentPane.add(contentPane_1);
		
		JLabel lblLogOut = new JLabel("");
		lblLogOut.setBounds(233, 11, 40, 40);
		lblLogOut.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login page = new Login();
				page.frmBloodeasy.setVisible(true);
				dispose();
			}
		});
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("/logout2.jpg"));
		lblLogOut.setIcon(img4);
		contentPane_1.setLayout(null);
		lblLogOut.setForeground(new Color(169, 169, 169));
		lblLogOut.setFont(new Font("Sitka Banner", Font.BOLD, 15));
		contentPane_1.add(lblLogOut);
		
		JLabel lblBack = new JLabel("");
		lblBack.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Inside in = new Inside();
				in.setVisible(true);
				dispose();
			}
		});
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("/Backmain2.png"));
		lblBack.setIcon(img5);
		lblBack.setBounds(183, 11, 40, 40);
		contentPane_1.add(lblBack);
		
		
		JLabel lblBElogo = new JLabel("");
		lblBElogo.setBounds(678, 11, 190, 47);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Screenshot__42_-removebg-preview (1).png"));
		lblBElogo.setIcon(img);
		contentPane_1.add(lblBElogo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(183, 79, 685, 451);
		contentPane_1.add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setGridColor(new Color(128, 128, 128));
		table.setFont(new Font("Segoe UI Historic", Font.PLAIN, 15));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		
		JLabel lblDonor = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("/[removal.ai]_f711eebe-0993-47a5-81e8-744712a0925f-8-c5cyxw4hxw470h1.png"));
		lblDonor.setIcon(img2);
		lblDonor.setBounds(47, 22, 69, 105);
		contentPane_1.add(lblDonor);
		
		JLabel donorOne = new JLabel("DONOR");
		donorOne.setOpaque(true);
		donorOne.setHorizontalAlignment(SwingConstants.CENTER);
		donorOne.setForeground(Color.WHITE);
		donorOne.setFont(new Font("Rockwell", Font.BOLD, 10));
		donorOne.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(128, 128, 128), null, null, null));
		donorOne.setBackground(Color.RED);
		donorOne.setBounds(60, 154, 45, 17);
		contentPane_1.add(donorOne);
		
		JLabel lblNewLabel_1 = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("/red_wavy_with_halftone_background.jpg"));
		lblNewLabel_1.setIcon(img3);
		lblNewLabel_1.setBounds(0, 0, 878, 541);
		contentPane_1.add(lblNewLabel_1);
		
		table_load();
	}
}
