package EPL343;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Showinput{
	   
	public static void showClientHistory(String input) {
		JTable table = new JTable(0, 3);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane pane = new JScrollPane(table);
        
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"Transaction ID", "Date Created", "Cost"});
        
        String rows[] = input.split("\n");
        for (int i = 0; i < rows.length;i++){
        	String att[] = rows[i].split(",");
        	 model.addRow(new Object[]{att[0], att[1], att[2]});
        }
       
        pane.setOpaque(true);
        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Client History");
        frame.setContentPane(pane);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);  
	}
	
	public static void showClient(String input) {
		JTable table = new JTable(0, 8);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane pane = new JScrollPane(table);
        
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"ID", "Name", "Surname","Date of Birth","Email","Phone Number","Home Number","Address"});
        
        String rows[] = input.split("\n");
        for (int i = 0; i < rows.length;i++){
        	String att[] = rows[i].split(",");
        	 model.addRow(new Object[]{att[0], att[1], att[2],att[3], att[4], att[5],att[6], att[7]});
        }
       
        pane.setOpaque(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Clients");
        frame.setContentPane(pane);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);    	
	}

	public static void showEmployee(String input) {
		JTable table = new JTable(0, 12);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane pane = new JScrollPane(table);
        
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"SSN","ID", "Name", "Surname","Date of Birth","Email","Position","Phone Number","Home Number","Address","Salary","Is Admin"});
        
        String rows[] = input.split("\n");
        for (int i = 0; i < rows.length;i++){
        	String att[] = rows[i].split(",");
        	 model.addRow(new Object[]{att[0], att[1], att[2],att[3], att[4], att[5],att[6], att[7],att[8], att[9], att[10],att[11]});
        }
       
        pane.setOpaque(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Employees");
        frame.setContentPane(pane);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);    	
	}
	
	public static void showPallet(String input) {
		JTable table = new JTable(0, 11);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane pane = new JScrollPane(table);
        
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"Pallet ID","Position", "Warehouse ID", "Owner ID","Import Date","Export Date","IsFood","Expiration Date","Basic Cost","Extra Cost","Total Cost"});
        
        String rows[] = input.split("\n");
        for (int i = 0; i < rows.length;i++){
        	String att[] = rows[i].split(",");
        	 model.addRow(new Object[]{att[0], att[1], att[2],att[3], att[4], att[5],att[6], att[7],att[8], att[9], att[10]});
        }
       
        pane.setOpaque(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Pallets");
        frame.setContentPane(pane);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);   	
	}

	public static void showIDLE(String input) {
		JTable table = new JTable(0, 5);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane pane = new JScrollPane(table);
        
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"Pallet ID","Warehouse ID", "Position", "Owner ID","Import Date"});
        
        String rows[] = input.split("\n");
        for (int i = 0; i < rows.length;i++){
        	String att[] = rows[i].split(",");
        	 model.addRow(new Object[]{att[0], att[1], att[2],att[3],att[4]});
        }
       
        pane.setOpaque(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Items that stayed too long in Warehouse");
        frame.setContentPane(pane);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);    	
	}

	public static void showFood(String input) {
		JTable table = new JTable(0, 5);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        JScrollPane pane = new JScrollPane(table);
        
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{"Pallet ID","Warehouse ID", "Position", "Owner ID","Expiration Date"});
        
        String rows[] = input.split("\n");
        for (int i = 0; i < rows.length;i++){
        	String att[] = rows[i].split(",");
        	 model.addRow(new Object[]{att[0], att[1], att[2],att[3],att[4]});
        }
       
        pane.setOpaque(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setTitle("Food that will soon expire");
        frame.setContentPane(pane);
        frame.pack();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setVisible(true);   	
	}
	
}
	