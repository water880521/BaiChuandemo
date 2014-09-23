package com.taobao.ybctest;



import com.taobao.itest.ITestSpringContextBaseCase;
import com.taobao.itest.annotation.ITestSpringContext;

/**
 * 
 * @author luxiao.hjt
 * 
 */
@ITestSpringContext({ "classpath:applicationContext.xml"})
public abstract class BaseTest extends ITestSpringContextBaseCase {
	
}
 