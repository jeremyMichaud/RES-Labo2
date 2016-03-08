package ch.heigvd.res.io;

import java.util.HashMap;
import java.util.Map;

public class MyExperimentData implements IData {

	private Map<String, Object> values;
	public MyExperimentData(String operation, String strategy, Integer blockSize, Long numberOfBytesToWrite, Long l){
		values = new HashMap<String, Object>();
		values.put("operation", operation);
		values.put("strategy", strategy);
		values.put("blockSize", blockSize);
		values.put("fileSizeInBytes", numberOfBytesToWrite);
		values.put("durationInMs", l);
	}

	@Override
	public String[] getKeys() {
		return new String[]{"operation", "strategy", "blockSize", "fileSizeInBytes", "durationInMs"};
	}

	@Override
	public Object getValue(String key) {
		return values.get(key);
	}
}
