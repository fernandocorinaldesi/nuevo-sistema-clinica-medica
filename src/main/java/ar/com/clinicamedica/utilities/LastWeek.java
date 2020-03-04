package ar.com.clinicamedica.utilities;

import java.util.Calendar;

public class LastWeek {
	String[] week;

	public LastWeek() {
		week = new String[7];
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case Calendar.SATURDAY:
			week[0] = "Sabado(hoy)";
			week[1] = "Viernes";
			week[2] = "Jueves";
			week[3] = "Miercoles";
			week[4] = "Martes";
			week[5] = "Lunes";
			week[6] = "Domingo";
			// Current day is Sunday
			break;

		case Calendar.SUNDAY:
			week[0] = "Domingo(hoy)";
			week[1] = "Sabado";
			week[2] = "Viernes";
			week[3] = "Jueves";
			week[4] = "Miercoles";
			week[5] = "Martes";
			week[6] = "Lunes";
			// Current day is Sunday
			break;
		case Calendar.MONDAY:
			week[0] = "Lunes(hoy)";
			week[1] = "Domingo";
			week[2] = "Sabado";
			week[3] = "Viernes";
			week[4] = "Jueves";
			week[5] = "Miercoles";
			week[6] = "Martes";
			// Current day is Monday
			break;
		case Calendar.TUESDAY:
			week[0] = "Martes(hoy)";
			week[1] = "Lunes";
			week[2] = "Domingo";
			week[3] = "Sabado";
			week[4] = "Viernes";
			week[5] = "Jueves";
			week[6] = "Miercoles";
			// etc.
			break;
		case Calendar.WEDNESDAY:
			week[0] = "Miercoles(hoy)";
			week[1] = "Martes";
			week[2] = "Lunes";
			week[3] = "Domingo";
			week[4] = "Sabado";
			week[5] = "Viernes";
			week[6] = "Jueves";

			break;
		case Calendar.THURSDAY:
			week[0] = "Jueves(hoy)";
			week[1] = "Miercoles";
			week[2] = "Martes";
			week[3] = "Lunes";
			week[4] = "Domingo";
			week[5] = "Sabado";
			week[6] = "Viernes";

			break;
		case Calendar.FRIDAY:
			week[0] = "Viernes(hoy)";
			week[1] = "Jueves";
			week[2] = "miercoles";
			week[3] = "Martes";
			week[4] = "Lunes";
			week[5] = "Domingo";
			week[6] = "Sabado";

			break;
		}
	}

	public String[] getWeek() {
		return week;
	}
}
