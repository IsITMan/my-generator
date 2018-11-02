package com.mydemo.generator.core.support;

import java.io.Serializable;
import java.util.Date;

/**
 * 父实体类
 * @author wangms
 */
public class BaseEntity implements Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	protected String id;

	/**
	 * 创建人
	 */
	protected String createBy;

	/**
	 * 创建时间
	 */
	protected Date createTime;

	/**
	 * 修改人
	 */
	protected String updateBy;

	/**
	 * 修改时间
	 */
	protected Date updateTime;
	
    public BaseEntity() {
    }
	
    public BaseEntity(String id) {
        this.id = id;
    }
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy == null ? null : createBy.trim();
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy == null ? null : updateBy.trim();
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}