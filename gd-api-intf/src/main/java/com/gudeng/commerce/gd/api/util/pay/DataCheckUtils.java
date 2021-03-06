package com.gudeng.commerce.gd.api.util.pay;

import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gudeng.commerce.gd.api.dto.pay.MsgCons;

/**基本的数据校验工具类
 * @author wjguo
 * datetime 2016年8月3日 下午12:10:05  
 *
 */
public class  DataCheckUtils {
	/**
	 * 定义记录日志信息
	 */
	private static Logger logger = LoggerFactory.getLogger(DataCheckUtils.class);
	
	/** 断言数据是否不为null，如果参数为空则抛出异常，异常信息默认为“参数错误”。
	 * @param msg 日志记录的异常信息。
	 * @param param 参数集，只要有一个参数为空都将抛出异常。
	 * @throws BizException
	 */
	public static void assertIsNonNull(String msg,  Object... params) throws BizException  {
		assertIsNonNull(null, msg, params);
	}
	
	/** 断言数据是否不为null，如果参数为空则抛出异常。msgCode或Msg 为null，则使用默认的
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param replaceMsg 是否替换消息参数。
	 * @param param 参数集，只要有一个参数为空都将抛出异常。
	 * @throws BizException
	 */
	public static void assertIsNonNull(Integer msgCode, String msg, Object... params) throws BizException  {
		for (Object object : params) {
			if (object == null) {
				logger.error(msg);
				if (msgCode == null || msg == null) {
					msgCode = MsgCons.C_20001;
					msg = MsgCons.M_20001;
				}
				//默认抛出参数异常代码
				throw new BizException(msgCode, msg);
			}
		}
	}
	
	
	/** 断言数据是否为null，如果参数不为空则抛出异常，异常信息默认为“参数错误”。
	 * @param msg 日志记录的异常信息。
	 * @param param 参数集，只要有一个参数不为空都将抛出异常。
	 * @throws BizException
	 */
	public static void assertIsNull(String msg, Object... params) throws BizException {
		assertIsNull(null, msg,  params);
	}
	
	/** 断言数据是否为null，如果参数不为空则抛出异常。
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param param 参数集，只要有一个参数不为空都将抛出异常。
	 * @throws BizException
	 */
	public static void assertIsNull(Integer msgCode, String msg, Object... params) throws BizException {
		for (Object object : params) {
			if (object != null) {
				logger.error(msg);
				if (msgCode == null || msg == null) {
					msgCode = MsgCons.C_20001;
					msg = MsgCons.M_20001;
				}
				throw new BizException(msgCode, msg);
			}
		}
	}
	
	
	/** 断言数据是否存在不为null的，只要存在一个不为空的参数都表示判断通过，反之如果参数中全部为空则抛出异常。
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param param 参数集，只要有一个参数不为空都将抛出异常。
	 * @throws BizException
	 */
	public static void assertExistNonNull(Integer msgCode, String msg, Object... params) throws BizException {
		boolean existNonNull = false;
		for (Object object : params) {
			if (object != null) {
				existNonNull = true;
				break;
			}
		}
		
		if (!existNonNull) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
	
	}
	
	/** 断言数值范围，异常信息默认为“参数错误”。
	 * @param msg 日志记录的异常信息。
	 * @param num 被比较的数值
	 * @param min 最小数值
	 * @param max 最大数值
	 * @throws BizException
	 */
	public static void assertNumLimit(String msg, Double num, double min, double max) throws BizException {
		assertNumLimit(null, msg, num, min, max);
		
	}
	
	/** 断言数值范围
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param num 被比较的数值
	 * @param min 最小数值
	 * @param max 最大数值
	 * @throws BizException
	 */
	public static void assertNumLimit(Integer msgCode, String msg, Double num, double min, double max) throws BizException {
		if (num == null || (num < min  || num > max  )) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
	}
	
	
	/** 非精确性的断言数值范围，非精确性表示如果数值参数num为null，则不进行判断数据范围。
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param num 被比较的数值 ，如果此值为null，则不判断数值范围。
	 * @param min 最小数值
	 * @param max 最大数值
	 * @throws BizException
	 */
	public static void assertLooseNumLimit(Integer msgCode, String msg, Double num, double min, double max) throws BizException {
		if (num != null && (num < min  || num > max  )) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
	}
	

	
	/** 断言数值范围，异常信息默认为“参数错误”。
	 * @param msg 日志记录的异常信息。
	 * @param num 被比较的数值
	 * @param min 最小数值
	 * @param max 最大数值
	 * @throws BizException
	 */
	public static void assertNumLimit(String msg, Integer num, int min, int max) throws BizException {
		assertNumLimit(null, msg, num, min, max);
		
	}
	
