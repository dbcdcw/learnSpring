package info.icoresys.base.vo;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 属性定义
 * @author JeffCao
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class BaseAttribute<T extends BaseAttribute<T>> extends BaseVO implements Serializable{

	private static final long serialVersionUID = -4752752690239507854L;
	/**
	 * 属性编码
	 */
	private String code;
	/**
	 * 属性名称，用于规则访问，定义时必须为字母组合
	 */
	private String name;
	/**
	 * 属性描述：用于界面的展示
	 */
	private String description;
	/**
	 * 数据类型
	 */
	private String dataType;
}
