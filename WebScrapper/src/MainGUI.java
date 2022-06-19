import java.awt.EventQueue;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class MainGUI {

	private JFrame frmGg;
	private static JTextField input1;
	private static JTextField input2;
	public static DB db = new DB();	
	private static JTextField input3;
	private static JTextField input4;
	private static JTextArea txtout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

		
		
		JOptionPane.showMessageDialog(null, "......Bienvenue à WebScraper Application......");
		String userName = JOptionPane.showInputDialog("Entrez Le Nom d'utilisateur");
		String password = JOptionPane.showInputDialog("Entrez Le mot De Passe");

		// Invoking the Method
		boolean status = authenticate(userName, password);

		if (status) {

			System.out.println("Vous Avez Le Droit Pour Accéder...");
			JOptionPane.showMessageDialog(null, "Bienvenue " + userName);

			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						MainGUI window = new MainGUI();
						window.frmGg.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

		} else {

			System.out.println("Vous Avez Pas Le Droit Pour Accéder");
			JOptionPane.showMessageDialog(null, "Expulsé !!!!\nTentave à Connexion Élligale");

		}
		
		
		

	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGg = new JFrame();
		frmGg.getContentPane().setForeground(Color.DARK_GRAY);
		frmGg.setBackground(Color.BLACK);
		frmGg.getContentPane().setBackground(Color.DARK_GRAY);
		frmGg.setTitle("PFE webscrapper");
		frmGg.setBounds(100, 100, 603, 503);
		frmGg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGg.getContentPane().setLayout(null);
		
		JLabel lblEnterAUrl = new JLabel("Entrer a URL :");
		lblEnterAUrl.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblEnterAUrl.setForeground(Color.YELLOW);
		lblEnterAUrl.setBounds(38, 26, 141, 28);
		frmGg.getContentPane().add(lblEnterAUrl);
		
		input1 = new JTextField();
		input1.setBackground(Color.WHITE);
		input1.setForeground(Color.BLACK);
		input1.setText("https://");
		input1.setBounds(38, 55, 311, 44);
		frmGg.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblDepth = new JLabel("Profondeur :");
		lblDepth.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblDepth.setForeground(Color.YELLOW);
		lblDepth.setBounds(38, 122, 96, 15);
		frmGg.getContentPane().add(lblDepth);
		
		input2 = new JTextField();
		input2.setForeground(Color.BLACK);
		input2.setBackground(Color.WHITE);
		input2.setHorizontalAlignment(SwingConstants.CENTER);
		input2.setText("3");
		input2.setColumns(10);
		input2.setBounds(139, 108, 36, 44);
		frmGg.getContentPane().add(input2);
		
		JButton btnNewButton = new JButton("Demarrer");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				new SwingWorker() {

					@Override
					protected Object doInBackground() throws Exception {

						new EchoServer().start();
						return null;

					}

				}.execute();
				
				
				
			}
		});
		btnNewButton.setBounds(449, 111, 117, 41);
		frmGg.getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 176, 528, 263);
		frmGg.getContentPane().add(scrollPane);
		
		txtout = new JTextArea();
		txtout.setBackground(Color.BLACK);
		txtout.setForeground(Color.GREEN);
		scrollPane.setViewportView(txtout);
		
		JLabel lblSearch = new JLabel("Recherche :");
		lblSearch.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblSearch.setForeground(Color.YELLOW);
		lblSearch.setBounds(207, 124, 95, 15);
		frmGg.getContentPane().add(lblSearch);
		
		input3 = new JTextField();
		input3.setForeground(Color.BLACK);
		input3.setBackground(Color.WHITE);
		input3.setHorizontalAlignment(SwingConstants.CENTER);
		input3.setColumns(10);
		input3.setBounds(296, 111, 141, 44);
		frmGg.getContentPane().add(input3);
		
		input4 = new JTextField();
		input4.setBackground(Color.WHITE);
		input4.setForeground(Color.BLACK);
		input4.setColumns(10);
		input4.setBounds(380, 55, 187, 44);
		frmGg.getContentPane().add(input4);
		
		JLabel lblSubUrl = new JLabel("sub URL :");
		lblSubUrl.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		lblSubUrl.setForeground(Color.YELLOW);
		lblSubUrl.setBounds(380, 26, 141, 28);
		frmGg.getContentPane().add(lblSubUrl);
		
		JLabel lblDevlopperPar = new JLabel("Devlopper par : HADJAZI Mohammed Hisham");
		lblDevlopperPar.setForeground(Color.YELLOW);
		lblDevlopperPar.setBackground(Color.YELLOW);
		lblDevlopperPar.setBounds(228, 445, 338, 15);
		frmGg.getContentPane().add(lblDevlopperPar);
	}
	
	
	
	static boolean authenticate(String userName, String password) {

		if ((userName != null && !userName.isEmpty()) && (password != null && !password.isEmpty())) {

			if (((userName.equalsIgnoreCase("admin")) && (password.equalsIgnoreCase("admin")))

					||

					((userName.equalsIgnoreCase("widad")) && (password.equalsIgnoreCase("widad")))

					||

					((userName.equalsIgnoreCase("houda")) && (password.equalsIgnoreCase("houda")))

			) {

				return true;
			}
		}
		return false;
	}
	
	
	
	
	static class EchoServer extends Thread {
		
		String link = input1.getText();
		String search = input3.getText();



		public EchoServer() {

		}

		public void run() {
			
	 
	
				try {
					db.runSql2("TRUNCATE Record;");
					processPage(link);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					txtout.append(e.toString());
				} catch (IOException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
					txtout.append(ex.toString());
				}

			
		 
			
			
			
		}}
	

	public static void processPage(String URL) throws SQLException, IOException{
		//check if the given URL is already in database
		String sql = "select * from Record where URL = '"+URL+"'";
		ResultSet rs = db.runSql(sql);
		String linkk = input1.getText();
		String search = input3.getText();
		String sub = input4.getText();
		if(rs.next()){
 
		}else{
			//store the URL to database to avoid parsing again
			sql = "INSERT INTO  `Crawler`.`Record` " + "(`URL`) VALUES " + "(?);";
			PreparedStatement stmt = db.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, URL);
			stmt.execute();
 
			//get useful information
			Document doc = Jsoup.connect(linkk).get();
 
			if(doc.text().contains(search)){
				System.out.println(URL);
				txtout.append(URL+"\n");
			}
 
			//get all links and recursively call the processPage method
			Elements questions = doc.select("a[href]");
			for(Element link: questions){
				if(link.attr("href").contains(sub))
					processPage(link.attr("abs:href"));
			}
		}
	}
}
		

