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
 * @Description 다건수정2 Input
 */
@XmlType(propOrder={"grid01_COUNT", "grid01_STARTLINE", "grid01"}, name="SSMP1002A022InDto")
@XmlRootElement(name="SSMP1002A022InDto")
@SuppressWarnings("all")
public class SSMP1002A022InDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = -1592694481L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "다건수정2 Input";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << grid01_COUNT >> [[ */
	
	@XmlTransient
	private boolean isSet_grid01_COUNT = false;
	
	protected boolean isSet_grid01_COUNT()
	{
		return this.isSet_grid01_COUNT;
	}
	
	protected void setIsSet_grid01_COUNT(boolean value)
	{
		this.isSet_grid01_COUNT = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="반복횟수", formatType="", format="", align="right", length=5, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer grid01_COUNT  = 0;
	
	/**
	 * 
	 * @Description 반복횟수
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getGrid01_COUNT(){
		/*
		 * 이 변수는 배열 또는 BLOB, CLOB에 의해 참조 되는 변수 입니다.
		 */
		if ( isSet_grid01_COUNT )	return grid01_COUNT;
		else
		{
			if ( grid01 == null || grid01.size() == 0 ) return 0;
			else return grid01.size();
		}
	}
	
	/**
	 * 
	 * @Description 반복횟수
	 */
	@JsonProperty("grid01_COUNT")
	public void setGrid01_COUNT( java.lang.Integer grid01_COUNT ) {
		isSet_grid01_COUNT = true;
		this.grid01_COUNT = grid01_COUNT;
	}
	
	/** Property set << grid01_COUNT >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << grid01_STARTLINE >> [[ */
	
	@XmlTransient
	private boolean isSet_grid01_STARTLINE = false;
	
	protected boolean isSet_grid01_STARTLINE()
	{
		return this.isSet_grid01_STARTLINE;
	}
	
	protected void setIsSet_grid01_STARTLINE(boolean value)
	{
		this.isSet_grid01_STARTLINE = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="시작라인", formatType="", format="", align="right", length=2, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer grid01_STARTLINE  = 0;
	
	/**
	 * 
	 * @Description 시작라인
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getGrid01_STARTLINE(){
		return grid01_STARTLINE;
	}
	
	/**
	 * 
	 * @Description 시작라인
	 */
	@JsonProperty("grid01_STARTLINE")
	public void setGrid01_STARTLINE( java.lang.Integer grid01_STARTLINE ) {
		isSet_grid01_STARTLINE = true;
		this.grid01_STARTLINE = grid01_STARTLINE;
	}
	
	/** Property set << grid01_STARTLINE >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << grid01 >> [[ */
	
	@XmlTransient
	private boolean isSet_grid01 = false;
	
	protected boolean isSet_grid01()
	{
		return this.isSet_grid01;
	}
	
	protected void setIsSet_grid01(boolean value)
	{
		this.isSet_grid01 = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="grid01", formatType="", format="", align="left", length=0, decimal=0, arrayReference="grid01_COUNT", fill="", encrypt="", validationRule="")
	private java.util.List<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01> grid01  = new java.util.ArrayList<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01>();
	
	/**
	 * 
	 * @Description grid01
	 */
	public java.util.List<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01>  getGrid01(){
		return grid01;
	}
	
	/**
	 * 
	 * @Description grid01
	 */
	@JsonProperty("grid01")
	public void setGrid01( java.util.List<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01> grid01 ) {
		isSet_grid01 = true;
		this.grid01 = grid01;
	}
	
	/** Property set << grid01 >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1002A022InDto clone(){
		try{
			SSMP1002A022InDto object= (SSMP1002A022InDto)super.clone();
			
			if ( this.grid01== null ) object.grid01 = null;
			else{
				java.util.List<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01> clonedList = new java.util.ArrayList<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01>(grid01.size());
				for( bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01 item : grid01 ){
					clonedList.add( (bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01)item.clone());
				}
				object.grid01 = clonedList;
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
		
		result = prime * result + ((grid01_COUNT==null)?0:grid01_COUNT.hashCode());
		result = prime * result + ((grid01_STARTLINE==null)?0:grid01_STARTLINE.hashCode());
		result = prime * result + ((grid01==null)?0:grid01.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1002A022InDto other= (bxm.dft.smp.online.service.dto.SSMP1002A022InDto)obj;
		if ( grid01_COUNT == null){
			if ( other.grid01_COUNT != null ) return false;
		}
		else if ( !grid01_COUNT.equals(other.grid01_COUNT) )
			return false;
		if ( grid01_STARTLINE == null){
			if ( other.grid01_STARTLINE != null ) return false;
		}
		else if ( !grid01_STARTLINE.equals(other.grid01_STARTLINE) )
			return false;
		if ( grid01 == null){
			if ( other.grid01 != null ) return false;
		}
		else if ( !grid01.equals(other.grid01) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1002A022InDto:\n");
		sb.append("\tgrid01_COUNT: ");
		sb.append(grid01_COUNT==null?"null":getGrid01_COUNT());
		sb.append("\n");
		sb.append("\tgrid01_STARTLINE: ");
		sb.append(grid01_STARTLINE==null?"null":getGrid01_STARTLINE());
		sb.append("\n");
		sb.append("\tgrid01: ");
		if ( grid01 == null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(grid01.size());
			sb.append("(items)\n");
	
			int max= (10<grid01.size())?10:grid01.size();
	
			for ( int i = 0; i < max; ++i ){
				sb.append("\tgrid01[");
				sb.append(i);
				sb.append("] : ");
				sb.append(grid01.get(i));
				sb.append("\n");
			}
	
			if ( max < grid01.size() ){
				sb.append("\tgrid01[.] : ").append("more ").append((grid01.size()-max)).append(" items").append("\n");
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
	
		messageLen+= 5; /* grid01_COUNT */
		messageLen+= 2; /* grid01_STARTLINE */
		{/*grid01*/
			int size=getGrid01_COUNT();
			int count= grid01 == null ? 0 : grid01.size();
			int min= size > count?count:size;
			bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01 emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01 element= grid01.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01();
					if ( !(emptyElement instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= ( (Predictable)emptyElement).predictMessageLength();
				}
			}
		}
	
		return messageLen;
	}
	

	@Override
	@JsonIgnore
	public java.util.List<String> getFieldNames(){
		java.util.List<String> fieldNames= new java.util.ArrayList<String>();
	
		fieldNames.add("grid01_COUNT");
		fieldNames.add("grid01_STARTLINE");
		fieldNames.add("grid01");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("grid01_COUNT", get("grid01_COUNT"));
		fieldValueMap.put("grid01_STARTLINE", get("grid01_STARTLINE"));
		fieldValueMap.put("grid01", get("grid01"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case -1016634761 : /* grid01_COUNT */
			return getGrid01_COUNT();
		case 1411025086 : /* grid01_STARTLINE */
			return getGrid01_STARTLINE();
		case -1237657657 : /* grid01 */
			return getGrid01();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case -1016634761 : /* grid01_COUNT */
			setGrid01_COUNT((java.lang.Integer) value);
			return;
		case 1411025086 : /* grid01_STARTLINE */
			setGrid01_STARTLINE((java.lang.Integer) value);
			return;
		case -1237657657 : /* grid01 */
			setGrid01((java.util.List<bxm.dft.smp.online.service.dto.SSMP1002A022InDtoSubGrid01>) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
