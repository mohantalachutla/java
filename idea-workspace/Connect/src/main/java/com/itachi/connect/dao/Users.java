package com.itachi.connect.dao;

import com.itachi.connect.startup.*;

import java.sql.Connection;
import java.util.Map;

public class Users {
	Connection conn=null;
        Map outMap =null;
	public Users()
	{
            conn = new DataSource().getConnection();
	}
	public Map addUser(Map inputMap)
	{
            return outMap;
	}
}