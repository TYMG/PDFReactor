package gov.ed.fsa;

import java.util.Calendar;

public class MustacheTemplateInjectorHelper {
	public String isUSCitzen;
	public String isPermanentResidentOther;
	public String isReference1Address2;
	public String isReference2Address2;
	public String isBorrowerAddress2PTag;
	public String isBorrowerAddress2PTagEnd;
	public String todaysDate;

	public String getIsUSCitzen() {
		return this.isUSCitzen;
	}
	public void setIsUSCitzen(String isUSCitzen) {
		this.isUSCitzen = isUSCitzen;
	}
	public String getIsPermanentResidentOther() {
		return this.isPermanentResidentOther;
	}
	public void setIsPermanentResidentOther(String isPermanentResidentOther) {
		this.isPermanentResidentOther = isPermanentResidentOther;
	}
	
	public void determineCitizenshipStatus(String endorserCitizenship){
		switch(endorserCitizenship){
		case "US":
			setIsUSCitzen("checked");
			setIsPermanentResidentOther("");
			break;
		case "OTHER":
			setIsUSCitzen("");
			setIsPermanentResidentOther("checked");
			break;
		}
		
	}
	public String getIsReference1Address2() {
		return this.isReference1Address2;
	}
	
	public void determineReference1Address2(String addressLine2){
		if(addressLine2 != null && !addressLine2.isEmpty() ){
			setIsReference1Address2(", ");
			return;
		}
			setIsReference1Address2("");
	}
	public void determineReference2Address2(String addressLine2){
		if(addressLine2 != null && !addressLine2.isEmpty() ){
			setIsReference2Address2(", ");
			return;
		}
			setIsReference2Address2("");
	}
	
	public void setIsReference1Address2(String isReference1Address2) {
		this.isReference1Address2 = isReference1Address2;
	}
	public String getIsReference2Address2() {
		return this.isReference2Address2;
	}
	public void setIsReference2Address2(String isReference2Address2) {
		this.isReference2Address2 = isReference2Address2;
	}
	
	public void determineBorrowerAddress2Tag(String addressLine2){
		if(addressLine2 != null && !addressLine2.isEmpty() ){
			 setIsBorrowerAddress2PTag("<p class=\"field-response-padding\">");
			setIsBorrowerAddress2PTagEnd("</p>");		
			return;
		}
		 setIsBorrowerAddress2PTag("");
			setIsBorrowerAddress2PTagEnd("");						}
	
	public String getIsBorrowerAddress2PTag() {
		return this.isBorrowerAddress2PTag;
	}
	public void setIsBorrowerAddress2PTag(String isBorrowerAddress2PTag) {
		this.isBorrowerAddress2PTag = isBorrowerAddress2PTag;
	}
	public String getIsBorrowerAddress2PTagEnd() {
		return this.isBorrowerAddress2PTagEnd;
	}
	public void setIsBorrowerAddress2PTagEnd(String isBorrowerAddress2PTagEnd) {
		this.isBorrowerAddress2PTagEnd = isBorrowerAddress2PTagEnd;
	}
	public String getTodaysDate() {
		return this.todaysDate;
	}
	public void setTodaysDate() {
		this.todaysDate = Calendar.getInstance().getTime().toString();
	}
}