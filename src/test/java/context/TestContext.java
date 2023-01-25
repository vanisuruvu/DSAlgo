package context;

import org.openqa.selenium.WebDriver;

import com.pageObjects.ArraysPage;
import com.pageObjects.DS_IntroPage;
import com.pageObjects.GraphPage;
import com.pageObjects.LinkedListPage;
import com.pageObjects.LoginPage;
import com.pageObjects.QueuePage;
import com.pageObjects.RegisterPage;
import com.pageObjects.StackPage;
import com.pageObjects.StartPage;
import com.pageObjects.TreePage;
import com.utils.Helper;
import io.cucumber.java.Scenario;

public class TestContext {

	WebDriver driver = Helper.getDriver();
	public 	StartPage sp;
	public RegisterPage registerPage;
	public LoginPage loginPage;
	public DS_IntroPage ds_IntroPage;
	public LinkedListPage listPage;
	public ArraysPage arrayPage;
	public StackPage stackPage;
	public GraphPage graphPage;
	public TreePage treePage;
	public QueuePage queuePage;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = Helper.getDriver();
	}
	public StartPage getSp() {
		return sp;
	}
	public RegisterPage getRegisterPage() {
		return registerPage;
	}
	public LoginPage getLoginPage() {
		return loginPage;
	}
	public DS_IntroPage getDs_IntroPage() {
		return ds_IntroPage;
	}
	public LinkedListPage getListPage() {
		return listPage;
	}
	public ArraysPage getArrayPage() {
		return arrayPage;
	}
	public StackPage getStackPage() {
		return stackPage;
	}
	public GraphPage getGraphPage() {
		return graphPage;
	}
	public TreePage getTreePage() {
		return treePage;
	}
	public QueuePage getQueuePage() {
		return queuePage;
	}
	
	public void initializePageObject(WebDriver driver) {
		sp = new StartPage(driver);
		registerPage = new RegisterPage(driver);
		loginPage = new LoginPage(driver);
		ds_IntroPage = new DS_IntroPage (driver);
		listPage = new LinkedListPage(driver);
		arrayPage = new ArraysPage(driver);
		stackPage = new StackPage (driver);
		graphPage = new GraphPage(driver);
		treePage = new TreePage (driver);
		queuePage = new QueuePage (driver);
	}
}
