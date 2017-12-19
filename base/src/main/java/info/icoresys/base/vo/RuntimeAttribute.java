package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 运行态属性定义，对应重定义后的最终结果
 * @author JeffCao
 *
 * @param <T>
 * @param <E>
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class RuntimeAttribute<T extends RuntimeAttribute<T>> extends BaseAttribute<T> {

	private static final long serialVersionUID = 2637776912928414946L;

}
