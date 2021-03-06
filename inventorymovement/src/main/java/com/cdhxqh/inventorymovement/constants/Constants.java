package com.cdhxqh.inventorymovement.constants;

/**
 * Created by apple on 15/10/8.
 * 静态常量类
 */
public class Constants {

    /**基础接口**/
    public static final String HTTP_API_URL = "http://192.168.1.125:7008/maximo/mobile/";

    //登陆URL
    public static final String SIGN_IN_URL = HTTP_API_URL + "system/login";


    //通用接口查询
    public static final String BASE_URL = HTTP_API_URL + "common/api";

    //主项目详情修改
    public static final String ITEM_UPDATE_URL = HTTP_API_URL + "item/update";





    /**------------------数据库表名配置－－开始**/

    //主项目的appid
    public static final String ITEM_APPID="ITEM";

    //主项目的表名
    public static final String ITEM_NAME="ITEM";


    /**库存使用情况**/

    //库存使用情况appid
    public static final String INV_APPID="INV";

    //库存使用情况的表名
    public static final String INVENTORY_NAME="INVENTORY";

    /**物资编码申请**/
    //物资编码申请appid
    public static final String ITEMREQ_APPID="ITEMREQ";
    //物资编码申请的表名
    public static final String ITEMREQ_NAME="ITEMREQ";
    //物资编码申请line
    public static final String ITEMREQLINE_NAME="ITEMREQLINE";

    /**
     * 用户登录表识--开始*
     */
    public static final String LOGINSUCCESS = "USER-S-101"; //登录成功

    public static final String CHANGEIMEI = "USER-S-104"; //登录成功,检测到用户更换手机登录

    public static final String USERNAMEERROR = "USER-E-100";//用户名密码错误

    public static final String GETDATASUCCESS = "GLOBAL-S-0";//获取数据成功
}
