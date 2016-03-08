package ch.heigvd.res.io;

public interface IRecorder {
	public void record(IData data);
	public void init();
	public void close();
}
