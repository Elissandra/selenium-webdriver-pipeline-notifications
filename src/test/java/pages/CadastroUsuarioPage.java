package pages;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import runner.RunCucumber;
import support.ScreenshotUtils;

import static support.Commands.*;

public class CadastroUsuarioPage extends RunCucumber {

    // elementos
    private By campoNome = By.id("user");
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("password");
    private By botaoFazerCadastro= By.id("btnRegister");

    // ações / funções / métodos
    public void preencheNome(String nome){
        fillDield(campoNome, nome);
    }

    public void preencheEmail(String email){
        fillDield(campoEmail, email);
    }

    public void preencherSenha(String senha){
        fillDield(campoSenha, senha);
    }

    public void cadastrarUsuario(){
        clickElement(botaoFazerCadastro);
    }

    public void verificaCadastroSucesso(){
        checkMessage(By.id("swal2-title"), "Cadastro realizado!");
    }
}
