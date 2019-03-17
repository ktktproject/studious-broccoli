@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("model", helloService.getModel());
		return "hello";
	}
}
