package notes.repository.account;


import org.springframework.data.jpa.repository.JpaRepository;

import notes.entity.account.Account;



/**
 * @ClassName: AccountRepository
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author RepositoryCreator
 * @date 2019年09月29日 下午15:42:59
 */
public interface AccountRepository extends JpaRepository<Account, Long>{

}