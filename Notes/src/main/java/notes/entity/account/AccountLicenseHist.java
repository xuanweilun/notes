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
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_ACCOUNT_LICENSE_HIST",schema = "BRTLIC")
public class AccountLicenseHist {
	@Id
//	@GeneratedValue(generator = "sequenceGenerator")
//	@GenericGenerator(
//	        name = "sequenceGenerator",
//	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//	        parameters = {
//	                @Parameter(name = "sequence_name", value = "SEQ_ACCOUNT_ACCOUNT_LICENSE"),
//	        }
//	)
	private Long id;
	
	private Long parentId;
	
	private String name; //名称
	
	private Long accountId;
		
	@Column(nullable = false, unique = false)
	private String subject; //lisenceName 
	
	private Timestamp startTime;
	
	private Timestamp endTime;

	private  String consumerType; //login or users
	
	private  Long consumerAmount;
	
	private  String description;
	
	private  String ipAddresses;
	
	private  String macAddresses; //"00-50-56-C0-00-01;00-50-56-C0-00-01"
	
	private  String cpuSerial; // "BFEBFBFF000406E3"
	
	private  String mainBoardSerial;
	
	@Column(nullable = false, unique = false)
	private String code;//license code
	@Column(nullable = false)
	private String licensePath;
	
	private String reserve; //备注
	
	private Timestamp createTime; //创建时间
	
	private Timestamp updateTime; //更新时间
	
	private String enable; //使能
	
	private String delFlag; //删除标志
	
	private String status; //状态
	
	private String publicCertsKeyStore;
	
	private String licensePathUrl;
	
	private String publicCertsKeyStoreUrl;
	
	private String licensePathUri;
	
	private String publicCertsKeyStoreUri;

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

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getConsumerType() {
		return consumerType;
	}

	public void setConsumerType(String consumerType) {
		this.consumerType = consumerType;
	}

	public Long getConsumerAmount() {
		return consumerAmount;
	}

	public void setConsumerAmount(Long consumerAmount) {
		this.consumerAmount = consumerAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getIpAddresses() {
		return ipAddresses;
	}

	public void setIpAddresses(String ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	public String getMacAddresses() {
		return macAddresses;
	}

	public void setMacAddresses(String macAddresses) {
		this.macAddresses = macAddresses;
	}

	public String getMainBoardSerial() {
		return mainBoardSerial;
	}

	public void setMainBoardSerial(String mainBoardSerial) {
		this.mainBoardSerial = mainBoardSerial;
	}

	public String getCpuSerial() {
		return cpuSerial;
	}

	public void setCpuSerial(String cpuSerial) {
		this.cpuSerial = cpuSerial;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLicensePath() {
		return licensePath;
	}

	public void setLicensePath(String licensePath) {
		this.licensePath = licensePath;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getPublicCertsKeyStore() {
		return publicCertsKeyStore;
	}

	public void setPublicCertsKeyStore(String publicCertsKeyStore) {
		this.publicCertsKeyStore = publicCertsKeyStore;
	}

	public String getLicensePathUrl() {
		return licensePathUrl;
	}

	public void setLicensePathUrl(String licensePathUrl) {
		this.licensePathUrl = licensePathUrl;
	}

	public String getPublicCertsKeyStoreUrl() {
		return publicCertsKeyStoreUrl;
	}

	public void setPublicCertsKeyStoreUrl(String publicCertsKeyStoreUrl) {
		this.publicCertsKeyStoreUrl = publicCertsKeyStoreUrl;
	}

	public String getLicensePathUri() {
		return licensePathUri;
	}

	public void setLicensePathUri(String licensePathUri) {
		this.licensePathUri = licensePathUri;
	}

	public String getPublicCertsKeyStoreUri() {
		return publicCertsKeyStoreUri;
	}

	public void setPublicCertsKeyStoreUri(String publicCertsKeyStoreUri) {
		this.publicCertsKeyStoreUri = publicCertsKeyStoreUri;
	}
	
	
}
