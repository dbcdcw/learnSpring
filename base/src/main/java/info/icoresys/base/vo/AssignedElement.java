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
public class AssignedElement<T extends AssignedElement<T, E>, E extends AssignedAttribute<E>> extends BaseElement<T, E> {
	
	private static final long serialVersionUID = -3020254568294948767L;

	private int assignType = ConstAssignType.DEFINE;
}
