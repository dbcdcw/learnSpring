package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class RuntimeAttribute<T extends RuntimeAttribute<T>> extends BaseAttribute<T> {

	private static final long serialVersionUID = 2637776912928414946L;

}
