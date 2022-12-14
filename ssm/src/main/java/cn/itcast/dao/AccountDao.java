package cn.itcast.dao;

import cn.itcast.domain.Account;
import cn.itcast.domain.Customers;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 帐户dao接口
 */
@Repository
public interface AccountDao {

    // 查询所有账户
    @Select("select * from customers")
    public List<Customers> findAll();

    // 保存帐户信息
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

}
