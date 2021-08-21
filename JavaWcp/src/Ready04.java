
public class Ready04 {
	public static void main(String[] args) {
		int num = (int) (4 * Math.random()) + 1;
		System.out.println("num=" + num);
		switch(num) {
		case 1:
			System.out.println("優!");
		break;
		case 2:
			System.out.println("良!");
		break;
		case 3:
			System.out.println("可!");
		break;
		case 4:
			System.out.println("不可!");
		break;
		default:
			System.out.println("出たらおかしいぞ！");
			break;
			
		}
	}
//	ランダムに出現した1～4の数字に対して
//	1が出れば優、2が出れば良、3が出れば、、、それ以外では出たらおかしいぞ！が出るように。
//	※breakを忘れないこと！！！！！

}
//switch(比較対象) {
//case 値1:
//	比較対象が値1の時に行う処理;
//	break;
//case 値2:
//	比較対象が値1の時に行う処理;
//	break;
//default:
//	上記以外の時に行う処理;
//	break;
//}