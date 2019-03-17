@Service
public class HelloService {
	public HelloModel getModel() {
		HelloModel model = new HelloModel();
		model.setName("なまえ");
		model.setMessage("テストメッセージ");
		return model;
	}
}
