package notes.rest.viewObject;

import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel("树")
public class TreeNode {
	
	private Long id;
	
	private Long parentId;
	
	private String name;
	
	private List<TreeNode> children;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeNode [id=" + id + ", parentId=" + parentId + ", name=" + name + ", children=" + children + "]";
	}
	
	
}
