package com.jy.service.system.tool;

import com.jy.base.service.BaseService;
import com.jy.entity.system.tool.Email;

public interface EmailService extends BaseService<Email> {
	
	/**发送邮件（简单版）
     * @param o
     * @return
     */
	public boolean sentEmailSimple(Email o);

}
