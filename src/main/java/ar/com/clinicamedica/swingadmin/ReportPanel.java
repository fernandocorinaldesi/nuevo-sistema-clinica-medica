package ar.com.clinicamedica.swingadmin;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import ar.com.clinicamedica.controller.AdminOperationsController;
import ar.com.clinicamedica.jchart.BarChart;
import ar.com.clinicamedica.jchart.LineChart;
import ar.com.clinicamedica.jchart.PieChart;

public class ReportPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReportPanel(AdminOperationsController controller) {
		setLayout(new FlowLayout());
		add(new PieChart(controller));
		add(new BarChart(controller));
		add(new LineChart(controller));
		validate();
	}
	

}
