package gamefield;


import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import gui.Gamefield;

public class CellRendererColor extends DefaultTableCellRenderer {

	  @Override
	  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
/*
	    //Cells are by default rendered as a JLabel.
	    JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

	    //Get the status for the current row.
	    Field_tablemodel tableModel = (Field_tablemodel) table.getModel();
	    
	    if (col > 15) {
	    	 l.setBackground(Color.GREEN);
	    }
	    //l.setBackground(Color.RED);
	   */
		  
	        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
	        
	        int p = Gamefield.getRandomNumberInRange(0, 32);
	        
	        if(row == p){
	            cellComponent.setBackground(Color.RED);
	        } else {
	            cellComponent.setBackground(Color.WHITE);
	        }
	        return cellComponent;

	  }
}
