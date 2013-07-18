import com.sun.jna.Library;
import com.sun.jna.Native;

public class TestDevjna{
	public static void main(String args[]){
		Devjna temp = (Devjna) Native.loadLibrary("devjna", Devjna.class);
		System.out.println(temp.add(10, 20));
	}

	public interface Devjna extends Library{
		public int add(int a, int b);
	}
}

