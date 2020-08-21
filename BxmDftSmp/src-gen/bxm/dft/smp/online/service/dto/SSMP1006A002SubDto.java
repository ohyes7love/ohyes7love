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
@XmlType(propOrder={"feduEmpNo", "feduEmpNm", "feduOccpNm", "feduMngrEmpNo", "feduIpsaDt", "feduPayAmt", "feduDeptNo", "strList"}, name="SSMP1006A002SubDto")
@XmlRootElement(name="SSMP1006A002SubDto")
@SuppressWarnings("all")
public class SSMP1006A002SubDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 376191152L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << feduEmpNo >> [[ */
	
	@XmlTransient
	private boolean isSet_feduEmpNo = false;
	
	protected boolean isSet_feduEmpNo()
	{
		return this.isSet_feduEmpNo;
	}
	
	protected void setIsSet_feduEmpNo(boolean value)
	{
		this.isSet_feduEmpNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 임직원번호", formatType="", format="", align="right", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="BXMVD0006[10000]")
	private java.lang.Integer feduEmpNo  = 0;
	
	/**
	 * 
	 * @Description FW샘플 임직원번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getFeduEmpNo(){
		return feduEmpNo;
	}
	
	/**
	 * 
	 * @Description FW샘플 임직원번호
	 */
	@JsonProperty("feduEmpNo")
	public void setFeduEmpNo( java.lang.Integer feduEmpNo ) {
		isSet_feduEmpNo = true;
		this.feduEmpNo = feduEmpNo;
	}
	
	/** Property set << feduEmpNo >> ]]
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
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 임직원명", formatType="", format="", align="left", length=10, decimal=0, arrayReference="", fill="", encrypt="", validationRule="BXMVD0001")
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
	* Property set << feduOccpNm >> [[ */
	
	@XmlTransient
	private boolean isSet_feduOccpNm = false;
	
	protected boolean isSet_feduOccpNm()
	{
		return this.isSet_feduOccpNm;
	}
	
	protected void setIsSet_feduOccpNm(boolean value)
	{
		this.isSet_feduOccpNm = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 직업명", formatType="", format="", align="left", length=9, decimal=0, arrayReference="", fill="", encrypt="", validationRule="BXMVD0001")
	private java.lang.String feduOccpNm  = null;
	
	/**
	 * 
	 * @Description FW샘플 직업명
	 */
	@XmlElement(nillable=true)
	public java.lang.String getFeduOccpNm(){
		return feduOccpNm;
	}
	
	/**
	 * 
	 * @Description FW샘플 직업명
	 */
	@JsonProperty("feduOccpNm")
	public void setFeduOccpNm( java.lang.String feduOccpNm ) {
		isSet_feduOccpNm = true;
		this.feduOccpNm = feduOccpNm;
	}
	
	/** Property set << feduOccpNm >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << feduMngrEmpNo >> [[ */
	
	@XmlTransient
	private boolean isSet_feduMngrEmpNo = false;
	
	protected boolean isSet_feduMngrEmpNo()
	{
		return this.isSet_feduMngrEmpNo;
	}
	
	protected void setIsSet_feduMngrEmpNo(boolean value)
	{
		this.isSet_feduMngrEmpNo = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 관리자임직원번호", formatType="", format="", align="right", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer feduMngrEmpNo  = 0;
	
	/**
	 * 
	 * @Description FW샘플 관리자임직원번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getFeduMngrEmpNo(){
		return feduMngrEmpNo;
	}
	
	/**
	 * 
	 * @Description FW샘플 관리자임직원번호
	 */
	@JsonProperty("feduMngrEmpNo")
	public void setFeduMngrEmpNo( java.lang.Integer feduMngrEmpNo ) {
		isSet_feduMngrEmpNo = true;
		this.feduMngrEmpNo = feduMngrEmpNo;
	}
	
	/** Property set << feduMngrEmpNo >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << feduIpsaDt >> [[ */
	
	@XmlTransient
	private boolean isSet_feduIpsaDt = false;
	
	protected boolean isSet_feduIpsaDt()
	{
		return this.isSet_feduIpsaDt;
	}
	
	protected void setIsSet_feduIpsaDt(boolean value)
	{
		this.isSet_feduIpsaDt = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 입사일자", formatType="", format="", align="left", length=8, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String feduIpsaDt  = null;
	
	/**
	 * 
	 * @Description FW샘플 입사일자
	 */
	@XmlElement(nillable=true)
	public java.lang.String getFeduIpsaDt(){
		return feduIpsaDt;
	}
	
	/**
	 * 
	 * @Description FW샘플 입사일자
	 */
	@JsonProperty("feduIpsaDt")
	public void setFeduIpsaDt( java.lang.String feduIpsaDt ) {
		isSet_feduIpsaDt = true;
		this.feduIpsaDt = feduIpsaDt;
	}
	
	/** Property set << feduIpsaDt >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << feduPayAmt >> [[ */
	
	@XmlTransient
	private boolean isSet_feduPayAmt = false;
	
	protected boolean isSet_feduPayAmt()
	{
		return this.isSet_feduPayAmt;
	}
	
	protected void setIsSet_feduPayAmt(boolean value)
	{
		this.isSet_feduPayAmt = value;
	}
	
	/**
	 * 
	 * java.math.BigDecimal - String value setter
	 * @Description FW샘플 급여금액
	 */
	public void setFeduPayAmt(java.lang.String value) {
		isSet_feduPayAmt = true;
		this.feduPayAmt = new java.math.BigDecimal(value);
	}
	/**
	 * 
	 * java.math.BigDecimal - Double value setter
	 * @Description FW샘플 급여금액
	 */
	public void setFeduPayAmt(double value) {
		isSet_feduPayAmt = true;
		this.feduPayAmt = java.math.BigDecimal.valueOf(value);
	}
	/**
	 * 
	 * java.math.BigDecimal - Long value setter
	 * @Description FW샘플 급여금액
	 */
	public void setFeduPayAmt(long value) {
		isSet_feduPayAmt = true;
		this.feduPayAmt = java.math.BigDecimal.valueOf(value);
	}
	
	@BxmOmm_Field(referenceType="reference", description="FW샘플 급여금액", formatType="", format="", align="right", length=19, decimal=2, arrayReference="", fill="", encrypt="", validationRule="")
	private java.math.BigDecimal feduPayAmt  = new java.math.BigDecimal("0.0");
	
	/**
	 * 
	 * @Description FW샘플 급여금액
	 */
	@XmlElement(nillable=true)
	public java.math.BigDecimal getFeduPayAmt(){
		return feduPayAmt;
	}
	
	/**
	 * 
	 * @Description FW샘플 급여금액
	 */
	@JsonProperty("feduPayAmt")
	public void setFeduPayAmt( java.math.BigDecimal feduPayAmt ) {
		isSet_feduPayAmt = true;
		this.feduPayAmt = feduPayAmt;
	}
	
	/** Property set << feduPayAmt >> ]]
	*******************************************************************************************************************************/
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
	* Property set << strList >> [[ */
	
	@XmlTransient
	private boolean isSet_strList = false;
	
	protected boolean isSet_strList()
	{
		return this.isSet_strList;
	}
	
	protected void setIsSet_strList(boolean value)
	{
		this.isSet_strList = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="", formatType="", format="", align="left", length=20, decimal=0, arrayReference="1", fill="", encrypt="", validationRule="BXMVD0001")
	private java.util.List<java.lang.String> strList  = new java.util.ArrayList<java.lang.String>();
	
	/**
	 * 
	 * @Description 
	 */
	public java.util.List<java.lang.String>  getStrList(){
		return strList;
	}
	
	/**
	 * 
	 * @Description 
	 */
	@JsonProperty("strList")
	public void setStrList( java.util.List<java.lang.String> strList ) {
		isSet_strList = true;
		this.strList = strList;
	}
	
	/** Property set << strList >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1006A002SubDto clone(){
		try{
			SSMP1006A002SubDto object= (SSMP1006A002SubDto)super.clone();
			
			if ( this.strList== null ) object.strList = null;
			else{
				java.util.List<java.lang.String> clonedList = new java.util.ArrayList<java.lang.String>(strList.size());
				for( java.lang.String item : strList ){
					clonedList.add(item);
				}
				object.strList = clonedList;
			}
			
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
		
		result = prime * result + ((feduEmpNo==null)?0:feduEmpNo.hashCode());
		result = prime * result + ((feduEmpNm==null)?0:feduEmpNm.hashCode());
		result = prime * result + ((feduOccpNm==null)?0:feduOccpNm.hashCode());
		result = prime * result + ((feduMngrEmpNo==null)?0:feduMngrEmpNo.hashCode());
		result = prime * result + ((feduIpsaDt==null)?0:feduIpsaDt.hashCode());
		result = prime * result + ((feduPayAmt==null)?0:feduPayAmt.hashCode());
		result = prime * result + ((feduDeptNo==null)?0:feduDeptNo.hashCode());
		result = prime * result + ((strList==null)?0:strList.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1006A002SubDto other= (bxm.dft.smp.online.service.dto.SSMP1006A002SubDto)obj;
		if ( feduEmpNo == null){
			if ( other.feduEmpNo != null ) return false;
		}
		else if ( !feduEmpNo.equals(other.feduEmpNo) )
			return false;
		if ( feduEmpNm == null){
			if ( other.feduEmpNm != null ) return false;
		}
		else if ( !feduEmpNm.equals(other.feduEmpNm) )
			return false;
		if ( feduOccpNm == null){
			if ( other.feduOccpNm != null ) return false;
		}
		else if ( !feduOccpNm.equals(other.feduOccpNm) )
			return false;
		if ( feduMngrEmpNo == null){
			if ( other.feduMngrEmpNo != null ) return false;
		}
		else if ( !feduMngrEmpNo.equals(other.feduMngrEmpNo) )
			return false;
		if ( feduIpsaDt == null){
			if ( other.feduIpsaDt != null ) return false;
		}
		else if ( !feduIpsaDt.equals(other.feduIpsaDt) )
			return false;
		if ( feduPayAmt == null){
			if ( other.feduPayAmt != null ) return false;
		}
		else if ( !feduPayAmt.equals(other.feduPayAmt) )
			return false;
		if ( feduDeptNo == null){
			if ( other.feduDeptNo != null ) return false;
		}
		else if ( !feduDeptNo.equals(other.feduDeptNo) )
			return false;
		if ( strList == null){
			if ( other.strList != null ) return false;
		}
		else if ( !strList.equals(other.strList) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1006A002SubDto:\n");
		sb.append("\tfeduEmpNo: ");
		sb.append(feduEmpNo==null?"null":getFeduEmpNo());
		sb.append("\n");
		sb.append("\tfeduEmpNm: ");
		sb.append(feduEmpNm==null?"null":getFeduEmpNm());
		sb.append("\n");
		sb.append("\tfeduOccpNm: ");
		sb.append(feduOccpNm==null?"null":getFeduOccpNm());
		sb.append("\n");
		sb.append("\tfeduMngrEmpNo: ");
		sb.append(feduMngrEmpNo==null?"null":getFeduMngrEmpNo());
		sb.append("\n");
		sb.append("\tfeduIpsaDt: ");
		sb.append(feduIpsaDt==null?"null":getFeduIpsaDt());
		sb.append("\n");
		sb.append("\tfeduPayAmt: ");
		sb.append(feduPayAmt==null?"null":getFeduPayAmt());
		sb.append("\n");
		sb.append("\tfeduDeptNo: ");
		sb.append(feduDeptNo==null?"null":getFeduDeptNo());
		sb.append("\n");
		sb.append("\tstrList: ");
		if ( strList == null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(strList.size());
			sb.append("(items)\n");
	
			int max= (10<strList.size())?10:strList.size();
	
			for ( int i = 0; i < max; ++i ){
				sb.append("\tstrList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(strList.get(i));
				sb.append("\n");
			}
	
			if ( max < strList.size() ){
				sb.append("\tstrList[.] : ").append("more ").append((strList.size()-max)).append(" items").append("\n");
			}
		}
		sb.append("]\n");
	
		return sb.toString();
	}

	/**
	 * Only for Fixed-Length Data
	 */
	@Override
	public long predictMessageLength(){
		long messageLen= 0;
	
		messageLen+= 4; /* feduEmpNo */
		messageLen+= 10; /* feduEmpNm */
		messageLen+= 9; /* feduOccpNm */
		messageLen+= 4; /* feduMngrEmpNo */
		messageLen+= 8; /* feduIpsaDt */
		messageLen+= 19; /* feduPayAmt */
		messageLen+= 2; /* feduDeptNo */
		messageLen+= ( 20 * (1) ); /* strList */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("feduEmpNo");
		fieldNames.add("feduEmpNm");
		fieldNames.add("feduOccpNm");
		fieldNames.add("feduMngrEmpNo");
		fieldNames.add("feduIpsaDt");
		fieldNames.add("feduPayAmt");
		fieldNames.add("feduDeptNo");
		fieldNames.add("strList");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("feduEmpNo", get("feduEmpNo"));
		fieldValueMap.put("feduEmpNm", get("feduEmpNm"));
		fieldValueMap.put("feduOccpNm", get("feduOccpNm"));
		fieldValueMap.put("feduMngrEmpNo", get("feduMngrEmpNo"));
		fieldValueMap.put("feduIpsaDt", get("feduIpsaDt"));
		fieldValueMap.put("feduPayAmt", get("feduPayAmt"));
		fieldValueMap.put("feduDeptNo", get("feduDeptNo"));
		fieldValueMap.put("strList", get("strList"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -2068798215 : /* feduEmpNo */
			return getFeduEmpNo();
		case -2068798217 : /* feduEmpNm */
			return getFeduEmpNm();
		case 568465552 : /* feduOccpNm */
			return getFeduOccpNm();
		case 716301837 : /* feduMngrEmpNo */
			return getFeduMngrEmpNo();
		case 409158357 : /* feduIpsaDt */
			return getFeduIpsaDt();
		case 595858864 : /* feduPayAmt */
			return getFeduPayAmt();
		case 255783062 : /* feduDeptNo */
			return getFeduDeptNo();
		case -1882627473 : /* strList */
			return getStrList();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -2068798215 : /* feduEmpNo */
			setFeduEmpNo((java.lang.Integer) value);
			return;
		case -2068798217 : /* feduEmpNm */
			setFeduEmpNm((java.lang.String) value);
			return;
		case 568465552 : /* feduOccpNm */
			setFeduOccpNm((java.lang.String) value);
			return;
		case 716301837 : /* feduMngrEmpNo */
			setFeduMngrEmpNo((java.lang.Integer) value);
			return;
		case 409158357 : /* feduIpsaDt */
			setFeduIpsaDt((java.lang.String) value);
			return;
		case 595858864 : /* feduPayAmt */
			setFeduPayAmt((java.math.BigDecimal) value);
			return;
		case 255783062 : /* feduDeptNo */
			setFeduDeptNo((java.lang.Integer) value);
			return;
		case -1882627473 : /* strList */
			setStrList((java.util.List<java.lang.String>) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
