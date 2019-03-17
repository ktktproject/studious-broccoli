@Controller
public class HelloController {
	/**
	 * パラメータなしのコントローラ
	 *
	 * @return
	 */
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("message", "テストメッセージ");
		return "hello";
	}

	/**
	 * パラメータありのコントローラ.<br>
	 * アクセス例:/hello1?message=test
	 *
	 * @param message
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/hello1", method = RequestMethod.GET)
	public String hello1(@RequestParam("message") String message, Model model) {
		model.addAttribute("message", message);
		return "hello";
	}

	/**
	 * パラメータありのコントローラ.<br>
	 * アクセス例:/hello2/test
	 *
	 * @param message
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/hello2/{message}", method = RequestMethod.GET)
	public String hello2(@PathVariable("message") String message, Model model) {
		model.addAttribute("message", message);
		return "hello";
	}
}
