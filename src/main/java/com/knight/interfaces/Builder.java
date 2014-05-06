package com.knight.interfaces;

import java.util.Map;

public interface Builder <T>
{
	Object build();
	Object withSpreadsheetData(Map<String, String> row);
	Object withRandomData();
}
