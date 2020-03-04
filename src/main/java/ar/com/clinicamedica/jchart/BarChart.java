package ar.com.clinicamedica.jchart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import ar.com.clinicamedica.controller.AdminOperationsController;
import ar.com.clinicamedica.utilities.LastWeek;

public class BarChart extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdminOperationsController controller;
	private int data[];
	DefaultCategoryDataset dataset;

	public BarChart(AdminOperationsController controller) {
		this.controller = controller;
		data=new int[6];
		data=this.controller.updateBarChart();
		datasets();

		JFreeChart barChart = ChartFactory.createBarChart("Asignacion de turnos semanal",
				"Dias", "Cantidad", dataset,
				PlotOrientation.VERTICAL, true, true, false);

		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new Dimension(400, 300));
		add(chartPanel, BorderLayout.CENTER);
		setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		validate();
	}

	private void datasets() {
		String days[]=new String[7];
		LastWeek l=new LastWeek();
		days=l.getWeek();
		dataset = new DefaultCategoryDataset();
		dataset.addValue(data[0],days[6], "");
		dataset.addValue(data[1],days[5], "");
		dataset.addValue(data[2],days[4], "");
		dataset.addValue(data[3],days[3], "");
		dataset.addValue(data[4],days[2], "");
		dataset.addValue(data[5],days[1], "");
		dataset.addValue(data[6],days[0], "");
	}
	
}
