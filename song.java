import java.util.Scanner;
public class song {
	String title, artist, country;
	int year;
	public song() {}
	
	public song (String t, String a, int y, String c) {
		title =t; artist =a; year =y; country =c;
	}
	public String show() {
		return (String)(year+"�� "+country+"������ "+artist+"�� �θ� "+title);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		song music;
		music = new song("Dancing Queen", "ABBA",1978,"������");
		System.out.println(music.show());
	}

}
