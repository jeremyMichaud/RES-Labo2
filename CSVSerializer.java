package ch.heigvd.res.io;

import java.io.PrintStream;

public class CSVSerializer implements ISerializer {
	
	private String delimiter;
	public CSVSerializer(String delimiter) {
		this.delimiter = delimiter;
	}
	
	@Override
	public void serialize(IData data, PrintStream ps) {
		String result = "";
		for(String key : data.getKeys())
			result += data.getValue(key) + delimiter;
		result = result.substring(0, result.length()-1);
		ps.println(result);
	}

}
