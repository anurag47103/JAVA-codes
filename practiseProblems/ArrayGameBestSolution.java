package practiseProblems;

import java.io.*;
 
public class ArrayGameBestSolution {
 
	private static Reader scanner = new Reader();
	private static Print printer = new Print();
 
	public static void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					process();
					printer.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}
	
	private static class Print {
		private final BufferedWriter bw;
 
		public Print() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}
 
		public void print(Object object) throws IOException {
			bw.append("" + object);
		}
 
		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}
 
		public void close() throws IOException {
			bw.close();
		}
	}
	
	private static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;
 
		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}
 
		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
 
			if (neg)
				return -ret;
			return ret;
		}
 
		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}
 
		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}
	}
 
    
	private static void process() throws IOException {
		int t = scanner.nextInt();
		for (int i1 = 1; i1 <= t; i1++) {
		    int n = scanner.nextInt();
		    
		    int[] v = new int[n + 1];
		    int[] mx = new int[n + 1];
		    for (int i = 1; i <= n; i++) {
		        int ni = scanner.nextInt();
		        v[i] = ni;
		        mx[i] = Math.max(mx[i - 1], ni);
		    }
		    int[] mi = new int[n + 1];
		    mi[n] = v[n];
		    for (int i = n - 1; i > 0; i--) {
		    	mi[i] = Math.min(v[i], mi[i + 1]);
		    }
		    int count = 0;
		    for (int i = 1; i < n; i++) {
		    	if (mx[i] < mi[i + 1]) {
		    		count++;
		    	}
		    }
		    if (count % 2 == 0)
    		    printer.println("Ashish");
		    else
    		    printer.println("Jeel");
		}
	}
 
}