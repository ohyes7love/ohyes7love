/******************************************************************************
 * Bxm Object Message Mapping(OMM) - Source Generator V7
 *
 * 생성된 자바파일은 수정하지 마십시오.
 * IO 파일 수정시 Java파일을 덮어쓰게 됩니다.
 *
 ******************************************************************************/

package bxm.dft.smp.online.service.dto;


import bxm.omm.root.IOmmObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import bxm.omm.predict.FieldInfo;
import javax.xml.bind.annotation.XmlType;
import bxm.omm.annotation.BxmOmm_Field;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlRootElement;
import bxm.omm.predict.Predictable;
import java.util.Hashtable;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Description 책임자승인처리 Input
 */
@XmlType(propOrder={"cashCmt"}, name="SSMP1010A001InDto")
@XmlRootElement(name="SSMP1010A001InDto")
@SuppressWarnings("all")
public class SSMP1010A001InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -505288047L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "책임자승인처리 Input";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << cashCmt >> [[ */
	
	@XmlTransient
	private boolean isSet_cashCmt = false;
	
	protected boolean isSet_cashCmt()
	{
		return this.isSet_cashCmt;
	}
	
	protected void setIsSet_cashCmt(boolean value)
	{
		this.isSet_cashCmt = value;
	}
	
	/**
	 * 
	 * java.math.BigDecimal - String value setter
	 * @Description 지급액
	 */
	public void setCashCmt(java.lang.String value) {
		isSet_cashCmt = true;
		this.cashCmt = new java.math.BigDecimal(value);
	}
	/**
	 * 
	 * java.math.BigDecimal - Double value setter
	 * @Description 지급액
	 */
	public void setCashCmt(double value) {
		isSet_cashCmt = true;
		this.cashCmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * 
	 * java.math.BigDecimal - Long value setter
	 * @Description 지급액
	 */
	public void setCashCmt(long value) {
		isSet_cashCmt = true;
		this.cashCmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="지급액", formatType="", format="", align="right", length=15, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.math.BigDecimal cashCmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * 
	 * @Description 지급액
	 */
	@XmlElement(nillable=true)
	public java.math.BigDecimal getCashCmt(){
		return cashCmt;
	}
	
	/**
	 * 
	 * @Description 지급액
	 */
	@JsonProperty("cashCmt")
	public void setCashCmt( java.math.BigDecimal cashCmt ) {
		isSet_cashCmt = true;
		this.cashCmt = cashCmt;
	}
	
	/** Property set << cashCmt >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1010A001InDto clone(){
		try{
			SSMP1010A001InDto object= (SSMP1010A001InDto)super.clone();
			
			
			return object;
		} 
		catch(CloneNotSupportedException e){
			throw new bxm.omm.exception.CloneFailedException();
		}
	}

	@Override
	public int hashCode(){
		final int prime=31;
		int result = 1;
		
		result = prime * result + ((cashCmt==null)?0:cashCmt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1010A001InDto other= (bxm.dft.smp.online.service.dto.SSMP1010A001InDto)obj;
		if ( cashCmt == null){
			if ( other.cashCmt != null ) return false;
		}
		else if ( !cashCmt.equals(other.cashCmt) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1010A001InDto:\n");
		sb.append("\tcashCmt: ");
		sb.append(cashCmt==null?"null":getCashCmt());
		sb.append("\n");
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
		messageLen+= 15; /* cashCmt */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("cashCmt");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("cashCmt", get("cashCmt"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 554949911 : /* cashCmt */
			return getCashCmt();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 554949911 : /* cashCmt */
			setCashCmt((java.math.BigDecimal) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
