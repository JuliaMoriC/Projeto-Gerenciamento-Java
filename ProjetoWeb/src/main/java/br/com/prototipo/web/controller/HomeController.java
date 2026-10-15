package br.com.prototipo.web.controller;
import br.com.prototipo.web.entity.*; import br.com.prototipo.web.repository.*; import jakarta.validation.Valid; import org.springframework.stereotype.Controller; import org.springframework.ui.Model; import org.springframework.validation.BindingResult; import org.springframework.web.bind.annotation.*; import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller public class HomeController {
 private final FuncionarioRepository funcionarios; private final ContaDoMesRepository contas;
 public HomeController(FuncionarioRepository f, ContaDoMesRepository c){funcionarios=f;contas=c;}
 @GetMapping("/") public String home(Model m){m.addAttribute("funcionarios",funcionarios.findAll());m.addAttribute("contas",contas.findAll());m.addAttribute("novoFuncionario",new Funcionario());m.addAttribute("novaConta",new ContaDoMes());return "index";}
 @PostMapping("/funcionarios") public String salvarFuncionario(@Valid @ModelAttribute("novoFuncionario") Funcionario f, BindingResult r, RedirectAttributes a){if(r.hasErrors()){a.addFlashAttribute("erro","Confira os dados do funcionário e tente novamente.");return "redirect:/";}funcionarios.save(f);a.addFlashAttribute("sucesso","Funcionário cadastrado!");return "redirect:/";}
 @PostMapping("/funcionarios/{id}/excluir") public String excluirFuncionario(@PathVariable Long id,RedirectAttributes a){funcionarios.deleteById(id);a.addFlashAttribute("sucesso","Funcionário excluído.");return "redirect:/";}
 @PostMapping("/contas") public String salvarConta(@Valid @ModelAttribute("novaConta") ContaDoMes c,BindingResult r,RedirectAttributes a){if(r.hasErrors()){a.addFlashAttribute("erro","Confira a descrição e o valor da conta.");return "redirect:/";}contas.save(c);a.addFlashAttribute("sucesso","Conta cadastrada!");return "redirect:/";}
 @PostMapping("/contas/{id}/excluir") public String excluirConta(@PathVariable Long id,RedirectAttributes a){contas.deleteById(id);a.addFlashAttribute("sucesso","Conta excluída.");return "redirect:/";}
}
