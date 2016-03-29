public class Tutorial {
public static void main (String[] args) {
Tutorial nama = new Tutorial();
System.out.println(nama.namaSaya());
nama.pertambahan();
}

public String namaSaya () {
return "Caroline";
}

public void pertambahan () {
int a = 1;
int b = 2;
System.out.println(a+b);
}
}