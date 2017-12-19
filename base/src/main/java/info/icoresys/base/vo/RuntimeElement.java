package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * 运行态元素结构，对应重定义后的最终结果
 * @author JeffCao
 *
 * @param <T>
 * @param <E>
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class RuntimeElement<T extends RuntimeElement<T, E>, E extends RuntimeAttribute<E>> extends BaseElement<T, E> {
	
	private static final long serialVersionUID = 2755201768644936275L;

}
