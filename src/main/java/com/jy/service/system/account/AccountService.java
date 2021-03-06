package com.jy.service.system.account;

import java.util.List;
import com.jy.base.service.BaseService;
import com.jy.common.utils.tree.entity.ZNodes;
import com.jy.entity.system.account.Account;



public interface AccountService extends BaseService<Account> {

  
    /**
     * 根据登录帐号查找loginName和accountType，正常只有一条数据
     * and a.isvalid='1' and a.account_type='1'需要该条件
     * @param loginName
     * @return
     */
    public Account findFormatByLoginName(String loginName);
    /**
     * 设置个人化皮肤
     * @param skin 皮肤属性
     * @return
     */
    public void setSetting(String skin);
    /**
     * 获取个人资料，需要登录状态
     * @return
     */
    public Account getPerData();
    /**
     * 设置头像
     * @param account
     * @return
     */
    public void setHeadpic(Account account);
    /**
     * 设置个人资料
     * @param account
     * @return
     */
    public void setPerData(Account account);
    /**
     * 新增用户(后台)
     * @param account
     * @return
     */
    public int insertAccount(Account account) throws Exception;
    /**
     * 获得角色树
     * @return
     */
    public List<ZNodes> getRoles();
	  /**
     * 系统密码重置
     * @param
     * @return
     */
	public int sysResetPwd(Account o);
	/**
     * 个人密码重置
     * @param
     * @return
     */
	public int preResetPwd(String opwd, String npwd, String qpwd);
	 /**
     * 删除人员
     * @param
     * @return
     */
	public void deleteAccount(Account o);
	 /**
     * 批量删除人员
     * @param chks 人员id 
     * @return
     */
	public void deleteBatchAccount(String chks);
}
