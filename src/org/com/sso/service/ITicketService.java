package org.com.sso.service;

import org.com.sso.util.MyException;


/**
 * 
 * @author zhimeiyue
 * @version 1
 */
public interface ITicketService {
	
	/**
	 * ��¼��֤�ɹ���,Ϊָ���û�����Ticket,��֤��ϵͳ��Ավ�㱣����û�Ticket�����洢������
	 * Ticket�����㷨��ƣ�
	 * 		base64(3des(utf8({userName})))+":"+md5(base64(utf8({userName}+":"+{��ǰʱ���ַ���})))
	 * @param userName �û���¼�˺�
	 * @param timeout ticket��ʱʱ�� ��λ��
	 * @return ����Ticket�ַ���
	 * @throws SSOException
	 */
	String generateTicket(String userName,int timeout) throws MyException;
	
	/**
	 * ��֤ticket��Ч�ԣ���ˢ��timeoutʱ��
	 * @param ticket 
	 * @return ����true��ticket��Ч ,false:��Ч
	 * @throws SSOException 
	 */
	boolean validate(String ticket) throws MyException;
	
	/**
	 * ͨ���û�����ѯ���û���Ticket
	 * @param userName
	 * @return
	 * @throws SSOException
	 */
	String fetchTicket(String userName) throws MyException;
	
	/**
	 * ɾ��ticket��ʹ����Ч
	 * @param ticket
	 * @throws SSOException
	 */
	void removeTicket(String ticket) throws MyException;
	
	/**
	 * ����USerName
	 * @param ticket
	 * @return
	 * @throws SSOException
	 */
	String trimUserNameFromTicket(String ticket) throws MyException ;
}
