package info.icoresys.base.vo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 元素，用来标识一个事物的框架构成。如数据字典、用户、菜单、角色等等，都是一个个元素，对于每个事物我们定义一个Element用来表示，关于Element具体的特征（属性），
 * 我们通过Attribute类进行定义，几个Element有几个特征，我们就定义几个attribute，这样通过element+attribute的方式即可描述一个具体的事物结构。
 * 
 * @author JeffCao
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class BaseElement<T extends BaseElement<T,E>, E extends BaseAttribute<E>> extends BaseVO implements Serializable{

	private static final long serialVersionUID = 7533787307981692489L;

	/**
	 * 元素类型
	 */
	private String type;
	/**
	 * 元素编码
	 */
	private String code;
	/**
	 * 元素名称：用于规则操作
	 */
	private String name;
	/**
	 * 元素描述：用于界面显示
	 */
	private String description;
	/**
	 * className:对应的类名，具体业务对象的class完整包名路径
	 */
	private String className;
	/**
	 * 对应的模板编码，即对应Element的elementCode，一个元素可以作为另外一个元素的模板，用于相近元素定义或元素的扩展
	 */
	private String templateCode;
	/**
	 * 定义元素每次实例生成的最小个数
	 */
	int minCount;
	/**
	 * 定义元素每次实例生成的最大个数
	 */
	int maxCount;
	/**
	 * 定义元素是否可以递归生成，是：则生成类似上级菜单、下级菜单这样的树形层级结构（即一个Element可以实例化成多个，但是有上下级关系）
	 */
	boolean cursive=false;
	/**
	 * 元素属性集合
	 */
	private Map<String, ? extends E> attributesMap = new HashMap<>();
	/**
	 * 子元素集合
	 */
	private Map<String, ? extends T> childrenMap = new HashMap<>();
	/**
	 * 父元素
	 */
	private BaseElement<? extends T, ? extends E> parent = null;
	/**
	 * 添加子元素
	 * @param child
	 */
	public void addChildrenElement(T child) {
		//TODO[需检查是否重复添加]
	}
	/**
	 * 添加属性
	 * @param attribute
	 */
	public void addAttribute(E attribute) {
		//TODO[需检查是否重复添加]
//		attributesMap.put(attribute, value)
	}
}
