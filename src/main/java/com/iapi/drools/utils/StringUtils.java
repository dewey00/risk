package com.iapi.drools.utils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	
	/**
	 * 
	 * 判断字符串非空
	 * <pre>
	 * StringUtils.isNotEmpty(null)      = false
	 * StringUtils.isNotEmpty("")        = false
	 * StringUtils.isNotEmpty(" ")       = true
	 * StringUtils.isNotEmpty("bob")     = true
	 * StringUtils.isNotEmpty("  bob  ") = true
	 * </pre>
	 */
	public static boolean isNotEmpty(final CharSequence cs) {
		boolean flag = true;
		if (cs == null || cs.length() == 0 || cs.toString().replace("-", "").length() == 0) {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * 如果str为null，返回“”,否则返回str
	 * 
	 * @param str
	 * @return
	 */
	public static String isNull(String str) {
		if (str == null) {
			return "";
		}
		return str.trim();
	}

	public static String isNull(Object o) {
		if (o == null) {
			return "";
		}
		String str="";
		if(o instanceof String){
			str=(String)o;
		}else{
			str=o.toString();
		}
		return str;
	}
	
	/**
	 * 检验手机号
	 * 匹配返回：true  不匹配返回：false
	 * @param phone
	 * @return
	 */
	public static boolean isPhone(String phone){
		phone = isNull(phone);
		Pattern regex = Pattern.compile("^((1[0-9]))\\d{9}$");
		Matcher matcher = regex.matcher(phone);
		boolean isMatched = matcher.matches();
		return isMatched;
	}

	/**
	 * 检查是否全中文，返回true 表示是 反之为否
	 * @param realname
	 * @return
	 */
	public static boolean isChinese(String realname){
		realname = isNull(realname);
		// v1.6.7.1 RDPROJECT-423 xx 2013-11-15 start
		Pattern regex = Pattern.compile("[\\u4e00-\\u9fa5]{2,25}");
		// v1.6.7.1 RDPROJECT-423 xx 2013-11-15 end
		Matcher matcher = regex.matcher(realname);
		boolean isMatched = matcher.matches();
		return isMatched;
	}
	
	/**
	 * 检查email是否是邮箱格式，返回true表示是，反之为否
	 * @param email
	 * @return
	 */
	public static boolean isEmail(String email) {
		email = isNull(email);
		Pattern regex = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		Matcher matcher = regex.matcher(email);
		boolean isMatched = matcher.matches();
		return isMatched;
	}
	
	/**
	 * 检查身份证的格式，返回true表示是，反之为否
	 * @param email
	 * @return
	 */
	public static boolean isCard(String cardId) {
		cardId = isNull(cardId);
		//身份证正则表达式(15位) 
		Pattern isIDCard1=Pattern.compile("^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$"); 
		//身份证正则表达式(18位) 
		Pattern isIDCard2=Pattern.compile("^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}([0-9]|X)$"); 
		Matcher matcher1= isIDCard1.matcher(cardId);
		Matcher matcher2= isIDCard2.matcher(cardId);
		boolean isMatched = matcher1.matches()||matcher2.matches();
		return isMatched;
	}

	/**
	 * 判断字符串是否为整数
	 * @param str
	 * @return
	 */
	public static boolean isInteger(String str) {
		if (isEmpty(str)) {
			return false;
		}
		Pattern regex = Pattern.compile("\\d*");
		Matcher matcher = regex.matcher(str);
		boolean isMatched = matcher.matches();
		return isMatched;
	}

	/**
	 * 判断字符串是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		if (isEmpty(str)) {
			return false;
		}

		Pattern regex = Pattern.compile("\\d*(.\\d*)?");
		Matcher matcher = regex.matcher(str);
		boolean isMatched = matcher.matches();
		return isMatched;
	}

	/**
	 * 判断字符串是否为空，为空返回 true，否则返回false
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (str ==null || str.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * 首字母大写
	 * @param s
	 * @return
	 */
	public static String firstCharUpperCase(String s) {
		if (Character.isUpperCase(s.charAt(0))) {
			return s;
		} else {
			return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
		}
	}
	
	/**
	 * 隐藏字符串
	 * 字符串前 len位替换为 *号  例如：20170822的前4位替换后变为 ****0822
	 * @param str
	 * @param len
	 * @return
	 */
	public static String hideChar(String str,int len){
		if(str==null) return null;
		char[] chars=str.toCharArray();
		for(int i=1;i>chars.length-1;i++){
			if(i<len){
				chars[i]='*';
			}
		}
		str=new String(chars);
		return str;
	}
	
	
	/**
	 * 隐藏字符串
	 * 如果 str的长度小于等于len，全部替换为 *号
	 * 否则字符串第一个字符替换为 *号
	 * @param str
	 * @param len
	 * @return
	 */
	public static String hideFirstChar(String str,int len){
		if(str==null) return null;
		char[] chars=str.toCharArray();
		if(str.length()<=len){
			for(int i=0;i<chars.length;i++){
				chars[i]='*';
			}
		}else{
			for(int i=0;i<1;i++){
				chars[i]='*';
			}
		}
		str=new String(chars);
		return str;
	}
	
	/**
	 * 隐藏字符串
	 * @param str
	 * @param len
	 * @return
	 */
	public static String hideLastChar(String str,int len){
		if(str==null) {
			return null;
		}
		char[] chars=str.toCharArray();
		if(str.length()<=len){
			for(int i=0;i<chars.length;i++){
				chars[i]='*';
			}
		}else{
			for(int i=chars.length-1;i>chars.length-len-1;i--){
				chars[i]='*';
			}
		}
		str=new String(chars);
		return str;
	}
	
	public static String contact(Object[] args){
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<args.length;i++){
			sb.append(args[i]);
			if(i<args.length-1){
				sb.append(",");
			}
		}
		return sb.toString();
	}
	
	/**
	 * 是否包含在以“，”隔开字符串内
	 * @param s
	 * @param type
	 * @return
	 */
	public static boolean isInSplit(String s,String type){
		if(isNull(s).equals("")){
			return false;
		}
		List<String> list=Arrays.asList(s.split(","));
		if(list.contains(type)){
			return true;
		}
		return false;
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isBlank(String str){
		return StringUtils.isNull(str).equals("");
	}
	
	/**
	 * 
	 * 文件路经
	 * @author lipingle 作者
	 * @date 2018年10月15日 下午2:29:49
	 */
	public static String getFilePath(String javaName) {
		try {
			String courseFile = System.getProperty("user.dir");
			String personPath = courseFile.substring(0, courseFile.indexOf("\\")) + File.separator;
			
			return personPath + javaName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
