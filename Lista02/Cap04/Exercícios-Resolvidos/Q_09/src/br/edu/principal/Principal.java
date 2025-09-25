package br.edu.principal;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Principal {

	public static void main(String[] args) {
		Calendar car = new GregorianCalendar();
		
		int dia=car.get(Calendar.DAY_OF_MONTH);
		int mes=car.get(Calendar.MONTH) + 1;
		int ano=car.get(Calendar.YEAR);
		int hora=car.get(Calendar.HOUR_OF_DAY);
		int minuto=car.get(Calendar.MINUTE);
		
		String MesExtenso =switch(mes) {
		case 1 ->"Janeiro";
		case 2 ->"Fevereiro";
		case 3 ->"Março";
		case 4 ->"Abril";
		case 5 ->"Maio";
		case 6 ->"Junho";
		case 7 ->"Julho";
		case 8 ->"Agosto";
		case 9 ->"Setembro";
		case 10 ->"Outubro";
		case 11 ->"Novembro";
		case 12->"Dezembro";
		
		default ->"none";

		};
		
		System.out.println("hoje é:" + dia + " de " + MesExtenso + " de " + ano);
		System.out.println("horário atual:" + hora + " horas e " + minuto + " minuto ");
		
		
	}

}


