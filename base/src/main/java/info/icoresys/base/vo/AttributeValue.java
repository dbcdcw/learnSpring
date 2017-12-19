package info.icoresys.base.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AttributeValue extends BaseVO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 对应Attribute的编码
	 */
	private String code;
	/**
	 * 对应Attribute的名称
	 */
	private String name;
	/**
	 * 对应Attribute的数据类型
	 */
	private String dataType;
	/**
	 * 属性值
	 */
	private Object value;
	/**
	 * 获取属性值
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public <E extends Object> E getValue(){
		return (E) value;
	}
	/**
	 * 设置属性值
	 * @param value
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	
}
