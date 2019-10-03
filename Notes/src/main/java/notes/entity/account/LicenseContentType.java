/**   
* @Title: Account.java 
* @Package com.brt.license.entity 
* @Description: TODO(用一句话描述该文件做什么) 
* @author lee   
* @date 2018年12月20日 下午2:37:00 
* @version V1.0   
*/
package notes.entity.account;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/** 
 * @ClassName: Account 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author lee
 * @date 2018年12月20日 下午2:37:00 
 *  
 */
@Entity
@Table(name = "T_LICENSE_CONTENT_TYPE",schema = "BRTLIC")
public class LicenseContentType {
	@Id
	@GeneratedValue(generator = "sequenceGenerator")
	@GenericGenerator(
	        name = "sequenceGenerator",
	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	        parameters = {
	                @Parameter(name = "sequence_name", value = "SEQ_LICENSE_CONTENT_TYPE"),
	        }
	)
	private Long id;
	
	@Column(nullable = false, unique = false)
	private String name; //名称
	
	@Column(nullable = false, unique = false)
	private String code; //lisenceName 
	
	@Column(nullable = false, unique = false)
	private String licType;
	
	private String reserve; //备注
	
	private Timestamp createTime; //创建时间
	
	private Timestamp updateTime; //更新时间
	
	private String enabled; //使能

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	public String getLicType() {
		return licType;
	}

	public void setLicType(String licType) {
		this.licType = licType;
	}
	

	
}
