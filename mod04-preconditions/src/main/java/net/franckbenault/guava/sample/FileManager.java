package net.franckbenault.guava.sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.google.common.base.Preconditions;

public class FileManager {

	public static void writeAllText(File file, String contents)
			throws FileNotFoundException, IOException {

		// parameters validation using Preconditions
		Preconditions.checkNotNull(file);
		Preconditions.checkArgument(!file.exists(), "File does not exist: %s",
				file);
		Preconditions.checkArgument(!file.isFile(),
				"Should not be a directory: %s", file);
		Preconditions.checkArgument(!file.canWrite(),
				"File cannot be written: %s", file);

		Writer output = new BufferedWriter(new FileWriter(file));
		try {
			output.write(contents);
		} finally {
			output.close();
		}
	}

}
