package mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class DemoController 
{
	@RequestMapping("/load1")
	public ModelAndView loadName()
	{
		ModelAndView view = new ModelAndView();
		
		view.setViewName("Demo.jsp");
		return view;
	}

}

/*@RequestMapping("/load")
public ModelAndView loadName()
{
	ModelAndView view = new ModelAndView();
	
	view.setViewName("Demo.jsp");
	return view;
}*/
