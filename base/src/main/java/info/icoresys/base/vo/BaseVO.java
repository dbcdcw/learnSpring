package info.icoresys.base.vo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
/**
 * 所有Elment的超类，包含最基本的几个属性
 * @author JeffCao
 *
 */
@Data
public class BaseVO implements Serializable{
	
	private static final long serialVersionUID = 7552702288164427819L;

	/**
	 * 主键ID
	 */
	private long id;
	/**
	 * 创建人
	 */
	private String creator = null;
	/**
	 * 创建时间
	 */
	private Date createTime = null;
	/**
	 * 修改人
	 */
	private String modifyer = null;
	/**
	 * 修改时间
	 */
	private Date updateTime = null;
}
