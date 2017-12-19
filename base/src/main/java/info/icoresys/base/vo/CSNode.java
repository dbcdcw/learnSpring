package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class CSNode<T extends RuntimeElement<T, E>, E extends RuntimeAttribute<E>> extends RuntimeElement<T, E> {
	
	private static final long serialVersionUID = 4696231504115575190L;

}
