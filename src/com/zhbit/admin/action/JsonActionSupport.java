package com.zhbit.admin.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhbitcxy.
 */

/**
 * 封装了ajax操作的类
 */
public class JsonActionSupport extends ActionSupport {
    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

    private Map<String,Object> dataMap = new HashMap<String, Object>();;
    protected  void ajaxRedirect(String url){
        dataMap.clear();
        dataMap.put("stat", true);
        dataMap.put("url", url);
    }
    protected void ajaxSuccess(Object obj){
        dataMap.clear();
        dataMap.put("data", obj);
        dataMap.put("stat", true);

    }
    protected void ajaxSuccess(Object obj, String msg){
        dataMap.clear();
        dataMap.put("data", obj);
        dataMap.put("msg", msg);
        dataMap.put("stat", true);
    }
    protected void ajaxSuccess(String msg){
        dataMap.clear();
        dataMap.put("msg", msg);
        dataMap.put("stat", true);
    }
    protected void ajaxSuccess(){
        dataMap.clear();
        dataMap.put("msg", "操作成功");
        dataMap.put("code", 1);
        dataMap.put("stat", true);
    }


    protected void  ajaxFail(String msg){
        dataMap.clear();
        dataMap.put("msg", msg);
        dataMap.put("stat", false);
    }


    protected void ajaxFail(){
        dataMap.clear();
        dataMap.put("msg", "操作失败");
        dataMap.put("code", 0);
        dataMap.put("stat", false);
    }


    protected void ajaxFail(int code){
        dataMap.clear();
        dataMap.put("code", code);
        dataMap.put("stat", false);
    }

    protected void ajaxFail(int code, String msg){
        dataMap.clear();
        dataMap.put("code", code);
        dataMap.put("msg", msg);
        dataMap.put("stat", false);
    }
}
