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
@XmlType(propOrder={"size", "empList"}, name="SSMP1006A002OutDto")
@XmlRootElement(name="SSMP1006A002OutDto")
@SuppressWarnings("all")
public class SSMP1006A002OutDto  implements IOmmObject, Predictable, FieldInfo  {

	private static final long serialVersionUID = 262210786L;

	@XmlTransient
	public static final String OMM_DESCRIPTION = "";
	
	@XmlTransient
	public static final String OMM_VERSION = "";

	/*******************************************************************************************************************************
	* Property set << size >> [[ */
	
	@XmlTransient
	private boolean isSet_size = false;
	
	protected boolean isSet_size()
	{
		return this.isSet_size;
	}
	
	protected void setIsSet_size(boolean value)
	{
		this.isSet_size = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="", formatType="", format="", align="right", length=9, decimal=0, arrayReference="", fill="", encrypt="", validationRule="")
	private java.lang.Integer size  = 0;
	
	/**
	 * 
	 * @Description 
	 */
	@XmlElement(nillable=true)
	public java.lang.Integer getSize(){
		/*
		 * 이 변수는 배열 또는 BLOB, CLOB에 의해 참조 되는 변수 입니다.
		 */
		if ( isSet_size )	return size;
		else
		{
			if ( empList == null || empList.size() == 0 ) return 0;
			else return empList.size();
		}
	}
	
	/**
	 * 
	 * @Description 
	 */
	@JsonProperty("size")
	public void setSize( java.lang.Integer size ) {
		isSet_size = true;
		this.size = size;
	}
	
	/** Property set << size >> ]]
	*******************************************************************************************************************************/
	/*******************************************************************************************************************************
	* Property set << empList >> [[ */
	
	@XmlTransient
	private boolean isSet_empList = false;
	
	protected boolean isSet_empList()
	{
		return this.isSet_empList;
	}
	
	protected void setIsSet_empList(boolean value)
	{
		this.isSet_empList = value;
	}
	
	
	@BxmOmm_Field(referenceType="reference", description="", formatType="", format="", align="left", length=0, decimal=0, arrayReference="size", fill="", encrypt="", validationRule="")
	private java.util.List<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto> empList  = new java.util.ArrayList<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto>();
	
	/**
	 * 
	 * @Description 
	 */
	public java.util.List<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto>  getEmpList(){
		return empList;
	}
	
	/**
	 * 
	 * @Description 
	 */
	@JsonProperty("empList")
	public void setEmpList( java.util.List<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto> empList ) {
		isSet_empList = true;
		this.empList = empList;
	}
	
	/** Property set << empList >> ]]
	*******************************************************************************************************************************/

	@Override
	public SSMP1006A002OutDto clone(){
		try{
			SSMP1006A002OutDto object= (SSMP1006A002OutDto)super.clone();
			
			if ( this.empList== null ) object.empList = null;
			else{
				java.util.List<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto> clonedList = new java.util.ArrayList<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto>(empList.size());
				for( bxm.dft.smp.online.service.dto.SSMP1006A002SubDto item : empList ){
					clonedList.add( (bxm.dft.smp.online.service.dto.SSMP1006A002SubDto)item.clone());
				}
				object.empList = clonedList;
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
		
		result = prime * result + ((size==null)?0:size.hashCode());
		result = prime * result + ((empList==null)?0:empList.hashCode());
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) return true;
		if ( obj == null ) return false;
		if ( getClass() != obj.getClass() ) return false;
		
		final bxm.dft.smp.online.service.dto.SSMP1006A002OutDto other= (bxm.dft.smp.online.service.dto.SSMP1006A002OutDto)obj;
		if ( size == null){
			if ( other.size != null ) return false;
		}
		else if ( !size.equals(other.size) )
			return false;
		if ( empList == null){
			if ( other.empList != null ) return false;
		}
		else if ( !empList.equals(other.empList) )
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	
		sb.append( "\n[bxm.dft.smp.online.service.dto.SSMP1006A002OutDto:\n");
		sb.append("\tsize: ");
		sb.append(size==null?"null":getSize());
		sb.append("\n");
		sb.append("\tempList: ");
		if ( empList == null ) sb.append("null");
		else{
			sb.append("array count : ");
			sb.append(empList.size());
			sb.append("(items)\n");
	
			int max= (10<empList.size())?10:empList.size();
	
			for ( int i = 0; i < max; ++i ){
				sb.append("\tempList[");
				sb.append(i);
				sb.append("] : ");
				sb.append(empList.get(i));
				sb.append("\n");
			}
	
			if ( max < empList.size() ){
				sb.append("\tempList[.] : ").append("more ").append((empList.size()-max)).append(" items").append("\n");
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
	
		messageLen+= 9; /* size */
		{/*empList*/
			int size=getSize();
			int count= empList == null ? 0 : empList.size();
			int min= size > count?count:size;
			bxm.dft.smp.online.service.dto.SSMP1006A002SubDto emptyElement= null;
			for ( int i = 0; i < size ; ++i ){
				if ( i < min ){
					bxm.dft.smp.online.service.dto.SSMP1006A002SubDto element= empList.get(i);
					if ( element != null && !(element instanceof Predictable) )
						throw new IllegalStateException( "Can not predict message length.");
					messageLen+= element==null?0:( (Predictable)element).predictMessageLength();
				}else{
					if ( emptyElement== null ) emptyElement= new bxm.dft.smp.online.service.dto.SSMP1006A002SubDto();
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
	
		fieldNames.add("size");
		fieldNames.add("empList");
	
		return fieldNames;
	}

	@Override
	@JsonIgnore
	public java.util.Map<String, Object> getFieldValues(){
		java.util.Map<String, Object> fieldValueMap= new java.util.HashMap<String, Object>();
	
		fieldValueMap.put("size", get("size"));
		fieldValueMap.put("empList", get("empList"));
	
		return fieldValueMap;
	}

	@XmlTransient
	@JsonIgnore
	private Hashtable<String, Object> htDynamicVariable = new Hashtable<String, Object>();
	
	public Object get(String key) throws IllegalArgumentException{
		switch( key.hashCode() ){
		case 3530753 : /* size */
			return getSize();
		case -1625028218 : /* empList */
			return getEmpList();
		default :
			if ( htDynamicVariable.containsKey(key) ) return htDynamicVariable.get(key);
			else throw new IllegalArgumentException("Not found element : " + key);
		}
	}
	
	@SuppressWarnings("unchecked")
	public void set(String key, Object value){
		switch( key.hashCode() ){
		case 3530753 : /* size */
			setSize((java.lang.Integer) value);
			return;
		case -1625028218 : /* empList */
			setEmpList((java.util.List<bxm.dft.smp.online.service.dto.SSMP1006A002SubDto>) value);
			return;
		default : htDynamicVariable.put(key, value);
		}
	}
}
