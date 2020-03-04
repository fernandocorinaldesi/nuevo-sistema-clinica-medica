package ar.com.clinicamedica.controller;

import ar.com.clinicamedica.daos.ChartsDAO;
import ar.com.clinicamedica.daos.ChartsDaoOperations;

public class AdminController implements AdminOperationsController{
	ChartsDaoOperations chartsDao;
	
	public AdminController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updatePieChart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] updateBarChart() {
		// TODO Auto-generated method stub
		int[]data=new int[6];
		chartsDao=new ChartsDAO(); 
		data=chartsDao.getBarCharData();
		return data;
	}

	@Override
	public void updateLineChart() {
		// TODO Auto-generated method stub
		
	}

}
