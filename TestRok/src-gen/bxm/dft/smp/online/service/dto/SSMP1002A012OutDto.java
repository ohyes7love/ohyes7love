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
 * @Description 다건등록2 Output
 */
@XmlType(propOrder={"succYn"}, name="SSMP1002A012OutDto")
@XmlRootElement(name="SSMP1002A012OutDto")
@SuppressWarnings("all")
public class SSMP1002A012OutDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 602891965L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "다건등록2 Output";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << succYn >> [[ */
	
	@XmlTransient
	private boolean isSet_succYn = false;
	
	protected boolean isSet_succYn()
	{
		return this.isSet_succYn;
	}
	
	protected void setIsSet_succYn(boolean value)
	{
		this.isSet_succYn = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="성공여부", formatType="", format="", align="left", length=1, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String succYn  = null;
	
	/**
	 * 
	 * @Description 성공여부
	 */
	@XmlElement(nillable=true)
	public java.lang.String getSuccYn(){
		return succYn;
	}
	
	/**
	 * 
	 * @Description 성공여부
	 */
	@JsonProperty("succYn")
	public void setSuccYn( java.lang.String succYn ) {
		isSet_succYn = true;
		this.succYn = succYn;
	}
	
	/** Property set << succYn >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1002A012OutDto clone(){
		try{
			SSMP1002A012OutDto object= (SSMP1002A012OutDto)super.clone();
			
			
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
		
		result = prime * result + ((succYn==null)?0:succYn.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1002A012OutDto other= (bxm.dft.smp.online.service.dto.SSMP1002A012OutDto)obj;
		if ( succYn == null){
			if ( other.succYn != null ) return false;
		}
		else if ( !succYn.equals(other.succYn) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1002A012OutDto:\n");
		sb.append("\tsuccYn: ");
		sb.append(succYn==null?"null":getSuccYn());
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
	
		messageLen+= 1; /* succYn */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("succYn");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("succYn", get("succYn"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -891515657 : /* succYn */
			return getSuccYn();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -891515657 : /* succYn */
			setSuccYn((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
