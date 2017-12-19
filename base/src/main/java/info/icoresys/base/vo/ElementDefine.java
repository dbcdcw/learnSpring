package info.icoresys.base.vo;

import info.icoresys.base.constant.ConstAssignType;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 定义态Element，用于进行元素结构的定义
 * @author JeffCao
 *
 * @param <T>
 * @param <E>
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class ElementDefine<T extends ElementDefine<T, E>, E extends AttributeDefine<E>> extends BaseElement<T, E> {
	
	private static final long serialVersionUID = -3020254568294948767L;

	/**
	 * 指派方式：默认为定义
	 */
	private int assignType = ConstAssignType.DEFINE;
	/**
	 * 指派关系对应的关系表结构：用于两个元素间关系，需要单独存储在一张表的情况，一般为多对多的情况，如用户和角色的关系表
	 */
	private String relationCode = null;
}
