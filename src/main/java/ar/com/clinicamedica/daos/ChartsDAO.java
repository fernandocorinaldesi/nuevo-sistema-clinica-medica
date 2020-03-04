package ar.com.clinicamedica.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.clinicamedica.dbconection.DbConection;

public class ChartsDAO implements ChartsDaoOperations{
	private String barQuery6 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()-6";
	private String barQuery5 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()-5";
	private String barQuery4 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()-4";
	private String barQuery3 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()-3";
	private String barQuery2 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()-2";
	private String barQuery1 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()-1";
	private String barQuery0 = "SELECT *FROM turno WHERE DATE(fecha) = CURDATE()";
	private int[] week = new int[7];
	private int pos = 0;
	private PreparedStatement ps;

	public int[] getBarCharData() {

		if (pos == week.length)
			return week;

		try {
			Connection con = DbConection.getConection();
			if (pos == 0)
				ps = con.prepareStatement(barQuery6);
     		if (pos == 1)
				ps = con.prepareStatement(barQuery5);
			if (pos == 2)
				ps = con.prepareStatement(barQuery4);
			if (pos == 3)
				ps = con.prepareStatement(barQuery3);
			if (pos == 4)
				ps = con.prepareStatement(barQuery2);
			if (pos == 5)
				ps = con.prepareStatement(barQuery1);
			if (pos == 6)
				ps = con.prepareStatement(barQuery0);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				week[pos]++;
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		pos++;
		return getBarCharData();
	}

	
}
