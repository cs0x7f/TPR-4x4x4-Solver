import java.io.*;
import java.util.*;
import cs.threephase.Search;


public class solver {

	public static void main(String[] args) {

		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("twophase.data")));
			cs.min2phase.Tools.initFrom(dis);
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("twophase.data")));
				cs.min2phase.Tools.saveTo(dos);
				dos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

		try {
			DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("threephase.data")));
			cs.threephase.Tools.initFrom(dis);
			dis.close();
		} catch (IOException e) {
			e.printStackTrace();
			try {
				DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("threephase.data")));
				cs.threephase.Tools.saveTo(dos);
				dos.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}

        String cubeString = args[0];
        Search search = new Search();
        String result = search.solution(cubeString);
        System.out.println(result);
	}
}
