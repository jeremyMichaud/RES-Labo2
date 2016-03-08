package ch.heigvd.res.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileRecorder implements IRecorder {

	private ISerializer serializer;
	private String filename;
	private File file;
	private PrintStream ps;
	public FileRecorder(String filename, ISerializer serializer) {
		this.serializer = serializer;
		this.filename = filename;
	}
	
	@Override
	public void record(IData data) {
		serializer.serialize(data,	ps);

	}

	@Override
	public void init() {
		file = new File(filename);
		try {
			ps = new PrintStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void close() {
		ps.close();
	}

}
