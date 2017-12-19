package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RuntimeElement<T extends RuntimeElement<T, E>, E extends RuntimeAttribute<E>> extends BaseElement<T, E> {
	
	private static final long serialVersionUID = 2755201768644936275L;

}
