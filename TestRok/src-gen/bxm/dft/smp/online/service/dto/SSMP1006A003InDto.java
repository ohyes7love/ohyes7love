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
 * @Description 
 */
@XmlType(propOrder={"empInfo"}, name="SSMP1006A003InDto")
@XmlRootElement(name="SSMP1006A003InDto")
@SuppressWarnings("all")
public class SSMP1006A003InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 169840584L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << empInfo >> [[ */
	
	@XmlTransient
	private boolean isSet_empInfo = false;
	
	protected boolean isSet_empInfo()
	{
		return this.isSet_empInfo;
	}
	
	protected void setIsSet_empInfo(boolean value)
	{
		this.isSet_empInfo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="", formatType="", format="", align="left", length=0, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private bxm.dft.smp.online.service.dto.SSMP1006A002SubDto empInfo  = null;
	
	/**
	 * 
	 * @Description 
	 */
	@XmlElement(nillable=true)
	public bxm.dft.smp.online.service.dto.SSMP1006A002SubDto getEmpInfo(){
		return empInfo;
	}
	
	/**
	 * 
	 * @Description 
	 */
	@JsonProperty("empInfo")
	public void setEmpInfo( bxm.dft.smp.online.service.dto.SSMP1006A002SubDto empInfo ) {
		isSet_empInfo = true;
		this.empInfo = empInfo;
	}
	
	/** Property set << empInfo >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1006A003InDto clone(){
		try{
			SSMP1006A003InDto object= (SSMP1006A003InDto)super.clone();
			
			if ( this.empInfo==null ) object.empInfo = null;
			else object.empInfo = (bxm.dft.smp.online.service.dto.SSMP1006A002SubDto)this.empInfo.clone();
			
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
		
		result = prime * result + ((empInfo==null)?0:empInfo.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1006A003InDto other= (bxm.dft.smp.online.service.dto.SSMP1006A003InDto)obj;
		if ( empInfo == null){
			if ( other.empInfo != null ) return false;
		}
		else if ( !empInfo.equals(other.empInfo) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1006A003InDto:\n");
		sb.append("\tempInfo: ");
		sb.append(empInfo==null?"null":getEmpInfo());
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
	
		if ( empInfo != null && !(empInfo instanceof Predictable) )
			throw new IllegalStateException( "Can not predict message length.");
		{
			bxm.dft.smp.online.service.dto.SSMP1006A002SubDto temp= empInfo;
			if ( temp== null ) temp= new bxm.dft.smp.online.service.dto.SSMP1006A002SubDto();
			messageLen+= ( (Predictable)temp).predictMessageLength(); /* empInfo */
		}
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("empInfo");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("empInfo", get("empInfo"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1625113194 : /* empInfo */
			return getEmpInfo();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1625113194 : /* empInfo */
			setEmpInfo((bxm.dft.smp.online.service.dto.SSMP1006A002SubDto) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
