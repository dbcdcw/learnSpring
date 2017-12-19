package info.icoresys.base.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ElementValue<T extends ElementValue<T>> extends BaseVO implements Serializable{

	private static final long serialVersionUID = -488923848065617183L;

	/**
	 * 对应Element的code
	 */
	protected String code;
	/**
	 * 对应Element的Name
	 */
	protected String name;
	/**
	 * 对应Element的Type
	 */
	protected String type;
	/**
	 * 父对象
	 */
	protected ElementValue<? extends ElementValue<T>> parent=null;
	/**
	 * 属性值列表
	 */
	protected Map<String, AttributeValue> fvs = new HashMap<String,AttributeValue>();
	/**
	 * 孩子对象列表
	 */
	protected Map<String, List<? extends ElementValue<T>> > childrenMap = new HashMap<String,List<? extends ElementValue<T>>> ();
	
}
