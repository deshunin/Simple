package upenn.edu.cit594.ui;

import java.util.Arrays;

/**
 * The class Args reads and checks 
 * correctness of the runtime arguments
 * @author sd
 *
 */
public class Args {
	
	private List<String> runArgs;
	
	public Args (String[] args) {
		this.runArgs = Arrays.asList(args);
	}

}
