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
 * @Description 업무로그 Input
 */
@XmlType(propOrder={"feduDeptNo", "feduDeptNm", "feduAdrCtnt"}, name="SSMP1009A001InDto")
@XmlRootElement(name="SSMP1009A001InDto")
@SuppressWarnings("all")
public class SSMP1009A001InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -476958233L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "업무로그 Input";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << feduDeptNo >> [[ */
	
	@XmlTransient
	private boolean isSet_feduDeptNo = false;
	
	protected boolean isSet_feduDeptNo()
	{
		return this.isSet_feduDeptNo;
	}
	
	protected void setIsSet_feduDeptNo(boolean value)
	{
		this.isSet_feduDeptNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 부서번호", formatType="", format="", align="right", length=2, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer feduDeptNo  = 0;
	
	/**
	 * 
	 * @Description FW샘플 부서번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getFeduDeptNo(){
		return feduDeptNo;
	}
	
	/**
	 * 
	 * @Description FW샘플 부서번호
	 */
	@JsonProperty("feduDeptNo")
	public void setFeduDeptNo( java.lang.Integer feduDeptNo ) {
		isSet_feduDeptNo = true;
		this.feduDeptNo = feduDeptNo;
	}
	
	/** Property set << feduDeptNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << feduDeptNm >> [[ */
	
	@XmlTransient
	private boolean isSet_feduDeptNm = false;
	
	protected boolean isSet_feduDeptNm()
	{
		return this.isSet_feduDeptNm;
	}
	
	protected void setIsSet_feduDeptNm(boolean value)
	{
		this.isSet_feduDeptNm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 부서명", formatType="", format="", align="left", length=14, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String feduDeptNm  = null;
	
	/**
	 * 
	 * @Description FW샘플 부서명
	 */
	@XmlElement(nillable=true)
	public java.lang.String getFeduDeptNm(){
		return feduDeptNm;
	}
	
	/**
	 * 
	 * @Description FW샘플 부서명
	 */
	@JsonProperty("feduDeptNm")
	public void setFeduDeptNm( java.lang.String feduDeptNm ) {
		isSet_feduDeptNm = true;
		this.feduDeptNm = feduDeptNm;
	}
	
	/** Property set << feduDeptNm >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << feduAdrCtnt >> [[ */
	
	@XmlTransient
	private boolean isSet_feduAdrCtnt = false;
	
	protected boolean isSet_feduAdrCtnt()
	{
		return this.isSet_feduAdrCtnt;
	}
	
	protected void setIsSet_feduAdrCtnt(boolean value)
	{
		this.isSet_feduAdrCtnt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 주소내용", formatType="", format="", align="left", length=13, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String feduAdrCtnt  = null;
	
	/**
	 * 
	 * @Description FW샘플 주소내용
	 */
	@XmlElement(nillable=true)
	public java.lang.String getFeduAdrCtnt(){
		return feduAdrCtnt;
	}
	
	/**
	 * 
	 * @Description FW샘플 주소내용
	 */
	@JsonProperty("feduAdrCtnt")
	public void setFeduAdrCtnt( java.lang.String feduAdrCtnt ) {
		isSet_feduAdrCtnt = true;
		this.feduAdrCtnt = feduAdrCtnt;
	}
	
	/** Property set << feduAdrCtnt >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1009A001InDto clone(){
		try{
			SSMP1009A001InDto object= (SSMP1009A001InDto)super.clone();
			
			
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
		
		result = prime * result + ((feduDeptNo==null)?0:feduDeptNo.hashCode());
		result = prime * result + ((feduDeptNm==null)?0:feduDeptNm.hashCode());
		result = prime * result + ((feduAdrCtnt==null)?0:feduAdrCtnt.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1009A001InDto other= (bxm.dft.smp.online.service.dto.SSMP1009A001InDto)obj;
		if ( feduDeptNo == null){
			if ( other.feduDeptNo != null ) return false;
		}
		else if ( !feduDeptNo.equals(other.feduDeptNo) )
			return false;
		if ( feduDeptNm == null){
			if ( other.feduDeptNm != null ) return false;
		}
		else if ( !feduDeptNm.equals(other.feduDeptNm) )
			return false;
		if ( feduAdrCtnt == null){
			if ( other.feduAdrCtnt != null ) return false;
		}
		else if ( !feduAdrCtnt.equals(other.feduAdrCtnt) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1009A001InDto:\n");
		sb.append("\tfeduDeptNo: ");
		sb.append(feduDeptNo==null?"null":getFeduDeptNo());
		sb.append("\n");
		sb.append("\tfeduDeptNm: ");
		sb.append(feduDeptNm==null?"null":getFeduDeptNm());
		sb.append("\n");
		sb.append("\tfeduAdrCtnt: ");
		sb.append(feduAdrCtnt==null?"null":getFeduAdrCtnt());
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
	
		messageLen+= 2; /* feduDeptNo */
		messageLen+= 14; /* feduDeptNm */
		messageLen+= 13; /* feduAdrCtnt */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("feduDeptNo");
		fieldNames.add("feduDeptNm");
		fieldNames.add("feduAdrCtnt");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("feduDeptNo", get("feduDeptNo"));
		fieldValueMap.put("feduDeptNm", get("feduDeptNm"));
		fieldValueMap.put("feduAdrCtnt", get("feduAdrCtnt"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 255783062 : /* feduDeptNo */
			return getFeduDeptNo();
		case 255783060 : /* feduDeptNm */
			return getFeduDeptNm();
		case 943591318 : /* feduAdrCtnt */
			return getFeduAdrCtnt();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 255783062 : /* feduDeptNo */
			setFeduDeptNo((java.lang.Integer) value);
			return;
		case 255783060 : /* feduDeptNm */
			setFeduDeptNm((java.lang.String) value);
			return;
		case 943591318 : /* feduAdrCtnt */
			setFeduAdrCtnt((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
