package cydeo.pages;

import cydeo.step_definitions.WorkGroup_Steps;
import cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkGroupPage {
    public WorkGroupPage() {
        PageFactory.initElements(Driver.getDriver(), this);}
    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement Password;

    @FindBy(className = "login-btn")
    public WebElement loginBtn;

    @FindBy(linkText = "Workgroups")
        public WebElement workGroupBtn;

    @FindBy(id = "bx-sonet-groups-request-8")
    public WebElement newCorpGrp;
    @FindBy (xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[1]/div[1]/span[2]/span[1]/span[1]/a")
    public WebElement newCorpHead;
    @FindBy (xpath = "//*[@id=\"popup-window-content-bx-group-join-successfull-request-popup\"]/div/div[3]/div/button")
    public WebElement newCorpWarnBtn;

    @FindBy(id = "bx-sonet-groups-request-1")
    public WebElement newCompanyGrp;
    @FindBy(id = "bx-sonet-groups-request-1")
    public WebElement newCompanyHead;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-group-join-successfull-request-popup\"]/div/div[3]/div/button")
    public WebElement newCompLeaveWarn;

    @FindBy(id = "bx-sonet-groups-request-7")
    public WebElement christmesGrp;
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[1]/div[2]/span[2]/span[1]/span[1]/a")
    public  WebElement christmesHead;
    @FindBy(xpath = "//*[@id=\"bx-group-menu-settings\"]")
    public WebElement christmesAction;

    @FindBy (xpath = "//*[@id=\"popup-window-content-menu-popup-group-profile-menu\"]/div/div/a[4]/span[2]")
    public WebElement christmesLeaveBtn;
    @FindBy(xpath = "//*[@id=\"sonet_group_user_leave_button_submit\"]")
    public WebElement christmesLeaveGrpBtn;

    @FindBy (id = "bx-sonet-groups-request-6")
    public WebElement newProductGrp;
    @FindBy (xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[2]/div[2]/span[2]/span[1]/span[1]/a")
    public WebElement newProductHead;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-group-join-successfull-request-popup\"]/div/div[3]/div/button")
    public WebElement newProductLeaveWarn;

    @FindBy (id = "bx-sonet-groups-request-2")
    public WebElement PrAdvGrp;
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[3]/div[1]/span[2]/span[1]/span[1]/a")
    public WebElement PrAdvHead;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-group-join-successfull-request-popup\"]/div/div[3]/div/button")
    public WebElement PrAdvLeaveWarn;


    @FindBy (xpath= "//*[@id='bx-sonet-groups-request-3']")
    public WebElement SalesGrp;
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[3]/div[2]/span[2]/span[1]/span[1]/a")
    public WebElement SalesHead;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-group-join-successfull-request-popup\"]/div/div[3]/div/button")
    public WebElement SalesLeaveWarn;

    @FindBy(id = "bx-sonet-groups-request-4")
    public WebElement Soccer;
    @FindBy(xpath = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[4]/div[1]/span[2]/span[1]/span[1]/a")
    public WebElement SoccerHead;

    @FindBy(xpath = "//*[@id=\"bx-group-menu-settings\"]")
    public WebElement SoccerAction;
    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-group-profile-menu\"]/div/div/a[4]/span[2]")
    public WebElement SoccerActionLeave;
    @FindBy(xpath = "//*[@id=\"sonet_group_user_leave_button_submit\"]")
    public WebElement SoccerLeaveBtn;

    @FindBy (id = "bx-sonet-groups-request-5")
    public WebElement TeckGrp;
    @FindBy(id = "//*[@id=\"sonet-groups-list-container\"]/div[2]/div[4]/div[2]/span[2]/span[1]/span[1]/a")
    public WebElement TeckGrpHead;
    @FindBy(xpath = "//*[@id=\"popup-window-content-bx-group-join-successfull-request-popup\"]/div/div[3]/div/button")
    public WebElement TeckLeaveWarn;

    @FindBy(xpath = "//*[@id=\"bx-sonet-groups-sort-value\"]")
    public WebElement SortGrp;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-bx-sonet-groups-sort-menu\"]/div/div/span[1]/span[2]")
    public WebElement AbcOrder;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-bx-sonet-groups-sort-menu\"]/div/div/span[2]/span[2]")
    public WebElement TimeOrder;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-bx-sonet-groups-sort-menu\"]/div/div/span[3]/span[2]")
    public WebElement LastViewed;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-bx-sonet-groups-sort-menu\"]/div/div/span[4]/span[2]")
    public WebElement NumOfMembers;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-bx-sonet-groups-sort-menu\"]/div/div/span[5]/span[2]")
    public WebElement LastActive;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-bx-sonet-groups-sort-menu\"]/div/div/span[6]/span[2]")
    public WebElement TimeCreated;




    }

