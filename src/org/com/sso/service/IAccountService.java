package org.com.sso.service;

import org.com.sso.util.MyException;

/**
 * 
 * 
 * 
 * @author zhimeiyue
 *
 */
public interface IAccountService {

	
	
	/**
	 * ��֤�˺������Ƿ�Ϸ�
	 * @param userName ��¼�˺�
	 * @param password ��¼����
	 * @param userType �û�����
	 * @return ����ֵΪtrue���Ϸ� ��false���Ƿ����������Ϸ���Ϣ�׳��쳣������֪������Ϣ��
	 * @throws SSOException
	 */
	boolean validate(String userName,String password,String userType) throws MyException; 
	
	/**
	 * ֧���˺�ע��ӿ�
	 * @param userName ��¼�˺�
	 * @param password ��¼����
	 * @param userType �û�����
	 * @param email
	 * @throws SSOException
	 */
	void register(String userName,String password,String userType,String email) throws MyException;
}
