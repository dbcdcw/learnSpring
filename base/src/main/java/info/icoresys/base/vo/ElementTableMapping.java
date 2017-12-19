package info.icoresys.base.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class ElementTableMapping extends BaseVO{

	private static final long serialVersionUID = -1437961469952033013L;

	/**
	 * 类型
	 */
	private String type;
	/**
	 * 元素类型
	 */
	private String elementType;
	/**
	 * 父节点ID
	 */
	private  long parentId;
	/**
	 * 元素对应的物理表名
	 */
	private String tableName;
	/**
	 * 元素对应的物理表字段列表
	 */
	private String fields;
	/**
	 * 元素扩展信息表名
	 */
	private String extTableName;
	/**
	 * 元素扩展信息表字段列表
	 */
	private String extFields;
	/**
	 * 是否持久化剩余字段
	 */
	private boolean pesistRemineFields;
}
