package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;
import static support.Commands.*;

public class LoginPage extends RunCucumber {

    // elementos
    private String URL = "http://automationpratice.com.br/";
    private By botaoAcessarLogin = By.cssSelector(".right_list_fix > li > a > .fa-user");
    private By campoEmail = By.id("user");
    private By campoSenha = By.id("password");
    private By botaoFazerLogin = By.id("btnLogin");
    private By botaoAcessarCadastro = By.cssSelector(".right_list_fix > li > a > .fa-lock");

    // ações / funções / métodos
    public void acessarAplicao() {
        String browser = System.getProperty("browser");
        getDriver(browser).get(URL);
    }

    public void acessarTelaLogin() {
        clickElement(botaoAcessarLogin);
    }

    public void preencheEmail(String email){
        fillDield(campoEmail, email);
    }

    public void preencherSenha(String senha){
        fillDield(campoSenha, senha);
    }

    public void clicarLogin(){
        clickElement(botaoFazerLogin);
    }

    public void verificaLoginSucesso(){
        //checkMessage(By.id("swal2-title"), "Login realizado");
        checkMessage(By.cssSelector("#swal2-title"), "Login realizado");
        //waitElementBeVisible(By.id("swal2-title"), 10000);
    }

    public void verificaCampoVazio(String message){
        checkMessage(By.className("invalid_input"), message);
        //waitElementBeVisible(By.id("swal2-title"), 10000);
    }

    public void acessarTelaCadastro(){
        clickElement(botaoAcessarCadastro);
    }

}
