package ar.com.clinicamedica.jchart;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class XyChart extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public XyChart() {
		 XYSeries Goals = new XYSeries("Goals Scored");
	        Goals.add(1, 1.0);
	        Goals.add(2, 3.0);
	        Goals.add(3, 2.0);
	        Goals.add(4, 0.0);
	        Goals.add(5, 3.0);
	        
	        XYDataset xyDataset = new XYSeriesCollection(Goals);
	        JFreeChart chart = ChartFactory.createXYLineChart(
	            "Goals Scored Over Time", "Fixture Number", "Goals",
	            xyDataset, PlotOrientation.VERTICAL, true, true, false);
	        ChartPanel cp = new ChartPanel(chart);
	        cp.setPreferredSize(new Dimension(800,300));
	        add(cp,BorderLayout.CENTER);
	            
	        
	}

}
