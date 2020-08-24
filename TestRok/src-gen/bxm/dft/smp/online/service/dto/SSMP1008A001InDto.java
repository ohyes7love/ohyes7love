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
 * @Description 속보메세지 Input
 */
@XmlType(propOrder={"brno", "trmno", "chanU", "messsage"}, name="SSMP1008A001InDto")
@XmlRootElement(name="SSMP1008A001InDto")
@SuppressWarnings("all")
public class SSMP1008A001InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -280444728L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "속보메세지 Input";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << brno >> [[ */
	
	@XmlTransient
	private boolean isSet_brno = false;
	
	protected boolean isSet_brno()
	{
		return this.isSet_brno;
	}
	
	protected void setIsSet_brno(boolean value)
	{
		this.isSet_brno = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="점번호", formatType="", format="", align="right", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer brno  = 0;
	
	/**
	 * 
	 * @Description 점번호
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getBrno(){
		return brno;
	}
	
	/**
	 * 
	 * @Description 점번호
	 */
	@JsonProperty("brno")
	public void setBrno( java.lang.Integer brno ) {
		isSet_brno = true;
		this.brno = brno;
	}
	
	/** Property set << brno >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << trmno >> [[ */
	
	@XmlTransient
	private boolean isSet_trmno = false;
	
	protected boolean isSet_trmno()
	{
		return this.isSet_trmno;
	}
	
	protected void setIsSet_trmno(boolean value)
	{
		this.isSet_trmno = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="단말기번", formatType="", format="", align="right", length=4, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer trmno  = 0;
	
	/**
	 * 
	 * @Description 단말기번
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getTrmno(){
		return trmno;
	}
	
	/**
	 * 
	 * @Description 단말기번
	 */
	@JsonProperty("trmno")
	public void setTrmno( java.lang.Integer trmno ) {
		isSet_trmno = true;
		this.trmno = trmno;
	}
	
	/** Property set << trmno >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << chanU >> [[ */
	
	@XmlTransient
	private boolean isSet_chanU = false;
	
	protected boolean isSet_chanU()
	{
		return this.isSet_chanU;
	}
	
	protected void setIsSet_chanU(boolean value)
	{
		this.isSet_chanU = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="채널유형", formatType="", format="", align="left", length=2, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String chanU  = null;
	
	/**
	 * 
	 * @Description 채널유형
	 */
	@XmlElement(nillable=true)
	public java.lang.String getChanU(){
		return chanU;
	}
	
	/**
	 * 
	 * @Description 채널유형
	 */
	@JsonProperty("chanU")
	public void setChanU( java.lang.String chanU ) {
		isSet_chanU = true;
		this.chanU = chanU;
	}
	
	/** Property set << chanU >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << messsage >> [[ */
	
	@XmlTransient
	private boolean isSet_messsage = false;
	
	protected boolean isSet_messsage()
	{
		return this.isSet_messsage;
	}
	
	protected void setIsSet_messsage(boolean value)
	{
		this.isSet_messsage = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="속도메세지", formatType="", format="", align="left", length=100, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.String messsage  = null;
	
	/**
	 * 
	 * @Description 속도메세지
	 */
	@XmlElement(nillable=true)
	public java.lang.String getMesssage(){
		return messsage;
	}
	
	/**
	 * 
	 * @Description 속도메세지
	 */
	@JsonProperty("messsage")
	public void setMesssage( java.lang.String messsage ) {
		isSet_messsage = true;
		this.messsage = messsage;
	}
	
	/** Property set << messsage >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1008A001InDto clone(){
		try{
			SSMP1008A001InDto object= (SSMP1008A001InDto)super.clone();
			
			
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
		
		result = prime * result + ((brno==null)?0:brno.hashCode());
		result = prime * result + ((trmno==null)?0:trmno.hashCode());
		result = prime * result + ((chanU==null)?0:chanU.hashCode());
		result = prime * result + ((messsage==null)?0:messsage.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1008A001InDto other= (bxm.dft.smp.online.service.dto.SSMP1008A001InDto)obj;
		if ( brno == null){
			if ( other.brno != null ) return false;
		}
		else if ( !brno.equals(other.brno) )
			return false;
		if ( trmno == null){
			if ( other.trmno != null ) return false;
		}
		else if ( !trmno.equals(other.trmno) )
			return false;
		if ( chanU == null){
			if ( other.chanU != null ) return false;
		}
		else if ( !chanU.equals(other.chanU) )
			return false;
		if ( messsage == null){
			if ( other.messsage != null ) return false;
		}
		else if ( !messsage.equals(other.messsage) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1008A001InDto:\n");
		sb.append("\tbrno: ");
		sb.append(brno==null?"null":getBrno());
		sb.append("\n");
		sb.append("\ttrmno: ");
		sb.append(trmno==null?"null":getTrmno());
		sb.append("\n");
		sb.append("\tchanU: ");
		sb.append(chanU==null?"null":getChanU());
		sb.append("\n");
		sb.append("\tmesssage: ");
		sb.append(messsage==null?"null":getMesssage());
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
	
		messageLen+= 4; /* brno */
		messageLen+= 4; /* trmno */
		messageLen+= 2; /* chanU */
		messageLen+= 100; /* messsage */
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("brno");
		fieldNames.add("trmno");
		fieldNames.add("chanU");
		fieldNames.add("messsage");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("brno", get("brno"));
		fieldValueMap.put("trmno", get("trmno"));
		fieldValueMap.put("chanU", get("chanU"));
		fieldValueMap.put("messsage", get("messsage"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3032593 : /* brno */
			return getBrno();
		case 110632880 : /* trmno */
			return getTrmno();
		case 94623555 : /* chanU */
			return getChanU();
		case -461563484 : /* messsage */
			return getMesssage();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3032593 : /* brno */
			setBrno((java.lang.Integer) value);
			return;
		case 110632880 : /* trmno */
			setTrmno((java.lang.Integer) value);
			return;
		case 94623555 : /* chanU */
			setChanU((java.lang.String) value);
			return;
		case -461563484 : /* messsage */
			setMesssage((java.lang.String) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
