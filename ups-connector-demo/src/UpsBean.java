import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.ups.wwwcie.api.client.PickupCreationRequest;
import com.ups.wwwcie.api.client.PickupCreationRequestPickupAddress;
import com.ups.wwwcie.api.client.PickupCreationRequestPickupDateInfo;
import com.ups.wwwcie.api.client.PickupCreationRequestPickupPiece;
import com.ups.wwwcie.api.client.PickupCreationRequestShipper;
import com.ups.wwwcie.api.client.PickupCreationRequestTotalWeight;
import com.ups.wwwcie.api.client.XAVRequestAddressKeyFormat;

@ViewScoped
@ManagedBean
public class UpsBean {

	private DateFormat timeFormatter = new SimpleDateFormat("HH:mm");
	private DateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
	private DateFormat inputDateFormatter = new SimpleDateFormat("yyyyMMdd");
	private DateFormat inputTimeFormatter = new SimpleDateFormat("HHmmss");
	private XAVRequestAddressKeyFormat addressKeyFormat = new XAVRequestAddressKeyFormat();
	private PickupCreationRequestPickupPiece pickupPiece = new PickupCreationRequestPickupPiece();

	public void init(PickupCreationRequest pickupCreationRequest) {
		pickupCreationRequest = new PickupCreationRequest();
		pickupCreationRequest.setShipper(new PickupCreationRequestShipper());
		pickupCreationRequest.setPickupDateInfo(new PickupCreationRequestPickupDateInfo());
		pickupCreationRequest.setPickupAddress(new PickupCreationRequestPickupAddress());
		pickupCreationRequest.setTotalWeight(new PickupCreationRequestTotalWeight());
	}

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

	public XAVRequestAddressKeyFormat getAddressKeyFormat() {
		return addressKeyFormat;
	}

	public void setAddressKeyFormat(XAVRequestAddressKeyFormat addressKeyFormat) {
		this.addressKeyFormat = addressKeyFormat;
	}

	public PickupCreationRequestPickupPiece getPickupPiece() {
		return pickupPiece;
	}

	public void setPickupPiece(PickupCreationRequestPickupPiece pickupPiece) {
		this.pickupPiece = pickupPiece;
	}

}
