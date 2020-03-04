package ar.com.clinicamedica.jchart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import ar.com.clinicamedica.controller.AdminOperationsController;

public class PieChart extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdminOperationsController controller;
	
	public PieChart(AdminOperationsController controller) {
		this.controller=controller;
		PieDataset dataset = createDataset();

		JFreeChart chart = ChartFactory.createPieChart("Cobertura medica", dataset, true, true, false);

		PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} : ({2})",
				new DecimalFormat("0"), new DecimalFormat("0%"));
		((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);
		ChartPanel panel = new ChartPanel(chart);
		panel.setPreferredSize(new Dimension(400,300));
		add(panel,BorderLayout.CENTER);
		setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	}
	private PieDataset createDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("sistema publico", 120);
		dataset.setValue("obra social", 80);
		dataset.setValue("prepaga o mutual", 20);
		return dataset;
	}

}
