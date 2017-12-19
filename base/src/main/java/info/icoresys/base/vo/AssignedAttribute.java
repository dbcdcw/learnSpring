package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 定义态属性，用来描述属性的基本定义信息
 * @author JeffCao
 *
 * @param <T>
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class AssignedAttribute<T extends AssignedAttribute<T>> extends BaseAttribute<T> {

	private static final long serialVersionUID = -2393276675142549545L;

}
