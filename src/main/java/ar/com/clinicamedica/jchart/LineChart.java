package ar.com.clinicamedica.jchart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import ar.com.clinicamedica.controller.AdminOperationsController;

public class LineChart extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdminOperationsController controller;
	
	public LineChart(AdminOperationsController controller) {
		this.controller=controller;
		DefaultCategoryDataset dataset = createDataset();  
	    // Create chart  
	    JFreeChart chart = ChartFactory.createLineChart(  
	        "Facturacion anual", // Chart title  
	        "Meses", // X-Axis Label  
	        "Pesos $", // Y-Axis Label  
	        dataset  
	        );  
	  
	    ChartPanel panel = new ChartPanel(chart); 
	    panel.setPreferredSize(new Dimension(800,300));
	    add(panel,BorderLayout.CENTER);
	    setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		
	}
	private DefaultCategoryDataset createDataset() {  
		  
	    String series1 = "Linea";  
	     
	  
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();  
	  
	    dataset.addValue(11200, series1, "Enero");  
	    dataset.addValue(11150, series1, "Febrero");  
	    dataset.addValue(11100, series1, "Marzo");  
	    dataset.addValue(11210, series1, "Abril");  
	    dataset.addValue(22240, series1, "Mayo");  
	    dataset.addValue(11195, series1, "Junio");  
	    dataset.addValue(11245, series1, "Julio");
	    dataset.addValue(11245, series1, "Agosto"); 
	    dataset.addValue(12245, series1, "Septiembre"); 
	    dataset.addValue(13245, series1, "Octubre"); 
	    dataset.addValue(11245, series1, "Noviembre"); 
	    dataset.addValue(10245, series1, "Diciembre"); 
	   
	  
	    return dataset;  
	  }  

}
