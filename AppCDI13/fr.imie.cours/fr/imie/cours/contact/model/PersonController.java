package fr.imie.cours;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

	@RequestMapping("/person")
	public String all(ModelMap model) {
		 model.addAttribute("list", dao.findAll);
		return "person";
	}

	@RequestMapping("/person/select")
	public String select(Personne person, ModelMap model) {
		person.getId();
		model.addAttribute("data", dao.findOne(id);
		return all(model);
	}

	@RequestMapping("/person/save")
	public String save(Personne person, ModelMap model) {
		dao.insert ou update selon si l'id est null ou pas
		return all(model);
	}

	@RequestMapping("/person/delete")
	public String delete(Personne personne, ModelMap model) {
		person.getId();
		dao.delete(id)
		return all(model);
	}

}
