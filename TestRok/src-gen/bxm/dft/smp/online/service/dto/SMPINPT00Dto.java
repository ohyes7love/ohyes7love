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
 * @Description 업무 공통부
 */
@XmlType(propOrder={"commEmpNo", "commEmpNm"}, name="SMPINPT00Dto")
@XmlRootElement(name="SMPINPT00Dto")
@SuppressWarnings("all")
public class SMPINPT00Dto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 1355423640L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "업무 공통부";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << commEmpNo >> [[ */
	
	@XmlTransient
	private boolean isSet_commEmpNo = false;
	
	protected boolean isSet_commEmpNo()
	{
		return this.isSet_commEmpNo;
	}
	
	protected void setIsSet_commEmpNo(boolean value)
	{
		this.isSet_commEmpNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="직원번호", formatType="", format="", align="right", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer commEmpNo  = 0;
	
	/**
	 * 
	 * @Description 직원번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getCommEmpNo(){
		return commEmpNo;
	}
	
	/**
	 * 
	 * @Description 직원번호
	 */
	@JsonProperty("commEmpNo")
	public void setCommEmpNo( java.lang.Integer commEmpNo ) {
		isSet_commEmpNo = true;
		this.commEmpNo = commEmpNo;
	}
	
	/** Property set << commEmpNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << commEmpNm >> [[ */
	
	@XmlTransient
	private boolean isSet_commEmpNm = false;
	
	protected boolean isSet_commEmpNm()
	{
		return this.isSet_commEmpNm;
	}
	
	protected void setIsSet_commEmpNm(boolean value)
	{
		this.isSet_commEmpNm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="직원명", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String commEmpNm  = null;
	
	/**
	 * 
	 * @Description 직원명
	 */
	@XmlElement(nillable=true)
	public java.lang.String getCommEmpNm(){
		return commEmpNm;
	}
	
	/**
	 * 
	 * @Description 직원명
	 */
	@JsonProperty("commEmpNm")
	public void setCommEmpNm( java.lang.String commEmpNm ) {
		isSet_commEmpNm = true;
		this.commEmpNm = commEmpNm;
	}
	
	/** Property set << commEmpNm >> ]]
	*******************************************************************************************************************************/

	@Override
	public SMPINPT00Dto clone(){
		try{
			SMPINPT00Dto object= (SMPINPT00Dto)super.clone();
			
			
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
		
		result = prime * result + ((commEmpNo==null)?0:commEmpNo.hashCode());
		result = prime * result + ((commEmpNm==null)?0:commEmpNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SMPINPT00Dto other= (bxm.dft.smp.online.service.dto.SMPINPT00Dto)obj;
		if ( commEmpNo == null){
			if ( other.commEmpNo != null ) return false;
		}
		else if ( !commEmpNo.equals(other.commEmpNo) )
			return false;
		if ( commEmpNm == null){
			if ( other.commEmpNm != null ) return false;
		}
		else if ( !commEmpNm.equals(other.commEmpNm) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SMPINPT00Dto:\n");
		sb.append("\tcommEmpNo: ");
		sb.append(commEmpNo==null?"null":getCommEmpNo());
		sb.append("\n");
		sb.append("\tcommEmpNm: ");
		sb.append(commEmpNm==null?"null":getCommEmpNm());
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
	
		messageLen+= 4; /* commEmpNo */
		messageLen+= 10; /* commEmpNm */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("commEmpNo");
		fieldNames.add("commEmpNm");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("commEmpNo", get("commEmpNo"));
		fieldValueMap.put("commEmpNm", get("commEmpNm"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1524602627 : /* commEmpNo */
			return getCommEmpNo();
		case -1524602629 : /* commEmpNm */
			return getCommEmpNm();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1524602627 : /* commEmpNo */
			setCommEmpNo((java.lang.Integer) value);
			return;
		case -1524602629 : /* commEmpNm */
			setCommEmpNm((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
