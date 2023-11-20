import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class UpsBean {

	private DateFormat timeFormatter = new SimpleDateFormat("HH:mm");
	private DateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
	private DateFormat inputDateFormatter = new SimpleDateFormat("yyyyMMdd");
	private DateFormat inputTimeFormatter = new SimpleDateFormat("HHmmss");
	
	public String getFormatedDate(String date) throws ParseException {
		return dateFormatter.format(inputDateFormatter.parse(date));
	}
	
	public String getFormatedTime(String time) throws ParseException {
		return timeFormatter.format(inputTimeFormatter.parse(time));
	}

	public DateFormat getTimeFormatter() {
		return timeFormatter;
	}

	public void setTimeFormatter(DateFormat timeFormatter) {
		this.timeFormatter = timeFormatter;
	}

	public DateFormat getDateFormatter() {
		return dateFormatter;
	}

	public void setDateFormatter(DateFormat dateFormatter) {
		this.dateFormatter = dateFormatter;
	}
	
}
