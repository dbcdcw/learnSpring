package info.icoresys.base.vo;

import java.util.ArrayList;
import java.util.List;

/**
 * 元素，用来标识一个事物的框架构成。如数据字典、用户、菜单、角色等等，都是一个个元素，对于每个事物我们定义一个Element用来表示，关于Element具体的特征（属性），
 * 我们通过Attribute类进行定义，几个Element有几个特征，我们就定义几个attribute，这样通过element+attribute的方式即可描述一个具体的事物结构。
 * 
 * @author JeffCao
 *
 */
public class Element {

	//元素类型
	private String type;
	//元素编码
	private String code;
	//元素名称：用于规则操作
	private String name;
	//元素描述：用于界面显示
	private String description;
	//定义元素每次实例生成的最小个数
	int minCount;
	//定义元素每次实例生成的最大个数
	int maxCount;
	//定义元素是否可以递归生成，是：则生成类似上级菜单、下级菜单这样的树形层级结构（即一个Element可以实例化成多个，但是有上下级关系）
	boolean cursive=false;
	//元素属性集合
	private List<Attribute> attributes = new ArrayList<Attribute>();
	//
}
