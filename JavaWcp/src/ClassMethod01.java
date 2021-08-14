
public class ClassMethod01 {
	public static void main(String[] args) {
        Ready05 yamada = new Ready05(); 
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

        Ready05 sato = new Ready05("佐藤", 25); 
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
    }

}
