package com.pmz.util.tree.compare;

import java.util.*;

/**
 * Created by Administrator on 2016/12/6.
 */
public class VirtualDataGenerator {
    // 构造无序的结果集列表，实际应用中，该数据应该从数据库中查询获得；
    public static List<Map<String,String>> getVirtualResult() {

        List<Map<String,String>> dataList = new ArrayList<Map<String,String>>();

        HashMap<String,String> dataRecord1 = new HashMap<String,String>();
        dataRecord1.put("id", "112000");
        dataRecord1.put("text", "廊坊银行解放道支行");
        dataRecord1.put("parentId", "110000");

        HashMap<String,String> dataRecord2 = new HashMap<String,String>();
        dataRecord2.put("id", "112200");
        dataRecord2.put("text", "廊坊银行三大街支行");
        dataRecord2.put("parentId", "112000");

        HashMap<String,String> dataRecord3 = new HashMap<String,String>();
        dataRecord3.put("id", "112100");
        dataRecord3.put("text", "廊坊银行广阳道支行");
        dataRecord3.put("parentId", "112000");

        HashMap<String,String> dataRecord4 = new HashMap<String,String>();
        dataRecord4.put("id", "113000");
        dataRecord4.put("text", "廊坊银行开发区支行");
        dataRecord4.put("parentId", "110000");

        HashMap<String,String> dataRecord5 = new HashMap<String,String>();
        dataRecord5.put("id", "100000");
        dataRecord5.put("text", "廊坊银行总行");
        dataRecord5.put("parentId", "");

        HashMap<String,String> dataRecord6 = new HashMap<String,String>();
        dataRecord6.put("id", "110000");
        dataRecord6.put("text", "廊坊分行");
        dataRecord6.put("parentId", "100000");

        HashMap<String,String> dataRecord7 = new HashMap<String,String>();
        dataRecord7.put("id", "111000");
        dataRecord7.put("text", "廊坊银行金光道支行");
        dataRecord7.put("parentId", "110000");

        dataList.add(dataRecord1);
        dataList.add(dataRecord2);
        dataList.add(dataRecord3);
        dataList.add(dataRecord4);
        dataList.add(dataRecord5);
        dataList.add(dataRecord6);
        dataList.add(dataRecord7);

        return dataList;
    }

    public static void main(String[] args) {
        List<Map<String, String>> virtualResult = getVirtualResult();
        Iterator<Map<String, String>> iterator = virtualResult.iterator();
    }
}
