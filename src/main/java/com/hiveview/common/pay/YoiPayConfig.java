package com.hiveview.common.pay;


import com.hiveview.util.ProperManager;

/**
 * AlipayConfig:{支付宝帐号信息类}
 * date: 2015年11月3日 下午4:09:23 
 * @author LiuJiangTao
 * @version
 */
public class YoiPayConfig {
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	public static String key = "GLX19894270GLZ19894270GLX1989427";

	//商户代码
	public static String MERCHANT_ID  = ProperManager.getString("merchant_id");
	//版本号
	public static String VERSION ="B2C1.0";
	//xml报文根节点
	public static String XML_ROOT_NAME ="B2CReq";
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String INPUT_CHARSET_UTF_8 = "UTF-8";
	public static String INPUT_CHARSET_GBK = "GBK";
	// 签名方式 不需修改
	public static String SIGN_TYPE = "MD5";

}
