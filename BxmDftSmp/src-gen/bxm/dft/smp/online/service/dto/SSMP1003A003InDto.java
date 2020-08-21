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
 * @Description 페이징조회 Input
 */
@XmlType(propOrder={"reqCount", "feduEmpNm", "nextFeduEmpNo", "nextFeduEmpNm"}, name="SSMP1003A003InDto")
@XmlRootElement(name="SSMP1003A003InDto")
@SuppressWarnings("all")
public class SSMP1003A003InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 759381099L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "페이징조회 Input";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << reqCount >> [[ */
	
	@XmlTransient
	private boolean isSet_reqCount = false;
	
	protected boolean isSet_reqCount()
	{
		return this.isSet_reqCount;
	}
	
	protected void setIsSet_reqCount(boolean value)
	{
		this.isSet_reqCount = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="조회요청건수", formatType="", format="", align="right", length=5, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer reqCount  = 0;
	
	/**
	 * 
	 * @Description 조회요청건수
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getReqCount(){
		return reqCount;
	}
	
	/**
	 * 
	 * @Description 조회요청건수
	 */
	@JsonProperty("reqCount")
	public void setReqCount( java.lang.Integer reqCount ) {
		isSet_reqCount = true;
		this.reqCount = reqCount;
	}
	
	/** Property set << reqCount >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << feduEmpNm >> [[ */
	
	@XmlTransient
	private boolean isSet_feduEmpNm = false;
	
	protected boolean isSet_feduEmpNm()
	{
		return this.isSet_feduEmpNm;
	}
	
	protected void setIsSet_feduEmpNm(boolean value)
	{
		this.isSet_feduEmpNm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 임직원명", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String feduEmpNm  = null;
	
	/**
	 * 
	 * @Description FW샘플 임직원명
	 */
	@XmlElement(nillable=true)
	public java.lang.String getFeduEmpNm(){
		return feduEmpNm;
	}
	
	/**
	 * 
	 * @Description FW샘플 임직원명
	 */
	@JsonProperty("feduEmpNm")
	public void setFeduEmpNm( java.lang.String feduEmpNm ) {
		isSet_feduEmpNm = true;
		this.feduEmpNm = feduEmpNm;
	}
	
	/** Property set << feduEmpNm >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << nextFeduEmpNo >> [[ */
	
	@XmlTransient
	private boolean isSet_nextFeduEmpNo = false;
	
	protected boolean isSet_nextFeduEmpNo()
	{
		return this.isSet_nextFeduEmpNo;
	}
	
	protected void setIsSet_nextFeduEmpNo(boolean value)
	{
		this.isSet_nextFeduEmpNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 임직원번호", formatType="", format="", align="right", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer nextFeduEmpNo  = 0;
	
	/**
	 * 
	 * @Description FW샘플 임직원번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getNextFeduEmpNo(){
		return nextFeduEmpNo;
	}
	
	/**
	 * 
	 * @Description FW샘플 임직원번호
	 */
	@JsonProperty("nextFeduEmpNo")
	public void setNextFeduEmpNo( java.lang.Integer nextFeduEmpNo ) {
		isSet_nextFeduEmpNo = true;
		this.nextFeduEmpNo = nextFeduEmpNo;
	}
	
	/** Property set << nextFeduEmpNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << nextFeduEmpNm >> [[ */
	
	@XmlTransient
	private boolean isSet_nextFeduEmpNm = false;
	
	protected boolean isSet_nextFeduEmpNm()
	{
		return this.isSet_nextFeduEmpNm;
	}
	
	protected void setIsSet_nextFeduEmpNm(boolean value)
	{
		this.isSet_nextFeduEmpNm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 임직원명", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String nextFeduEmpNm  = null;
	
	/**
	 * 
	 * @Description FW샘플 임직원명
	 */
	@XmlElement(nillable=true)
	public java.lang.String getNextFeduEmpNm(){
		return nextFeduEmpNm;
	}
	
	/**
	 * 
	 * @Description FW샘플 임직원명
	 */
	@JsonProperty("nextFeduEmpNm")
	public void setNextFeduEmpNm( java.lang.String nextFeduEmpNm ) {
		isSet_nextFeduEmpNm = true;
		this.nextFeduEmpNm = nextFeduEmpNm;
	}
	
	/** Property set << nextFeduEmpNm >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1003A003InDto clone(){
		try{
			SSMP1003A003InDto object= (SSMP1003A003InDto)super.clone();
			
			
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
		
		result = prime * result + ((reqCount==null)?0:reqCount.hashCode());
		result = prime * result + ((feduEmpNm==null)?0:feduEmpNm.hashCode());
		result = prime * result + ((nextFeduEmpNo==null)?0:nextFeduEmpNo.hashCode());
		result = prime * result + ((nextFeduEmpNm==null)?0:nextFeduEmpNm.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1003A003InDto other= (bxm.dft.smp.online.service.dto.SSMP1003A003InDto)obj;
		if ( reqCount == null){
			if ( other.reqCount != null ) return false;
		}
		else if ( !reqCount.equals(other.reqCount) )
			return false;
		if ( feduEmpNm == null){
			if ( other.feduEmpNm != null ) return false;
		}
		else if ( !feduEmpNm.equals(other.feduEmpNm) )
			return false;
		if ( nextFeduEmpNo == null){
			if ( other.nextFeduEmpNo != null ) return false;
		}
		else if ( !nextFeduEmpNo.equals(other.nextFeduEmpNo) )
			return false;
		if ( nextFeduEmpNm == null){
			if ( other.nextFeduEmpNm != null ) return false;
		}
		else if ( !nextFeduEmpNm.equals(other.nextFeduEmpNm) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1003A003InDto:\n");
		sb.append("\treqCount: ");
		sb.append(reqCount==null?"null":getReqCount());
		sb.append("\n");
		sb.append("\tfeduEmpNm: ");
		sb.append(feduEmpNm==null?"null":getFeduEmpNm());
		sb.append("\n");
		sb.append("\tnextFeduEmpNo: ");
		sb.append(nextFeduEmpNo==null?"null":getNextFeduEmpNo());
		sb.append("\n");
		sb.append("\tnextFeduEmpNm: ");
		sb.append(nextFeduEmpNm==null?"null":getNextFeduEmpNm());
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
	
		messageLen+= 5; /* reqCount */
		messageLen+= 10; /* feduEmpNm */
		messageLen+= 4; /* nextFeduEmpNo */
		messageLen+= 8; /* nextFeduEmpNm */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("reqCount");
		fieldNames.add("feduEmpNm");
		fieldNames.add("nextFeduEmpNo");
		fieldNames.add("nextFeduEmpNm");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("reqCount", get("reqCount"));
		fieldValueMap.put("feduEmpNm", get("feduEmpNm"));
		fieldValueMap.put("nextFeduEmpNo", get("nextFeduEmpNo"));
		fieldValueMap.put("nextFeduEmpNm", get("nextFeduEmpNm"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -439133423 : /* reqCount */
			return getReqCount();
		case -2068798217 : /* feduEmpNm */
			return getFeduEmpNm();
		case -33498298 : /* nextFeduEmpNo */
			return getNextFeduEmpNo();
		case -33498300 : /* nextFeduEmpNm */
			return getNextFeduEmpNm();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -439133423 : /* reqCount */
			setReqCount((java.lang.Integer) value);
			return;
		case -2068798217 : /* feduEmpNm */
			setFeduEmpNm((java.lang.String) value);
			return;
		case -33498298 : /* nextFeduEmpNo */
			setNextFeduEmpNo((java.lang.Integer) value);
			return;
		case -33498300 : /* nextFeduEmpNm */
			setNextFeduEmpNm((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