	/** 断言数值范围。
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param num 被比较的数值
	 * @param min 最小数值
	 * @param max 最大数值
	 * @throws BizException
	 */
	public static void assertNumLimit(Integer msgCode, String msg, Integer num, int min, int max) throws BizException {
		if (num == null || (num < min  || num > max  )) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
	}	
		
	/** 非精确性的断言数值范围，非精确性表示如果数值参数num为null，则不进行判断数据范围。
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param num 被比较的数值
	 * @param min 最小数值
	 * @param max 最大数值
	 * @throws BizException
	 */
	public static void assertLooseNumLimit(Integer msgCode, String msg, Integer num, int min, int max) throws BizException {
		if (num != null && (num < min  || num > max  )) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
		
	}
	
	/** 断言字符串范围，异常信息默认为“参数错误”。
	 * @param msg 日志记录的异常信息。
	 * @param str 被比较的字符串
	 * @param maxLength 字符串最大长度
	 * @throws BizException
	 */
	public static void assertStrLimit(String msg, String str, int maxLength) throws BizException {
		assertStrLimit(null, msg, str, maxLength);
	}	
	
	/** 断言字符串范围。
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param str 被比较的字符串
	 * @param maxLength 字符串最大长度
	 * @throws BizException
	 */
	public static void assertStrLimit(Integer msgCode, String msg, String str, int maxLength) throws BizException {
		if (str != null && str.length() > maxLength ) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
	}	
	
	/** 断言传入的参数日期大于当前系统日期
	 * @param msgCode 消息代码
	 * @param msg 异常抛出的信息
	 * @param dateParam 日期参数
	 * @throws BizException
	 */
	public static void assertPassedCurDate(Integer msgCode, String msg, Date dateParam) throws BizException {
		long curTimeInMillis = System.currentTimeMillis();
		if (dateParam.getTime() <= curTimeInMillis) {
			logger.error(msg);
			if (msgCode == null || msg == null) {
				msgCode = MsgCons.C_20001;
				msg = MsgCons.M_20001;
			}
			throw new BizException(msgCode, msg);
		}
	}	
	
	
	/*********************   DJB    start ************************************/
	/**
	 * 
	 * @Description: 验证参数不能为空  
	 * @param errorMsg 为空时提示语
	 * @param errorCode 为空时提示code
	 * @param param 验证参数
	 * @throws BizException 
	 *
	 */
	public static void assertIsNoNull(String errorMsg,Integer errorCode,Object param) throws BizException{
		if (param==null) {
			throw new BizException(errorCode, errorMsg);
		}
	}
	
	/**
	 * 
	 * @Description: 判断字符串是否为空，不为空且不是空字符串返回true
	 * @param string
	 * @return
	 *
	 */
	public static boolean stringIsEmpty(String string) {
		if (string == null) {
			return false;
		}
		if (string.trim().equals("")) {
			return false;
		}
		return true;
	}
	
	/**
	 * 
	 * @Description: 判断map是否为空，不为空返回true
	 * @param map
	 * @return
	 *
	 */
	public static boolean mapIsEmpty(Map<String, Object> map) {
		if (map == null) {
			return false;
		}
		if (map.isEmpty()) {
			return false;
		}
		return true;
	}

	// 验证map是否含有指定参数，且参数不能为空
	public static void assertIsNoNull(String errorMsg,Integer errorCode,Map<String, Object> map, String keyName) throws BizException{
		if (mapIsEmpty(map) && stringIsEmpty(keyName)) {
			Object value = map.get(keyName);
			if (value != null && !value.toString().trim().equals("")) {
				return;
			}
		}
		throw new BizException(errorCode, errorMsg);
	}
	public static Integer  mapValueToInteger(Map<String, Object> map,String keyName) throws BizException{
		if (map.get(keyName)!=null) {
			 String temp= map.get(keyName).toString().trim();
			if (!temp.trim().equals("")) {
				return Integer.parseInt(temp);
			}
		}
		return null;
	 }
	
	public static String  mapValueToString(Map<String, Object> map,String keyName) throws BizException{
		if (map.get(keyName)!=null) {
			 String temp= map.get(keyName).toString().trim();
			if (!temp.equals("")) {
				return temp;
			}
		}
		return null;
	 }
	
	
	
	/*********************   DJB    end ************************************/
}
