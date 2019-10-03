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
@Table(name = "T_ACCOUNT_KEY_PAIR",schema = "BRTLIC")
public class AccountKeyPair {
	@Id
	@GeneratedValue(generator = "sequenceGenerator")
	@GenericGenerator(
	        name = "sequenceGenerator",
	        strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
	        parameters = {
	                @Parameter(name = "sequence_name", value = "SEQ_ACCOUNT_KEY_PAIR"),
	        }
	)
	private Long id;
	
	@Column(nullable = false, unique = false)
	private Long accountId;
	
	private String accountName;
	
	@Column(nullable = false, unique = false)
	private String privateAlias;//账号
	
	@Column(nullable = false, unique = false)
	private String publicAlias;//用户编号
	
	@Column(nullable = false)
	private String keyStore; //密码
	
	private String publicCertsKeyStore; //公钥文件
	
	private String publicCertsKeyStoreUrl; //公钥文件下载路径
	
	private String publicCertsKeyStoreUri; //公钥文件相对资源标识
	
	private String reserve; //备注
	
	private Timestamp createTime; //创建时间
	
	private Timestamp updateTime; //更新时间
	
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
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getPrivateAlias() {
		return privateAlias;
	}
	public void setPrivateAlias(String privateAlias) {
		this.privateAlias = privateAlias;
	}
	public String getPublicAlias() {
		return publicAlias;
	}
	public void setPublicAlias(String publicAlias) {
		this.publicAlias = publicAlias;
	}
	public String getKeyStore() {
		return keyStore;
	}
	public void setKeyStore(String keyStore) {
		this.keyStore = keyStore;
	}
	public String getPublicCertsKeyStore() {
		return publicCertsKeyStore;
	}
	public void setPublicCertsKeyStore(String publicCertsKeyStore) {
		this.publicCertsKeyStore = publicCertsKeyStore;
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
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getPublicCertsKeyStoreUrl() {
		return publicCertsKeyStoreUrl;
	}
	public void setPublicCertsKeyStoreUrl(String publicCertsKeyStoreUrl) {
		this.publicCertsKeyStoreUrl = publicCertsKeyStoreUrl;
	}
	public String getPublicCertsKeyStoreUri() {
		return publicCertsKeyStoreUri;
	}
	public void setPublicCertsKeyStoreUri(String publicCertsKeyStoreUri) {
		this.publicCertsKeyStoreUri = publicCertsKeyStoreUri;
	}

	
	
}
