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
@Table(name = "T_ACCOUNT",schema = "BRTLIC")
public class Account {
	@Id
	@GeneratedValue(generator = "sequenceGenerator")
	@GenericGenerator(
	        name = "sequenceGenerator",
	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	        parameters = {
	                @Parameter(name = "sequence_name", value = "SEQ_ACCOUNT"),
	        }
	)
	private Long id;
	
	@Column(nullable = false, unique = false)
	private String name;//账号
	
	@Column(nullable = false, unique = false)
	private String code;//用户编号
	
	@Column(nullable = false)
	private String password; //密码
	
	private String company; //公司名称
	
	private String agentName; //代理人姓名
	
	private String phoneNumbers; //代理人联系方式，多个电话用“;”隔开
	
	private String reserve; //备注
	
	private Timestamp createTime; //创建时间
	
	private Timestamp updateTime; //更新时间
	
	private String enable; //使能
	
	private String delFlag; //删除标志
	@Column(nullable = false)
	private String publicKeyPass; //公钥-不可以修改
	@Column(nullable = false)
	private String privatekeyPass; // 私钥-不可以修改

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
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

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getPublicKeyPass() {
		return publicKeyPass;
	}

	public void setPublicKeyPass(String publicKeyPass) {
		this.publicKeyPass = publicKeyPass;
	}

	public String getPrivatekeyPass() {
		return privatekeyPass;
	}

	public void setPrivatekeyPass(String privatekeyPass) {
		this.privatekeyPass = privatekeyPass;
	}
	
	
	
}
