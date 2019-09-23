package com.example.demo.utils;

import java.util.HashMap;

public class Tool {
    public static HashMap<String, Object> getResultMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("data", null);
        map.put("errorID", Constant.NO_ERROR);
        map.put("errorMsg", null);
        return map;
    }
}
