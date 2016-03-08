package ch.heigvd.res.io;

import java.io.PrintStream;

public interface ISerializer {
	void serialize(IData data, PrintStream ps);
}
